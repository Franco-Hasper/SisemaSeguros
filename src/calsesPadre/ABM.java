package calsesPadre;

import clasesUtilidadGeneral.OperacionesUtiles;
import conexion.ConexionHibernate;
import ds.desktop.notify.DesktopNotify;
import java.util.Date;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.hibernate.Session;
import rojeru_san.componentes.RSDateChooser;

/**
 * @author Hasper Franco
 */
public abstract class ABM extends Consultas {

    protected OperacionesUtiles operacionesUtilidad = new OperacionesUtiles();
    protected JOptionPane jOptionPane = new JOptionPane();
    protected JDialog formularioRegistrar;
    protected JDialog formularioEditar;
    protected List listaCampos;

    public JDialog getFormularioRegistrar() {
        return formularioRegistrar;
    }

    public void setFormularioRegistrar(JDialog formularioRegistrar) {
        this.formularioRegistrar = formularioRegistrar;
    }

    public JDialog getFormularioEditar() {
        return formularioEditar;
    }

    public void setFormularioEditar(JDialog formularioEditar) {
        this.formularioEditar = formularioEditar;
    }

    public List getListaCampos() {
        return listaCampos;
    }

    public void setListaCampos(List listaCampos) {
        this.listaCampos = listaCampos;
    }

    /**
     * Jala la instancia de la interfaz grafica del formulario registrar para
     * cerrarlo luego de ejecutarReistrar.
     */
    public abstract void obtenerFormularioRegistrar();

    /**
     * Jala la instancia de la interfaz grafica del formulario editar para
     * cerrarlo luego de ejecutarEditar.
     */
    public abstract void obtenerFormularioEditar();

    /**
     * Convoca el metodo de conexion para realizar la transaccion registrar y
     * cierra el formulario.
     *
     */
    public boolean ejecutarRegistrar() {
        obtenerFormularioRegistrar();
        conexionTransaccionRegistrar();
        //en ocasiones no se utiliza un formulario
        try {
            getFormularioRegistrar().dispose();
        } catch (NullPointerException e) {
        }
        return true;

    }

    /**
     * Verifica que todos los campos del formulario esten completados, convoca
     * el metodo de conexion para realizar la transaccion editar y cierra el
     * formulario.
     *
     */
    public boolean ejecutarEditar() {
        obtenerFormularioEditar();
        conexionTransaccionEditar();
        try {
            getFormularioEditar().dispose();
        } catch (NullPointerException e) {
        }
        return true;
    }

    /**
     * Convoca el metodo de conexion para realizar la transaccion eliminar y
     * cierra el formulario.
     *
     */
    public boolean ejecutarEliminar() {
        conexionTransaccionEliminar();
        return true;
    }

    /**
     * Abre una conexion con la base de datos, convoca el metodo que realiza la
     * transaccion de datos a instancias hibernate y realiza un commit para
     * generar un nuevo registro en la base de datos, una vez completada la
     * accion, envia un mensaje informando al usuario el estado de la accion.
     */
    public void conexionTransaccionRegistrar() {
        Session miSesion = ConexionHibernate.tomarConexion();
        try {
        miSesion.beginTransaction();
        transaccionRegistrar(miSesion);
        miSesion.getTransaction().commit();

        DesktopNotify.showDesktopMessage("   exito   ", "   Nuevo registro creado con exito", DesktopNotify.SUCCESS, 7000);
        } catch (Exception e) {
            DesktopNotify.showDesktopMessage("   error    ", "   Error al intentar crear  registro", DesktopNotify.ERROR, 7000);
        }
    }

    /**
     * Abre una conexion con la base de datos, convoca el metodo que realiza la
     * transaccion de datos a instancias hibernate y realiza un commit para dar
     * de actualizar un registro existente en la base de datos, una vez
     * completada la accion, envia un mensaje informando al usuario el estado de
     * la accion.
     */
    public void conexionTransaccionEditar() {

        Session miSesion = ConexionHibernate.tomarConexion();

        try {
        miSesion.beginTransaction();
        transaccionEditar(miSesion);
        miSesion.getTransaction().commit();

        DesktopNotify.showDesktopMessage("   exito   ", "    Registro editado con exito", DesktopNotify.SUCCESS, 7000);
        } catch (Exception e) {
            DesktopNotify.showDesktopMessage("   error   ", "   Error al intentar editar  registro", DesktopNotify.ERROR, 7000);
        }
    }

    /**
     * Abre una conexion con la base de datos, convoca el metodo que realiza la
     * transaccion de datos a instancias hibernate y realiza un commit para dar
     * de baja un registro existente en la base de datos, una vez completada la
     * accion, envia un mensaje informando al usuario el estado de la accion.
     */
    public void conexionTransaccionEliminar() {

        Session miSesion = ConexionHibernate.tomarConexion();

        try {
        miSesion.beginTransaction();
        transaccionEliminar(miSesion);
        miSesion.getTransaction().commit();

        DesktopNotify.showDesktopMessage("   exito   ", "    Registro eliminado con exito", DesktopNotify.SUCCESS, 7000);
        } catch (Exception e) {
            DesktopNotify.showDesktopMessage("   error    ", "    Error al intentar eliminar  registro", DesktopNotify.ERROR, 7000);
        }

    }

    /**
     * Guarda los datos de la interfaz grafica en instancias de clases Hibernate
     * para generar un nuevo registro.
     *
     * @param miSesion
     */
    public abstract void transaccionRegistrar(Session miSesion);

    /**
     * Guarda los datos de la interfaz grafica en instancias de clases Hibernate
     * para actualizar un registro existente.
     *
     * @param miSesion
     */
    public abstract void transaccionEditar(Session miSesion);

    /**
     * Guarda los datos de la interfaz grafica en instancias de clases Hibernate
     * para dar de baja un registro existente.
     *
     * @param miSesion
     */
    public abstract void transaccionEliminar(Session miSesion);

    /**
     * Inserta en el objeto el valor "sin registros" en el caso de que el campo
     * de texto este vacio"
     */
    protected String siEstaVacio(JTextField campo) {
        if (campo.getText().equals("")) {
            return "sin registros";
        } else {
            return campo.getText();
        }
    }

    /**
     * Inserta en el objeto el valor "0" en el caso de que el campo de texto
     * este vacio"
     */
    protected String siEstaVacioNumero(JTextField campo) {
        if (campo.getText().equals("")) {
            return "0";
        } else {
            return campo.getText();
        }
    }

    /**
     * Inserta en el objeto el valor "fecha actual" en el caso de que el campo
     * de texto este vacio"
     */
    protected Date siEstaVacioFecha(RSDateChooser calendario) {
        Date fechaActual = new Date();

        if (calendario.getDatoFecha() == null) {
            return fechaActual;
        } else {
            return calendario.getDatoFecha();
        }
    }
}
