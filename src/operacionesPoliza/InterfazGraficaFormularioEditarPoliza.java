package operacionesPoliza;

import calsesPadre.InterfazGraficaFormularioEditar;
import clasesUtilidadGeneral.TextPrompt;
import formularios.FormularioEditarPoliza;
import operacionesCliente.TablaPolizaC;
import principal.PrincipalAdministrador;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarPoliza extends InterfazGraficaFormularioEditar {

    public InterfazGraficaFormularioEditarPoliza() {
    }

    private PrincipalAdministrador principalAdministrador;

    public PrincipalAdministrador getPrincipalAdministrador() {
        return principalAdministrador;
    }

    public void setPrincipalAdministrador(PrincipalAdministrador principalAdministrador) {
        this.principalAdministrador = principalAdministrador;
    }

    @Override
    public void nuevoFormularioEditar() {

        FormularioEditarPoliza formularioEditar = new FormularioEditarPoliza(frame, true);
        formularioEditar.setPrincipalAdministrador(principalAdministrador);
        principalAdministrador.getCliente().setEditarPoliza(formularioEditar);
        agregarBoxes();
        rellenarBoxes();
        infoTextPrompt();
        transferirDatos();
        colorTema();
        //esto debe ir antes de se set visible si os si
        principalAdministrador.getCliente().getEditarPoliza().setPrincipalAdministrador(principalAdministrador);
        principalAdministrador.getCliente().getEditarPoliza().setVisible(true);

    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("NÚMERO DE POLIZA", principalAdministrador.getCliente().getEditarPoliza().getTxtNumeroPoliza());
        principalAdministrador.getCliente().getEditarPoliza().getBoxEmpresa().grabFocus();
    }

    public void agregarBoxes() {
        this.setBoxEmpresa(principalAdministrador.getCliente().getEditarPoliza().getBoxEmpresa());
        this.setBoxTipoSeguro(principalAdministrador.getCliente().getEditarPoliza().getBoxTipoSeguro());
    }

    public void rellenarBoxes() {
        this.consultaRellenarEmpresa();
        this.consultaRellenarTipoSeguro();
    }

    @Override
    public void colorTema() {
        principalAdministrador.getCliente().getEditarPoliza().getPanelPrincipalTop().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getEditarPoliza().getBtnGardarCambios().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getEditarPoliza().getBtnCancelar().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());

    }

    @Override
    public void transferirDatos() {
        //TablaPolizaC tablaPoliza = new TablaPolizaC();
        principalAdministrador.getCliente().getTablaPolizaC().setPrincipalCliente(principalAdministrador.getCliente());
        int fila = principalAdministrador.getCliente().getTablaGraficaPolizas().getSelectedRow();
        principalAdministrador.getCliente().getEditarPoliza().getTxtNumeroPoliza().setText(principalAdministrador.getCliente().getTablaGraficaPolizas().getValueAt(fila, 0).toString());
    }

}
