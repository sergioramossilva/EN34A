package br.com.gstok.utilidades;

import javax.swing.*;

public abstract class Funcoes {

    private static int[] arrayInt;

    public static String IntToString(int inteiro) {

        return String.valueOf(inteiro);
    }

    public static int[] StringToArrayInt(String string) {

        arrayInt = new int[string.length()];

        for (int i = 0; i < string.length(); i++) {
            arrayInt[i] = StringToInt(string.valueOf(string.charAt(i)));
        }
        return arrayInt;
    }

    public static int StringToInt(String string) {

        return Integer.parseInt(string);
    }

    public static void habilitarComponentes(JComponent[] componentes) {

        for (int i = 0; i < componentes.length; i++) {

            if (componentes[i] instanceof JTextField) {

                    ((JTextField) componentes[i]).setEnabled(true);
                    ((JTextField) componentes[i]).setEditable(true);
            } else if (componentes[i] instanceof JComboBox) {

                ((JComboBox) componentes[i]).setEditable(false);
                ((JComboBox) componentes[i]).setEnabled(true);
            } else if (componentes[i] instanceof JButton) {

                ((JButton) componentes[i]).setEnabled(true);
            }
        }
    }

    public static void desabilitarComponentes(JComponent[] componentes) {

        for (int i = 0; i < componentes.length; i++) {

            if (componentes[i] instanceof JButton) {

                ((JButton) componentes[i]).setEnabled(false);
            } else if(componentes[i] instanceof JTextField) {
                
                ((JTextField) componentes[i]).setEditable(false);
            }
        }
    }

    public static void limparComponentes(JComponent[] componentes) {

        for (int i = 0; i < componentes.length; i++) {

            if (componentes[i] instanceof JTextField) {

                ((JTextField) componentes[i]).setText("");
            } else if (componentes[i] instanceof JComboBox) {

                ((JComboBox) componentes[i]).setSelectedIndex(-1);
            } else if (componentes[i] instanceof JRadioButton) {
                
                if(((JRadioButton) componentes[i]).isSelected()) {
                    
                    ((JRadioButton) componentes[i]).setSelected(false);
                }
            }
        }
    }

    public static boolean verificarComponentes(JComponent[] componentes) {

        for (int i = 0; i < componentes.length; i++) {

            if (componentes[i] instanceof JTextField) {

                if (((JTextField) componentes[i]).getText().equals("")) {
                    return false;
                } else {
                    return true;
                }
            } else if (componentes[i] instanceof JComboBox) {

                if (((JComboBox) componentes[i]).getSelectedIndex() == -1) {
                    return false;
                } else {
                    return true;
                }
            }
        }

        return true;
    }

    public static void sair() {

        System.exit(0);
    }
//    public static String limpar = "limpar";
//    public static String habilitar = "habilitar";
//    public static String desabilitar="desabilitar";
//    public static String verificarCampos = "verificar";
//    public static String habilitarBotoes="habilitarBotoes";
//    private static int[] arrayInt;
//
//    /**
//     * Converte uma String númerica em um número do tipo int.
//     *
//     * @param string String númerica a ser convertida.
//     * @return Um número inteiro.
//     */
//    public static int StringToNumberInt(String string) {
//
//        return Integer.parseInt(string);
//    }
//
//    /**
//     * Converte uma String númerica em um Array do tipo int.
//     *
//     * @param string String númerica a ser convertida.
//     * @return Um array de números inteiros.
//     */
//    public static int[] StringToArrayInt(String string) {
//
//    }
//
//    /**
//     * Converte uma String númerica em um número do tipo double.
//     *
//     * @param string String númerica.
//     * @return numero String convertida.
//     */
//    public static double StringToNumberDouble(String string) {
//
//        return Double.parseDouble(string);
//    }
//
//    /**
//     * Converte uma String númerica em um número do tipo float.
//     *
//     * @param string String númerica.
//     * @return numero String convertida.
//     */
//    public static float StringToNumberFloat(String string) {
//
//        return Float.parseFloat(string);
//    }
//
//    /**
//     * Converte um número inteiro em uma String.
//     *
//     * @param inteiro número a ser convertido.
//     * @return Uma String convertida.
//     */
//    public static String IntToString(int inteiro) {
//
//        return String.valueOf(inteiro);
//    }
//
//    /**
//     * Habilita os componentes do formulário.
//     *
//     * @param componentes Componentes que serão habilitados.
//     */
//    public static void habilitarComponentes(JComponent[] componentes) {
//
//        for (int i = 0; i < componentes.length; i++) {
//
//            componentes[i].setEnabled(true);
//
//            if (componentes[i] instanceof JTextField) {
//                ((JTextField) componentes[i]).setEditable(true);
//            }
//        }
//    }
//    
//    public static void desabilitarComponentes(JComponent[] componentes) {
//        
//        for(int i=0; i<componentes.length; i++) {
//            
//            componentes[i].setEnabled(false);
//        }
//    }
//
//    /**
//     * Verifica os campos do formulário.
//     *
//     * @param campos Campos que serão verificados.
//     */
//    public static boolean verificarCampos(JComponent[] campos) {
//
//        for (int i = 0; i < campos.length; i++) {
//
//            if (campos[i] instanceof JTextField) {
//
//                if (!((JTextField) campos[i]).getText().equals("")) {
//
//                    return true;
//                } else {
//
//                    return false;
//                }
//            } else if (campos[i] instanceof JComboBox) {
//
//                if (((JComboBox) campos[i]).getSelectedIndex() != -1) {
//
//                    return true;
//                } else {
//
//                    return false;
//                }
//            } else {
//
//                return false;
//            }
//        }
//        
//        return false;
//    }
//
//    /**
//     * Limpa os componentes do formulário.
//     *
//     * @param componentes Componentes que serão limpos..
//     */
//    public static void limparComponentes(JComponent[] componentes) {
//
//        for (int i = 0; i < componentes.length; i++) {
//
//            if (componentes[i] instanceof JTextField) {
//
//                ((JTextField) componentes[i]).setText("");
//            } else if (componentes[i] instanceof JComboBox) {
//
//                ((JComboBox) componentes[i]).setSelectedIndex(-1);
//            }
//        }
//    }
//
//    /**
//     * Termina a execução da aplicação.
//     */
}
