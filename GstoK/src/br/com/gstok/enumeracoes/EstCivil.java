package br.com.gstok.enumeracoes;

public enum EstCivil {

    Solteiro("Solteiro(a)"),
    Casado("Casado(a)"),
    Divorciado("Divorciado(a)"),
    Viuvo("Viúvo(a)");
    private String estado;

    private EstCivil(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return estado;
    }
}