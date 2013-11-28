package br.com.gstok.utilidades;

import java.text.Normalizer;

public class Formatador {

    public final static int simples = 0;
    public final static int composta = 1;
    public final static int armazenamento = 2;
    public final static int exibicao = 3;

    public static String formatarCPF(String cpf, int tipo) {

        if (tipo == Formatador.exibicao) {

            cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
        } else if (tipo == Formatador.armazenamento) {

            cpf = cpf.replace(".", "").replace("-", "");
        } else {

            System.err.println("Erro no tipo de formatação!\nTipos permitidos: exibição ou armazenamento.");
        }

        return cpf;
    }

    public static String formatarCNPJ(String cnpj, int tipo) {

        if (tipo == Formatador.exibicao) {

            cnpj = cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." + cnpj.substring(5, 8) + "/" + cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14);
        } else if (tipo == Formatador.armazenamento) {

            cnpj = cnpj.replace(".", "").replace("/", "").replace("-", "");
        } else {

            System.err.println("Erro no tipo de formatação!\nTipos permitidos: exibição ou armazenamento.");
        }

        return cnpj;
    }

    public static String formatarCEP(String cep, int tipo) {

        if (tipo == Formatador.simples || tipo == Formatador.exibicao) {

            cep = cep.substring(0, 5) + "-" + cep.substring(5, 8);
        } else if (tipo == Formatador.composta) {

            cep = cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5, 8);
        } else if (tipo == Formatador.armazenamento) {

            cep = cep.replace(".", "").replace("-", "");
        } else {

            System.err.println("Erro no tipo de formatação!\nTipos permitidos: simples, composta, exibição ou armazenamento.");
        }

        return cep;
    }

    public static String formatarTexto(String texto) {

        retirarAcento(texto.trim());
        return texto.toUpperCase();
    }

    private static String retirarAcento(String string) {

        if (string != null) {

            string = Normalizer.normalize(string, Normalizer.Form.NFD);

            string = string.replaceAll("[^\\p{ASCII}]", "");
        }
        return string;
    }    

    public static String formatarData(String data, int tipo) {
        
        if(tipo==Formatador.armazenamento) {
            
            data=data.replace("/", "");
        } else if(tipo==Formatador.exibicao) {
            
            data=data.substring(0, 2)+"/"+data.substring(2, 4)+"/"+data.substring(4, 8);
        }
        return data;
    }
}
