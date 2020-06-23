package operacionesCliente;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalCliente;
import formularios.FormularioRegistrarCliente;
import java.awt.Color;
import java.util.Date;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioRegistrarCliente extends InterfazGraficaFormularioRegistrar {

    public InterfazGraficaFormularioRegistrarCliente() {
        setEstadoConsultaLocalidad(0);
    }

    private PrincipalCliente principalCliente;

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    @Override
    public void nuevoFormularioRegistrar() {
        FormularioRegistrarCliente formularioRegistrar = new FormularioRegistrarCliente(frame, true);
        formularioRegistrar.setPrincipalCliente(principalCliente);
        principalCliente.setRegistrarCliente(formularioRegistrar);
        agregarBoxes();
        rellenarBoxes();
        formularioRegistrar.getBoxProvincia().setSelectedIndex(14);
        formularioRegistrar.getBoxLocalidad().setSelectedIndex(18);
        infoTextPrompt();
        colorTema();
        principalCliente.getRegistrarCliente().setVisible(true);
    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("NOMBRE", principalCliente.getRegistrarCliente().getTxtNombre());
        new TextPrompt("APELLIDO", principalCliente.getRegistrarCliente().getTxtApellido());
        new TextPrompt("TELEFONO", principalCliente.getRegistrarCliente().getTxtTelefono());
        new TextPrompt("NÚEMRO DE POLIZA", principalCliente.getRegistrarCliente().getTxtNumeroPoliza());
        new TextPrompt("DOMINIO (PATENTE)", principalCliente.getRegistrarCliente().getTxtDominio());
        new TextPrompt("DOMICILIO", principalCliente.getRegistrarCliente().getTxtDireccion());
        new TextPrompt("NUMERO DE DOMICILIO", principalCliente.getRegistrarCliente().getTxtNroDireccion());
        new TextPrompt("DNI", principalCliente.getRegistrarCliente().getTxtNroDNI());
        principalCliente.getRegistrarCliente().getrSDateChooser().setDatoFecha(new Date());
        principalCliente.getRegistrarCliente().getTxtNombre().grabFocus();
    }

    @Override
    public void agregarBoxes() {
        this.setBoxLocalidad(principalCliente.getRegistrarCliente().getBoxLocalidad());
        this.setBoxProvincia(principalCliente.getRegistrarCliente().getBoxProvincia());
        this.setBoxEmpresa(principalCliente.getRegistrarCliente().getBoxEmpresa());
        this.setBoxTipoSeguro(principalCliente.getRegistrarCliente().getBoxTipoSeguro());
    }

    @Override
    public void rellenarBoxes() {
        this.consultaRellenarProvincia();
        this.consultaRellenarLocalidad();
        this.consultaRellenarEmpresa();
        this.consultaRellenarTipoSeguro();
    }

    @Override
    public void colorTema() {
        principalCliente.getRegistrarCliente().getPanelPrincipalTop().setBackground(principalCliente.getPanelPrincipalTop().getBackground());
        principalCliente.getRegistrarCliente().getBtnCancelar().setBackground(principalCliente.getPanelPrincipalTop().getBackground());
        principalCliente.getRegistrarCliente().getBtnRegistrar().setBackground(principalCliente.getPanelPrincipalTop().getBackground());
        principalCliente.getRegistrarCliente().getrSDateChooser().setColorBackground(principalCliente.getPanelPrincipalTop().getBackground());
        principalCliente.getRegistrarCliente().getrSDateChooser().setColorButtonHover(Color.BLACK);
    }

}
