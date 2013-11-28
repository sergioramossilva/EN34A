package br.com.gstok.principal;

// <editor-fold defaultstate="collapsed" desc="Importações">
import br.com.gstok.utilidades.Funcoes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;
// </editor-fold>

/**
 * Esta é uma classe responsável por criar a tela de login do sistema.
 */
public class LoginGUI extends JDialog {

    private static final long serialVersionUID = 1L;
    private JLabel lbTitulo;
    private JLabel lbImagem;
    private JLabel lbMatricula;
    private JLabel lbSenha;
    private JTextField tfMatricula;
    private JPasswordField pfSenha;
    private JButton btEntrar;
    private JButton btSair;
    private PrincipalGUI principal;
    private int tentativa;

    /**
     * Cria o formulário LoginGUI.
     */
    public LoginGUI() {

        iniciarComponentes();
        definirEventos();
    }

    /**
     * Este método inicializa os componentes do formulário.
     */
    private void iniciarComponentes() {

        this.setPreferredSize(new Dimension(329, 217));
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("GstoK - Validação de Acesso");
        this.setResizable(false);
        this.setModal(true);
        this.setIconImage(getToolkit().getImage(this.getClass().getResource("/br/com/gstok/imagens/gstok.png")));
        this.getContentPane().setLayout(null);

        lbTitulo = new JLabel();
        lbTitulo.setText("GstoK - Gestão Comercial");
        lbTitulo.setForeground(new Color(255, 0, 0));
        lbTitulo.setFont(new Font("Lucida Sans", 0, 21));
        lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
        lbTitulo.setVerticalAlignment(SwingConstants.CENTER);
        lbTitulo.setVerticalTextPosition(SwingConstants.CENTER);
        lbTitulo.setBounds(12, 12, 305, 28);
        this.getContentPane().add(lbTitulo);

        lbImagem = new JLabel();
        lbImagem.setIcon(new ImageIcon(getClass().getResource("/br/com/gstok/imagens/login.png")));
        lbImagem.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lbImagem.setHorizontalAlignment(SwingConstants.CENTER);
        lbImagem.setVerticalAlignment(SwingConstants.CENTER);
        lbImagem.setBounds(12, 46, 130, 122);
        this.getContentPane().add(lbImagem);

        lbMatricula = new JLabel();
        lbMatricula.setText("Matrícula");
        lbMatricula.setForeground(new Color(0, 0, 255));
        lbMatricula.setFont(new Font("Lucida Sans", 1, 13));
        lbMatricula.setHorizontalAlignment(SwingConstants.CENTER);
        lbMatricula.setHorizontalTextPosition(SwingConstants.CENTER);
        lbMatricula.setVerticalAlignment(SwingConstants.CENTER);
        lbMatricula.setVerticalTextPosition(SwingConstants.CENTER);
        lbMatricula.setBounds(154, 46, 163, 19);
        this.getContentPane().add(lbMatricula);

        tfMatricula = new JTextField();
        tfMatricula.setBackground(new Color(255, 255, 255));
        tfMatricula.setForeground(new Color(0, 0, 0));
        tfMatricula.setFont(new Font("Lucida Sans", 0, 13));
        tfMatricula.setToolTipText("Digite sua matrícula");
        tfMatricula.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfMatricula.setHorizontalAlignment(JTextField.CENTER);
        tfMatricula.requestFocus();
        tfMatricula.setBounds(154, 71, 163, 21);
        this.getContentPane().add(tfMatricula);

        lbSenha = new JLabel();
        lbSenha.setText("Senha");
        lbSenha.setForeground(new Color(0, 0, 255));
        lbSenha.setFont(new Font("Lucida Sans", 1, 13));
        lbSenha.setHorizontalAlignment(SwingConstants.CENTER);
        lbSenha.setHorizontalTextPosition(SwingConstants.CENTER);
        lbSenha.setVerticalAlignment(SwingConstants.CENTER);
        lbSenha.setVerticalTextPosition(SwingConstants.CENTER);
        lbSenha.setBounds(154, 98, 163, 19);
        this.getContentPane().add(lbSenha);

        pfSenha = new JPasswordField();
        pfSenha.setBackground(new Color(255, 255, 255));
        pfSenha.setForeground(new Color(0, 0, 0));
        pfSenha.setFont(new Font("Lucida Sans", 0, 13));
        pfSenha.setToolTipText("Digite sua senha");
        pfSenha.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        pfSenha.setEchoChar('*');
        pfSenha.setHorizontalAlignment(JPasswordField.CENTER);
        pfSenha.setBounds(154, 123, 163, 21);
        this.getContentPane().add(pfSenha);

        btSair = new JButton();
        btSair.setFont(new Font("Lucida Sans", 1, 13));
        btSair.setForeground(new Color(255, 0, 0));
        btSair.setText("Sair");
        btSair.setToolTipText("Fecha a tela de login");
        btSair.setMnemonic('S');
        btSair.setIcon(new ImageIcon(getClass().getResource("/br/com/gstok/imagens/sair.png")));
        btSair.setHorizontalAlignment(SwingConstants.CENTER);
        btSair.setHorizontalTextPosition(SwingConstants.RIGHT);
        btSair.setVerticalAlignment(SwingConstants.CENTER);
        btSair.setVerticalTextPosition(SwingConstants.CENTER);
        btSair.setBounds(12, 174, 130, 31);
        this.getContentPane().add(btSair);

        btEntrar = new JButton();
        btEntrar.setFont(new Font("Lucida Sans", 1, 13));
        btEntrar.setForeground(new Color(22, 103, 22));
        btEntrar.setText("Entrar");
        btEntrar.setToolTipText("Valida o login e entra no sistema");
        btEntrar.setMnemonic('E');
        btEntrar.setIcon(new ImageIcon(getClass().getResource("/br/com/gstok/imagens/entrar.png")));
        btEntrar.setHorizontalAlignment(SwingConstants.CENTER);
        btEntrar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btEntrar.setVerticalAlignment(SwingConstants.CENTER);
        btEntrar.setVerticalTextPosition(SwingConstants.CENTER);
        btEntrar.setBounds(154, 174, 163, 31);
        this.getContentPane().add(btEntrar);

        tentativa = 1;

        this.pack();
    }

    /**
     * Este método define os eventos do formulário.
     */
    private void definirEventos() {

        pfSenha.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {

                btEntrar.requestFocus();
            }
        });

        btEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                validaLogin();
            }
        });

        btSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                sair();
            }
        });
    }

    /**
     * Este método faz a validação do login. Se o login for válido abre a tela
     * principal, senão, verifica o número de tentativas permitidas. Caso o
     * número de tentativas esteja fora do permitido faz um bloqueio por tempo.
     */
    private void validaLogin() {

        String matricula = tfMatricula.getText();
        char[] senha = pfSenha.getPassword();

        String mat = "admin";
        char[] sen = {'a', 'd', 'm', 'i', 'n'};

        if (matricula.equals(mat) && Arrays.equals(senha, sen)) {

            principal = new PrincipalGUI();
            principal.setVisible(true);
            principal.setLocationRelativeTo(null);
            dispose();
        } else {

            if (tentativa < 4) {

                JOptionPane.showMessageDialog(this, "A matrícula e/ou senha são inválidos!\nTente novamente.", "Erro de Acesso", JOptionPane.INFORMATION_MESSAGE, null);
                tentativa++;
            } else {

                JOptionPane.showMessageDialog(this, "A matrícula e/ou senha foram digitados incorretamente três vezes.\nSeu acesso foi bloqueado"
                        + " pelo próximos 15 minutos.", "Erro de Acesso", JOptionPane.INFORMATION_MESSAGE, null);
            }

        }

    }

    private void sair() {

        Funcoes.sair();
    }
}