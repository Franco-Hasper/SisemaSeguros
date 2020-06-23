package operacionesPoliza;

import calsesPadre.ABM;
import clasesUtilidadGeneral.Fechas;
import entidades.Cliente;
import entidades.Empresa;
import entidades.Estado;
import entidades.Poliza;
import entidades.TipoSeguro;
import entidades.Vencimiento;
import escritorios.PrincipalCliente;
import formularios.FormularioEditarPoliza;
import formularios.FormularioRegistrarPoliza;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

/**
 * @author Hasper Franco
 */
public class ABMPoliza extends ABM {

    FormularioRegistrarPoliza formularioRegistrarPoliza;
    FormularioEditarPoliza formularioEditarPoliza;

    //se utiliza solo para eliminar y editar
    //PrincipalPoliza principalPoliza;
    //se utiliza para obtener el id cliente
    private PrincipalCliente principalCliente;

    public PrincipalCliente getPrincipalCliente() {
        return principalCliente;
    }

    public void setPrincipalCliente(PrincipalCliente principalCliente) {
        this.principalCliente = principalCliente;
    }

    public FormularioRegistrarPoliza getFormularioRegistrarPoliza() {
        return formularioRegistrarPoliza;
    }

    public void setFormularioRegistrarPoliza(FormularioRegistrarPoliza formularioRegistrarPoliza) {
        this.formularioRegistrarPoliza = formularioRegistrarPoliza;
    }

    public FormularioEditarPoliza getFormularioEditarPoliza() {
        return formularioEditarPoliza;
    }

    public void setFormularioEditarPoliza(FormularioEditarPoliza formularioEditarPoliza) {
        this.formularioEditarPoliza = formularioEditarPoliza;
    }


    public void obtenerFormularioRegistrar() {
        setFormularioRegistrar(this.getFormularioRegistrarPoliza());
        // setListaCampos(this.getFormularioRegistrarPoliza().getListaCampos());
    }

    public void obtenerFormularioEditar() {
        setFormularioEditar(this.getFormularioEditarPoliza());
        // setListaCampos(this.getFormularioEditarPoliza().getListaCampos());
    }

    @Override
    public void transaccionRegistrar(Session miSesion) {

        Estado e = (Estado) miSesion.get(Estado.class, 1);
        Poliza p = new Poliza();

        p.setNumero(siEstaVacio(formularioRegistrarPoliza.getTxtNumeroPoliza()));

        
        List<Empresa> lista_empresa
                = (List<Empresa>) miSesion.createQuery("from Empresa").list();
        for (Empresa em : lista_empresa) {
            if (em.getNombre().equals(formularioRegistrarPoliza.getBoxEmpresa().getSelectedItem())) {
                p.setEmpresaId(em);
            }
        }
        List<TipoSeguro> lista_tipoSeguro
                = (List<TipoSeguro>) miSesion.createQuery("from TipoSeguro").list();
        for (TipoSeguro ts : lista_tipoSeguro) {
            if (ts.getNombre().equals(formularioRegistrarPoliza.getBoxTipoSeguro().getSelectedItem())) {
                p.setTipoSeguroId(ts);
            }
        }
        p.setEstadoId(e);

        Integer totalFilas = principalCliente.getTablaGrafica().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGrafica().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaCliente().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        Cliente c = (Cliente) miSesion.get(Cliente.class, id);
        p.setClienteId(c);
        miSesion.save(p);
        
        if (formularioRegistrarPoliza.getTxtTotalCuotas().getText().equals("")) {

        } else {

            Integer numeroDeCuotas = Integer.valueOf(siEstaVacio(formularioRegistrarPoliza.getTxtTotalCuotas()));

            Fechas fecha = new Fechas();
            Estado ev = (Estado) miSesion.get(Estado.class, 3);
            for (int i = 0; i < numeroDeCuotas; i++) {
                Vencimiento v = new Vencimiento();
                v.setCuota(i + 1);
                if (i == 0) {
                    v.setFechaVencimieto(siEstaVacioFecha(formularioRegistrarPoliza.getrSDateChooser()));
                } else {

                    Date fechaGrafica = siEstaVacioFecha(formularioRegistrarPoliza.getrSDateChooser());
                    v.setFechaVencimieto(fecha.sumarRestarMeses(fechaGrafica, i));
                }
                v.setPolizaId(p);
                v.setEstadoId(ev);
                miSesion.save(v);
            }
        }

    }

    @Override
    public void transaccionEditar(Session miSesion) {
      
        Integer totalFilas = principalCliente.getTablaGraficaPolizas().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGraficaPolizas().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaPolizaC().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        Poliza p = (Poliza) miSesion.get(Poliza.class, id);
        
        p.setNumero(siEstaVacio(formularioEditarPoliza.getTxtNumeroPoliza()));

        List<Empresa> lista_empresa
                = (List<Empresa>) miSesion.createQuery("from Empresa").list();
        for (Empresa em : lista_empresa) {
            if (em.getNombre().equals(formularioEditarPoliza.getBoxEmpresa().getSelectedItem())) {
                p.setEmpresaId(em);
            }
        }
        List<TipoSeguro> lista_tipoSeguro
                = (List<TipoSeguro>) miSesion.createQuery("from TipoSeguro").list();
        for (TipoSeguro ts : lista_tipoSeguro) {
            if (ts.getNombre().equals(formularioEditarPoliza.getBoxTipoSeguro().getSelectedItem())) {
                p.setTipoSeguroId(ts);
            }
        }
        miSesion.save(p);
    }

    @Override
    public void transaccionEliminar(Session miSesion) {
        Integer totalFilas = principalCliente.getTablaGraficaPolizas().getRowCount();
        Integer filasSeleccionada = principalCliente.getTablaGraficaPolizas().getSelectedRow();
        List<Integer> listaResutadosActuales = principalCliente.getTablaPolizaC().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        Poliza p = (Poliza) miSesion.get(Poliza.class, id);
        Estado e = (Estado) miSesion.get(Estado.class, 2);
        p.setEstadoId(e);
        miSesion.saveOrUpdate(e);

    }

}
