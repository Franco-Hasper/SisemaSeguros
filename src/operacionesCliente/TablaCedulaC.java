package operacionesCliente;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import calsesPadre.Tabla;
import clasesUtilidadGeneral.OperacionesUtiles;
import conexion.ConexionHibernate;
import entidades.Cedula;
import escritorios.PrincipalCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 * <h1>Clase TablaMatetiaPrima</h1>
 * Contiene atributos y metodos que se encargan de manejar operaciones
 * relaacionadas con JTable de la interfaz grafica materia prima
 *
 * @author Hasper Franco
 * @version 0.1
 * @since 2020-01-15
 */
public class TablaCedulaC extends Tabla {

    private Integer idPoliza;

    private PrincipalCliente principalCliente;

    private List<Integer> listaResutladosActuales = new ArrayList<Integer>();

    public List<Integer> getListaResutladosActuales() {
        return listaResutladosActuales;
    }

    public void setListaResutladosActuales(List<Integer> listaResutladosActuales) {
        this.listaResutladosActuales = listaResutladosActuales;
    }

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    public Integer getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(Integer idPoliza) {
        this.idPoliza = idPoliza;
    }

    public TablaCedulaC() {
        setEstadoConsulta(0);
    }

    /**
     * Ejecuata los metodos necesarios para rellenar la tabla de la ventana
     * PrincipalCliente.
     *
     * @param p
     */
    @Override
    public void ejecutarRellenarTabla() {

        setTabla(principalCliente.getTablaGraficacedula());
        this.setStringConsulta("from Cedula");
        this.evaluarEstadoConsulta();
        rellenarTabla();

//        setTabla(principalCliente.getTablaGraficacedula());
//        TablaPolizaC tablaPoliza = new TablaPolizaC();
//        tablaPoliza.setPrincipalCliente(principalCliente);
//        this.setConsultaList("from Cedula where polizaId="
//                + tablaPoliza.obtenerIdFilaSeleccionada());
//        obtenerListaConsulta();
//        //this.evaluarEstadoConsulta();
//        rellenarTabla();
    }

    @Override
    public Integer obtenerIdFilaSeleccionada() {

        Session miSesion = ConexionHibernate.tomarConexion();

        try {
            Integer totalFilas = principalCliente.getTablaGraficacedula().getRowCount();
            Integer filasSeleccionada = principalCliente.getTablaGraficacedula().getSelectedRow();
            List<Integer> listaResutadosActualesThis = principalCliente.getTablaCedulaC().getListaResutladosActuales();
            Integer id = utilidad.obtenerId(listaResutadosActualesThis, totalFilas, filasSeleccionada);
//            miSesion.beginTransaction();
//            Cedula c = (Cedula) miSesion.get(Cedula.class, id);
//            miSesion.getTransaction().commit();
//            this.setIdTabla(c.getId());
            this.setIdTabla(id);
        } catch (Exception e) {
        }
        return idTabla;
    }

    @Override
    public void rellenarTabla() {

        Integer idPoliza = principalCliente.getTablaPolizaC().obtenerIdFilaSeleccionada();

        DefaultTableModel tablaCedula = (DefaultTableModel) getTabla().getModel();
        List lista = this.getListaResultados();
        utilidad.removerFilas(tablaCedula);

        try {
            this.listaResutladosActuales.clear();
        } catch (NullPointerException e) {
        }

        OperacionesUtiles op = new OperacionesUtiles();
        for (Object o : lista) {
            Cedula c = (Cedula) o;
            if (c.getPolizaId().getId().equals(idPoliza) && c.getEstadoId().getId().equals(1)) {

                Vector<Object> fila = new Vector<>();
                this.listaResutladosActuales.add(0, c.getId());
                fila.add(c.getNumero());
                fila.add(c.getTitular());
                fila.add(c.getDni());
                fila.add(c.getDireccionId().getNombre() + "-"
                        + c.getDireccionId().getLocalidadId().getNombre() + "-"
                        + c.getDireccionId().getLocalidadId().getProvinciaId().getNombre());
                fila.add(c.getDominio());
                fila.add(c.getModeloId().getMarcaId().getNombre());
                fila.add(c.getModeloId().getNombre());
                fila.add(c.getTipoId().getNombre());
                fila.add(c.getUsoId().getNombre());
                fila.add(c.getCahsis());
                fila.add(c.getMotor());
                fila.add(op.formatoFechaSinHora(c.getVencimiento()));
                tablaCedula.addRow(fila);
            }
        }
        utilidad.ordenarLista(listaResutladosActuales);
//             String estadoConexion="SessionImpl(<closed>)";
//        if(estadoConexion.equals(miSesion.toString())){
//        miSesion.getTransaction().commit();
        
//        }
        //  miSesion.close();
    }

    /**
     * Compara los valores de una fila seleccionada en la tabla de
     * PrincipalCliente con los resultados obtenidos de la base datos, si estos
     * coinciden guarda el resultado en la variable idCliente.
     */
//    @Override
//    public void buscarCopiaEnBaseDeDatos() {
//        int fila = principalPoliza.getTablaGraficacedula().getSelectedRow();
//        String numeroCedula = principalPoliza.getTablaGraficacedula().getValueAt(fila, 0).toString();
//        for (Object o : getListaResultados()) {
//            //asignamos todos los resultados a m
//            Cedula c = (Cedula) o;
//            if (c.getNumero().equals(numeroCedula)) {
//                this.setIdTabla(c.getId());
//            }
//        }
//    }
    @Override
    public boolean verificarFilaSeleccionada() {
        try {
            int fila = principalCliente.getTablaGraficacedula().getSelectedRow();
            principalCliente.getTablaGraficacedula().getValueAt(fila, 0).toString();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    /**
     * @deprecated
     */
    @Override
    public void rellenarTabla(String valorBusqueda) {

    }

    public void vaciarTabla() {
        try {
            setTabla(principalCliente.getTablaGraficacedula());
            DefaultTableModel tablaCedula = (DefaultTableModel) getTabla().getModel();
            utilidad.removerFilas(tablaCedula);
        } catch (NullPointerException e) {
        }

    }

}
