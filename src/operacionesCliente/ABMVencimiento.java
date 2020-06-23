package operacionesCliente;

import calsesPadre.ABM;
import clasesUtilidadGeneral.Fechas;
import conexion.ConexionHibernate;
import ds.desktop.notify.DesktopNotify;
import entidades.Estado;
import entidades.Poliza;
import entidades.Vencimiento;
import escritorios.PrincipalCliente;
import formularios.FormularioEditarVencimiento;

import formularios.FormularioRegistrarVencimiento;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

/**
 * @author Hasper Franco
 */
public class ABMVencimiento extends ABM {

    //se utiliza solo para eliminar
    private PrincipalCliente principalCliente;
    private FormularioRegistrarVencimiento formularioRegistrarVencimiento;
    private FormularioEditarVencimiento formularioEditarVencimiento;

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    public FormularioEditarVencimiento getFormularioEditarVencimiento() {
        return formularioEditarVencimiento;
    }

    public void setFormularioEditarVencimiento(FormularioEditarVencimiento formularioEditarVencimiento) {
        this.formularioEditarVencimiento = formularioEditarVencimiento;
    }

    public FormularioRegistrarVencimiento getFormularioRegistrarVencimiento() {
        return formularioRegistrarVencimiento;
    }

    public void setFormularioRegistrarVencimiento(FormularioRegistrarVencimiento formularioRegistrarVencimiento) {
        this.formularioRegistrarVencimiento = formularioRegistrarVencimiento;
    }

    public boolean ejecutarEliminarTodo() {
        conexionTransaccionEliminarTodo();
        return true;
    }

    public void conexionTransaccionEliminarTodo() {
        miSesion = ConexionHibernate.tomarConexion();
        try {
            miSesion.beginTransaction();
            transaccionEliminarTodo(miSesion);
            miSesion.getTransaction().commit();
            DesktopNotify.showDesktopMessage("   exito   ", "  Todos los registros eliminados", DesktopNotify.SUCCESS, 7000);
        } catch (Exception e) {
            DesktopNotify.showDesktopMessage("   error    ", "   Error al intentar eliminar registros", DesktopNotify.ERROR, 7000);
        }
    }

    public boolean ejecutarPagarTodo() {
        conexionTransaccionPagarTodo();
        return true;
    }

    public void conexionTransaccionPagarTodo() {
        miSesion = ConexionHibernate.tomarConexion();
        try {
            miSesion.beginTransaction();
            transaccionPagarTodo(miSesion);
            miSesion.getTransaction().commit();
            DesktopNotify.showDesktopMessage("   exito   ", "  Todos los registros cambiaron a pagado", DesktopNotify.SUCCESS, 7000);
        } catch (Exception e) {
            DesktopNotify.showDesktopMessage("   error    ", "   Error al intentar modificar registros", DesktopNotify.ERROR, 7000);
        }
    }

    public void transaccionPagarTodo(Session miSesion) {
        Integer totalFilas = principalCliente.getTablaGraficaPolizas().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGraficaPolizas().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaPolizaC().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        Estado e = (Estado) miSesion.get(Estado.class, 4);

        this.setConsultaList("from Vencimiento where polizaId="
                + id);
        obtenerListaConsulta();
        List lista = this.getListaResultados();
        for (Object o : lista) {
            Vencimiento v = (Vencimiento) o;
            v.setEstadoId(e);
            miSesion.saveOrUpdate(v);
        }

    }

    @Override
    public void obtenerFormularioRegistrar() {
        setFormularioRegistrar(this.getFormularioRegistrarVencimiento());
    }

    @Override
    public void obtenerFormularioEditar() {
        setFormularioEditar(this.getFormularioEditarVencimiento());
    }

    @Override
    public void transaccionRegistrar(Session miSesion) {
        Integer totalFilas = principalCliente.getTablaGraficaPolizas().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGraficaPolizas().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaPolizaC().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);

        this.setConsultaList("from Vencimiento where polizaId="
                + id);
        obtenerListaConsulta();
        List lista = this.getListaResultados();
//eliminar registros previos
        for (Object o : lista) {
            Vencimiento vbd = (Vencimiento) o;
            Vencimiento vd = (Vencimiento) miSesion.get(Vencimiento.class, vbd.getId());
            miSesion.delete(vd);
        }
        Integer numeroDeCuotas = Integer.valueOf(siEstaVacioNumero(formularioRegistrarVencimiento.getTxtTotalCuotas()));
        if (numeroDeCuotas == 0) {
            numeroDeCuotas = 1;
        }
        Poliza p = (Poliza) miSesion.get(Poliza.class, id);
        Fechas fecha = new Fechas();
        Estado ev = (Estado) miSesion.get(Estado.class, 3);
        for (int i = 0; i < numeroDeCuotas; i++) {
            Vencimiento v = new Vencimiento();
            v.setCuota(i + 1);
            if (i == 0) {
                v.setFechaVencimieto(siEstaVacioFecha(formularioRegistrarVencimiento.getrSDateChooser()));
            } else {

                Date fechaGrafica = siEstaVacioFecha(formularioRegistrarVencimiento.getrSDateChooser());
                v.setFechaVencimieto(fecha.sumarRestarMeses(fechaGrafica, i));
            }
            v.setPolizaId(p);
            v.setEstadoId(ev);
            miSesion.save(v);
        }

    }

    @Override
    public void transaccionEditar(Session miSesion) {
        Integer totalFilas = principalCliente.getTablaGraficaVencimiento().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGraficaVencimiento().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaVencimientoC().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        Vencimiento v = (Vencimiento) miSesion.get(Vencimiento.class, id);
        v.setFechaVencimieto(siEstaVacioFecha(formularioEditarVencimiento.getrSDateChooser()));
        miSesion.saveOrUpdate(v);
    }

    @Override
    public void transaccionEliminar(Session miSesion) {
        Integer totalFilas = principalCliente.getTablaGraficaVencimiento().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGraficaVencimiento().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaVencimientoC().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        Vencimiento v = (Vencimiento) miSesion.get(Vencimiento.class, id);
        miSesion.delete(v);

    }

    public void transaccionEliminarTodo(Session miSesion) {
        Integer totalFilas = principalCliente.getTablaGraficaPolizas().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGraficaPolizas().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaPolizaC().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        this.setConsultaList("from Vencimiento where polizaId="
                + id);
        obtenerListaConsulta();
        List lista = this.getListaResultados();
        for (Object o : lista) {
            Vencimiento v = (Vencimiento) o;
            miSesion.delete(v);
        }

    }

    public void actualizaEstadoVencimiento(List lista) {
        Integer numDiasRestantes;
        String diasRestantes;
        String estadoActual;
        Fechas fecha = new Fechas();
        miSesion = ConexionHibernate.tomarConexion();

        try {
            miSesion.beginTransaction();
            Estado e = (Estado) miSesion.get(Estado.class, 5);
            for (Object o : lista) {
                Vencimiento v = (Vencimiento) o;
                if (v.getPolizaId().getClienteId().getEstadoId().getId().equals(1)) {
                    fecha.diasRestantes(fecha.dateToListInteger(v.getFechaVencimieto()));
                    diasRestantes = fecha.getCasonegativo() + fecha.getDias();
                    estadoActual = (v.getEstadoId().getValor());
                    if (diasRestantes.equals("sin registros")) {
                    } else {
                        numDiasRestantes = Integer.valueOf(diasRestantes);
                        if (numDiasRestantes == 0 && estadoActual.equals("pendiente")) {

                            v.setEstadoId(e);
                            miSesion.saveOrUpdate(v);
                            System.out.println("estado cambiado" + v.getPolizaId().getNumero());
                        }
                    }
                }
            }
            miSesion.getTransaction().commit();
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException exc) {
        }

    }

}
