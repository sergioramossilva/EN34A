package br.com.gstok.utilidades;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Icones {

    public Icon getIconePesquisar() {
        return new ImageIcon(getClass().getResource("/br/com/gstok/imagens/pesquisar.png"));
    }  

    public Icon getIconeErro() {
        return new ImageIcon(getClass().getResource("/br/com/gstok/imagens/erro.png"));
    }

    public Icon getIconeFechar() {
        return new ImageIcon(getClass().getResource("/br/com/gstok/imagens/fechar.png"));
    }
}