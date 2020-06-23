package operacionesPoliza;

import calsesPadre.ABM;
import entidades.Cedula;
import entidades.Direccion;
import entidades.Estado;
import entidades.Localidad;
import entidades.Marca;
import entidades.Modelo;
import entidades.Poliza;
import entidades.Tipo;
import entidades.Uso;
import escritorios.PrincipalCliente;
import formularios.FormularioEditarCedula;
import formularios.FormularioRegistrarCedula;
import java.util.List;
import org.hibernate.Session;

/**
 * @author Hasper Franco
 */
public class ABMCedula extends ABM {

  
private PrincipalCliente principalCliente;

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }



  private  FormularioRegistrarCedula formularioRegistrarCedula;
   private  FormularioEditarCedula formularioEditarCedula;

    public FormularioRegistrarCedula getFormularioRegistrarCedula() {
        return formularioRegistrarCedula;
    }

    public void setFormularioRegistrarCedula(FormularioRegistrarCedula formularioRegistrarCedula) {
        this.formularioRegistrarCedula = formularioRegistrarCedula;
    }

    public FormularioEditarCedula getFormularioEditarCedula() {
        return formularioEditarCedula;
    }

    public void setFormularioEditarCedula(FormularioEditarCedula formularioEditarCedula) {
        this.formularioEditarCedula = formularioEditarCedula;
    }

    public void obtenerFormularioRegistrar() {
        setFormularioRegistrar(this.getFormularioRegistrarCedula());
        //setListaCampos(this.getFormularioRegistrarCedula().getListaCampos());
    }

    @Override
    public void obtenerFormularioEditar() {
        setFormularioEditar(this.getFormularioEditarCedula());
        // setListaCampos(this.getFormularioEditarCedula().getListaCampos());
    }

    @Override
    public void transaccionRegistrar(Session miSesion) {

        Estado e = (Estado) miSesion.get(Estado.class, 1);

        Cedula c = new Cedula();

        c.setTitular(siEstaVacio(formularioRegistrarCedula.getTxtTitular()));
        c.setNumero(siEstaVacio(formularioRegistrarCedula.getTxtCedula()));
        c.setDominio(siEstaVacio(formularioRegistrarCedula.getTxtDominio()));
        //esto es temporal para poder probar abm

        if (formularioRegistrarCedula.getRadioModelo().isSelected()) {
            Modelo newModelo = new Modelo();
            newModelo.setNombre(siEstaVacio(formularioEditarCedula.getTxtModelo()));

            if (formularioRegistrarCedula.getRadioMarca().isSelected()) {
                Marca newMarca = new Marca();
                newMarca.setNombre(siEstaVacio(formularioRegistrarCedula.getTxtMarca()));
                miSesion.save(newMarca);
                newModelo.setMarcaId(newMarca);
            } else {
                List<Marca> listaMarcas
                        = (List<Marca>) miSesion.createQuery("from Marca").list();

                for (Marca mcs : listaMarcas) {
                    if (mcs.getNombre().equals(formularioRegistrarCedula.getBoxMarcaVehiculo().getSelectedItem())) {
                        newModelo.setMarcaId(mcs);
                    }
                }
            }
            miSesion.save(newModelo);
            c.setModeloId(newModelo);
        } else {
            List<Modelo> listaModelos
                    = (List<Modelo>) miSesion.createQuery("from Modelo").list();

            for (Modelo m : listaModelos) {
                if (m.getNombre().equals(formularioRegistrarCedula.getBoxModeloVehiculo().getSelectedItem())) {

                    if (formularioRegistrarCedula.getRadioMarca().isSelected()) {
                        Marca newMarca = new Marca();
                        newMarca.setNombre(siEstaVacio(formularioRegistrarCedula.getTxtMarca()));
                        miSesion.save(newMarca);
                        m.setMarcaId(newMarca);
                    } else {
                        List<Marca> listaMarcas
                                = (List<Marca>) miSesion.createQuery("from Marca").list();

                        for (Marca mcs : listaMarcas) {
                            if (mcs.getNombre().equals(formularioRegistrarCedula.getBoxMarcaVehiculo().getSelectedItem())) {
                                m.setMarcaId(mcs);
                            }
                        }
                    }
                    c.setModeloId(m);
                }
            }

        }

        if (formularioRegistrarCedula.getRadioTipo().isSelected()) {
            Tipo newTipo = new Tipo();
            newTipo.setNombre(siEstaVacio(formularioRegistrarCedula.getTxtTipo()));
            miSesion.save(newTipo);
            c.setTipoId(newTipo);
        } else {
            List<Tipo> listaTipos
                    = (List<Tipo>) miSesion.createQuery("from Tipo").list();

            for (Tipo tipo : listaTipos) {
                if (tipo.getNombre().equals(formularioRegistrarCedula.getBoxTipoVehiculo().getSelectedItem())) {
                    c.setTipoId(tipo);
                }
            }
        }
        c.setDni(siEstaVacioNumero(formularioRegistrarCedula.getTxtDni()));

        if (formularioRegistrarCedula.getRadioTipo().isSelected()) {
            Uso newUso = new Uso();
            newUso.setNombre(siEstaVacio(formularioRegistrarCedula.getTxtUso()));
            miSesion.save(newUso);
            c.setUsoId(newUso);
        } else {
            List<Uso> listaUsos
                    = (List<Uso>) miSesion.createQuery("from Uso").list();

            for (Uso uso : listaUsos) {
                if (uso.getNombre().equals(formularioRegistrarCedula.getBoxUsoVehiculo().getSelectedItem())) {
                    c.setUsoId(uso);
                }
            }
        }
        c.setCahsis(siEstaVacio(formularioRegistrarCedula.getTxtChasis()));
        c.setMotor(siEstaVacio(formularioRegistrarCedula.getTxtMotor()));
        c.setVencimiento(siEstaVacioFecha(formularioRegistrarCedula.getrSDateChooser()));

        Direccion direccion = new Direccion();
        direccion.setNombre(siEstaVacio(formularioRegistrarCedula.getTxtDireccion()));
        direccion.setNumero((Integer.valueOf(siEstaVacioNumero(formularioRegistrarCedula.getTxtNroDireccion()))));

        List<Localidad> lista_Lc
                = (List<Localidad>) miSesion.createQuery("from Localidad").list();

        for (Localidad lc : lista_Lc) {
            if (lc.getNombre().equals(formularioRegistrarCedula.getBoxLocalidad().getSelectedItem())) {
                direccion.setLocalidadId(lc);
            }
        }

        miSesion.save(direccion);
        c.setDireccionId(direccion);
        
        String idPoliza = principalCliente.getTablaPolizaC().obtenerIdFilaSeleccionada().toString();
        Poliza p = (Poliza) miSesion.get(Poliza.class, Integer.parseInt(idPoliza));
        c.setPolizaId(p);
        c.setEstadoId(e);
        miSesion.save(c);

    }

    @Override
    public void transaccionEditar(Session miSesion) {

        Integer totalFilas = principalCliente.getTablaGraficacedula().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGraficacedula().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaCedulaC().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        Cedula c = (Cedula) miSesion.get(Cedula.class, id);

        c.setTitular(siEstaVacio(formularioEditarCedula.getTxtTitular()));
        c.setNumero(siEstaVacio(formularioEditarCedula.getTxtCedula()));
        c.setDominio(siEstaVacio(formularioEditarCedula.getTxtDominio()));
        //esto es temporal para poder probar abm

        if (formularioEditarCedula.getRadioModelo().isSelected()) {
            Modelo newModelo = new Modelo();
            newModelo.setNombre(formularioEditarCedula.getTxtModelo().getText());

            if (formularioEditarCedula.getRadioMarca().isSelected()) {
                Marca newMarca = new Marca();
                newMarca.setNombre(formularioEditarCedula.getTxtMarca().getText());
                miSesion.save(newMarca);
                newModelo.setMarcaId(newMarca);
            } else {
                List<Marca> listaMarcas
                        = (List<Marca>) miSesion.createQuery("from Marca").list();

                for (Marca mcs : listaMarcas) {
                    if (mcs.getNombre().equals(formularioEditarCedula.getBoxMarcaVehiculo().getSelectedItem())) {
                        newModelo.setMarcaId(mcs);
                    }
                }
            }
            miSesion.save(newModelo);
            c.setModeloId(newModelo);
        } else {
            List<Modelo> listaModelos
                    = (List<Modelo>) miSesion.createQuery("from Modelo").list();

            for (Modelo m : listaModelos) {
                if (m.getNombre().equals(formularioEditarCedula.getBoxModeloVehiculo().getSelectedItem())) {

                    if (formularioEditarCedula.getRadioMarca().isSelected()) {
                        Marca newMarca = new Marca();
                        newMarca.setNombre(formularioEditarCedula.getTxtMarca().getText());
                        miSesion.save(newMarca);
                        m.setMarcaId(newMarca);
                    } else {
                        List<Marca> listaMarcas
                                = (List<Marca>) miSesion.createQuery("from Marca").list();

                        for (Marca mcs : listaMarcas) {
                            if (mcs.getNombre().equals(formularioEditarCedula.getBoxMarcaVehiculo().getSelectedItem())) {
                                m.setMarcaId(mcs);
                            }
                        }
                    }
                    c.setModeloId(m);
                }
            }

        }

        if (formularioEditarCedula.getRadioTipo().isSelected()) {
            Tipo newTipo = new Tipo();
            newTipo.setNombre(formularioEditarCedula.getTxtTipo().getText());
            miSesion.save(newTipo);
            c.setTipoId(newTipo);
        } else {
            List<Tipo> listaTipos
                    = (List<Tipo>) miSesion.createQuery("from Tipo").list();

            for (Tipo tipo : listaTipos) {
                if (tipo.getNombre().equals(formularioEditarCedula.getBoxTipoVehiculo().getSelectedItem())) {
                    c.setTipoId(tipo);
                }
            }
        }

        c.setDni(siEstaVacioNumero(formularioEditarCedula.getTxtDni()));

        if (formularioEditarCedula.getRadioTipo().isSelected()) {
            Uso newUso = new Uso();
            newUso.setNombre(formularioEditarCedula.getTxtUso().getText());
            miSesion.save(newUso);
            c.setUsoId(newUso);
        } else {
            List<Uso> listaUsos
                    = (List<Uso>) miSesion.createQuery("from Uso").list();

            for (Uso uso : listaUsos) {
                if (uso.getNombre().equals(formularioEditarCedula.getBoxUsoVehiculo().getSelectedItem())) {
                    c.setUsoId(uso);
                }
            }
        }

        c.setCahsis(siEstaVacio(formularioEditarCedula.getTxtChasis()));
        c.setMotor(siEstaVacio(formularioEditarCedula.getTxtMotor()));
        c.setVencimiento(siEstaVacioFecha(formularioEditarCedula.getrSDateChooser()));

        Direccion direccion = new Direccion();

        direccion.setNombre(siEstaVacio(formularioEditarCedula.getTxtDireccion()));
        direccion.setNumero((Integer.valueOf(siEstaVacioNumero(formularioEditarCedula.getTxtNroDireccion()))));

        List<Localidad> lista_Lc
                = (List<Localidad>) miSesion.createQuery("from Localidad").list();

        for (Localidad lc : lista_Lc) {
            if (lc.getNombre().equals(formularioEditarCedula.getBoxLocalidad().getSelectedItem())) {
                direccion.setLocalidadId(lc);
            }
        }
        miSesion.save(direccion);
        c.setDireccionId(direccion);
        miSesion.saveOrUpdate(c);
    }

    @Override
    public void transaccionEliminar(Session miSesion) {
        Estado e = (Estado) miSesion.get(Estado.class, 2);
        Integer totalFilas = principalCliente.getTablaGraficacedula().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGraficacedula().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaCedulaC().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        Cedula c = (Cedula) miSesion.get(Cedula.class, id);
        c.setEstadoId(e);
        miSesion.saveOrUpdate(c);
    }

}
