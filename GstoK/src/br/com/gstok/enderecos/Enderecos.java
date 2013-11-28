package br.com.gstok.enderecos;

import br.com.gstok.cidades.Cidades;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Enderecos")
public class Enderecos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int codigo;

    private String logradouro;

    private String numero;

    private String bairro;

    private String complemento;

    private String cep;
    
    @ManyToOne
    private Cidades cidade;
    
    public Enderecos() {
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(Cidades cidade) {
        this.cidade = cidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    public Cidades getCidade() {
        return cidade;
    }
}