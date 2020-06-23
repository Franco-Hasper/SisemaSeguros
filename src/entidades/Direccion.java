package entidades;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author TELCOM MPC
 */
@Entity
@Table(name = "direccion")
public class Direccion {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "numero")
    private Integer numero;

    @OneToMany(mappedBy = "direccionId")
    private List<Cedula> cedulas;

    @OneToMany(mappedBy = "direccionId")
    private List<Cliente> clientes;

    @ManyToOne
    @JoinColumn(name = "localidad_id")
    private Localidad localidadId;

    public Direccion() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Localidad getLocalidadId() {
        return localidadId;
    }

    public void setLocalidadId(Localidad localidadId) {
        this.localidadId = localidadId;
    }

    public List<Cedula> getCedulas() {
        return cedulas;
    }

    public void setCedulas(List<Cedula> cedulas) {
        this.cedulas = cedulas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    
    
}
