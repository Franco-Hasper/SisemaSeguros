package operacionesCliente;

import calsesPadre.Consultas;
import clasesUtilidadGeneral.OperacionesUtiles;
import conexion.ConexionHibernate;
import entidades.Cliente;
import entidades.Estado;
import escritorios.PrincipalCliente;
import java.util.List;
import org.hibernate.Session;

/**
 * @author Hasper Franco
 */
public class DetallesCliente extends Consultas {

    OperacionesUtiles operacionesUtilidad = new OperacionesUtiles();

    private PrincipalCliente principalCliente;

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void ejecutarRellenarDatosMenu() {
        Session miSesion = ConexionHibernate.tomarConexion();
        String direccion = "";
        String nroDireccion = "";
        String localidad = "";
        String provincia = "";
        String Dni = "";
        String fechaNacimiento = "";
        String sexo = "";

        Integer totalFilas = principalCliente.getTablaGrafica().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGrafica().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaCliente().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);

        miSesion.beginTransaction();
        Cliente c = (Cliente) miSesion.get(Cliente.class, id);
        miSesion.getTransaction().commit();

        direccion = c.getDireccionId().getNombre();
        nroDireccion = String.valueOf(c.getDireccionId().getNumero());
        localidad = c.getDireccionId().getLocalidadId().getNombre();
        provincia = c.getDireccionId().getLocalidadId().getProvinciaId().getNombre();
        Dni = c.getDni();
        fechaNacimiento = (String) operacionesUtilidad.formatoFechaSinHora(c.getFechaNacimiento());
        sexo = c.getSexoId().getValor().toString();
        datosMenu(direccion, nroDireccion, localidad, provincia, Dni, fechaNacimiento, sexo);
    }

    public void datosMenu(String domicilio, String nroDomicilio, String localidad, String provincia, String Dni, String fechaNacimiento, String sexo) {

        principalCliente.getMenuDetallesCliente().getLblDomicilio().setText(domicilio);
        principalCliente.getMenuDetallesCliente().getLblNumeroDomicilio().setText(nroDomicilio);
        principalCliente.getMenuDetallesCliente().getLblLocalidad().setText(localidad);
        principalCliente.getMenuDetallesCliente().getLblProvincia().setText(provincia);
        principalCliente.getMenuDetallesCliente().getLblDNI().setText(Dni);
        principalCliente.getMenuDetallesCliente().getLblFechaNac().setText(fechaNacimiento);
        principalCliente.getMenuDetallesCliente().getLblSexo().setText(sexo);
        vista();
    }

    private void vista() {
        principalCliente.getMenuDetallesCliente().setLocationRelativeTo(null);
        principalCliente.getMenuDetallesCliente().setVisible(true);
    }

}
