package conexion;

import entidades.Cedula;
import entidades.Cliente;
import entidades.Direccion;
import entidades.Empresa;
import entidades.Estado;
import entidades.Localidad;
import entidades.Marca;
import entidades.Modelo;
import entidades.Poliza;
import entidades.Provincia;
import entidades.Sexo;
import entidades.Tipo;
import entidades.TipoSeguro;
import entidades.Uso;
import entidades.Vencimiento;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.JDBCConnectionException;

public class ConexionHibernate {

    /**
     * Añade todas las clases mapeadas a la sesion.
     *
     * @return
     */
    public static Session tomarConexion() {
        SessionFactory sf = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Cedula.class)
                .addAnnotatedClass(Cliente.class)
                .addAnnotatedClass(Direccion.class)
                .addAnnotatedClass(Empresa.class)
                .addAnnotatedClass(Estado.class)
                .addAnnotatedClass(Localidad.class)
                .addAnnotatedClass(Marca.class)
                .addAnnotatedClass(Modelo.class)
                .addAnnotatedClass(Poliza.class)
                .addAnnotatedClass(Provincia.class)
                .addAnnotatedClass(Tipo.class)
                .addAnnotatedClass(TipoSeguro.class)
                .addAnnotatedClass(Uso.class)
                .addAnnotatedClass(Vencimiento.class)
                .addAnnotatedClass(Sexo.class)
                .buildSessionFactory();
        return sf.getCurrentSession();
    }

}
