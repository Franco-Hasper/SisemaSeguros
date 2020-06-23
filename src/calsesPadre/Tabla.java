package calsesPadre;

import javax.swing.JTable;
import javax.swing.JTextField;
import clasesUtilidadGeneral.OperacionesUtiles;

/**
 *
 * @author FRANCO
 */
public abstract class Tabla extends Consultas {

    protected  OperacionesUtiles utilidad = new OperacionesUtiles();

    protected JTable tabla;
    protected Integer idTabla;
    protected Integer estadoConsulta;
    protected String stringConsulta;
    protected JTextField campoTexto;

    //public abstract void buscarCopiaEnBaseDeDatos();

    public abstract boolean verificarFilaSeleccionada();

    /**
     * Toma los datos de listaConsulta y en base a la cadena del
     * JTextField.getTex() inserta los resultados en el modelo del JTable
     * (intefaz grafica) indicado.
     *
     * @param valorBusqueda
     */
    public abstract void rellenarTabla(String valorBusqueda);

    /**
     * @deprecated
     */
    public abstract void rellenarTabla();

    public abstract void ejecutarRellenarTabla();

    public abstract Integer obtenerIdFilaSeleccionada();

    /**
     * Devuelve el modelo de la tabla alojado en el atributo tabla.
     *
     * @return tabla;
     */
    public JTable getTabla() {
        return tabla;
    }

    /**
     * Guarda un modelo de tabla en el atributo tabla.
     *
     * @param tabla
     */
    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    /**
     * Devuelve el id de una fila seleccionada en la tabla de la interfaz
     * grafica.
     *
     * @return idTabla;
     */
    public Integer getIdTabla() {
        return idTabla;
    }

    /**
     * Guarda el id de una fila seleccionada en la tabla de la intefaz grafica.
     *
     * @param idTabla
     */
    public void setIdTabla(Integer idTabla) {
        this.idTabla = idTabla;
    }

    /**
     * Devuelve 0 si la consulta esta desactualizada,1 si la consulta esta
     * actualizada.
     *
     * @return estadoConsulta;
     */
    public Integer getEstadoConsulta() {
        return estadoConsulta;
    }

    /**
     * Aloja en estadoConsulta 0 si la consulta esta desactualizada,1 si la
     * consulta esta actualizada.
     *
     * @param estadoConsulta
     */
    public void setEstadoConsulta(Integer estadoConsulta) {
        this.estadoConsulta = estadoConsulta;
    }

    /**
     * ** Devuelve una consulta sql en formato String para un unico
     * resultado.(se puede eliminar y utilizar directamente el
     * getConultaList/Object de la clase padre Consultas) esto implica modificar
     * el metodo en todas las Tabla/entidad en donde se implementa este metodo.
     *
     * @return stringConsulta;
     */
    public String getStringConsulta() {
        return stringConsulta;
    }

    /**
     * Guarda una consulta sql en formato String para una lista de
     * resultados.(se puede eliminar y utilizar directamente el
     * setConultaList/Object de la clase padre Consultas) esto implica modificar
     * el metodo en todas las Tabla/entidad en donde se implementa este metodo.
     *
     * @param stringConsulta
     */
    public void setStringConsulta(String stringConsulta) {
        this.stringConsulta = stringConsulta;
    }

    /**
     * Devuelve un JTextField con los caracteres clave para ejecutar una
     * consulta sql. (se puede mejorar retornando el campoTexto.getText())
     *
     * @return campoTexto;
     */
    public JTextField getCampoTexto() {
        return campoTexto;
    }

    /**
     * Aloja en campoTexto un JTextField con los caracteres clave para ejecutar
     * una consulta sql.(se puede mejorar retornando el campoTexto.getText())
     *
     * @param campoTexto
     */
    public void setCampoTexto(JTextField campoTexto) {
        this.campoTexto = campoTexto;
    }

    /**
     * Evalua el estado de la consulta, si este es 0 (desactulizada) vuelve a
     * ejecutar la consulta, si es 1 (actualizada) no realiza ninguna acccion.
     */
    public void evaluarEstadoConsulta() {
        switch (this.getEstadoConsulta()) {
            case 0:
                this.obtenerDatosConsulta();
                break;
            case 1:
                break;
        }
    }

    /**
     * Realiza una consulta, aloja los resultados en listaConsulta y actualiza
     * el estadoConsulta en 1 (actualizada).
     */
    public void obtenerDatosConsulta() {
        setConsultaList(this.stringConsulta);
        obtenerListaConsulta();
        setEstadoConsulta(1);
    }

}
