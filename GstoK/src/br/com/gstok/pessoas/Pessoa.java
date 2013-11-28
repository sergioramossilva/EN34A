package br.com.gstok.pessoas;

import br.com.gstok.enderecos.Enderecos;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int codigo;
    
    private String nome;
    
    @ManyToOne
    private Enderecos enderecos;
     
    private String email;
    
    private String atividade;
    
    private double renda;

    private boolean ativo;

    public Pessoa() {
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnderecos(Enderecos enderecos) {
        this.enderecos = enderecos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Enderecos getEnderecos() {
        return enderecos;
    }

    public String getEmail() {
        return email;
    }

    public String getAtividade() {
        return atividade;
    }

    public double getRenda() {
        return renda;
    }

    public boolean isAtivo() {
        return ativo;
    }
}