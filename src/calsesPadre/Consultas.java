package calsesPadre;

import conexion.ConexionHibernate;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.NonUniqueResultException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Contiene atributos y metodos que se encargan de obtener resultados de la base
 * de datos.
 */
public abstract class Consultas {

    protected String consultaList;

    protected String consultaObject;

    protected List listaResultados;

    protected Object objetoResultado;

    protected Session miSesion;

    /**
     * Devuelve un objeto con los datos de un unico resultado de la entidad
     * consultada.
     *
     * @return objetoResultado;
     */
    public Object getObjetoResultado() {
        return objetoResultado;
    }

    /**
     * Guarda un objeto con los datos de un unico resultado de la entidad
     * consultada.
     *
     * @param objetoResultado;
     */
    public void setObjetoResultado(Object objetoResultado) {
        this.objetoResultado = objetoResultado;
    }

    /**
     * Devuelve una consulta sql en formato String para una lista de resultados.
     *
     * @return consultaList;
     */
    public String getConsultaList() {
        return consultaList;
    }

    /**
     * Guarda una consulta sql en formato String para una lista de resultados.
     *
     * @param consultaList ;
     */
    public void setConsultaList(String consultaList) {
        this.consultaList = consultaList;
    }

    /**
     * Devuelve una consulta sql en formato String para un unico resultado.
     *
     * @return consultaObject;
     */
    public String getConsultaObject() {
        return consultaObject;
    }

    /**
     * Guarda una consula sql en formato String para un unico resultado.
     *
     * @param consultaObject
     */
    public void setConsultaObject(String consultaObject) {
        this.consultaObject = consultaObject;
    }

    /**
     * Devuelve una lista que permite alojar varios resultados de la entidad
     * consultada.
     *
     * @return listaResultados;
     */
    public List getListaResultados() {
        return listaResultados;
    }

    /**
     * Guarda una lista que permite alojar varios resultados de la entidad
     * consultada.
     *
     * @param listaResultados
     */
    public void setListaResultados(List listaResultados) {
        this.listaResultados = listaResultados;
    }

    /**
     * Abre una sesion con Hibernate, genera una consulta y guarda los
     * resultados en atributo listaResultados.
     */
    public void obtenerListaConsulta() {
        try {
            Session miSesion = ConexionHibernate.tomarConexion();
            miSesion.beginTransaction();
            Query q = miSesion.createQuery(getConsultaList());
            setListaResultados(q.list());
            miSesion.beginTransaction().commit();
            //miSesion.close();
        } catch (HibernateException ex) {
        }
    }

    /**
     * Abre una sesion con Hibernate, genera una consulta y guarda un unico
     * resultado en atributo objetoResultado.
     */
    public void obtenerObjetoConsulta() {
        try {
            Session miSesion = ConexionHibernate.tomarConexion();
            miSesion.beginTransaction();
            Query query = miSesion.createQuery(getConsultaObject());
            query.setMaxResults(1);
            Object o = (query.uniqueResult());
            setObjetoResultado(o);

        } catch (NonUniqueResultException ex) {
        }
    }

}
