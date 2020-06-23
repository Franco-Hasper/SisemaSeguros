package operacionesCliente;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import calsesPadre.Tabla;
import escritorios.PrincipalCliente;
import conexion.ConexionHibernate;
import entidades.Poliza;
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
public class TablaPolizaC extends Tabla {

    private Integer idPoliza;

    // private PrincipalPoliza principalPoliza;
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

//    public PrincipalPoliza getPrincipalPoliza() {
//        return principalPoliza;
//    }
//
//    public void setPrincipalPoliza(PrincipalPoliza principalPoliza) {
//        this.principalPoliza = principalPoliza;
//    }
    public Integer getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(Integer idPoliza) {
        this.idPoliza = idPoliza;
    }

    public TablaPolizaC() {
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
        setTabla(principalCliente.getTablaGraficaPolizas());
        this.setStringConsulta("from Poliza");
        this.evaluarEstadoConsulta();
        rellenarTabla();

//        setTabla(principalCliente.getTablaGraficaPolizas());
//        TablaCliente tablaCliente = new TablaCliente();
//        tablaCliente.setPrincipalCliente(principalCliente);
//        this.setStringConsulta("from Poliza where clienteId="
//                + tablaCliente.obtenerIdFilaSeleccionada());
//        this.evaluarEstadoConsulta();
//        rellenarTabla();
    }

    public void rellenarTablaB() {

    }

    @Override
    public Integer obtenerIdFilaSeleccionada() {


        try {
            Integer totalFilas = principalCliente.getTablaGraficaPolizas().getRowCount();
            Integer filasSeleccionada = principalCliente.getTablaGraficaPolizas().getSelectedRow();
            List<Integer> listaResutadosActualesThis = principalCliente.getTablaPolizaC().getListaResutladosActuales();
            Integer id = utilidad.obtenerId(listaResutadosActualesThis, totalFilas, filasSeleccionada);
//            miSesion.beginTransaction();
//            Poliza p = (Poliza) miSesion.get(Poliza.class, id);
//            miSesion.getTransaction().commit();
//            this.setIdTabla(p.getId());
            this.setIdTabla(id);
        } catch (Exception e) {
        }
        return idTabla;
    }

    @Override
    public void rellenarTabla() {

        Integer idCliente = principalCliente.getTablaCliente().obtenerIdFilaSeleccionada();

        DefaultTableModel tablaPoliza = (DefaultTableModel) getTabla().getModel();
        List lista = this.getListaResultados();
        utilidad.removerFilas(tablaPoliza);
        try {
            this.listaResutladosActuales.clear();
        } catch (NullPointerException e) {
        }

        for (Object o : lista) {
            Poliza p = (Poliza) o;
            if (p.getClienteId().getId().equals(idCliente) && p.getEstadoId().getId().equals(1)) {
                Vector<Object> fila = new Vector<>();
                this.listaResutladosActuales.add(0, p.getId());
                fila.add(p.getNumero());
                fila.add(p.getEmpresaId().getNombre());
                fila.add(p.getTipoSeguroId().getNombre());
                tablaPoliza.addRow(fila);
            }
        }
        utilidad.ordenarLista(listaResutladosActuales);

//        String estadoConexion = "SessionImpl(<closed>)";
//        if (estadoConexion.equals(miSesion.toString())) {
//             miSesion.getTransaction().commit();
           
//        }

        //miSesion.close();
//        
//        DefaultTableModel tablaPoliza = (DefaultTableModel) getTabla().getModel();
//        List lista = this.getListaResultados();
//        utilidad.removerFilas(tablaPoliza);
//
//        try {
//            this.listaResutladosActuales.clear();
//        } catch (NullPointerException e) {
//        }
//
//        for (Object o : lista) {
//            Poliza p = (Poliza) o;
//
//            if (p.getEstadoId().getId().equals(1)) {
//                Vector<Object> fila = new Vector<>();
//                this.listaResutladosActuales.add(0, p.getId());
//                fila.add(p.getNumero());
//                fila.add(p.getEmpresaId().getNombre());
//                fila.add(p.getTipoSeguroId().getNombre());
//                tablaPoliza.addRow(fila);
//            }
//        }
//        utilidad.ordenarLista(listaResutladosActuales);
        //  miSesion.getTransaction().commit();
        //miSesion.close();
    }

    @Override
    public boolean verificarFilaSeleccionada() {
        try {
            int fila = principalCliente.getTablaGraficaPolizas().getSelectedRow();
            principalCliente.getTablaGraficaPolizas().getValueAt(fila, 0).toString();
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar unar fila!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
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
            setTabla(principalCliente.getTablaGraficaPolizas());
            DefaultTableModel tablaPoliza = (DefaultTableModel) getTabla().getModel();
            utilidad.removerFilas(tablaPoliza);
        } catch (NullPointerException e) {
        }

    }

}
