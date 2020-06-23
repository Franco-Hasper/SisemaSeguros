package entidades;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Hasper Franco
 */


@Entity
@Table(name = "tipo")
public class Tipo {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "tipoId")
    private List<Cedula> cedulas;


    public Tipo() {
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

    public List<Cedula> getCedulas() {
        return cedulas;
    }

    public void setCedulas(List<Cedula> cedulas) {
        this.cedulas = cedulas;
    }


    
}
