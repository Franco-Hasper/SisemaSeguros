package entidades;

/**
 * @author Hasper Franco
 */
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vencimiento")

public class Vencimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cuota")
    private Integer cuota;

    @Column(name = "fecha_vencimineto")
    private Date fechaVencimieto;

    @ManyToOne
    @JoinColumn(name = "poliza_id")
    private Poliza polizaId;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado estadoId;

    public Vencimiento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCuota() {
        return cuota;
    }

    public void setCuota(Integer cuota) {
        this.cuota = cuota;
    }

    public Date getFechaVencimieto() {
        return fechaVencimieto;
    }

    public void setFechaVencimieto(Date fechaVencimieto) {
        this.fechaVencimieto = fechaVencimieto;
    }

    public Poliza getPolizaId() {
        return polizaId;
    }

    public void setPolizaId(Poliza polizaId) {
        this.polizaId = polizaId;
    }

    public Estado getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(Estado estadoId) {
        this.estadoId = estadoId;
    }

    
}
