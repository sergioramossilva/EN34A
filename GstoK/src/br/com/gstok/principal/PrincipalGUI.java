package br.com.gstok.principal;

import br.com.gstok.utilidades.Funcoes;
import br.com.gstok.utilidades.TelasUtil;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;

public class PrincipalGUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JMenuBar mnbMenu;
    private JMenu mnuCadastros;
    private JMenu mnuLancamentos;
    private JMenu mnuRelatorios;
    private JMenu mnuSistema;
    private JMenu mnuAjuda;
    private JMenuItem mnuClientes;
    private JMenuItem mnuProdutos;
    private JMenuItem mnuFornecedores;
    private JMenuItem mnuFuncionarios;
    private JMenuItem mnuUsuarios;
    private JMenuItem mnuCidades;
    private JMenuItem mnuConfigurarBD;
    private JMenuItem mnuSobre;
    private JMenuItem mnuManual;
    private JToolBar tbBarraDeFerramentas;
    private JPanel pnMensagens, pnBarraStatus;
    private JLabel lbLogo;
    private JButton btCadClientes;
    private String manual;
    private int resp;

    public PrincipalGUI() {

        iniciarComponentes();
        definirEventos();
    }

    private void iniciarComponentes() {

        this.setPreferredSize(new Dimension(800, 600));
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setTitle("GstoK - Gestão Comercial");
        this.setResizable(true);
        this.setIconImage(getToolkit().getImage(this.getClass().getResource("/br/com/gstok/imagens/gstok.png")));
        this.getContentPane().setLayout(null);

        mnbMenu = new JMenuBar();
        this.setJMenuBar(mnbMenu);

        mnuCadastros = new JMenu();
        mnuCadastros.setText("Cadastros");
        mnuCadastros.setMnemonic('C');
        mnbMenu.add(mnuCadastros);

        mnuClientes = new JMenuItem();
        mnuClientes.setText("Clientes");
        mnuClientes.setMnemonic('E');
        //mnuClientes.setIcon(new ImageIcon(getClass().getResource("pacote")));
        mnuClientes.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
        mnuCadastros.add(mnuClientes);

        mnuProdutos = new JMenuItem();
        mnuProdutos.setText("Produtos");
        mnuProdutos.setMnemonic('P');
        //mnuClientes.setIcon(new ImageIcon(getClass().getResource("pacote")));
        mnuProdutos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
        mnuCadastros.add(mnuProdutos);

        mnuFornecedores = new JMenuItem();
        mnuFornecedores.setText("Fornecedores");
        mnuFornecedores.setMnemonic('F');
        //mnuClientes.setIcon(new ImageIcon(getClass().getResource("pacote")));
        mnuFornecedores.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
        mnuCadastros.add(mnuFornecedores);

        mnuCadastros.addSeparator();

        mnuFuncionarios = new JMenuItem();
        mnuFuncionarios.setText("Funcionários");
        mnuFuncionarios.setMnemonic('O');
        //mnuClientes.setIcon(new ImageIcon(getClass().getResource("pacote")));
        mnuFuncionarios.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
        mnuCadastros.add(mnuFuncionarios);

        mnuUsuarios = new JMenuItem();
        mnuUsuarios.setText("Usuários");
        mnuUsuarios.setMnemonic('U');
        //mnuClientes.setIcon(new ImageIcon(getClass().getResource("pacote")));
        mnuUsuarios.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
        mnuCadastros.add(mnuUsuarios);

        mnuCadastros.addSeparator();

        mnuCidades = new JMenuItem();
        mnuCidades.setText("Cidades");
        mnuCidades.setMnemonic('I');
        //mnuClientes.setIcon(new ImageIcon(getClass().getResource("pacote")));
        mnuCidades.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_MASK | InputEvent.SHIFT_MASK));
        mnuCadastros.add(mnuCidades);

        mnuLancamentos = new JMenu();
        mnuLancamentos.setText("Lançamentos");
        mnuLancamentos.setMnemonic('L');
        mnbMenu.add(mnuLancamentos);

        mnuRelatorios = new JMenu();
        mnuRelatorios.setText("Relatórios");
        mnuRelatorios.setMnemonic('R');
        mnbMenu.add(mnuRelatorios);

        mnuSistema = new JMenu();
        mnuSistema.setText("Sistema");
        mnuSistema.setMnemonic('S');
        mnbMenu.add(mnuSistema);

        mnuConfigurarBD = new JMenuItem();
        mnuConfigurarBD.setText("Configurar Persistência");
        mnuConfigurarBD.setMnemonic('T');
//        mnuManual.setIcon(new ImageIcon(getClass().getResource("/icone/16x16/manual.png")));
        mnuSistema.add(mnuConfigurarBD);

        mnuAjuda = new JMenu();
        mnuAjuda.setText("Ajuda");
        mnuAjuda.setMnemonic('J');
        mnbMenu.add(mnuAjuda);

        mnuManual = new JMenuItem();
        mnuManual.setText("Manual do Sistema");
        mnuManual.setMnemonic('M');
        mnuManual.setIcon(new ImageIcon(getClass().getResource("/br/com/gstok/imagens/manual.png")));
        mnuAjuda.add(mnuManual);

        mnuSobre = new JMenuItem();
        mnuSobre.setText("Sobre");
        mnuSobre.setMnemonic('S');
        //mnuClientes.setIcon(new ImageIcon(getClass().getResource("pacote")));
        mnuAjuda.add(mnuSobre);

        tbBarraDeFerramentas = new JToolBar();
        tbBarraDeFerramentas.setBorder(new BevelBorder(BevelBorder.RAISED));
        tbBarraDeFerramentas.setRollover(true);
        tbBarraDeFerramentas.setFloatable(true);
        tbBarraDeFerramentas.setBounds(0, 0, 795, 30);
        this.getContentPane().add(tbBarraDeFerramentas);

        btCadClientes = new JButton();
        btCadClientes.setToolTipText("Cadastra um novo cliente");
//        btCadClientes.setIcon(new ImageIcon(getClass().getResource("/icone/icone.png")));
        btCadClientes.setHorizontalAlignment(SwingConstants.CENTER);
        btCadClientes.setHorizontalTextPosition(SwingConstants.RIGHT);
        btCadClientes.setVerticalAlignment(SwingConstants.CENTER);
        btCadClientes.setVerticalTextPosition(SwingConstants.CENTER);
        btCadClientes.setFocusable(false);
        tbBarraDeFerramentas.add(btCadClientes);

        pnMensagens = new JPanel();
        pnMensagens.setBorder(new CompoundBorder(new SoftBevelBorder(BevelBorder.LOWERED), new BevelBorder(BevelBorder.LOWERED)));
        pnMensagens.setLayout(null);
        pnMensagens.setBounds(10, 36, 790, 512);
        this.getContentPane().add(pnMensagens);

        lbLogo = new JLabel();
        //       lbLogo.setIcon(new ImageIcon(getClass().getResource("/icone/gnome_logo.png"))); // NOI18N
        lbLogo.setHorizontalAlignment(SwingConstants.CENTER);
        lbLogo.setVerticalAlignment(SwingConstants.CENTER);
        lbLogo.setOpaque(true);
        //lbLogo.setBackground(new Color(0, 78, 152));
        lbLogo.setBounds(10, 10, 770, 300);
        pnMensagens.add(lbLogo);

        pnBarraStatus = new JPanel();
        pnBarraStatus.setBorder(new CompoundBorder(new SoftBevelBorder(BevelBorder.LOWERED), null));
        pnBarraStatus.setLayout(null);
        pnBarraStatus.setBounds(10, 554, 800, 23);
        this.getContentPane().add(pnBarraStatus);

        this.pack();
    }

    private void definirEventos() {

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {

                fecharJanela();
            }
        });

        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent evt) {

                tamanhoJanelaAlterada();
            }
        });

        mnuCidades.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                
                TelasUtil.abrirCidadesGUI();
            }
        });

        mnuConfigurarBD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //abrirCfgPersistencia();
            }
        });

        mnuManual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                abrirManual();
            }
        });

        mnuSobre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                TelasUtil.abrirSobreGUI();
            }
        });
    }

    private void fecharJanela() {

        resp = JOptionPane.showConfirmDialog(this, "Deseja realmente sair do GstoK?", "Sair?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (resp == JOptionPane.YES_OPTION) {

            Funcoes.sair();
        }
    }

    private void tamanhoJanelaAlterada() {

        tbBarraDeFerramentas.setSize((this.getWidth() - 5), 30);
        pnMensagens.setSize((this.getWidth() - 20), (this.getHeight() - 120));
        lbLogo.setSize((pnMensagens.getWidth() - 23), (pnMensagens.getHeight() - 23));
        pnBarraStatus.setBounds(10, (pnMensagens.getHeight() + 40), pnMensagens.getWidth(), 23);
    }

    private void abrirManual() {

        manual = System.getProperty("java.class.path").replace("GstoK.jar", "Manual/index.html");

        try {

            Desktop.getDesktop().open(new File(manual));
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this, "Não foi possível encontrar o manual do sistema!");
        }
    }
}
