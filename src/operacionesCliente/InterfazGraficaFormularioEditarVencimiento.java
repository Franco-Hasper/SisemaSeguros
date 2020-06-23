package operacionesCliente;

import calsesPadre.InterfazGraficaFormularioEditar;
import formularios.FormularioEditarVencimiento;
import java.awt.Color;
import principal.PrincipalAdministrador;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarVencimiento extends InterfazGraficaFormularioEditar {

    public InterfazGraficaFormularioEditarVencimiento() {

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

        FormularioEditarVencimiento formularioEditar = new FormularioEditarVencimiento(frame, true);
        principalAdministrador.getCliente().setEditarVencimiento(formularioEditar);
        colorTema();
        transferirDatos();
        principalAdministrador.getCliente().getEditarVencimiento().setPrincipalAdministrador(principalAdministrador);
        principalAdministrador.getCliente().getEditarVencimiento().setVisible(true);

    }

    @Override
    public void infoTextPrompt() {
    }

    @Override
    public void agregarBoxes() {
    }

    @Override
    public void rellenarBoxes() {
    }

    @Override
    public void colorTema() {
        principalAdministrador.getCliente().getEditarVencimiento().getPanelPrincipalTop().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getEditarVencimiento().getrSDateChooser().setColorBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getEditarVencimiento().getrSDateChooser().setColorButtonHover(Color.BLACK);
        principalAdministrador.getCliente().getEditarVencimiento().getBtnCancelar().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getEditarVencimiento().getBtnRegistrar().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
    }

    @Override
    public void transferirDatos() {
        int fila = principalAdministrador.getCliente().getTablaGraficaVencimiento().getSelectedRow();
        String numeroCuota = principalAdministrador.getCliente().getTablaGraficaVencimiento().getValueAt(fila, 0).toString();
        principalAdministrador.getCliente().getEditarVencimiento().getTxtCuota().setText(numeroCuota);
        principalAdministrador.getCliente().getEditarVencimiento().getrSDateChooser().grabFocus();
    }

}
