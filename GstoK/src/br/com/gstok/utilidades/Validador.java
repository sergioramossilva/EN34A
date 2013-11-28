package br.com.gstok.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {

    public static boolean validarCPF(String cpf) {

        cpf = Formatador.formatarCPF(cpf, Formatador.armazenamento);
        int[] CPF = Funcoes.StringToArrayInt(cpf);
        int d1 = 0, d2 = 0;
        int ps1 = 10, ps2 = 11;

        if (cpf.length() != 11 || cpf.equals("11111111111")
                || cpf.equals("22222222222") || cpf.equals("33333333333")
                || cpf.equals("44444444444") || cpf.equals("55555555555")
                || cpf.equals("66666666666") || cpf.equals("77777777777")
                || cpf.equals("88888888888") || cpf.equals("99999999999")) {

            System.out.println("CPF inválido!");
            return false;
        } else if (cpf.equals("00000000000")) {

            System.out.println("Usando CPF para testes.");
            return true;
        } else {

// Calcula o primeiro dígito verificador.
            for (int i = 0; i < CPF.length - 2; i++) {
                d1 += CPF[i] * ps1;
                ps1--;
            }

            d1 = d1 % 11;

            if (d1 == 0 || d1 == 1) {
                d1 = 0;
            } else {
                d1 = 11 - d1;
            }

// Calcula o segundo dígito verificador.
            for (int i = 0; i < CPF.length - 1; i++) {
                d2 += CPF[i] * ps2;
                ps2--;
            }

            d2 = d2 % 11;

            if (d2 == 0 || d2 == 1) {
                d2 = 0;
            } else {
                d2 = 11 - d2;
            }
        }

// Compara os dígitos obtidos com os informados no CPF.
        if (d1 == CPF[9] && d2 == CPF[10]) {

            return true;
        } else {

            System.out.println("CPF inválido!");
            return false;
        }
    }

    public static boolean validarEmail(String email) {

        Pattern pattern = Pattern.compile("([a-zA-Z0-9_\\-\\.]+)@((\\[a-z]{1,3}\\.[a-z]"
                + "{1,3}\\.[a-z]{1,3}\\.)|(([a-zA-Z\\-]+\\.)+))" + "([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)",
                Pattern.MULTILINE);
        Matcher m = pattern.matcher(email);
        return m.matches();
    }

    public static boolean validarCNPJ(String cnpj) {
        return true;
    }

    public static boolean validarDtNascimento(String dtNascimento) {
        return true;
    }

    public static boolean validarTexto(String texto) {

        Pattern p = Pattern.compile("^[a-zA-Z\\s]+");
        Matcher m = p.matcher(texto);
        return m.matches();
    }
}