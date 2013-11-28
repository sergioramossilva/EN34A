package br.com.gstok.enumeracoes;

public enum TipoTelefone {

    Residencial("Residencial"),
    Comercial("Comercial"),
    Celular("Celular"),
    Contato("Contato");
    private String tipoTelefone;

    private TipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    @Override
    public String toString() {
        return tipoTelefone;
    }
}