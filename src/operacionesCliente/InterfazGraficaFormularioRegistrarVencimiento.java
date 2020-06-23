package operacionesCliente;

import calsesPadre.InterfazGraficaFormularioRegistrar;
import clasesUtilidadGeneral.TextPrompt;
import formularios.FormularioRegistrarVencimiento;
import java.awt.Color;
import java.util.Date;
import principal.PrincipalAdministrador;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioRegistrarVencimiento extends InterfazGraficaFormularioRegistrar {

    public InterfazGraficaFormularioRegistrarVencimiento() {
  
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
         
        FormularioRegistrarVencimiento formularioRegistrar = new FormularioRegistrarVencimiento(frame, true);
        principalAdministrador.getCliente().setRegistrarVencimiento(formularioRegistrar);
        infoTextPrompt();
        colorTema();
        //esto debe ir antes de se set visible si os si
        principalAdministrador.getCliente().getRegistrarVencimiento().setPrincipalAdministrador(principalAdministrador);
        principalAdministrador.getCliente().getRegistrarVencimiento().setVisible(true);
    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("TOTAL CUOTAS", principalAdministrador.getCliente().getRegistrarVencimiento().getTxtTotalCuotas());
        principalAdministrador.getCliente().getRegistrarVencimiento().getrSDateChooser().setDatoFecha(new Date());
        principalAdministrador.getCliente().getRegistrarVencimiento().getTxtTotalCuotas().grabFocus();
    }

    @Override
    public void agregarBoxes() {
    }

    @Override
    public void rellenarBoxes() {
    }

    @Override
    public void colorTema() {
        principalAdministrador.getCliente().getRegistrarVencimiento().getPanelPrincipalTop().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getRegistrarVencimiento().getrSDateChooser().setColorBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getRegistrarVencimiento().getrSDateChooser().setColorButtonHover(Color.BLACK);
        principalAdministrador.getCliente().getRegistrarVencimiento().getBtnRegistrar().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getRegistrarVencimiento().getBtnCancelar().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
    }

}
