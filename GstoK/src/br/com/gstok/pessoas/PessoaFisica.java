package br.com.gstok.pessoas;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class PessoaFisica extends Pessoa {

    @Temporal(TemporalType.DATE)
    private Date dtNascimento;
    private String cpf;
    private String rg;
    private char sexo;
    private String estCivil;

    public PessoaFisica() {
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public char getSexo() {
        return sexo;
    }

    public String getEstCivil() {
        return estCivil;
    }
}