package operacionesPoliza;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import clasesUtilidadGeneral.TextPrompt;
import formularios.FormularioRegistrarCedula;
import java.awt.Color;
import java.util.Date;
import principal.PrincipalAdministrador;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioRegistrarCedula extends InterfazGraficaFormularioRegistrar {

    public InterfazGraficaFormularioRegistrarCedula() {
        setEstadoConsultaLocalidad(0);
        setEstadoConsultaModelo(0);
    }
    private PrincipalAdministrador principalAdministrador;

    public PrincipalAdministrador getPrincipalAdministrador() {
        return principalAdministrador;
    }

    public void setPrincipalAdministrador(PrincipalAdministrador principalAdministrador) {
        this.principalAdministrador = principalAdministrador;
    }


    @Override
    public void nuevoFormularioRegistrar() {
        FormularioRegistrarCedula formularioRegistrar = new FormularioRegistrarCedula(frame, true);
        principalAdministrador.getCliente().setRegistrarCedula(formularioRegistrar);
        agregarBoxes();
        rellenarBoxes();
         formularioRegistrar.getBoxProvincia().setSelectedIndex(14);
        formularioRegistrar.getBoxLocalidad().setSelectedIndex(18);
        infoTextPrompt();
        deshabilitarLabels();
        colorTema();
        principalAdministrador.getCliente().getRegistrarCedula().setPrincipalAdministrador(principalAdministrador);
        principalAdministrador.getCliente().getRegistrarCedula().setVisible(true);
    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("TIULAR", principalAdministrador.getCliente().getRegistrarCedula().getTxtTitular());
        new TextPrompt("DNI", principalAdministrador.getCliente().getRegistrarCedula().getTxtDni());
        new TextPrompt("N° CEDULA", principalAdministrador.getCliente().getRegistrarCedula().getTxtCedula());
        new TextPrompt("DOMINIO (PATENTE)", principalAdministrador.getCliente().getRegistrarCedula().getTxtDominio());
        new TextPrompt("MARCA", principalAdministrador.getCliente().getRegistrarCedula().getTxtMarca());
        new TextPrompt("MODELO", principalAdministrador.getCliente().getRegistrarCedula().getTxtModelo());
        new TextPrompt("TIPO", principalAdministrador.getCliente().getRegistrarCedula().getTxtTipo());
        new TextPrompt("USO", principalAdministrador.getCliente().getRegistrarCedula().getTxtUso());
        new TextPrompt("CHASIS", principalAdministrador.getCliente().getRegistrarCedula().getTxtChasis());
        new TextPrompt("MOTOR", principalAdministrador.getCliente().getRegistrarCedula().getTxtMotor());
        new TextPrompt("DIRECCION", principalAdministrador.getCliente().getRegistrarCedula().getTxtDireccion());
        new TextPrompt("N° DIRECCION", principalAdministrador.getCliente().getRegistrarCedula().getTxtNroDireccion());
        principalAdministrador.getCliente().getRegistrarCedula().getrSDateChooser().setDatoFecha(new Date());
        principalAdministrador.getCliente().getRegistrarCedula().getTxtTitular().grabFocus();
    }

    public void deshabilitarLabels(){
        principalAdministrador.getCliente().getRegistrarCedula().getTxtModelo().setEnabled(false);
        principalAdministrador.getCliente().getRegistrarCedula().getTxtMarca().setEnabled(false);
        principalAdministrador.getCliente().getRegistrarCedula().getTxtTipo().setEnabled(false);
        principalAdministrador.getCliente().getRegistrarCedula().getTxtUso().setEnabled(false);
    }
    
    
    
    @Override
    public void agregarBoxes() {
        this.setBoxLocalidad(principalAdministrador.getCliente().getRegistrarCedula().getBoxLocalidad());
        this.setBoxProvincia(principalAdministrador.getCliente().getRegistrarCedula().getBoxProvincia());
        this.setBoxTipoVehiculo(principalAdministrador.getCliente().getRegistrarCedula().getBoxTipoVehiculo());
        this.setBoxUsoVehiculo(principalAdministrador.getCliente().getRegistrarCedula().getBoxUsoVehiculo());
        this.setBoxMarcaVehiculo(principalAdministrador.getCliente().getRegistrarCedula().getBoxMarcaVehiculo());
        this.setBoxModeloVehiculo(principalAdministrador.getCliente().getRegistrarCedula().getBoxModeloVehiculo());
    }

    @Override
    public void rellenarBoxes() {
        this.consultaRellenarProvincia();
        this.consultaRellenarLocalidad();
        this.consultaRellenarTipo();
        this.consultaRellenarUso();
        this.consultaRellenarMarca();
        this.consultaRellenarModelo();
    }

    @Override
    public void colorTema() {
        principalAdministrador.getCliente().getRegistrarCedula().getPanelPrincipalTop().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getRegistrarCedula().getrSDateChooser().setColorBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getRegistrarCedula().getrSDateChooser().setColorButtonHover(Color.BLACK);
        principalAdministrador.getCliente().getRegistrarCedula().getBtnCancelar().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getRegistrarCedula().getBtnRegistrar().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
    }

}
