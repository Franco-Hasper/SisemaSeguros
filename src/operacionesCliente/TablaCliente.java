package operacionesCliente;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import calsesPadre.Tabla;
import clasesUtilidadGeneral.Fechas;
import entidades.Cliente;
import escritorios.PrincipalCliente;
import clasesUtilidadGeneral.OperacionesUtiles;
import conexion.ConexionHibernate;
import entidades.Cedula;
import entidades.Poliza;
import entidades.Vencimiento;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionException;

/**
 * <h1>Clase TablaMatetiaPrima</h1>
 * Contiene atributos y metodos que se encargan de manejar operaciones
 * relaacionadas con JTable de la interfaz grafica materia prima
 *
 * @author Hasper Franco
 * @version 0.1
 * @since 2020-01-15
 */
public class TablaCliente extends Tabla {

    private PrincipalCliente principalCliente;

    public List<Integer> getListaResutladosActuales() {
        return listaResutladosActuales;
    }

    public void setListaResutladosActuales(List<Integer> listaResutladosActuales) {
        this.listaResutladosActuales = listaResutladosActuales;
    }
    private List<Integer> listaResutladosActuales = new ArrayList<Integer>();
//    private List<Integer> listaResultadosIdsVencimientosAnterior = new ArrayList<Integer>();
//    private List<Integer> listaResultadosIdsVencimientosActual = new ArrayList<Integer>();

//    public List<Integer> getListaResultadosIdsVencimientosAnterior() {
//        return listaResultadosIdsVencimientosAnterior;
//    }
//
//    public void setListaResultadosIdsVencimientosAnterior(List<Integer> listaResultadosIdsVencimientosAnterior) {
//        this.listaResultadosIdsVencimientosAnterior = listaResultadosIdsVencimientosAnterior;
//    }
//
//    public List<Integer> getListaResultadosIdsVencimientosActual() {
//        return listaResultadosIdsVencimientosActual;
//    }
//
//    public void setListaResultadosIdsVencimientosActual(List<Integer> listaResultadosIdsVencimientosActual) {
//        this.listaResultadosIdsVencimientosActual = listaResultadosIdsVencimientosActual;
//    }
    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    public TablaCliente() {
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
        setTabla(principalCliente.getTablaGrafica());
        setStringConsulta("from Cliente");
        evaluarEstadoConsulta();
        setCampoTexto(principalCliente.getTxtBuscar());
        rellenarTabla(getCampoTexto().getText());
    }

    @Override
    public Integer obtenerIdFilaSeleccionada() {
        try {
            Integer totalFilas = principalCliente.getTablaGrafica().getRowCount();
            Integer filasSeleccionada = principalCliente.getTablaGrafica().getSelectedRow();
            List<Integer> listaResutadosActualesThis = principalCliente.getTablaCliente().getListaResutladosActuales();
            Integer id = utilidad.obtenerId(listaResutadosActualesThis, totalFilas, filasSeleccionada);
            this.setIdTabla(id);
        } catch (Exception e) {
        }
        return idTabla;
    }

    @Override
    public void rellenarTabla(String valorBusqueda) {
        DefaultTableModel tablaCliente = (DefaultTableModel) getTabla().getModel();
        List lista = this.getListaResultados();
        utilidad.removerFilas(tablaCliente);
        Fechas fecha = new Fechas();
        try {
            this.listaResutladosActuales.clear();
        } catch (NullPointerException e) {
        }
        for (Object o : lista) {
            Cliente c = (Cliente) o;
            boolean resultadoComparacion = OperacionesUtiles.convertirResultado(c.getNombre(), valorBusqueda);
            if (c.getEstadoId().getId().equals(1) && resultadoComparacion) {

                Vector<Object> fila = new Vector<>();
                this.listaResutladosActuales.add(0, c.getId());
                fila.add(c.getNombre());
                fila.add(c.getApellido());
                fila.add(c.getTelefono());
                fila.add("sin registros");
                fila.add("sin registros");
                fila.add("sin registros");
                fila.add("sin registros");
                fila.add("sin registros");
                fila.add("sin registros");
                fila.add("sin registros");
                fila.add("sin registros");
                tablaCliente.addRow(fila);

            }
        }
        utilidad.ordenarLista(listaResutladosActuales);

//        String estadoConexion = "SessionImpl(<closed>)";
//        if (estadoConexion.equals(miSesion.toString())) {
//              miSesion.getTransaction().commit();

//        }

    }

    public void rellenarTablaO(String valorBusqueda) {

        DefaultTableModel tablaCliente = (DefaultTableModel) getTabla().getModel();
        List lista = this.getListaResultados();
        utilidad.removerFilas(tablaCliente);
        Fechas fecha = new Fechas();
        try {
            this.listaResutladosActuales.clear();
//            this.listaResultadosIdsVencimientosAnterior.clear();
//            this.listaResultadosIdsVencimientosActual.clear();
        } catch (NullPointerException e) {
        }
        for (Object o : lista) {
            Cliente c = (Cliente) o;
            boolean resultadoComparacion = OperacionesUtiles.convertirResultado(c.getNombre(), valorBusqueda);
            if (c.getEstadoId().getId().equals(1) && resultadoComparacion) {
                List<Poliza> polizas = c.getPolizas();
                if (c.getPolizas().size() == 0) {
                    //++++++++++++++++++++//
                    soloCliente(c, tablaCliente);
                    //++++++++++++++++++++//
                } else {
                    for (Poliza p : polizas) {
                        if (p.getEstadoId().getId().equals(1)) {
                            List<Cedula> cedulas = p.getCedulas();
                            List<Vencimiento> vencimientos = p.getVencimientos();
                            //ver el p.getVencimientos.size para evitar el error de la utima columna de la tabla
                            if (p.getCedulas().size() == 0
                                    && p.getVencimientos().size() == 0) {
                                //++++++++++++++++++++//
                                clientePoliza(c, p, tablaCliente);
                                //++++++++++++++++++++//
                            } else if (p.getCedulas().size() == 0
                                    && p.getVencimientos().size() != 0) {
                                Integer tieneMesAnterior = 0;
                                Integer tieneMesActual = 0;
                                Integer nuemeroVueltasValidas = 0;
                                Integer nuemeroVueltasTotales = 0;
                                boolean reinicioDeVuelta = false;
                                //buscar cuota en vencimiento mes anteriror y su estado
                                Vector<Object> fila = new Vector<>();
                                for (Vencimiento venc : vencimientos) {
                                    nuemeroVueltasTotales += 1;
                                    if (nuemeroVueltasTotales.equals(vencimientos.size())) {
                                        reinicioDeVuelta = true;
                                    }
                                    if (fecha.mesAntesOmesActual(venc.getFechaVencimieto(), -1)
                                            || fecha.mesAntesOmesActual(venc.getFechaVencimieto(), 0)) {
                                        nuemeroVueltasValidas += 1;
                                        if (nuemeroVueltasValidas.equals(1)) {
                                            //++++++++++++++++++++//
                                            clientePolizaVencimientosVeulta1(c, p, fila);
                                            //++++++++++++++++++++//
                                        }
                                        if (fecha.mesAntesOmesActual(venc.getFechaVencimieto(), -1)) {
                                            tieneMesAnterior = 1;
                                            fila.add(7, venc.getEstadoId().getValor());
//                                            this.listaResultadosIdsVencimientosAnterior.add(0, venc.getId());

                                        } else if (fecha.mesAntesOmesActual(venc.getFechaVencimieto(), 0)) {
                                            tieneMesActual = 1;
                                            fila.add(venc.getEstadoId().getValor());
                                            fila.add(utilidad.formatoFechaSinHora(venc.getFechaVencimieto()));
                                            fecha.diasRestantes(fecha.dateToListInteger(venc.getFechaVencimieto()));
//                                            this.listaResultadosIdsVencimientosActual.add(0, venc.getId());
                                            //fila.add(fecha.getCasonegativo() + fecha.getDias()); te dice cuantos dias ya pasaron de la fecha ej -7
                                            fila.add(fecha.getCasonegativo() + fecha.getDias());
                                        }
                                    }
                                    if (nuemeroVueltasValidas.equals(2)
                                            && tieneMesAnterior.equals(1)
                                            && tieneMesActual.equals(1)
                                            && reinicioDeVuelta) {

                                        tablaCliente.addRow(fila);
                                    } else if (nuemeroVueltasValidas.equals(1)
                                            && tieneMesAnterior.equals(1)
                                            && tieneMesActual.equals(0)
                                            && reinicioDeVuelta) {
                                        fila.add(8, "sin registros");
                                        fila.add(9, "sin registros");
                                        fila.add(10, "sin registros");
                                        tablaCliente.addRow(fila);
                                    } else if (nuemeroVueltasValidas.equals(1)
                                            && tieneMesAnterior.equals(0)
                                            && tieneMesActual.equals(1)
                                            && reinicioDeVuelta) {
                                        fila.add(7, "sin registros");
                                        tablaCliente.addRow(fila);
                                    }
                                }

                            } else if (p.getCedulas().size() != 0
                                    && p.getVencimientos().size() == 0) {

                                for (Cedula cedu : cedulas) {
                                    if (c.getEstadoId().getId().equals(1)) {
                                        //++++++++++++++++++++//
                                        clientePolizaCedulas(c, p, tablaCliente, cedu);
                                        //++++++++++++++++++++//
                                    }
                                }
                            } else {
                                //ambos tienen size<0
                                for (Cedula cedu : cedulas) {
                                    if (c.getEstadoId().getId().equals(1)) {
                                        Vector<Object> fila = new Vector<>();
                                        //++++++++++++++++++++//
                                        clientePolizaCedulasVencimientos(c, p, cedu, fila);
                                        //++++++++++++++++++++//
                                        Integer tieneMesAnterior = 0;
                                        Integer tieneMesActual = 0;
                                        Integer nuemeroVueltasValidas = 0;
                                        Integer nuemeroVueltasTotales = 0;
                                        boolean reinicioDeVuelta = false;
                                        //buscar cuota en vencimiento mes anteriror y su estado
                                        for (Vencimiento venc : vencimientos) {
                                            nuemeroVueltasTotales += 1;
                                            if (nuemeroVueltasTotales.equals(vencimientos.size())) {
                                                reinicioDeVuelta = true;
                                            }
                                            if (fecha.mesAntesOmesActual(venc.getFechaVencimieto(), -1)
                                                    || fecha.mesAntesOmesActual(venc.getFechaVencimieto(), 0)) {
                                                nuemeroVueltasValidas += 1;
                                                if (fecha.mesAntesOmesActual(venc.getFechaVencimieto(), -1)) {

                                                    tieneMesAnterior = 1;
                                                    fila.add(7, venc.getEstadoId().getValor());
//                                                    this.listaResultadosIdsVencimientosAnterior.add(0, venc.getId());

                                                } else if (fecha.mesAntesOmesActual(venc.getFechaVencimieto(), 0)) {
                                                    tieneMesActual = 1;
                                                    fila.add(venc.getEstadoId().getValor());
                                                    fila.add(utilidad.formatoFechaSinHora(venc.getFechaVencimieto()));
                                                    fecha.diasRestantes(fecha.dateToListInteger(venc.getFechaVencimieto()));
                                                    fila.add(fecha.getCasonegativo() + fecha.getDias());
//                                                    this.listaResultadosIdsVencimientosActual.add(0, venc.getId());
                                                }
                                            }
                                            if (nuemeroVueltasValidas.equals(2)
                                                    && tieneMesAnterior.equals(1)
                                                    && tieneMesActual.equals(1)
                                                    && reinicioDeVuelta) {
                                                tablaCliente.addRow(fila);
                                            } else if (nuemeroVueltasValidas.equals(1)
                                                    && tieneMesAnterior.equals(1)
                                                    && tieneMesActual.equals(0)
                                                    && reinicioDeVuelta) {
                                                fila.add(8, "sin registros");
                                                fila.add(9, "sin registros");
                                                fila.add(10, "sin registros");
                                                tablaCliente.addRow(fila);
                                            } else if (nuemeroVueltasValidas.equals(1)
                                                    && tieneMesAnterior.equals(0)
                                                    && tieneMesActual.equals(1)
                                                    && reinicioDeVuelta) {
                                                fila.add(7, "sin registros");
                                                tablaCliente.addRow(fila);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        utilidad.ordenarLista(listaResutladosActuales);
        // utilidad.ordenarLista(this.listaResultadosIdsVencimientosAnterior);
//       utilidad.ordenarLista(listaResultadosIdsVencimientosActual);
        miSesion.getTransaction().commit();
        //miSesion.close();

    }

    public Integer obtenerIdPoliza() {
        Integer idPoliza = null;
        int fila = principalCliente.getTablaGrafica().getSelectedRow();
        String numeroPoliza = principalCliente.getTablaGrafica().getValueAt(fila, 4).toString();
        this.setConsultaList("from Poliza");
        obtenerListaConsulta();
        for (Object o : getListaResultados()) {
            Poliza p = (Poliza) o;
            if (p.getNumero().equals(numeroPoliza)) {
                idPoliza = (p.getId());
            }
        }
        return idPoliza;
    }

    @Override
    public boolean verificarFilaSeleccionada() {
        try {
            int fila = principalCliente.getTablaGrafica().getSelectedRow();
            principalCliente.getTablaGrafica().getValueAt(fila, 0).toString();
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

    private void soloCliente(Cliente c, DefaultTableModel tablaCliente) {
        Vector<Object> fila = new Vector<>();
        this.listaResutladosActuales.add(0, c.getId());
//        this.listaResultadosIdsVencimientosAnterior.add(0, null);
//        this.listaResultadosIdsVencimientosActual.add(0, null);
        fila.add(c.getNombre());
        fila.add(c.getApellido());
        fila.add(c.getTelefono());
        fila.add("sin registros");
        fila.add("sin registross");
        fila.add("sin registros");
        fila.add("sin registros");
        fila.add("sin registros");
        fila.add("sin registros");
        fila.add("sin registros");
        fila.add("sin registros");
        tablaCliente.addRow(fila);
    }

    private void clientePoliza(Cliente c, Poliza p, DefaultTableModel tablaCliente) {
        Vector<Object> fila = new Vector<>();
        this.listaResutladosActuales.add(0, c.getId());
//        this.listaResultadosIdsVencimientosAnterior.add(0, null);
//        this.listaResultadosIdsVencimientosActual.add(0, null);
        fila.add(c.getNombre());
        fila.add(c.getApellido());
        fila.add(c.getTelefono());
        fila.add(p.getEmpresaId().getNombre());
        fila.add(p.getNumero());
        fila.add(p.getTipoSeguroId().getNombre());
        fila.add("sin registros");
        fila.add("sin registros");
        fila.add("sin registros");
        fila.add("sin registros");
        fila.add("sin registros");
        tablaCliente.addRow(fila);
    }

    private void clientePolizaVencimientosVeulta1(Cliente c, Poliza p, Vector fila) {
        this.listaResutladosActuales.add(0, c.getId());
        fila.add(c.getNombre());
        fila.add(c.getApellido());
        fila.add(c.getTelefono());
        fila.add(p.getEmpresaId().getNombre());
        fila.add(p.getNumero());
        fila.add(p.getTipoSeguroId().getNombre());
        fila.add("sin registros");
    }

    private void clientePolizaCedulas(Cliente c, Poliza p, DefaultTableModel tablaCliente, Cedula cedu) {

        Vector<Object> fila = new Vector<>();
        this.listaResutladosActuales.add(0, c.getId());
//        this.listaResultadosIdsVencimientosAnterior.add(0, null);
//        this.listaResultadosIdsVencimientosActual.add(0, null);
        fila.add(c.getNombre());
        fila.add(c.getApellido());
        fila.add(c.getTelefono());
        fila.add(p.getEmpresaId().getNombre());
        fila.add(p.getNumero());
        fila.add(p.getTipoSeguroId().getNombre());
        fila.add(cedu.getDominio());
        fila.add("sin registros");
        fila.add("sin registros");
        fila.add("sin registros");
        fila.add("sin registros");
        tablaCliente.addRow(fila);

    }

    private void clientePolizaCedulasVencimientos(Cliente c, Poliza p, Cedula cedu, Vector<Object> fila) {
        this.listaResutladosActuales.add(0, c.getId());
        fila.add(c.getNombre());
        fila.add(c.getApellido());
        fila.add(c.getTelefono());
        fila.add(p.getEmpresaId().getNombre());
        fila.add(p.getNumero());
        fila.add(p.getTipoSeguroId().getNombre());
        fila.add(cedu.getDominio());
    }
}

//REFERNCIA PARA CORREGIR 2 MESES IGUALES MAS ADELANTE (VER TAMBIEN QUE NO APARESCAN CEDULAS CON ESTADO 2)

