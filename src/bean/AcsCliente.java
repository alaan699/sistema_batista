package bean;
// Generated 08/12/2023 16:14:48 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AcsCliente generated by hbm2java
 */
@Entity
@Table(name="acs_cliente"
    ,catalog="db_alan_batista"
)
public class AcsCliente  implements java.io.Serializable {


     private int acsIdcliente;
     private String acsNome;
     private String acsCpf;
     private String acsRg;
     private Date acsDataNasc;
     private String acsEmail;
     private String acsCep;
     private String acsEndereco;
     private String acsCidade;
     private int acsNumeroCasa;
     private String acsNacionalidade;
     private String acsCelular;
     private int acsEstadoCivil;
     private String acsSexo;

    public AcsCliente() {
    }

	
    public AcsCliente(int acsIdcliente, String acsNome, String acsCpf, String acsRg, String acsEmail, String acsCep, String acsEndereco, String acsCidade, int acsNumeroCasa, String acsNacionalidade, String acsCelular, int acsEstadoCivil, String acsSexo) {
        this.acsIdcliente = acsIdcliente;
        this.acsNome = acsNome;
        this.acsCpf = acsCpf;
        this.acsRg = acsRg;
        this.acsEmail = acsEmail;
        this.acsCep = acsCep;
        this.acsEndereco = acsEndereco;
        this.acsCidade = acsCidade;
        this.acsNumeroCasa = acsNumeroCasa;
        this.acsNacionalidade = acsNacionalidade;
        this.acsCelular = acsCelular;
        this.acsEstadoCivil = acsEstadoCivil;
        this.acsSexo = acsSexo;
    }
    public AcsCliente(int acsIdcliente, String acsNome, String acsCpf, String acsRg, Date acsDataNasc, String acsEmail, String acsCep, String acsEndereco, String acsCidade, int acsNumeroCasa, String acsNacionalidade, String acsCelular, int acsEstadoCivil, String acsSexo, Set acsVendas) {
       this.acsIdcliente = acsIdcliente;
       this.acsNome = acsNome;
       this.acsCpf = acsCpf;
       this.acsRg = acsRg;
       this.acsDataNasc = acsDataNasc;
       this.acsEmail = acsEmail;
       this.acsCep = acsCep;
       this.acsEndereco = acsEndereco;
       this.acsCidade = acsCidade;
       this.acsNumeroCasa = acsNumeroCasa;
       this.acsNacionalidade = acsNacionalidade;
       this.acsCelular = acsCelular;
       this.acsEstadoCivil = acsEstadoCivil;
       this.acsSexo = acsSexo;
    }
   
     @Id 

    
    @Column(name="acs_idcliente", unique=true, nullable=false)
    public int getAcsIdcliente() {
        return this.acsIdcliente;
    }
    
    public void setAcsIdcliente(int acsIdcliente) {
        this.acsIdcliente = acsIdcliente;
    }

    
    @Column(name="acs_nome", nullable=false, length=45)
    public String getAcsNome() {
        return this.acsNome;
    }
    
    public void setAcsNome(String acsNome) {
        this.acsNome = acsNome;
    }

    
    @Column(name="acs_cpf", nullable=false, length=45)
    public String getAcsCpf() {
        return this.acsCpf;
    }
    
    public void setAcsCpf(String acsCpf) {
        this.acsCpf = acsCpf;
    }

    
    @Column(name="acs_rg", nullable=false, length=45)
    public String getAcsRg() {
        return this.acsRg;
    }
    
    public void setAcsRg(String acsRg) {
        this.acsRg = acsRg;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="acs_dataNasc", length=10)
    public Date getAcsDataNasc() {
        return this.acsDataNasc;
    }
    
    public void setAcsDataNasc(Date acsDataNasc) {
        this.acsDataNasc = acsDataNasc;
    }

    
    @Column(name="acs_email", nullable=false, length=45)
    public String getAcsEmail() {
        return this.acsEmail;
    }
    
    public void setAcsEmail(String acsEmail) {
        this.acsEmail = acsEmail;
    }

    
    @Column(name="acs_cep", nullable=false, length=45)
    public String getAcsCep() {
        return this.acsCep;
    }
    
    public void setAcsCep(String acsCep) {
        this.acsCep = acsCep;
    }

    
    @Column(name="acs_endereco", nullable=false, length=90)
    public String getAcsEndereco() {
        return this.acsEndereco;
    }
    
    public void setAcsEndereco(String acsEndereco) {
        this.acsEndereco = acsEndereco;
    }

    
    @Column(name="acs_cidade", nullable=false, length=80)
    public String getAcsCidade() {
        return this.acsCidade;
    }
    
    public void setAcsCidade(String acsCidade) {
        this.acsCidade = acsCidade;
    }

    
    @Column(name="acs_numeroCasa", nullable=false)
    public int getAcsNumeroCasa() {
        return this.acsNumeroCasa;
    }
    
    public void setAcsNumeroCasa(int acsNumeroCasa) {
        this.acsNumeroCasa = acsNumeroCasa;
    }

    
    @Column(name="acs_nacionalidade", nullable=false, length=45)
    public String getAcsNacionalidade() {
        return this.acsNacionalidade;
    }
    
    public void setAcsNacionalidade(String acsNacionalidade) {
        this.acsNacionalidade = acsNacionalidade;
    }

    
    @Column(name="acs_celular", nullable=false, length=45)
    public String getAcsCelular() {
        return this.acsCelular;
    }
    
    public void setAcsCelular(String acsCelular) {
        this.acsCelular = acsCelular;
    }

    
    @Column(name="acs_estadoCivil", nullable=false)
    public int getAcsEstadoCivil() {
        return this.acsEstadoCivil;
    }
    
    public void setAcsEstadoCivil(int acsEstadoCivil) {
        this.acsEstadoCivil = acsEstadoCivil;
    }

    
    @Column(name="acs_sexo", nullable=false, length=30)
    public String getAcsSexo() {
        return this.acsSexo;
    }
    
    public void setAcsSexo(String acsSexo) {
        this.acsSexo = acsSexo;
    }
        @Override
     public String toString() {
    return acsNome;
}
    
         @Override
      public boolean equals (Object object){
      if(object instanceof AcsCliente){
      AcsCliente acsCliente = (AcsCliente) object;
        if(this.getAcsIdcliente()== acsCliente.getAcsIdcliente())
            return true;
                }         
                return false;
      }

}


