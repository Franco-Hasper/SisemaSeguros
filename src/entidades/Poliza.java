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
 * @author Hasper Franco
 */


@Entity
@Table(name = "poliza")
public class Poliza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "numero")
    private String numero;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresaId;

    @ManyToOne
    @JoinColumn(name = "tipo_seguro_id")
    private TipoSeguro tipoSeguroId;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado estadoId;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente clienteId;

    @OneToMany(mappedBy = "polizaId")
    private List<Vencimiento> vencimientos;

     @OneToMany(mappedBy = "polizaId")
    private List<Cedula> cedulas;
    
    
    public Poliza() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }



    public Empresa getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Empresa empresaId) {
        this.empresaId = empresaId;
    }

    public TipoSeguro getTipoSeguroId() {
        return tipoSeguroId;
    }

    public void setTipoSeguroId(TipoSeguro tipoSeguroId) {
        this.tipoSeguroId = tipoSeguroId;
    }

    public Estado getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(Estado estadoId) {
        this.estadoId = estadoId;
    }

    public Cliente getClienteId() {
        return clienteId;
    }

    public void setClienteId(Cliente clienteId) {
        this.clienteId = clienteId;
    }

    public List<Vencimiento> getVencimientos() {
        return vencimientos;
    }

    public void setVencimientos(List<Vencimiento> vencimientos) {
        this.vencimientos = vencimientos;
    }

    public List<Cedula> getCedulas() {
        return cedulas;
    }

    public void setCedulas(List<Cedula> cedulas) {
        this.cedulas = cedulas;
    }

    
    
    
}
