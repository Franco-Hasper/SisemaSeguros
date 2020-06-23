package operacionesCliente;

import calsesPadre.InterfazGraficaEscritorio;
import clasesUtilidadGeneral.Fechas;
import escritorios.PrincipalCliente;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import clasesUtilidadGeneral.TextPrompt;
import formularios.MenuDetallesCliente;
import java.awt.Frame;
import java.awt.Rectangle;

/**
 *
 * @author Hasper Franco
 */
public class InterfazGraficaEscritorioCliente extends InterfazGraficaEscritorio {

    protected PrincipalCliente principalCliente;

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    @Override
    public void nuevaVentana() {
        if (principalAdministrador.getEscritorio().estacerrado(principalAdministrador.getCliente())) {
            PrincipalCliente principalCliente = new PrincipalCliente();
            principalAdministrador.setCliente(principalCliente);
            BasicInternalFrameTitlePane menupanel = (BasicInternalFrameTitlePane) ((BasicInternalFrameUI) principalAdministrador.getCliente().getUI()).getNorthPane();
            int width = principalAdministrador.getEscritorio().getWidth();
            int Height = principalAdministrador.getEscritorio().getHeight();
            principalAdministrador.getCliente().remove(menupanel);
            principalAdministrador.getCliente().setSize(width, Height);
            principalAdministrador.getEscritorio().add(principalAdministrador.getCliente());
            TablaCliente tablaCliente = new TablaCliente();
            tablaCliente.setPrincipalCliente(principalAdministrador.getCliente());
            tablaCliente.ejecutarRellenarTabla();
            principalAdministrador.getCliente().setTablaCliente(tablaCliente);

            MenuDetallesCliente menuDetallesCliente = new MenuDetallesCliente(new Frame(), true);
            menuDetallesCliente.setPrincipalAdministrador(principalAdministrador);
            principalAdministrador.getCliente().setMenuDetallesCliente(menuDetallesCliente);

            TablaPolizaC tablaPoliza = new TablaPolizaC();
            tablaPoliza.setPrincipalCliente(principalAdministrador.getCliente());
            tablaPoliza.ejecutarRellenarTabla();
            principalAdministrador.getCliente().setTablaPolizaC(tablaPoliza);

            //tablaPoliza.vaciarTabla();
            TablaVencimientoC tablaVencimiento = new TablaVencimientoC();
            tablaVencimiento.setPrincipalCliente(principalAdministrador.getCliente());
            tablaVencimiento.ejecutarRellenarTabla();
            principalAdministrador.getCliente().setTablaVencimientoC(tablaVencimiento);

            TablaCedulaC tablaCedula = new TablaCedulaC();
            tablaCedula.setPrincipalCliente(principalAdministrador.getCliente());
            tablaCedula.ejecutarRellenarTabla();
            principalAdministrador.getCliente().setTablaCedulaC(tablaCedula);

            DetallesCliente detalles = new DetallesCliente();
            principalAdministrador.getCliente().setDetalles(detalles);
            try {
                new Fechas().notificarFechaVencimientoLista(principalAdministrador.getCliente().getTablaVencimientoC().getListaResultados());
            } catch (NumberFormatException e) {
            }
            new ABMVencimiento().actualizaEstadoVencimiento(principalAdministrador.getCliente().getTablaVencimientoC().getListaResultados());
        }

        //solamente se hace consulta y rellena tabla...nada de notificaciones
        principalAdministrador.getCliente().getTablaCliente().setEstadoConsulta(0);
        principalAdministrador.getCliente().getTablaCliente().ejecutarRellenarTabla();
        colorInterfazEscritorio();
        infoTextPrompt();
        principalAdministrador.getCliente().show();
        principalAdministrador.getCliente().toFront();
        principalAdministrador.getCliente().setPrincipalAdministrador(this.getPrincipalAdministrador());
    }

    @Override
    public void colorInterfazEscritorio() {
        principalAdministrador.getCliente().getPanelPrincipalTop().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getTablaGrafica().setForeground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getTablaGrafica().setSelectionBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getTablaGraficaVencimiento().setForeground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getTablaGraficaVencimiento().setSelectionBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getTablaGraficaPolizas().setForeground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getTablaGraficaPolizas().setSelectionBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getTablaGraficacedula().setForeground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getTablaGraficacedula().setSelectionBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getBtnPagado().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getBtnVencido().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getBtnPendiente().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getBtnEliminarCedula().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getBtnEliminarPoliza().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getBtnEliminarVEncimiento().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getBtnnDetalles().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getBtnnEditarCedula().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getBtnnEditarCliente().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getBtnnEditarPoliza().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getBtnnEditarVencimiento().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getBtnEliminarCli().setBackground(principalAdministrador.getPanelPrincipalTop().getBackground());

    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("BUSCAR POR NOMBRE", principalAdministrador.getCliente().getTxtBuscar());
        principalAdministrador.getCliente().getTxtBuscar().grabFocus();
    }

}
