package operacionesCliente;

import calsesPadre.InterfazGraficaFormularioEditar;
import clasesUtilidadGeneral.TextPrompt;
import escritorios.PrincipalCliente;
import formularios.FormularioEditarCliente;
import java.awt.Color;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarCliente extends InterfazGraficaFormularioEditar {

    protected PrincipalCliente principalCliente;

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    public InterfazGraficaFormularioEditarCliente() {
        setEstadoConsultaLocalidad(0);
    }

    protected TablaCliente tablaCliente;

    public TablaCliente getTablaCliente() {
        return tablaCliente;
    }

    public void setTablaCliente(TablaCliente tablaCliente) {
        this.tablaCliente = tablaCliente;
    }

    @Override
    public void nuevoFormularioEditar() {
        FormularioEditarCliente formularioEditar = new FormularioEditarCliente(frame, true);
        formularioEditar.setPrincipalCliente(principalCliente);
        principalCliente.setEditarCliente(formularioEditar);
        transferirDatos();
        infoTextPrompt();
        agregarBoxes();
        rellenarBoxes();
        formularioEditar.getBoxProvincia().setSelectedIndex(14);
        formularioEditar.getBoxLocalidad().setSelectedIndex(18);
        colorTema();
        principalCliente.getEditarCliente().setVisible(true);
    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("NOMBRE", principalCliente.getEditarCliente().getTxtNombre());
        new TextPrompt("APELLIDO", principalCliente.getEditarCliente().getTxtApellido());
        new TextPrompt("TELEFONO", principalCliente.getEditarCliente().getTxtTelefono());
        new TextPrompt("DOMICILIO", principalCliente.getEditarCliente().getTxtDireccion());
        new TextPrompt("NUMERO DE DOMICILIO", principalCliente.getEditarCliente().getTxtNroDireccion());
        new TextPrompt("DNI", principalCliente.getEditarCliente().getTxtNroDNI());
        principalCliente.getEditarCliente().getTxtNombre().grabFocus();
    }

    @Override
    public void colorTema() {
        principalCliente.getEditarCliente().getPanelPrincipalTop().setBackground(principalCliente.getPanelPrincipalTop().getBackground());
        principalCliente.getEditarCliente().getBtnCancelar().setBackground(principalCliente.getPanelPrincipalTop().getBackground());
        principalCliente.getEditarCliente().getBtnGuardarCambios().setBackground(principalCliente.getPanelPrincipalTop().getBackground());
        principalCliente.getEditarCliente().getrSDateChooser().setColorBackground(principalCliente.getPanelPrincipalTop().getBackground());
        principalCliente.getEditarCliente().getrSDateChooser().setColorButtonHover(Color.BLACK);
    }

    @Override
    public void transferirDatos() {
        TablaCliente tablaCliente = new TablaCliente();
        tablaCliente.setPrincipalCliente(principalCliente);
        int fila = principalCliente.getTablaGrafica().getSelectedRow();
        principalCliente.getEditarCliente().getTxtNombre().setText(principalCliente.getTablaGrafica().getValueAt(fila, 0).toString());
        principalCliente.getEditarCliente().getTxtApellido().setText(principalCliente.getTablaGrafica().getValueAt(fila, 1).toString());
        principalCliente.getEditarCliente().getTxtTelefono().setText(principalCliente.getTablaGrafica().getValueAt(fila, 2).toString());
    }

    @Override
    public void agregarBoxes() {
        this.setBoxLocalidad(principalCliente.getEditarCliente().getBoxLocalidad());
        this.setBoxProvincia(principalCliente.getEditarCliente().getBoxProvincia());
    }

    @Override
    public void rellenarBoxes() {
        this.consultaRellenarProvincia();
        this.consultaRellenarLocalidad();

    }

}
