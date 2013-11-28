package br.com.gstok.principal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class SobreGUI extends JDialog {
    
    private static final long serialVersionUID = 1L;
    private JLabel lbTitulo;
    private JLabel lbLogo;
    private JLabel lbVersao;
    private JPanel pnPainel;
    private JTextArea taDescricao;
    private JScrollPane spRolagem;
    private JButton btFechar;

    public SobreGUI() {

        iniciarComponentes();
        definirEventos();
    }

    private void iniciarComponentes() {

        this.setPreferredSize(new Dimension(538, 246));
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Sobre o GstoK");
        this.setResizable(false);
        this.setModal(true);
        this.setIconImage(getToolkit().getImage(this.getClass().getResource("/br/com/gstok/imagens/gstok.png")));
        this.getContentPane().setLayout(null);

        lbTitulo = new JLabel();
        lbTitulo.setText("GstoK - Gestão Comercial");
        lbTitulo.setForeground(new Color(255, 0, 0));
        lbTitulo.setFont(new Font("Lucida Sans", 0, 20));
        lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
        lbTitulo.setVerticalAlignment(SwingConstants.CENTER);
        lbTitulo.setVerticalTextPosition(SwingConstants.CENTER);
        lbTitulo.setBounds(12, 12, 526, 25);
        this.getContentPane().add(lbTitulo);

        pnPainel = new JPanel();
        pnPainel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        pnPainel.setLayout(null);
        pnPainel.setBounds(12, 43, 512, 156);
        this.getContentPane().add(pnPainel);

        lbLogo = new JLabel();
        lbLogo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lbLogo.setIcon(new ImageIcon(getClass().getResource("/br/com/gstok/imagens/logo.png")));
        lbLogo.setHorizontalAlignment(SwingConstants.CENTER);
        lbLogo.setHorizontalTextPosition(SwingConstants.CENTER);
        lbLogo.setVerticalAlignment(SwingConstants.CENTER);
        lbLogo.setVerticalTextPosition(SwingConstants.CENTER);
        lbLogo.setBounds(13, 13, 130, 130);
        pnPainel.add(lbLogo);

        taDescricao = new JTextArea();
        taDescricao.setEditable(false);
        taDescricao.setFont(new Font("Lucida Sans", 1, 16));
        taDescricao.setForeground(new Color(0, 0, 0));
        taDescricao.setText("Sistema comercial para micro e pequenas\nempresas.\n\nLicenca: GPLv3.\nPara maiores informações consulte a \ndocumentação do sistema.");
        pnPainel.add(taDescricao);

        spRolagem = new JScrollPane();
        spRolagem.setViewportView(taDescricao);
        spRolagem.setBounds(155, 13, 344, 130);
        pnPainel.add(spRolagem);

        lbVersao = new JLabel();
        lbVersao.setText("Versão: 1.02");
        lbVersao.setForeground(new Color(0, 0, 0));
        lbVersao.setFont(new Font("Lucida Sans", 1, 14));
        lbVersao.setHorizontalAlignment(SwingConstants.LEFT);
        lbVersao.setHorizontalTextPosition(SwingConstants.CENTER);
        lbVersao.setVerticalAlignment(SwingConstants.CENTER);
        lbVersao.setVerticalTextPosition(SwingConstants.CENTER);
        lbVersao.setBounds(12, 205, 87, 29);
        this.getContentPane().add(lbVersao);

        btFechar = new JButton();
        btFechar.setFont(new Font("Lucida Sans", 1, 14));
        btFechar.setForeground(new Color(0, 0, 0));
        btFechar.setText("Fechar");
        btFechar.setHorizontalAlignment(SwingConstants.CENTER);
        btFechar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btFechar.setVerticalAlignment(SwingConstants.CENTER);
        btFechar.setVerticalTextPosition(SwingConstants.CENTER);
        btFechar.setBounds(439, 205, 87, 29);
        this.getContentPane().add(btFechar);

        this.pack();
    }

    private void definirEventos() {

        btFechar.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
            }
        });
    }
}