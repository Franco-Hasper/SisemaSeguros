package operacionesCliente;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import calsesPadre.Tabla;
import clasesUtilidadGeneral.Fechas;
import clasesUtilidadGeneral.OperacionesUtiles;
import conexion.ConexionHibernate;
import entidades.Vencimiento;
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
public class TablaVencimientoC extends Tabla {

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

    public TablaVencimientoC() {
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

        setTabla(principalCliente.getTablaGraficaVencimiento());
        this.setStringConsulta("from Vencimiento");
        this.evaluarEstadoConsulta();
        rellenarTabla();

//        
//        setTabla(principalCliente.getTablaGraficaVencimiento());
//        TablaPolizaC tablaPoliza = new TablaPolizaC();
//        tablaPoliza.setPrincipalCliente(principalCliente);
//        this.setConsultaList("from Vencimiento where polizaId="
//                + tablaPoliza.obtenerIdFilaSeleccionada());
//        obtenerListaConsulta();
//        //this.evaluarEstadoConsulta();
//        rellenarTabla();
    }

    @Override
    public Integer obtenerIdFilaSeleccionada() {

       Session miSesion = ConexionHibernate.tomarConexion();

        try {
            Integer totalFilas = principalCliente.getTablaGraficaVencimiento().getRowCount();
            Integer filasSeleccionada = principalCliente.getTablaGraficaVencimiento().getSelectedRow();
            List<Integer> listaResutadosActualesThis = principalCliente.getTablaVencimientoC().getListaResutladosActuales();
            Integer id = utilidad.obtenerId(listaResutadosActualesThis, totalFilas, filasSeleccionada);
//            miSesion.beginTransaction();
//            Vencimiento v = (Vencimiento) miSesion.get(Vencimiento.class, id);
//            miSesion.getTransaction().commit();
//            this.setIdTabla(v.getId());
            this.setIdTabla(id);
        } catch (Exception e) {
        }
        return idTabla;

//        setTabla(principalPoliza.getTablaGraficaVencimiento());
//        TablaPolizaC tablaPoliza = new TablaPolizaC();
//        tablaPoliza.setPrincipalPoliza(principalPoliza);
//        this.setConsultaList("from Vencimiento where polizaId="
//                + tablaPoliza.obtenerIdFilaSeleccionada());
//        obtenerListaConsulta();
//        buscarCopiaEnBaseDeDatos();
//        return idTabla;
    }

    @Override
    public void rellenarTabla() {
        Integer idPoliza = principalCliente.getTablaPolizaC().obtenerIdFilaSeleccionada();
        DefaultTableModel tablaVencimiento = (DefaultTableModel) getTabla().getModel();
        List lista = this.getListaResultados();
        utilidad.removerFilas(tablaVencimiento);

        try {
            this.listaResutladosActuales.clear();
        } catch (NullPointerException e) {
        }

        Fechas fecha = new Fechas();
        OperacionesUtiles op = new OperacionesUtiles();
        for (Object o : lista) {
            Vencimiento v = (Vencimiento) o;
            if (v.getPolizaId().getId().equals(idPoliza)) {

                Vector<Object> fila = new Vector<>();
                this.listaResutladosActuales.add(0, v.getId());
                fila.add(v.getCuota());
                fila.add(v.getEstadoId().getValor());
                fila.add(op.formatoFechaSinHora(v.getFechaVencimieto()));
                fecha.diasRestantes(fecha.dateToListInteger(v.getFechaVencimieto()));
                fila.add(fecha.getCasonegativo() + fecha.getDias());
                tablaVencimiento.addRow(fila);
            }

        }
        utilidad.ordenarLista(listaResutladosActuales);
//        String estadoConexion = "SessionImpl(<closed>)";
//        if (estadoConexion.equals(miSesion.toString())) {
//            miSesion.getTransaction().commit();
           
//        }
        //  miSesion.close();
    }

    public void vaciarTabla() {
        try {
            setTabla(principalCliente.getTablaGraficaVencimiento());
            DefaultTableModel tablaPoliza = (DefaultTableModel) getTabla().getModel();
            utilidad.removerFilas(tablaPoliza);
        } catch (NullPointerException e) {
        }

    }

    /**
     * en este caso corrobora el numero de poliza en tabla cliente y retorna la
     * id de la poliza que coincid e ne la base de datos
     */
    public void obtenerIdPolizaDesdeCliente() {
        // int fila = principalCliente.getTablaGrafica().getSelectedRow();
        // String nropoliza = principalCliente.getTablaGrafica().getValueAt(fila, 4).toString();
        //si poliza lleva letra ..traer todos los resutados y usar equals para seleccionar el que quiero.
//        setConsultaList("from Poliza where numero=" + nropoliza);
//
//        obtenerListaConsulta();
//        try {
//            for (Object o : getListaResultados()) {
//                Poliza p = (Poliza) o;
//                if (p.getNumero().equals(nropoliza)) {
//                    this.setIdPoliza(p.getId());
//
//                }
//            }
//        } catch (NullPointerException e) {
//        }

    }

    @Override
    public boolean verificarFilaSeleccionada() {
        try {
            int fila = principalCliente.getTablaGraficaVencimiento().getSelectedRow();
            principalCliente.getTablaGraficaVencimiento().getValueAt(fila, 0).toString();
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

//    public void buscarCopiaEnBaseDeDatos() {
//        int fila = principalPoliza.getTablaGraficaVencimiento().getSelectedRow();
//        String numeroCuota = principalPoliza.getTablaGraficaVencimiento().getValueAt(fila, 0).toString();
//
//        for (Object o : getListaResultados()) {
//            //asignamos todos los resultados a m
//            Vencimiento v = (Vencimiento) o;
//            if ((String.valueOf(v.getCuota())).equals(numeroCuota)) {
//                this.setIdTabla(v.getId());
//            }
//        }
//    }
}
