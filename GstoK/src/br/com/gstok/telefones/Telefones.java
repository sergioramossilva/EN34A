package br.com.gstok.telefones;

import java.io.Serializable;

public class Telefones implements Serializable {
    
    private int codigo;
    private String tipo;
    private String numero;
    private String dono;

    public Telefones() {
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}