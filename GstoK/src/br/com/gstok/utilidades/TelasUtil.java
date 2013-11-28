package br.com.gstok.utilidades;

import br.com.gstok.cidades.CidadesGUI;
import br.com.gstok.principal.LoginGUI;
import br.com.gstok.principal.SobreGUI;
import br.com.gstok.telefones.TelefonesGUI;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class TelasUtil {

    private static LoginGUI loginGui;
    private static CidadesGUI cidadesGui;
    private static TelefonesGUI telefonesGui;
    private static SobreGUI sobreGUI;
    private static Icones icones = new Icones();

    public static void abrirLoginGUI() {

        loginGui = new LoginGUI();
        abrirCentralizado(loginGui);
        loginGui.setVisible(true);
    }

    public static void abrirCidadesGUI() {
        
        cidadesGui=new CidadesGUI();
        abrirCentralizado(cidadesGui);
        cidadesGui.setVisible(true);
    }

    public static void abrirTelefoneGUI() {

        telefonesGui = new TelefonesGUI();
        abrirCentralizado(telefonesGui);
        telefonesGui.setVisible(true);
    }

    public static void abrirSobreGUI() {

        sobreGUI = new SobreGUI();
        abrirCentralizado(sobreGUI);
        sobreGUI.setVisible(true);
    }

    public static void camposInvalidos(JComponent[] componentes) {

        for (int i = 0; i < componentes.length; i++) {

            componentes[i].setBorder(new LineBorder(new Color(255, 0, 0), 1, true));
        }

        JOptionPane.showMessageDialog(null, "Os campos em vermelho são obrigatórios", "Campos Inválidos!", JOptionPane.ERROR_MESSAGE, icones.getIconeErro());
    }

    private static void abrirCentralizado(JDialog janela) {

        janela.setLocationRelativeTo(null);
    }
}