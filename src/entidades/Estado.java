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
 *
 * @author TELCOM MPC
 */
@Entity

@Table(name = "estado")

public class Estado {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "valor")
    private String valor;

    @OneToMany(mappedBy = "estadoId")
    private List<Cedula> cedulas;

    @OneToMany(mappedBy = "estadoId")
    private List<Vencimiento> vencimientos;

    @OneToMany(mappedBy = "estadoId")
    private List<TipoSeguro>tiposSeguros;

    @OneToMany(mappedBy = "estadoId")
    private List<Cliente> clientes;

    @OneToMany(mappedBy = "estadoId")
    private List<Empresa> empresas;

    @OneToMany(mappedBy = "estadoId")
    private List<Poliza> polizas;

    public Estado() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public List<Cedula> getCedulas() {
        return cedulas;
    }

    public void setCedulas(List<Cedula> cedulas) {
        this.cedulas = cedulas;
    }

    public List<Vencimiento> getVencimientos() {
        return vencimientos;
    }

    public void setVencimientos(List<Vencimiento> vencimientos) {
        this.vencimientos = vencimientos;
    }

    public List<TipoSeguro> getTiposSeguros() {
        return tiposSeguros;
    }

    public void setTiposSeguros(List<TipoSeguro> tiposSeguros) {
        this.tiposSeguros = tiposSeguros;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }

    public List<Poliza> getPolizas() {
        return polizas;
    }

    public void setPolizas(List<Poliza> polizas) {
        this.polizas = polizas;
    }
    
   
    
    

}
