package br.com.gstok.pessoas;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class PessoaJuridica extends Pessoa{
    
    private String razaoSocial;
      
    @Temporal(TemporalType.DATE)
    private Date dtAbertura;
    
    private String cnpj;
    
    private String ie;
    
    public PessoaJuridica() {
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setDtAbertura(Date dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public Date getDtAbertura() {
        return dtAbertura;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getIe() {
        return ie;
    }
}