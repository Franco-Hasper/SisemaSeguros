package entidades;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Hasper Franco
 */
@Entity
@Table(name = "cedula")
public class Cedula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "poliza_id")
    private Poliza polizaId;

    @Column(name = "titular")
    private String titular;
    
    
    @ManyToOne
    @JoinColumn(name = "direccion_id")
    private Direccion direccionId;

    

    @Column(name = "dni")
    private String dni;

    @Column(name = "numero")
    private String numero;

    @Column(name = "dominio")
    private String dominio;

    @ManyToOne
    @JoinColumn(name = "uso_id")
    private Uso usoId;
    
      @ManyToOne
    @JoinColumn(name = "tipo_id")
    private Tipo tipoId;
      
    @Column(name = "chasis")
    private String cahsis;

    @Column(name = "motor")
    private String motor;
    
    @Column(name = "vencimiento")
    private Date vencimiento;

  
    
    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modeloId;

    

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado estadoId;

    public Cedula() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Poliza getPolizaId() {
        return polizaId;
    }

    public void setPolizaId(Poliza polizaId) {
        this.polizaId = polizaId;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getCahsis() {
        return cahsis;
    }

    public void setCahsis(String cahsis) {
        this.cahsis = cahsis;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Tipo getTipoId() {
        return tipoId;
    }

    public void setTipoId(Tipo tipoId) {
        this.tipoId = tipoId;
    }

    public Uso getUsoId() {
        return usoId;
    }

    public void setUsoId(Uso usoId) {
        this.usoId = usoId;
    }

    public Direccion getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(Direccion direccionId) {
        this.direccionId = direccionId;
    }



    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Modelo getModeloId() {
        return modeloId;
    }

    public void setModeloId(Modelo modeloId) {
        this.modeloId = modeloId;
    }

    
    
    
    public Estado getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(Estado estadoId) {
        this.estadoId = estadoId;
    }

}
