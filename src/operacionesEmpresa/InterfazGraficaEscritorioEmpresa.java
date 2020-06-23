package operacionesEmpresa;

import operacionesCliente.*;
import calsesPadre.InterfazGraficaEscritorio;
import escritorios.PrincipalCliente;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalEmpresa;

/**
 *
 * @author Hasper Franco
 */
public class InterfazGraficaEscritorioEmpresa extends InterfazGraficaEscritorio {

    protected PrincipalEmpresa principalEmpresa;

    public PrincipalEmpresa getPrincipalEmpresa() {
        return principalEmpresa;
    }

    public void setPrincipalEmpresa(PrincipalEmpresa principalEmpresa) {
        this.principalEmpresa = principalEmpresa;
    }

    @Override
    public void nuevaVentana() {
        if (principalAdministrador.getEscritorio().estacerrado(principalAdministrador.getEmpresa())) {
            PrincipalEmpresa principalEmpresa = new PrincipalEmpresa();
            //ya no se usa directamente principalCliente ahora se usa    principalAdministrador.instancias.getCliente() ************************
            principalAdministrador.setEmpresa(principalEmpresa);
            BasicInternalFrameTitlePane menupanel = (BasicInternalFrameTitlePane) ((BasicInternalFrameUI) principalAdministrador.getEmpresa().getUI()).getNorthPane();
            int width = principalAdministrador.getEscritorio().getWidth();
            int Height = principalAdministrador.getEscritorio().getHeight();
            principalAdministrador.getEmpresa().remove(menupanel);
            principalAdministrador.getEmpresa().setSize(width, Height);
            principalAdministrador.getEscritorio().add(principalAdministrador.getEmpresa());
            TablaEmpresa tablaEmpresa = new TablaEmpresa();
            tablaEmpresa.setPrincipalEmpresa(principalAdministrador.getEmpresa());
            tablaEmpresa.ejecutarRellenarTabla();
            principalAdministrador.getEmpresa().setTablaEmpresa(tablaEmpresa);
        }
        colorInterfazEscritorio();
        infoTextPrompt();
        principalAdministrador.getEmpresa().show();
        principalAdministrador.getEmpresa().toFront();
        //guardo la instancia de pad en Pc
        principalAdministrador.getEmpresa().setPrincipalAdministrador(this.getPrincipalAdministrador());
    }

    @Override
    public void colorInterfazEscritorio() {
        principalAdministrador.getEmpresa().getPanelPrincipalTop().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getEmpresa().getTablaGrafica().setForeground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getEmpresa().getTablaGrafica().setSelectionBackground(principalAdministrador.getPanelPrincipalTop().getBackground());

        principalAdministrador.getEmpresa().getBtnEliminarEmpresa().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getEmpresa().getBtnGuardar().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getEmpresa().getBtnGuardarCambios().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());

    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("BUSCAR POR NOMBRE", principalAdministrador.getEmpresa().getTxtBuscar());
        principalAdministrador.getEmpresa().getTxtBuscar().grabFocus();
    }

}
