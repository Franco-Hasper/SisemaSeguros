package operacionesEmpresa;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import calsesPadre.Tabla;
import clasesUtilidadGeneral.OperacionesUtiles;
import conexion.ConexionHibernate;
import entidades.Empresa;
import escritorios.PrincipalEmpresa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * <h1>Clase TablaMatetiaPrima</h1>
 * Contiene atributos y metodos que se encargan de manejar operaciones
 * relaacionadas con JTable de la interfaz grafica materia prima
 *
 * @author Hasper Franco
 * @version 0.1
 * @since 2020-01-15
 */
public class TablaEmpresa extends Tabla {

    private PrincipalEmpresa principalEmpresa;

    public PrincipalEmpresa getPrincipalEmpresa() {
        return principalEmpresa;
    }

    public void setPrincipalEmpresa(PrincipalEmpresa principalEmpresa) {
        this.principalEmpresa = principalEmpresa;
    }

    private List<Integer> listaResutladosActuales = new ArrayList<Integer>();

    public List<Integer> getListaResutladosActuales() {
        return listaResutladosActuales;
    }

    public void setListaResutladosActuales(List<Integer> listaResutladosActuales) {
        this.listaResutladosActuales = listaResutladosActuales;
    }

    public TablaEmpresa() {
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
        setTabla(principalEmpresa.getTablaGrafica());
        setStringConsulta("from Empresa");
        this.evaluarEstadoConsulta();
        setCampoTexto(principalEmpresa.getTxtBuscar());
        rellenarTabla(getCampoTexto().getText());
    }

    @Override
    public Integer obtenerIdFilaSeleccionada() {
        miSesion = ConexionHibernate.tomarConexion();
        try {
            Integer totalFilas = principalEmpresa.getTablaGrafica().getRowCount();
            Integer filasSeleccionada = principalEmpresa.getTablaGrafica().getSelectedRow();
            List<Integer> listaResutadosActualesThis = principalEmpresa.getTablaEmpresa().getListaResutladosActuales();
            Integer id = utilidad.obtenerId(listaResutadosActualesThis, totalFilas, filasSeleccionada);
            miSesion.beginTransaction();
            Empresa e = (Empresa) miSesion.get(Empresa.class, id);
            miSesion.getTransaction().commit();
            this.setIdTabla(e.getId());
        } catch (Exception ex) {
        }
        return idTabla;
//        setTabla(tabla);
//        setConsultaList("from Empresa");
//        obtenerListaConsulta();
//        buscarCopiaEnBaseDeDatos();
//        return idTabla;
    }

    @Override
    public void rellenarTabla(String valorBusqueda) {
        DefaultTableModel tablaEmpresa = (DefaultTableModel) getTabla().getModel();
        List lista = this.getListaResultados();
        utilidad.removerFilas(tablaEmpresa);
        try {
            this.listaResutladosActuales.clear();
        } catch (NullPointerException e) {
        }
        for (Object o : lista) {
            Empresa e = (Empresa) o;
            Vector<Object> fila = new Vector<>();
            boolean resultadoComparacion = OperacionesUtiles.convertirResultado(e.getNombre(), valorBusqueda);
            //***********************
            if (e.getEstadoId().getId().equals(1) && resultadoComparacion) {
                this.listaResutladosActuales.add(0, e.getId());
                fila.add(e.getNombre());
                tablaEmpresa.addRow(fila);
            }
        }

        utilidad.ordenarLista(listaResutladosActuales);
    }

    /**
     * Compara los valores de una fila seleccionada en la tabla de
     * PrincipalCliente con los resultados obtenidos de la base datos, si estos
     * coinciden guarda el resultado en la variable idCliente.
     */
//    public void buscarCopiaEnBaseDeDatos() {
//        int fila = principalEmpresa.getTablaGrafica().getSelectedRow();
//        String nombre = principalEmpresa.getTablaGrafica().getValueAt(fila, 0).toString();
//        for (Object o : getListaResultados()) {
//            //asignamos todos los resultados a m
//            Empresa e = (Empresa) o;
//            if (e.getNombre().equals(nombre)) {
//                this.setIdTabla(e.getId());
//            }
//        }
//    }

    @Override
    public boolean verificarFilaSeleccionada() {
        try {
            int fila = principalEmpresa.getTablaGrafica().getSelectedRow();
            principalEmpresa.getTablaGrafica().getValueAt(fila, 0).toString();
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
    public void rellenarTabla() {

    }

}
