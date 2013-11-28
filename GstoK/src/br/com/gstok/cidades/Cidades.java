package br.com.gstok.cidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cidades")
public class Cidades implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int codigo;

    private String nome;

    private String uf;

    private String ddd;

    public Cidades() {
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }

    public String getDdd() {
        return ddd;
    }

    @Override
    public boolean equals(Object cidades) {

        if (cidades == null) {
            return false;
        }
        if (getClass() != cidades.getClass()) {
            return false;
        }
        final Cidades other = (Cidades) cidades;
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if ((this.uf == null) ? (other.uf != null) : !this.uf.equals(other.uf)) {
            return false;
        }
        if ((this.ddd == null) ? (other.ddd != null) : !this.ddd.equals(other.ddd)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {

        int hash = 7;
        return hash;
    }

    @Override
    public String toString() {
        return "\nCódigo:> " + codigo + "\nNome:>" + nome + "\nUF:>" + uf + "\nDDD:>" + ddd;
    }
}