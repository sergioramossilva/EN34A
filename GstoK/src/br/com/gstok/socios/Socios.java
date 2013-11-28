package br.com.gstok.socios;

import br.com.gstok.pessoas.PessoaFisica;
import br.com.gstok.pessoas.PessoaJuridica;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Socios")
public class Socios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int codigo;
    @ManyToOne
    private PessoaFisica pessoaFisica;
    @ManyToOne
    private PessoaJuridica pessoaJuridica;
    @Temporal(TemporalType.DATE)
    private Date dtInicio;
    @Temporal(TemporalType.DATE)
    private Date dtFim;

    public Socios() {
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public int getCodigo() {
        return codigo;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public Date getDtInicio() {
        return dtInicio;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }   
}