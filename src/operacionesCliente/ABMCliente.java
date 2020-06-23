package operacionesCliente;

import calsesPadre.ABM;
import entidades.Cedula;
import entidades.Cliente;
import entidades.Direccion;
import entidades.Empresa;
import entidades.Estado;
import entidades.Localidad;
import entidades.Modelo;
import entidades.Poliza;
import entidades.Sexo;
import entidades.Tipo;
import entidades.TipoSeguro;
import entidades.Uso;
import formularios.FormularioEditarCliente;
import formularios.FormularioRegistrarCliente;
import escritorios.PrincipalCliente;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

/**
 * @author Hasper Franco
 */
public class ABMCliente extends ABM {

    FormularioRegistrarCliente formularioRegistrarCliente;
    FormularioEditarCliente formularioEditarCliente;

    //se utiliza solo para eliminar
    PrincipalCliente principalCliente;

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    public FormularioRegistrarCliente getFormularioRegistrarCliente() {
        return formularioRegistrarCliente;
    }

    public void setFormularioRegistrarCliente(FormularioRegistrarCliente formularioRegistrarCliente) {
        this.formularioRegistrarCliente = formularioRegistrarCliente;
    }

    public FormularioEditarCliente getFormularioEditarCliente() {
        return formularioEditarCliente;
    }

    public void setFormularioEditarCliente(FormularioEditarCliente formularioEditarCliente) {
        this.formularioEditarCliente = formularioEditarCliente;
    }

    public void obtenerFormularioRegistrar() {
        setFormularioRegistrar(this.getFormularioRegistrarCliente());
        //setListaCampos(this.getFormularioRegistrarCliente().getListaCampos());
    }

    public void obtenerFormularioEditar() {
        setFormularioEditar(this.getFormularioEditarCliente());
        //setListaCampos(this.getFormularioEditarCliente().getListaCampos());
    }

    @Override
    public void transaccionRegistrar(Session miSesion) {

        Estado e = (Estado) miSesion.get(Estado.class, 1);
        Cliente c = new Cliente();
        c.setNombre(siEstaVacio(formularioRegistrarCliente.getTxtNombre()));
        c.setApellido(siEstaVacio(formularioRegistrarCliente.getTxtApellido()));
        c.setTelefono(siEstaVacio(formularioRegistrarCliente.getTxtTelefono()));
        c.setDni(siEstaVacio(formularioRegistrarCliente.getTxtNroDNI()));
        c.setFechaNacimiento(siEstaVacioFecha(formularioRegistrarCliente.getrSDateChooser()));

        if (formularioRegistrarCliente.getRadioBtnFemenino().isSelected()) {
            Sexo s = (Sexo) miSesion.get(Sexo.class, 1);
            c.setSexoId(s);
        } else if (formularioRegistrarCliente.getRadioBtnMasculino().isSelected()) {
            Sexo s = (Sexo) miSesion.get(Sexo.class, 2);
            c.setSexoId(s);
        } else if (formularioRegistrarCliente.getRadioBtnOtros().isSelected()) {
            Sexo s = (Sexo) miSesion.get(Sexo.class, 3);
            c.setSexoId(s);
        } else {
            Sexo s = (Sexo) miSesion.get(Sexo.class, 3);
            c.setSexoId(s);
        }

        Direccion direccion = new Direccion();
        direccion.setNombre(siEstaVacio(formularioRegistrarCliente.getTxtDireccion()));
        direccion.setNumero((Integer.valueOf(siEstaVacioNumero(formularioRegistrarCliente.getTxtNroDireccion()))));
        List<Localidad> lista_Lc
                = (List<Localidad>) miSesion.createQuery("from Localidad").list();

        for (Localidad lc : lista_Lc) {
            if (lc.getNombre().equals(formularioRegistrarCliente.getBoxLocalidad().getSelectedItem())) {
                direccion.setLocalidadId(lc);
            }
        }
        miSesion.save(direccion);
        c.setDireccionId(direccion);
        c.setEstadoId(e);
        miSesion.save(c);

        //domicilio
        Poliza p = new Poliza();
        p.setNumero(siEstaVacio(formularioRegistrarCliente.getTxtNumeroPoliza()));

        List<Empresa> lista_empresa
                = (List<Empresa>) miSesion.createQuery("from Empresa").list();
        for (Empresa em : lista_empresa) {
            if (em.getNombre().equals(formularioRegistrarCliente.getBoxEmpresa().getSelectedItem())) {
                p.setEmpresaId(em);
            }
        }
        List<TipoSeguro> lista_tipoSeguro
                = (List<TipoSeguro>) miSesion.createQuery("from TipoSeguro").list();
        for (TipoSeguro ts : lista_tipoSeguro) {
            if (ts.getNombre().equals(formularioRegistrarCliente.getBoxTipoSeguro().getSelectedItem())) {
                p.setTipoSeguroId(ts);
            }
        }
        p.setEstadoId(e);
        p.setClienteId(c);
        miSesion.save(p);
        //cedula
        if (formularioRegistrarCliente.getTxtDominio().getText().equals("")) {
        } else {
            Cedula ce = new Cedula();
            ce.setTitular("sin registros");
            ce.setNumero("sin registros");
            ce.setDominio(siEstaVacio(formularioRegistrarCliente.getTxtDominio()));
//CREAR EN BASE DE DATSO MODELO Y MARCA SIN REGISTROS
            Modelo mo = (Modelo) miSesion.get(Modelo.class, 1);
            ce.setModeloId(mo);
            Tipo t = (Tipo) miSesion.get(Tipo.class, 1);
            ce.setTipoId(t);
            ce.setDni("0");
            Uso u = (Uso) miSesion.get(Uso.class, 1);
            ce.setUsoId(u);
            ce.setCahsis("0");
            ce.setMotor("sin registros");
            Date fechaActual = new Date();
            ce.setVencimiento(fechaActual);
            Direccion direccionCedula = new Direccion();
            direccionCedula.setNombre("sin registros");
            direccionCedula.setNumero(0);
            Localidad lc = (Localidad) miSesion.get(Localidad.class, 1515);
            direccionCedula.setLocalidadId(lc);
            miSesion.save(direccionCedula);
            ce.setDireccionId(direccionCedula);
            ce.setPolizaId(p);
            ce.setEstadoId(e);
            miSesion.save(ce);
        }

    }

    @Override
    public void transaccionEditar(Session miSesion) {
//        String idCliente = formularioEditarCliente.getPrincipalCliente().getTablaCliente().obtenerIdFilaSeleccionada().toString();
//        Cliente c = (Cliente) miSesion.get(Cliente.class,Integer.parseInt(idCliente));

        Integer totalFilas = principalCliente.getTablaGrafica().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGrafica().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaCliente().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        Cliente c = (Cliente) miSesion.get(Cliente.class, id);

        c.setNombre(siEstaVacio(formularioEditarCliente.getTxtNombre()));
        c.setApellido(siEstaVacio(formularioEditarCliente.getTxtApellido()));
        c.setTelefono(siEstaVacio(formularioEditarCliente.getTxtTelefono()));
        c.setDni(siEstaVacio(formularioEditarCliente.getTxtNroDNI()));
        c.setFechaNacimiento(siEstaVacioFecha(formularioEditarCliente.getrSDateChooser()));

        if (formularioEditarCliente.getRadioBtnFemenino().isSelected()) {
            Sexo s = (Sexo) miSesion.get(Sexo.class, 1);
            c.setSexoId(s);
        } else if (formularioEditarCliente.getRadioBtnMasculino().isSelected()) {
            Sexo s = (Sexo) miSesion.get(Sexo.class, 2);
            c.setSexoId(s);
        } else if (formularioEditarCliente.getRadioBtnOtros().isSelected()) {
            Sexo s = (Sexo) miSesion.get(Sexo.class, 3);
            c.setSexoId(s);
        } else {
            Sexo s = (Sexo) miSesion.get(Sexo.class, 3);
            c.setSexoId(s);
        }
        Direccion dir = (Direccion) miSesion.get(Direccion.class, c.getDireccionId().getId());
        dir.setNombre(siEstaVacio(formularioEditarCliente.getTxtDireccion()));
        dir.setNumero((Integer.valueOf(siEstaVacioNumero(formularioEditarCliente.getTxtNroDireccion()))));
        List<Localidad> lista_Lc
                = (List<Localidad>) miSesion.createQuery("from Localidad").list();
        for (Localidad lc : lista_Lc) {
            if (lc.getNombre().equals(formularioEditarCliente.getBoxLocalidad().getSelectedItem())) {
                dir.setLocalidadId(lc);
            }
        }
        miSesion.saveOrUpdate(dir);
        miSesion.saveOrUpdate(c);
    }

    @Override
    public void transaccionEliminar(Session miSesion) {
        Estado e = (Estado) miSesion.get(Estado.class, 2);
        Integer totalFilas = principalCliente.getTablaGrafica().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGrafica().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaCliente().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        Cliente c = (Cliente) miSesion.get(Cliente.class, id);
        c.setEstadoId(e);
        miSesion.saveOrUpdate(c);
    }

    public void transaccionRegistrarSave(Session miSesion) {
        Estado e = (Estado) miSesion.get(Estado.class, 1);
        Cliente c = new Cliente();
        c.setNombre(siEstaVacio(formularioRegistrarCliente.getTxtNombre()));
        c.setApellido(siEstaVacio(formularioRegistrarCliente.getTxtApellido()));
        c.setTelefono(siEstaVacio(formularioRegistrarCliente.getTxtTelefono()));
        c.setEstadoId(e);
        miSesion.save(c);

    }

}
