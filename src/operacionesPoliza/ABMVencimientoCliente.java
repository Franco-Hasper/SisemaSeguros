package operacionesPoliza;

import calsesPadre.ABM;
import conexion.ConexionHibernate;
import ds.desktop.notify.DesktopNotify;
import entidades.Estado;
import entidades.Vencimiento;
import escritorios.PrincipalCliente;
import java.util.List;
import org.hibernate.Session;

/**
 * @author Hasper Franco
 */
public class ABMVencimientoCliente extends ABM {

    PrincipalCliente principalCliente;

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    public boolean ejecutarCambiarEstado() {
        conexionTransaccionCambiarEstado();
        return true;
    }

    public void conexionTransaccionCambiarEstado() {
        Session miSesion = ConexionHibernate.tomarConexion();
//        try {
        miSesion.beginTransaction();
        transaccionCambiarEstado(miSesion);
        miSesion.getTransaction().commit();
        DesktopNotify.showDesktopMessage("   exito   ", "  Registro modificado con exito", DesktopNotify.SUCCESS, 7000);
//        } catch (Exception e) {
//            DesktopNotify.showDesktopMessage("   error    ", "   Error al intentar modificar  registro", DesktopNotify.ERROR, 7000);
//        }
    }

    public void transaccionCambiarEstado(Session miSesion) {
      // Fechas fecha = new Fechas();
        Estado e = (Estado) miSesion.get(Estado.class, principalCliente.getEstado());
        Integer totalFilas = principalCliente.getTablaGraficaVencimiento().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGraficaVencimiento().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaVencimientoC().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        Vencimiento ve = (Vencimiento) miSesion.get(Vencimiento.class, id);
        ve.setEstadoId(e);
        miSesion.saveOrUpdate(ve);
       
        

//        TablaCliente tablaCliente = new TablaCliente();
//        tablaCliente.setPrincipalCliente(principalCliente);
//        Integer IdPoliza = tablaCliente.obtenerIdPoliza();
//        Integer idVencimiento = null;
//        this.setConsultaList("from Vencimiento where polizaId="
//                + IdPoliza.toString());
//        obtenerListaConsulta();
//        Integer columna = principalCliente.getTablaGrafica().getSelectedColumn();
//        if (columna.equals(7)) {
//            for (Object o : getListaResultados()) {
//                Vencimiento v = (Vencimiento) o;
//                if (fecha.mesAntesOmesActual(v.getFechaVencimieto(), -1)) {
//                    idVencimiento = v.getId();
//                }
//            }
//        } else if (columna.equals(8)) {
//            for (Object o : getListaResultados()) {
//                Vencimiento v = (Vencimiento) o;
//                if (fecha.mesAntesOmesActual(v.getFechaVencimieto(), 0)) {
//                    idVencimiento = v.getId();
//                }
//            }
//        }
//
//        Vencimiento ve = (Vencimiento) miSesion.get(Vencimiento.class, idVencimiento);
//        ve.setEstadoId(e);
//        miSesion.saveOrUpdate(ve);

    }

    @Override
    public void obtenerFormularioRegistrar() {
    }

    @Override
    public void obtenerFormularioEditar() {
    }

    @Override
    public void transaccionEditar(Session miSesion) {
    }

    @Override
    public void transaccionEliminar(Session miSesion) {
    }

    @Override
    public void transaccionRegistrar(Session miSesion) {
    }

}
