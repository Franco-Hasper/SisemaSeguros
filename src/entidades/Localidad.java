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
 *
 * @author TELCOM MPC
 */
@Entity
@Table(name = "localidad")
public class Localidad {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "localidadId")
    private List<Direccion> direcciones;


    @ManyToOne
    @JoinColumn(name = "provincia_id")
    private Provincia provinciaId;

    public Localidad() {
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

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }


    public Provincia getProvinciaId() {
        return provinciaId;
    }

    public void setProvinciaId(Provincia provinciaId) {
        this.provinciaId = provinciaId;
    }

    
    
    
}
