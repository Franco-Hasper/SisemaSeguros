package operacionesEmpresa;

import calsesPadre.ABM;
import entidades.Cliente;
import entidades.Empresa;
import entidades.Estado;
import escritorios.PrincipalEmpresa;
import java.util.List;
import org.hibernate.Session;

/**
 * @author Hasper Franco
 */
public class ABMEmpresa extends ABM {

    //se utiliza solo para eliminar
    PrincipalEmpresa principalEmpresa;

    public PrincipalEmpresa getPrincipalEmpresa() {
        return principalEmpresa;
    }

    public void setPrincipalEmpresa(PrincipalEmpresa principalEmpresa) {
        this.principalEmpresa = principalEmpresa;
    }

    @Override
    public void obtenerFormularioRegistrar() {
        setListaCampos(this.getPrincipalEmpresa().getListaCamposRegistrar());
    }

    @Override
    public void obtenerFormularioEditar() {
        setListaCampos(this.getPrincipalEmpresa().getListaCamposEditar());
    }

    @Override
    public void transaccionRegistrar(Session miSesion) {
        Estado e = (Estado) miSesion.get(Estado.class, 1);
        Empresa em = new Empresa();
        em.setNombre(principalEmpresa.getTxtNombreRegistar().getText());
        em.setEstadoId(e);
        miSesion.save(em);

    }

    @Override
    public void transaccionEditar(Session miSesion) {

        Integer totalFilas = principalEmpresa.getTablaGrafica().getRowCount();
        Integer filasSeleccionada = principalEmpresa.getTablaGrafica().getSelectedRow();
        List<Integer> listaResutadosActuales = principalEmpresa.getTablaEmpresa().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        Empresa em = (Empresa) miSesion.get(Empresa.class, id);
        em.setNombre(principalEmpresa.getTxtNombreEditar().getText());
        miSesion.saveOrUpdate(em);
    }

    @Override
    public void transaccionEliminar(Session miSesion) {
        Integer totalFilas = principalEmpresa.getTablaGrafica().getRowCount();
        Integer filasSeleccionada = principalEmpresa.getTablaGrafica().getSelectedRow();
        List<Integer> listaResutadosActuales = principalEmpresa.getTablaEmpresa().getListaResutladosActuales();
        Integer id = operacionesUtilidad.obtenerId(listaResutadosActuales, totalFilas, filasSeleccionada);
        Empresa em = (Empresa) miSesion.get(Empresa.class, id);
        Estado e = (Estado) miSesion.get(Estado.class, 2);
        em.setEstadoId(e);
        miSesion.saveOrUpdate(em);
    }

}
