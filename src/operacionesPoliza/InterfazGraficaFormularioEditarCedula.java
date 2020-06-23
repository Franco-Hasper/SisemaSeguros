package operacionesPoliza;

import calsesPadre.InterfazGraficaFormularioEditar;
import clasesUtilidadGeneral.TextPrompt;
import formularios.FormularioEditarCedula;
import java.awt.Color;
import java.util.Date;
import principal.PrincipalAdministrador;

/**
 * @author Hasper Franco
 */
public class InterfazGraficaFormularioEditarCedula extends InterfazGraficaFormularioEditar {

    public InterfazGraficaFormularioEditarCedula() {
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
    public void nuevoFormularioEditar() {
        FormularioEditarCedula formularioEditar = new FormularioEditarCedula(frame, true);
        formularioEditar.setPrincipalAdministrador(principalAdministrador);
        principalAdministrador.getCliente().setEditarCedula(formularioEditar);
        agregarBoxes();
        rellenarBoxes();
        formularioEditar.getBoxProvincia().setSelectedIndex(14);
        formularioEditar.getBoxLocalidad().setSelectedIndex(18);
        infoTextPrompt();
        transferirDatos();
        deshabilitarLabels();
        colorTema();
        principalAdministrador.getCliente().getEditarCedula().setPrincipalAdministrador(principalAdministrador);
        principalAdministrador.getCliente().getEditarCedula().setVisible(true);
    }

    @Override
    public void infoTextPrompt() {
        new TextPrompt("TIULAR", principalAdministrador.getCliente().getEditarCedula().getTxtTitular());
        new TextPrompt("DNI", principalAdministrador.getCliente().getEditarCedula().getTxtDni());
        new TextPrompt("N° CEDULA", principalAdministrador.getCliente().getEditarCedula().getTxtCedula());
        new TextPrompt("DOMINIO (PATENTE)", principalAdministrador.getCliente().getEditarCedula().getTxtDominio());
        new TextPrompt("MARCA", principalAdministrador.getCliente().getEditarCedula().getTxtMarca());
        new TextPrompt("MODELO", principalAdministrador.getCliente().getEditarCedula().getTxtModelo());
        new TextPrompt("TIPO", principalAdministrador.getCliente().getEditarCedula().getTxtTipo());
        new TextPrompt("USO", principalAdministrador.getCliente().getEditarCedula().getTxtUso());
        new TextPrompt("CHASIS", principalAdministrador.getCliente().getEditarCedula().getTxtChasis());
        new TextPrompt("MOTOR", principalAdministrador.getCliente().getEditarCedula().getTxtMotor());
        new TextPrompt("DIRECCION", principalAdministrador.getCliente().getEditarCedula().getTxtDireccion());
        new TextPrompt("N° DIRECCION", principalAdministrador.getCliente().getEditarCedula().getTxtNroDireccion());

        principalAdministrador.getCliente().getEditarCedula().getTxtTitular().grabFocus();
    }

    public void deshabilitarLabels() {
        principalAdministrador.getCliente().getEditarCedula().getTxtModelo().setEnabled(false);
        principalAdministrador.getCliente().getEditarCedula().getTxtMarca().setEnabled(false);
        principalAdministrador.getCliente().getEditarCedula().getTxtTipo().setEnabled(false);
        principalAdministrador.getCliente().getEditarCedula().getTxtUso().setEnabled(false);
    }

    @Override
    public void agregarBoxes() {
        this.setBoxLocalidad(principalAdministrador.getCliente().getEditarCedula().getBoxLocalidad());
        this.setBoxProvincia(principalAdministrador.getCliente().getEditarCedula().getBoxProvincia());
        this.setBoxTipoVehiculo(principalAdministrador.getCliente().getEditarCedula().getBoxTipoVehiculo());
        this.setBoxUsoVehiculo(principalAdministrador.getCliente().getEditarCedula().getBoxUsoVehiculo());
        this.setBoxMarcaVehiculo(principalAdministrador.getCliente().getEditarCedula().getBoxMarcaVehiculo());
        this.setBoxModeloVehiculo(principalAdministrador.getCliente().getEditarCedula().getBoxModeloVehiculo());
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
        principalAdministrador.getCliente().getEditarCedula().getPanelPrincipalTop().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getEditarCedula().getrSDateChooser().setColorBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getEditarCedula().getrSDateChooser().setColorButtonHover(Color.BLACK);
        principalAdministrador.getCliente().getEditarCedula().getBtnCancelar().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
        principalAdministrador.getCliente().getEditarCedula().getBtnGuardarCambios().setBackground(principalAdministrador.getCliente().getPanelPrincipalTop().getBackground());
    }

    @Override
    public void transferirDatos() {
//        TablaPoliza TablaPoliza = new TablaPoliza();
        principalAdministrador.getCliente().getTablaPolizaC().setPrincipalCliente(principalAdministrador.getCliente());
        int filap = principalAdministrador.getCliente().getTablaGraficaPolizas().getSelectedRow();
        principalAdministrador.getCliente().getEditarCedula().getTxtPoliza().setText(principalAdministrador.getCliente().getTablaGraficaPolizas().getValueAt(filap, 0).toString());

//        TablaCedula tablaCedual = new TablaCedula();
//        tablaCedual.setPR(principalAdministrador.getCliente());
        int fila = principalAdministrador.getCliente().getTablaGraficacedula().getSelectedRow();
        principalAdministrador.getCliente().getEditarCedula().getTxtCedula().setText(principalAdministrador.getCliente().getTablaGraficacedula().getValueAt(fila, 0).toString());
        principalAdministrador.getCliente().getEditarCedula().getTxtTitular().setText(principalAdministrador.getCliente().getTablaGraficacedula().getValueAt(fila, 1).toString());
        principalAdministrador.getCliente().getEditarCedula().getTxtDni().setText(principalAdministrador.getCliente().getTablaGraficacedula().getValueAt(fila, 2).toString());
        principalAdministrador.getCliente().getEditarCedula().getTxtDominio().setText(principalAdministrador.getCliente().getTablaGraficacedula().getValueAt(fila, 4).toString());
        principalAdministrador.getCliente().getEditarCedula().getTxtChasis().setText(principalAdministrador.getCliente().getTablaGraficacedula().getValueAt(fila, 9).toString());
        principalAdministrador.getCliente().getEditarCedula().getTxtMotor().setText(principalAdministrador.getCliente().getTablaGraficacedula().getValueAt(fila, 10).toString());

    }

}
