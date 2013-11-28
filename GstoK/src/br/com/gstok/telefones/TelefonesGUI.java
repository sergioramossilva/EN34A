package br.com.gstok.telefones;

import br.com.gstok.enumeracoes.TipoTelefone;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class TelefonesGUI extends JDialog {
    
    private JPanel pnTelefone;
    private JPanel pnBotoes;
    private JLabel lbTitulo;
    private JLabel lbTelefone;
    private JLabel lbTipo;
    private JLabel lbDono;
    private JTextField tfTelefone;
    private JTextField tfDono;
    private JComboBox cbTipo;
    private JButton btSalvar;
    private JButton btFechar;
    
    public TelefonesGUI() {
        
        iniciarComponentes();
        definirEventos();
    }
    
    private void iniciarComponentes() {
        
        this.setPreferredSize(new Dimension(242, 235));
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("GstoK - Cadastro de Telefones");
        this.setResizable(false);
        this.setModal(true);
        this.getContentPane().setLayout(null);
        
        lbTitulo = new JLabel();
        lbTitulo.setText("Cadastro de Telefones");
        lbTitulo.setForeground(new Color(0, 90, 0));
        lbTitulo.setFont(new Font("Lucida Sans", 1, 17));
        lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
        lbTitulo.setVerticalAlignment(SwingConstants.CENTER);
        lbTitulo.setVerticalTextPosition(SwingConstants.CENTER);
        lbTitulo.setBounds(12, 12, 218, 24);
        this.getContentPane().add(lbTitulo);
        
        pnTelefone = new JPanel();
        pnTelefone.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        pnTelefone.setLayout(null);
        pnTelefone.setBounds(12, 42, 218, 110);
        this.getContentPane().add(pnTelefone);
        
        lbTelefone = new JLabel();
        lbTelefone.setText("Telefone:");
        lbTelefone.setForeground(new Color(0, 0, 0));
        lbTelefone.setFont(new Font("Lucida Sans", 0, 12));
        lbTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        lbTelefone.setHorizontalTextPosition(SwingConstants.CENTER);
        lbTelefone.setVerticalAlignment(SwingConstants.CENTER);
        lbTelefone.setVerticalTextPosition(SwingConstants.CENTER);
        lbTelefone.setBounds(13, 17, 66, 18);
        pnTelefone.add(lbTelefone);
        
        tfTelefone = new JTextField();
        tfTelefone.setForeground(new Color(0, 0, 0));
        tfTelefone.setFont(new Font("Lucida Sans", 0, 12));
        tfTelefone.setToolTipText("Digite o número de telefone");
        tfTelefone.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfTelefone.setHorizontalAlignment(JTextField.LEFT);
        tfTelefone.setEditable(true);
        tfTelefone.setEnabled(true);
        tfTelefone.requestFocus();
        tfTelefone.setBounds(91, 13, 114, 20);
        pnTelefone.add(tfTelefone);
        
        lbTipo = new JLabel();
        lbTipo.setText("Tipo:");
        lbTipo.setForeground(new Color(0, 0, 0));
        lbTipo.setFont(new Font("Lucida Sans", 0, 12));
        lbTipo.setHorizontalAlignment(SwingConstants.RIGHT);
        lbTipo.setHorizontalTextPosition(SwingConstants.CENTER);
        lbTipo.setVerticalAlignment(SwingConstants.CENTER);
        lbTipo.setVerticalTextPosition(SwingConstants.CENTER);
        lbTipo.setBounds(13, 50, 66, 18);
        pnTelefone.add(lbTipo);
        
        cbTipo = new JComboBox();
        cbTipo.setBackground(new Color(255, 255, 255));
        cbTipo.setForeground(new Color(0, 0, 0));
        cbTipo.setFont(new Font("Lucida Sans", 0, 12));
        cbTipo.setToolTipText("Selecione o tipo de Telefone");
        cbTipo.setEditable(false);
        cbTipo.setModel(new DefaultComboBoxModel(TipoTelefone.values()));
        cbTipo.setSelectedIndex(-1);
        cbTipo.setEnabled(true);
        cbTipo.setBounds(91, 46, 114, 20);
        pnTelefone.add(cbTipo);
        
        lbDono = new JLabel();
        lbDono.setText("Contato:");
        lbDono.setForeground(new Color(0, 0, 0));
        lbDono.setFont(new Font("Lucida Sans", 0, 12));
        lbDono.setHorizontalAlignment(SwingConstants.RIGHT);
        lbDono.setHorizontalTextPosition(SwingConstants.CENTER);
        lbDono.setVerticalAlignment(SwingConstants.CENTER);
        lbDono.setVerticalTextPosition(SwingConstants.CENTER);
        lbDono.setBounds(13, 75, 66, 18);
        pnTelefone.add(lbDono);
        
        tfDono = new JTextField();
        tfDono.setForeground(new Color(0, 0, 0));
        tfDono.setFont(new Font("Lucida Sans", 0, 12));
        tfDono.setToolTipText("Digite o nome da pessoa dona do telefone");
        tfDono.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfDono.setHorizontalAlignment(JTextField.LEFT);
        tfDono.setEditable(true);
        tfDono.setEnabled(true);
        tfDono.requestFocus();
        tfDono.setBounds(91, 75, 114, 20);
        pnTelefone.add(tfDono);
        
        pnBotoes = new JPanel();
        pnBotoes.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        pnBotoes.setLayout(null);
        pnBotoes.setBounds(12, 162, 218, 62);
        this.getContentPane().add(pnBotoes);
        
        btSalvar = new JButton();
        btSalvar.setFont(new Font("Lucida Sans", 0, 12));
        btSalvar.setForeground(new Color(0, 0, 255));
        btSalvar.setText("Salvar");
        btSalvar.setToolTipText("Salva as alterações");
        btSalvar.setMnemonic('S');
        btSalvar.setIcon(new ImageIcon(getClass().getResource("/br/com/gstok/imagens/salvar2.png")));
        btSalvar.setHorizontalAlignment(SwingConstants.CENTER);
        btSalvar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btSalvar.setVerticalAlignment(SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(SwingConstants.CENTER);
        btSalvar.setEnabled(true);
        btSalvar.setBounds(13, 13, 93, 36);
        pnBotoes.add(btSalvar);
        
        btFechar = new JButton();
        btFechar.setFont(new Font("Lucida Sans", 0, 12));
        btFechar.setForeground(new Color(255, 0, 0));
        btFechar.setText("Fechar");
        btFechar.setToolTipText("Fecha o formulário");
        btFechar.setMnemonic('F');
        btFechar.setIcon(new ImageIcon(getClass().getResource("/br/com/gstok/imagens/fechar2.png")));
        btFechar.setHorizontalAlignment(SwingConstants.CENTER);
        btFechar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btFechar.setVerticalAlignment(SwingConstants.CENTER);
        btFechar.setVerticalTextPosition(SwingConstants.CENTER);
        btFechar.setBounds(113, 13, 93, 36);
        pnBotoes.add(btFechar);
        
        this.pack();
    }
    
    private void definirEventos() {
        
        btSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           
                salvarTelefones();
            }
        });
        
        btFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                dispose();
            }
        });
    }
    
    private void salvarTelefones() {
        
        
    }
}
