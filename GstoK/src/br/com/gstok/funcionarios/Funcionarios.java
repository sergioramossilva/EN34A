package br.com.gstok.funcionarios;

import br.com.gstok.pessoas.PessoaFisica;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="Funcionarios")
public class Funcionarios extends PessoaFisica {
    
    private static final long serialVersionUID = 1L;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtAdmissao;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtSaida;

    public Funcionarios() {
    }

    public void setDtAdmissao(Date dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    public Date getDtAdmissao() {
        return dtAdmissao;
    }

    public Date getDtSaida() {
        return dtSaida;
    }   
}