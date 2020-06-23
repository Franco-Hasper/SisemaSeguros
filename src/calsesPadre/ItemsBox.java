package calsesPadre;

import clasesUtilidadGeneral.OperacionesUtiles;
import entidades.Empresa;
import entidades.Localidad;
import entidades.Marca;
import entidades.Modelo;
import entidades.Provincia;
import entidades.Tipo;
import entidades.TipoSeguro;
import entidades.Uso;
import java.util.List;
import javax.swing.JComboBox;

/**
 * @author Hasper Franco
 */
public abstract class ItemsBox extends Consultas {

    private final OperacionesUtiles operacionesUtilidad = new OperacionesUtiles();

    protected JComboBox boxProvincia;
    protected JComboBox boxLocalidad;
    protected JComboBox boxTipoDomicilio;
    protected JComboBox boxTipoTelefono;
    protected JComboBox boxTipoSeguro;
    protected JComboBox boxEmpresa;
    private JComboBox boxTipoVehiculo;
    private JComboBox boxModeloVehiculo;
    private JComboBox boxMarcaVehiculo;
    private JComboBox boxUsoVehiculo;
    protected Integer estadoConsultaLocalidad;
    protected Integer estadoConsultaModelo;

    List listaResultadosProvincias;

    public List getListaResultadosProvincias() {
        return listaResultadosProvincias;
    }

    public void setListaResultadosProvincias(List listaResultadosProvincias) {
        this.listaResultadosProvincias = listaResultadosProvincias;
    }

    public List getListaResultadosMarcas() {
        return listaResultadosMarcas;
    }

    public void setListaResultadosMarcas(List listaResultadosMarcas) {
        this.listaResultadosMarcas = listaResultadosMarcas;
    }
    List listaResultadosMarcas;

    public Integer getEstadoConsultaModelo() {
        return estadoConsultaModelo;
    }

    public void setEstadoConsultaModelo(Integer estadoConsultaModelo) {
        this.estadoConsultaModelo = estadoConsultaModelo;
    }

    public Integer getEstadoConsultaLocalidad() {
        return estadoConsultaLocalidad;
    }

    public void setEstadoConsultaLocalidad(Integer estadoConsultaLocalidad) {
        this.estadoConsultaLocalidad = estadoConsultaLocalidad;
    }

    public JComboBox getBoxProvincia() {
        return boxProvincia;
    }

    public void setBoxProvincia(JComboBox boxProvincia) {
        this.boxProvincia = boxProvincia;
    }

    public JComboBox getBoxLocalidad() {
        return boxLocalidad;
    }

    public void setBoxLocalidad(JComboBox boxLocalidad) {
        this.boxLocalidad = boxLocalidad;
    }

    public JComboBox getBoxTipoDomicilio() {
        return boxTipoDomicilio;
    }

    public void setBoxTipoDomicilio(JComboBox boxTipoDomicilio) {
        this.boxTipoDomicilio = boxTipoDomicilio;
    }

    public JComboBox getBoxTipoTelefono() {
        return boxTipoTelefono;
    }

    public void setBoxTipoTelefono(JComboBox boxTipoTelefono) {
        this.boxTipoTelefono = boxTipoTelefono;
    }

    public JComboBox getBoxTipoSeguro() {
        return boxTipoSeguro;
    }

    public void setBoxTipoSeguro(JComboBox boxTipoSeguro) {
        this.boxTipoSeguro = boxTipoSeguro;
    }

    public JComboBox getBoxEmpresa() {
        return boxEmpresa;
    }

    public void setBoxEmpresa(JComboBox boxEmpresa) {
        this.boxEmpresa = boxEmpresa;
    }

    /**
     * Se utiliza para insertar todos los boxes del formulario en un solo
     * metodo.
     */
    public abstract void agregarBoxes();

    /**
     * Se utiliza para implemntar varios consultaRellenar# en un solo metodo.
     */
    public abstract void rellenarBoxes();

    /**
     * Evalua el estado de la consulta para eviatar realizar una cada vez que se
     * seleccione un box provincia.
     */
    public void evaluarEstadoConsultaLocalidad() {
        switch (getEstadoConsultaLocalidad()) {
            case 0:

                consultaRellenarLocalidad();
                break;
            case 1:
                consultaRellenarLocalidadSinBusqueda();
                break;
        }
    }

    /**
     * Genera la consulta, obtiene los resultados y ejecuta el metodo
     * rellenarBoxProvincia.
     */
    public void consultaRellenarProvincia() {
        setConsultaList("from Provincia");
        obtenerListaConsulta();
        rellenarBoxProvincia();
    }

    /**
     * Genera la consulta, obtiene los resultados y ejecuta el metodo
     * rellenarBoxLocalidad.
     */
    public void consultaRellenarLocalidad() {
        while (getBoxLocalidad().getItemCount() > 0) {
            getBoxLocalidad().removeAllItems();
        }
        setConsultaList("from Provincia");
        obtenerListaConsulta();
        this.setListaResultadosProvincias(getListaResultados());
        rellenarBoxLocalidad();
    }

    /**
     * Se implementa en el caso de que la consulta ya haya sido realizada
     * previamente, ejecuta el metodo rellenarBoxLocalidad.
     */
    public void consultaRellenarLocalidadSinBusqueda() {
        while (getBoxLocalidad().getItemCount() > 0) {
            getBoxLocalidad().removeAllItems();
        }
        rellenarBoxLocalidad();
    }

    /**
     * Agrega Items obtenidos de la consulta al boxProvincia.
     */
    public void rellenarBoxProvincia() {
        List lista = this.getListaResultados();
        List<Provincia> lista_provincia
                = (List<Provincia>) lista;
        for (Object o : lista_provincia) {
            Provincia p = (Provincia) o;
            operacionesUtilidad.agregarItem(p.getNombre(), getBoxProvincia());
        }

    }

    /**
     * Agrega Items obtenidos de la consulta al boxLocalidad dependiendo de la
     * provincia seleccionada.
     */
    public void rellenarBoxLocalidad() {
        List lista = this.getListaResultadosProvincias();
        List<Provincia> lista_Provincias
                = (List<Provincia>) lista;
        for (Object o : lista_Provincias) {
            Provincia p = (Provincia) o;
            if (p.getNombre().equals(getBoxProvincia().getSelectedItem().toString())) {
                List<Localidad> localidades = p.getLocalidades();
                for (Localidad l : localidades) {
                    getBoxLocalidad().addItem(l.getNombre());
                }

            }

        }
        setEstadoConsultaLocalidad(1);
    }

    /*------------------------------------------------------------------------*/
    public void consultaRellenarEmpresa() {
        while (getBoxEmpresa().getItemCount() > 0) {
            getBoxEmpresa().removeAllItems();
        }
        setConsultaList("from Empresa where estadoId=1");
        obtenerListaConsulta();
        rellenarBoxEmpresa();
    }

    /**
     * Agrega Items obtenidos de la consulta al boxLocalidad dependiendo de la
     * provincia seleccionada.
     */
    public void rellenarBoxEmpresa() {
        List lista = this.getListaResultados();
        List<Empresa> lista_empresas
                = (List<Empresa>) lista;
        for (Object o : lista_empresas) {
            Empresa e = (Empresa) o;
            operacionesUtilidad.agregarItem(e.getNombre(), getBoxEmpresa());
        }
    }

    public void consultaRellenarTipoSeguro() {
        while (getBoxTipoSeguro().getItemCount() > 0) {
            getBoxTipoSeguro().removeAllItems();
        }
        setConsultaList("from TipoSeguro");
        obtenerListaConsulta();
        rellenarBoxTipoSeguro();
    }

    /**
     * Agrega Items obtenidos de la consulta al boxLocalidad dependiendo de la
     * provincia seleccionada.
     */
    public void rellenarBoxTipoSeguro() {
        List lista = this.getListaResultados();
        List<TipoSeguro> lista_tipoSeguros
                = (List<TipoSeguro>) lista;
        for (Object o : lista_tipoSeguros) {
            TipoSeguro t = (TipoSeguro) o;
            operacionesUtilidad.agregarItem(t.getNombre(), getBoxTipoSeguro());
        }
    }

    public JComboBox getBoxTipoVehiculo() {
        return boxTipoVehiculo;
    }

    public void setBoxTipoVehiculo(JComboBox boxTipoVehiculo) {
        this.boxTipoVehiculo = boxTipoVehiculo;
    }

    public JComboBox getBoxModeloVehiculo() {
        return boxModeloVehiculo;
    }

    public void setBoxModeloVehiculo(JComboBox boxModeloVehiculo) {
        this.boxModeloVehiculo = boxModeloVehiculo;
    }

    public JComboBox getBoxMarcaVehiculo() {
        return boxMarcaVehiculo;
    }

    public void setBoxMarcaVehiculo(JComboBox boxMarcaVehiculo) {
        this.boxMarcaVehiculo = boxMarcaVehiculo;
    }

    public JComboBox getBoxUsoVehiculo() {
        return boxUsoVehiculo;
    }

    public void setBoxUsoVehiculo(JComboBox boxUsoVehiculo) {
        this.boxUsoVehiculo = boxUsoVehiculo;
    }

    /**
     * Evalua el estado de la consulta para eviatar realizar una cada vez que se
     * seleccione un box marca.
     */
    public void evaluarEstadoConsultaModelo() {
        switch (getEstadoConsultaModelo()) {
            case 0:
                consultaRellenarModelo();
                break;
            case 1:
                consultaRellenarModeloSinBusqueda();
                break;
        }
    }

    /**
     * Genera la consulta, obtiene los resultados y ejecuta el metodo
     * rellenarBoxModelo.
     */
    public void consultaRellenarModelo() {
        while (getBoxModeloVehiculo().getItemCount() > 0) {
            getBoxModeloVehiculo().removeAllItems();
        }
        setConsultaList("from Marca");
        obtenerListaConsulta();
        this.setListaResultadosMarcas(getListaResultados());
        rellenarBoxModelo();
    }

    /**
     * Se implementa en el caso de que la consulta ya haya sido realizada
     * previamente, ejecuta el metodo rellenarBoxModelo.
     */
    public void consultaRellenarModeloSinBusqueda() {
        while (getBoxModeloVehiculo().getItemCount() > 0) {
            getBoxModeloVehiculo().removeAllItems();
        }
        rellenarBoxModelo();
    }

    /**
     * Agrega Items obtenidos de la consulta al modelo dependiendo de la marca
     * seleccionada.
     */
    public void rellenarBoxModelo() {
        List lista = this.getListaResultadosMarcas();
        List<Marca> lista_marcas
                = (List<Marca>) lista;
        for (Object o : lista_marcas) {
            Marca m = (Marca) o;
            if (m.getNombre().equals(getBoxMarcaVehiculo().getSelectedItem().toString())) {
                List<Modelo> modelos = m.getModelos();
                for (Modelo mo : modelos) {
                    getBoxModeloVehiculo().addItem(mo.getNombre());
                }

            }

        }
        setEstadoConsultaModelo(1);
    }

    /**
     * Genera la consulta, obtiene los resultados y ejecuta el metodo
     * rellenarBoxProvincia.
     */
    public void consultaRellenarMarca() {
        setConsultaList("from Marca");
        obtenerListaConsulta();
        rellenarBoxMarca();
    }

    /**
     * Agrega Items obtenidos de la consulta al boxProvincia.
     */
    public void rellenarBoxMarca() {
        List lista = this.getListaResultados();
        List<Marca> lista_marcas
                = (List<Marca>) lista;
        for (Object o : lista_marcas) {
            Marca m = (Marca) o;
            operacionesUtilidad.agregarItem(m.getNombre(), getBoxMarcaVehiculo());
        }

    }

    /**
     * Genera la consulta, obtiene los resultados y ejecuta el metodo
     * rellenarBoxProvincia.
     */
    public void consultaRellenarTipo() {
        setConsultaList("from Tipo");
        obtenerListaConsulta();
        rellenarBoxTipo();
    }

    /**
     * Agrega Items obtenidos de la consulta al boxProvincia.
     */
    public void rellenarBoxTipo() {
        List lista = this.getListaResultados();
        List<Tipo> listaTipos
                = (List<Tipo>) lista;
        for (Object o : listaTipos) {
            Tipo t = (Tipo) o;
            operacionesUtilidad.agregarItem(t.getNombre(), getBoxTipoVehiculo());
        }

    }

    /**
     * Genera la consulta, obtiene los resultados y ejecuta el metodo
     * rellenarBoxProvincia.
     */
    public void consultaRellenarUso() {
        setConsultaList("from Uso");
        obtenerListaConsulta();
        rellenarBoxUso();
    }

    /**
     * Agrega Items obtenidos de la consulta al boxProvincia.
     */
    public void rellenarBoxUso() {
        List lista = this.getListaResultados();
        List<Uso> listaUsos
                = (List<Uso>) lista;
        for (Object o : listaUsos) {
            Uso u = (Uso) o;
            operacionesUtilidad.agregarItem(u.getNombre(), getBoxUsoVehiculo());
        }

    }

}
