package operacionesPoliza;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import clasesUtilidadGeneral.TextPrompt;
import formularios.FormularioRegistrarPoliza;
import java.awt.Color;
import java.util.Date;
import principal.PrincipalAdministrador;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioRegistrarPoliza extends InterfazGraficaFormularioRegistrar {

    public InterfazGraficaFormularioRegistrarPoliza() {
   
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
         
        FormularioRegistrarPoliza formularioRegistrar = new FormularioRegistrarPoliza(frame, true);
        principalAdministrador.getCliente().setRegistrarPoliza(formularioRegistrar);
        agregarBoxes();
        rellenarBoxes();
        infoTextPrompt();
        colorTema();
        //esto debe ir antes de se set visible si os si
        principalAdministrador.getCliente().getRegistrarPoliza().setPrincipalAdministrador(principalAdministrador);
        principalAdministrador.getCliente().getRegistrarPoliza().setVisible(true);
        
      
       
    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("NÚMERO DE POLIZA", principalAdministrador.getCliente().getRegistrarPoliza().getTxtNumeroPoliza());
        new TextPrompt("TOTAL CUOTAS", principalAdministrador.getCliente().getRegistrarPoliza().getTxtTotalCuotas());
        principalAdministrador.getCliente().getRegistrarPoliza().getrSDateChooser().setDatoFecha(new Date());
        principalAdministrador.getCliente().getRegistrarPoliza().getBoxEmpresa().grabFocus();
    }

    @Override
    public void agregarBoxes() {
        this.setBoxEmpresa(principalAdministrador.getCliente().getRegistrarPoliza().getBoxEmpresa());
        this.setBoxTipoSeguro(principalAdministrador.getCliente().getRegistrarPoliza().getBoxTipoSeguro());
    }

    @Override
    public void rellenarBoxes() {
       this.consultaRellenarEmpresa();
       this.consultaRellenarTipoSeguro();
    }

    @Override
    public void colorTema() {
        principalAdministrador.getCliente().getRegistrarPoliza().getPanelPrincipalTop().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getRegistrarPoliza().getrSDateChooser().setColorBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getRegistrarPoliza().getrSDateChooser().setColorButtonHover(Color.BLACK);
        principalAdministrador.getCliente().getRegistrarPoliza().getBtnRegistrar().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getRegistrarPoliza().getBtnCancelar().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
    
    }

}
