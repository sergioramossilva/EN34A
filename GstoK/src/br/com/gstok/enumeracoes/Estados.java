package br.com.gstok.enumeracoes;

public enum Estados {

    AC("AC"), // Acre
    AL("AL"), // Alagoas
    AP("AP"), // Amapá
    AM("AM"), // Amazonas
    BA("BA"), // Bahia
    CE("CE"), // Ceará
    DF("DF"), // Distrito Federal
    ES("ES"), // Espírito Santo
    GO("GO"), // Goiás
    MA("MA"), // Maranhão
    MT("MT"), // Mato Grosso
    MS("MS"), // Mato Grosso do Sul
    MG("MG"), // Minas Gerais
    PA("PA"), // Pará
    PB("PB"), // Paraíba
    PR("PR"), // Paraná
    PE("PE"), // Pernambuco
    PI("PI"), // Piauí
    RO("RO"), // Rondônia
    RR("RR"), // Roraima 
    RJ("RJ"), // Rio de Janeiro
    RN("RN"), // Rio Grande do Norte
    RS("RS"), // Rio Grande do Sul
    SC("SC"), // Santa Catarina
    SP("SP"), // São Paulo
    SE("SE"), // Sergipe
    TO("TO"); // Tocantins
    private String estado;
        
    private Estados(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return estado;
    }
}