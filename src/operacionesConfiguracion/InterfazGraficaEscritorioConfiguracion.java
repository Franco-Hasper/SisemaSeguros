package operacionesConfiguracion;

import calsesPadre.InterfazGraficaEscritorio;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import escritorios.PrincipalConfiguracion;
import principal.PrincipalAdministrador;

/**
 *
 * @author Hasper Franco
 */
public class InterfazGraficaEscritorioConfiguracion extends InterfazGraficaEscritorio {

    private PrincipalAdministrador principalAdministrador;

    public PrincipalAdministrador getPrincipalAdministrador() {
        return principalAdministrador;
    }

    public void setPrincipalAdministrador(PrincipalAdministrador principalAdministrador) {
        this.principalAdministrador = principalAdministrador;
    }

    @Override
    public void nuevaVentana() {
        if (principalAdministrador.getEscritorio().estacerrado(principalAdministrador.getConfiguracion())) {
            PrincipalConfiguracion principalConfiguracion = new PrincipalConfiguracion();
            principalAdministrador.setConfiguracion(principalConfiguracion);
            BasicInternalFrameTitlePane menupanel = (BasicInternalFrameTitlePane) ((BasicInternalFrameUI) principalAdministrador.getConfiguracion().getUI()).getNorthPane();
            int width = principalAdministrador.getEscritorio().getWidth();
            int Height = principalAdministrador.getEscritorio().getHeight();
            principalAdministrador.getConfiguracion().remove(menupanel);
            principalAdministrador.getConfiguracion().setSize(width, Height);

            principalAdministrador.getEscritorio().add(principalAdministrador.getConfiguracion());
        }

        colorInterfazEscritorio();
        infoTextPrompt();
        principalAdministrador.getConfiguracion().show();
        principalAdministrador.getConfiguracion().toFront();
        principalAdministrador.getConfiguracion().setPrincipalAdministrador(this.getPrincipalAdministrador());
    }

    @Override
    public void colorInterfazEscritorio() {
        principalAdministrador.getConfiguracion().getPanelPrincipalTop().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
    }

    @Override
    public void infoTextPrompt() {

    }

}
