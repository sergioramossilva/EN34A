package br.com.gstok.clientes;

import br.com.gstok.enumeracoes.EstCivil;
import br.com.gstok.enumeracoes.Estados;
import br.com.gstok.utilidades.Funcoes;
import br.com.gstok.utilidades.TelasUtil;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class ClientesFGUI extends JDialog {

    private static final long serialVersionUID = 1L;
    private JPanel pnPrincipal;
    private JPanel pnEndereco;
    private JPanel pnTelefones;
    private JPanel pnOutrasInf;
    private JPanel pnBotoes;
    private JLabel lbTitulo;
    private JLabel lbCodigo;
    private JLabel lbCPF;
    private JLabel lbRG;
    private JLabel lbDtNasc;
    private JLabel lbNome;
    private JLabel lbEstCivil;
    private JLabel lbSexo;
    private JLabel lbLogradouro;
    private JLabel lbBairro;
    private JLabel lbNumero;
    private JLabel lbCidade;
    private JLabel lbEstado;
    private JLabel lbCEP;
    private JLabel lbComplemento;
    private JLabel lbEmail;
    private JLabel lbProfissao;
    private JLabel lbEmpresa;
    private JLabel lbRenda;
    private JLabel lbAtivo;
    private JTextField tfCodigo;
    private JTextField tfCPF;
    private JTextField tfRG;
    private JTextField tfDtNasc;
    private JTextField tfNome;
    private JTextField tfLogradouro;
    private JTextField tfNumero;
    private JTextField tfBairro;
    private JTextField tfCidades;
    private JTextField tfCEP;
    private JTextField tfComplemento;
    private JTextField tfEmail;
    private JTextField tfProfissao;
    private JTextField tfEmpresa;
    private JTextField tfRenda;
    private JTextField tfTotalClientes;
    private JComboBox cbEstCivil;
    private JComboBox cbEstado;
    private JComboBox cbAtivo;
    private JRadioButton rbMasculino;
    private JRadioButton rbFeminino;
    private ButtonGroup rbGrupo;
    private JButton btCalendario;
    private JButton btAdicionar;
    private JButton btRemover;
    private JButton btNovo;
    private JButton btAlterar;
    private JButton btSalvar;
    private JButton btExcluir;
    private JButton btLimpar;
    private JButton btFechar;
    private JDateChooser dcDtNasc;
    private JTable tbTelefones;
    private ListSelectionModel lsmTelefones;
    private DefaultTableModel tmTelefones;
    private JScrollPane spRolagem;
    private String tipoCadastro;
    private JComponent[] componentes;

    public ClientesFGUI() {

        iniciarComponentes();
        definirEventos();
    }

    private void iniciarComponentes() {

        this.setPreferredSize(new Dimension(726, 528));
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("GstoK - Cadastro de Clientes");
        this.setResizable(false);
        this.setModal(true);
        this.setIconImage(getToolkit().getImage(this.getClass().getResource("/br/com/gstok/imagens/gstok.png")));
        this.getContentPane().setLayout(null);

        lbTitulo = new JLabel();
        lbTitulo.setText("Cadastro de Clientes");
        lbTitulo.setForeground(new Color(0, 90, 0));
        lbTitulo.setFont(new Font("Lucida Sans", 1, 17));
        lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
        lbTitulo.setVerticalAlignment(SwingConstants.CENTER);
        lbTitulo.setVerticalTextPosition(SwingConstants.CENTER);
        lbTitulo.setBounds(12, 12, 700, 24);
        this.getContentPane().add(lbTitulo);

        pnPrincipal = new JPanel();
        pnPrincipal.setBorder(new TitledBorder(null, "Dados Cadastrais", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Lucida Sans", 0, 13), new Color(0, 0, 0)));
        pnPrincipal.setLayout(null);
        pnPrincipal.setBounds(12, 46, 700, 120);
        this.getContentPane().add(pnPrincipal);

        lbCodigo = new JLabel();
        lbCodigo.setText("Código:");
        lbCodigo.setForeground(new Color(0, 0, 0));
        lbCodigo.setFont(new Font("Lucida Sans", 0, 12));
        lbCodigo.setHorizontalAlignment(SwingConstants.CENTER);
        lbCodigo.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbCodigo.setVerticalAlignment(SwingConstants.CENTER);
        lbCodigo.setVerticalTextPosition(SwingConstants.CENTER);
        lbCodigo.setBounds(18, 26, 44, 18);
        pnPrincipal.add(lbCodigo);

        tfCodigo = new JTextField();
        tfCodigo.setBackground(new Color(255, 255, 255));
        tfCodigo.setForeground(new Color(0, 0, 0));
        tfCodigo.setFont(new Font("Lucida Sans", 0, 12));
        tfCodigo.setText("");
        tfCodigo.setToolTipText("Código automático");
        tfCodigo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfCodigo.setEditable(false);
        tfCodigo.setEnabled(false);
        tfCodigo.setHorizontalAlignment(JTextField.CENTER);
        tfCodigo.setBounds(74, 25, 70, 20);
        pnPrincipal.add(tfCodigo);

        lbCPF = new JLabel();
        lbCPF.setText("CPF:");
        lbCPF.setForeground(new Color(0, 0, 0));
        lbCPF.setFont(new Font("Lucida Sans", 0, 12));
        lbCPF.setHorizontalAlignment(SwingConstants.CENTER);
        lbCPF.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbCPF.setVerticalAlignment(SwingConstants.CENTER);
        lbCPF.setVerticalTextPosition(SwingConstants.CENTER);
        lbCPF.setBounds(156, 26, 33, 18);
        pnPrincipal.add(lbCPF);

        tfCPF = new JTextField();
        tfCPF.setBackground(new Color(255, 255, 255));
        tfCPF.setForeground(new Color(0, 0, 0));
        tfCPF.setFont(new Font("Lucida Sans", 0, 12));
        tfCPF.setText("");
        tfCPF.setToolTipText("Digite o o CPF do cliente");
        tfCPF.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfCPF.setHorizontalAlignment(JTextField.LEFT);
        tfCPF.setEditable(true);
        tfCPF.setEnabled(true);
        tfCPF.setBounds(197, 25, 120, 20);
        pnPrincipal.add(tfCPF);

        lbRG = new JLabel();
        lbRG.setText("RG:");
        lbRG.setForeground(new Color(0, 0, 0));
        lbRG.setFont(new Font("Lucida Sans", 0, 12));
        lbRG.setHorizontalAlignment(SwingConstants.CENTER);
        lbRG.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbRG.setVerticalAlignment(SwingConstants.CENTER);
        lbRG.setVerticalTextPosition(SwingConstants.CENTER);
        lbRG.setBounds(327, 26, 31, 18);
        pnPrincipal.add(lbRG);

        tfRG = new JTextField();
        tfRG.setBackground(new Color(255, 255, 255));
        tfRG.setForeground(new Color(0, 0, 0));
        tfRG.setFont(new Font("Lucida Sans", 0, 12));
        tfRG.setText("");
        tfRG.setToolTipText("Digite o o RG do cliente");
        tfRG.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfRG.setHorizontalAlignment(JTextField.LEFT);
        tfRG.setEditable(true);
        tfRG.setEnabled(true);
        tfRG.setBounds(367, 25, 120, 20);
        pnPrincipal.add(tfRG);

        lbDtNasc = new JLabel();
        lbDtNasc.setText("Dt. Nasc:");
        lbDtNasc.setForeground(new Color(0, 0, 0));
        lbDtNasc.setFont(new Font("Lucida Sans", 0, 12));
        lbDtNasc.setHorizontalAlignment(SwingConstants.CENTER);
        lbDtNasc.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbDtNasc.setVerticalAlignment(SwingConstants.CENTER);
        lbDtNasc.setVerticalTextPosition(SwingConstants.CENTER);
        lbDtNasc.setBounds(500, 26, 63, 18);
        pnPrincipal.add(lbDtNasc);

        dcDtNasc = new JDateChooser();
        pnPrincipal.add(dcDtNasc);

        tfDtNasc = new JTextField();
        tfDtNasc = (JTextField) dcDtNasc.getDateEditor();
        tfDtNasc.setBackground(new Color(255, 255, 255));
        tfDtNasc.setForeground(new Color(0, 0, 0));
        tfDtNasc.setFont(new Font("Lucida Sans", 0, 12));
        tfDtNasc.setText("");
        tfDtNasc.setToolTipText("Digite a data de nascimento do cliente.");
        tfDtNasc.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfDtNasc.setHorizontalAlignment(JTextField.LEFT);
        tfDtNasc.setEditable(true);
        tfDtNasc.setEnabled(true);
        tfDtNasc.setBounds(570, 25, 100, 20);
        pnPrincipal.add(tfDtNasc);

        btCalendario = dcDtNasc.getCalendarButton();
        btCalendario.setBounds(672, 25, 20, 20);
        pnPrincipal.add(btCalendario);

        lbNome = new JLabel();
        lbNome.setText("Nome:");
        lbNome.setForeground(new Color(0, 0, 0));
        lbNome.setFont(new Font("Lucida Sans", 0, 12));
        lbNome.setHorizontalAlignment(SwingConstants.CENTER);
        lbNome.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbNome.setVerticalAlignment(SwingConstants.CENTER);
        lbNome.setVerticalTextPosition(SwingConstants.CENTER);
        lbNome.setBounds(18, 51, 44, 18);
        pnPrincipal.add(lbNome);

        tfNome = new JTextField();
        tfNome.setBackground((new Color(255, 255, 255)));
        tfNome.setForeground(new Color(0, 0, 0));
        tfNome.setFont(new Font("Lucida Sans", 0, 12));
        tfNome.setText("");
        tfNome.setToolTipText("Digite o nome do cliente.");
        tfNome.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfNome.setHorizontalAlignment(JTextField.LEFT);
        tfNome.setEditable(true);
        tfNome.setEnabled(true);
        tfNome.setBounds(74, 52, 597, 20);
        pnPrincipal.add(tfNome);

        lbEstCivil = new JLabel();
        lbEstCivil.setText("Est.Civil:");
        lbEstCivil.setForeground(new Color(0, 0, 0));
        lbEstCivil.setFont(new Font("Lucida Sans", 0, 12));
        lbEstCivil.setHorizontalAlignment(SwingConstants.LEFT);
        lbEstCivil.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbEstCivil.setVerticalAlignment(SwingConstants.CENTER);
        lbEstCivil.setVerticalTextPosition(SwingConstants.CENTER);
        lbEstCivil.setBounds(18, 79, 72, 18);
        pnPrincipal.add(lbEstCivil);

        cbEstCivil = new JComboBox();
        cbEstCivil.setBackground(new Color(255, 255, 255));
        cbEstCivil.setForeground(new Color(0, 0, 0));
        cbEstCivil.setFont(new Font("Lucida Sans", 0, 12));
        cbEstCivil.setToolTipText("Selecione o estado civil do cliente");
        cbEstCivil.setModel(new DefaultComboBoxModel(EstCivil.values()));
        cbEstCivil.setSelectedIndex(-1);
        cbEstCivil.setEditable(false);
        cbEstCivil.setEnabled(true);
        cbEstCivil.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        cbEstCivil.setBounds(74, 79, 105, 20);
        pnPrincipal.add(cbEstCivil);

        lbSexo = new JLabel();
        lbSexo.setText("Sexo:");
        lbSexo.setForeground(new Color(0, 0, 0));
        lbSexo.setFont(new Font("Lucida Sans", 0, 12));
        lbSexo.setHorizontalAlignment(SwingConstants.LEFT);
        lbSexo.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbSexo.setVerticalAlignment(SwingConstants.CENTER);
        lbSexo.setVerticalTextPosition(SwingConstants.CENTER);
        lbSexo.setBounds(192, 78, 72, 18);
        pnPrincipal.add(lbSexo);

        rbMasculino = new JRadioButton();
        rbMasculino.setText("Masculino");
        rbMasculino.setForeground(new Color(0, 0, 0));
        rbMasculino.setFont(new Font("Lucida Sans", 0, 12));
        rbMasculino.setToolTipText("Selecione o sexo do cliente.");
        rbMasculino.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        rbMasculino.setHorizontalAlignment(JRadioButton.LEFT);
        rbMasculino.setBounds(232, 79, 78, 20);
        pnPrincipal.add(rbMasculino);

        rbFeminino = new JRadioButton();
        rbFeminino.setText("Feminino");
        rbFeminino.setForeground(new Color(0, 0, 0));
        rbFeminino.setFont(new Font("Lucida Sans", 0, 12));
        rbFeminino.setToolTipText("Selecione o sexo do cliente.");
        rbFeminino.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        rbFeminino.setHorizontalAlignment(JRadioButton.LEFT);
        rbFeminino.setBounds(312, 79, 78, 20);
        pnPrincipal.add(rbFeminino);

        rbGrupo = new ButtonGroup();
        rbGrupo.add(rbMasculino);
        rbGrupo.add(rbFeminino);

        pnEndereco = new JPanel();
        pnEndereco.setBorder(new TitledBorder(null, "Endereço do Cliente", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Lucida Sans", 0, 13), new Color(0, 0, 0)));
        pnEndereco.setLayout(null);
        pnEndereco.setBounds(12, 170, 700, 90);
        this.getContentPane().add(pnEndereco);

        lbLogradouro = new JLabel();
        lbLogradouro.setText("Logradouro:");
        lbLogradouro.setForeground(new Color(0, 0, 0));
        lbLogradouro.setFont(new Font("Lucida Sans", 0, 12));
        lbLogradouro.setHorizontalAlignment(SwingConstants.CENTER);
        lbLogradouro.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbLogradouro.setVerticalAlignment(SwingConstants.CENTER);
        lbLogradouro.setVerticalTextPosition(SwingConstants.CENTER);
        lbLogradouro.setBounds(18, 26, 71, 18);
        pnEndereco.add(lbLogradouro);

        tfLogradouro = new JTextField();
        tfLogradouro.setBackground((new Color(255, 255, 255)));
        tfLogradouro.setForeground(new Color(0, 0, 0));
        tfLogradouro.setFont(new Font("Lucida Sans", 0, 12));
        tfLogradouro.setText("");
        tfLogradouro.setToolTipText("Digite o endereço do cliente.");
        tfLogradouro.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfLogradouro.setHorizontalAlignment(JTextField.LEFT);
        tfLogradouro.setEditable(true);
        tfLogradouro.setEnabled(true);
        tfLogradouro.setBounds(94, 25, 285, 20);
        pnEndereco.add(tfLogradouro);

        lbNumero = new JLabel();
        lbNumero.setText("N.º:");
        lbNumero.setForeground(new Color(0, 0, 0));
        lbNumero.setFont(new Font("Lucida Sans", 0, 12));
        lbNumero.setHorizontalAlignment(SwingConstants.CENTER);
        lbNumero.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbNumero.setVerticalAlignment(SwingConstants.CENTER);
        lbNumero.setVerticalTextPosition(SwingConstants.CENTER);
        lbNumero.setBounds(361, 26, 78, 18);
        pnEndereco.add(lbNumero);

        tfNumero = new JTextField();
        tfNumero.setBackground((new Color(255, 255, 255)));
        tfNumero.setForeground(new Color(0, 0, 0));
        tfNumero.setFont(new Font("Lucida Sans", 0, 12));
        tfNumero.setText("");
        tfNumero.setToolTipText("Digite o número do endereço.");
        tfNumero.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfNumero.setHorizontalAlignment(JTextField.LEFT);
        tfNumero.setEditable(true);
        tfNumero.setEnabled(true);
        tfNumero.setBounds(420, 25, 80, 20);
        pnEndereco.add(tfNumero);

        lbBairro = new JLabel();
        lbBairro.setText("Bairro:");
        lbBairro.setForeground(new Color(0, 0, 0));
        lbBairro.setFont(new Font("Lucida Sans", 0, 12));
        lbBairro.setHorizontalAlignment(SwingConstants.CENTER);
        lbBairro.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbBairro.setVerticalAlignment(SwingConstants.CENTER);
        lbBairro.setVerticalTextPosition(SwingConstants.CENTER);
        lbBairro.setBounds(492, 26, 77, 18);
        pnEndereco.add(lbBairro);

        tfBairro = new JTextField();
        tfBairro.setBackground((new Color(255, 255, 255)));
        tfBairro.setForeground(new Color(0, 0, 0));
        tfBairro.setFont(new Font("Lucida Sans", 0, 12));
        tfBairro.setText("");
        tfBairro.setToolTipText("Digite o nome do bairro.");
        tfBairro.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfBairro.setHorizontalAlignment(JTextField.LEFT);
        tfBairro.setEditable(true);
        tfBairro.setEnabled(true);
        tfBairro.setBounds(560, 25, 127, 20);
        pnEndereco.add(tfBairro);

        lbCidade = new JLabel();
        lbCidade.setText("Cidade:");
        lbCidade.setForeground(new Color(0, 0, 0));
        lbCidade.setFont(new Font("Lucida Sans", 0, 12));
        lbCidade.setHorizontalAlignment(SwingConstants.CENTER);
        lbCidade.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbCidade.setVerticalAlignment(SwingConstants.CENTER);
        lbCidade.setVerticalTextPosition(SwingConstants.CENTER);
        lbCidade.setBounds(39, 51, 50, 18);
        pnEndereco.add(lbCidade);

        tfCidades = new JTextField();
        tfCidades.setBackground((new Color(255, 255, 255)));
        tfCidades.setForeground(new Color(0, 0, 0));
        tfCidades.setFont(new Font("Lucida Sans", 0, 12));
        tfCidades.setText("");
        tfCidades.setToolTipText("Digite o nome da cidade.");
        tfCidades.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfCidades.setHorizontalAlignment(JTextField.LEFT);
        tfCidades.setEditable(true);
        tfCidades.setEnabled(true);
        tfCidades.setBounds(94, 52, 200, 20);
        pnEndereco.add(tfCidades);

        lbEstado = new JLabel();
        lbEstado.setText("UF:");
        lbEstado.setForeground(new Color(0, 0, 0));
        lbEstado.setFont(new Font("Lucida Sans", 0, 12));
        lbEstado.setHorizontalAlignment(SwingConstants.CENTER);
        lbEstado.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbEstado.setVerticalAlignment(SwingConstants.CENTER);
        lbEstado.setVerticalTextPosition(SwingConstants.CENTER);
        lbEstado.setBounds(298, 52, 50, 18);
        pnEndereco.add(lbEstado);

        cbEstado = new JComboBox();
        cbEstado.setBackground(new Color(255, 255, 255));
        cbEstado.setForeground(new Color(0, 0, 0));
        cbEstado.setFont(new Font("Lucida Sans", 0, 12));
        cbEstado.setToolTipText("Selecione o Estado da Cidade");
        cbEstado.setModel(new DefaultComboBoxModel(Estados.values()));
        cbEstado.setSelectedIndex(-1);
        cbEstado.setEditable(false);
        cbEstado.setEnabled(true);
        cbEstado.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        cbEstado.setBounds(338, 52, 62, 20);
        pnEndereco.add(cbEstado);

        lbCEP = new JLabel();
        lbCEP.setText("CEP:");
        lbCEP.setForeground(new Color(0, 0, 0));
        lbCEP.setFont(new Font("Lucida Sans", 0, 12));
        lbCEP.setHorizontalAlignment(SwingConstants.CENTER);
        lbCEP.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbCEP.setVerticalAlignment(SwingConstants.CENTER);
        lbCEP.setVerticalTextPosition(SwingConstants.CENTER);
        lbCEP.setBounds(400, 52, 50, 18);
        pnEndereco.add(lbCEP);

        tfCEP = new JTextField();
        tfCEP.setBackground((new Color(255, 255, 255)));
        tfCEP.setForeground(new Color(0, 0, 0));
        tfCEP.setFont(new Font("Lucida Sans", 0, 12));
        tfCEP.setText("");
        tfCEP.setToolTipText("Digite o nome do bairro.");
        tfCEP.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfCEP.setHorizontalAlignment(JTextField.LEFT);
        tfCEP.setEditable(true);
        tfCEP.setEnabled(true);
        tfCEP.setBounds(450, 52, 90, 20);
        pnEndereco.add(tfCEP);

        lbComplemento = new JLabel();
        lbComplemento.setText("Compl:");
        lbComplemento.setForeground(new Color(0, 0, 0));
        lbComplemento.setFont(new Font("Lucida Sans", 0, 12));
        lbComplemento.setHorizontalAlignment(SwingConstants.CENTER);
        lbComplemento.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbComplemento.setVerticalAlignment(SwingConstants.CENTER);
        lbComplemento.setVerticalTextPosition(SwingConstants.CENTER);
        lbComplemento.setBounds(548, 52, 45, 18);
        pnEndereco.add(lbComplemento);

        tfComplemento = new JTextField();
        tfComplemento.setBackground((new Color(255, 255, 255)));
        tfComplemento.setForeground(new Color(0, 0, 0));
        tfComplemento.setFont(new Font("Lucida Sans", 0, 12));
        tfComplemento.setText("");
        tfComplemento.setToolTipText("Digite o nome do bairro.");
        tfComplemento.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfComplemento.setHorizontalAlignment(JTextField.LEFT);
        tfComplemento.setEditable(true);
        tfComplemento.setEnabled(true);
        tfComplemento.setBounds(598, 52, 90, 20);
        pnEndereco.add(tfComplemento);

        pnTelefones = new JPanel();
        pnTelefones.setBorder(new TitledBorder(null, "Contato", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Lucida Sans", 0, 13), new Color(0, 0, 0)));
        pnTelefones.setLayout(null);
        pnTelefones.setBounds(12, 265, 350, 170);
        this.getContentPane().add(pnTelefones);

        tmTelefones = new DefaultTableModel(null, new String[]{"Tipo", "Telefone", "Contato"});

        tbTelefones = new JTable();
        tbTelefones.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tbTelefones.setGridColor(new Color(0, 0, 0));
        tbTelefones.setShowGrid(true);
        tbTelefones.setBackground(new Color(255, 255, 255));
        tbTelefones.setFont(new Font("Lucida Sans", 0, 12));
        tbTelefones.setForeground(new Color(0, 0, 0));
        tbTelefones.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbTelefones.setModel(tmTelefones);
        lsmTelefones = tbTelefones.getSelectionModel();
        pnTelefones.add(tbTelefones);

        spRolagem = new JScrollPane();
        spRolagem.setViewportView(tbTelefones);
        spRolagem.setBounds(18, 26, 320, 100);
        pnTelefones.add(spRolagem);

        btAdicionar = new JButton();
        btAdicionar.setFont(new Font("Lucida Sans", 0, 12));
        btAdicionar.setForeground(new Color(5, 91, 5));
        btAdicionar.setText("Adicionar");
        btAdicionar.setToolTipText("Adiciona um telefone");
        btAdicionar.setMnemonic('A');
        btAdicionar.setIcon(new ImageIcon(getClass().getResource("/br/com/gstok/imagens/adicionar.png")));
        btAdicionar.setHorizontalAlignment(SwingConstants.CENTER);
        btAdicionar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btAdicionar.setVerticalAlignment(SwingConstants.CENTER);
        btAdicionar.setVerticalTextPosition(SwingConstants.CENTER);
        btAdicionar.setBounds(18, 133, 120, 21);
        pnTelefones.add(btAdicionar);

        btRemover = new JButton();
        btRemover.setFont(new Font("Lucida Sans", 0, 12));
        btRemover.setForeground(new Color(5, 91, 5));
        btRemover.setText("Remover");
        btRemover.setToolTipText("Remove um telefone");
        btRemover.setMnemonic('R');
        btRemover.setIcon(new ImageIcon(getClass().getResource("/br/com/gstok/imagens/remover.png")));
        btRemover.setHorizontalAlignment(SwingConstants.CENTER);
        btRemover.setHorizontalTextPosition(SwingConstants.RIGHT);
        btRemover.setVerticalAlignment(SwingConstants.CENTER);
        btRemover.setVerticalTextPosition(SwingConstants.CENTER);
        btRemover.setBounds(140, 133, 120, 21);
        pnTelefones.add(btRemover);

        pnOutrasInf = new JPanel();
        pnOutrasInf.setBorder(new TitledBorder(null, "Outras Informações", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Lucida Sans", 0, 13), new Color(0, 0, 0)));
        pnOutrasInf.setLayout(null);
        pnOutrasInf.setBounds(370, 265, 343, 170);
        this.getContentPane().add(pnOutrasInf);

        lbEmail = new JLabel();
        lbEmail.setText("E-mail:");
        lbEmail.setForeground(new Color(0, 0, 0));
        lbEmail.setFont(new Font("Lucida Sans", 0, 12));
        lbEmail.setHorizontalAlignment(SwingConstants.CENTER);
        lbEmail.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbEmail.setVerticalAlignment(SwingConstants.CENTER);
        lbEmail.setVerticalTextPosition(SwingConstants.CENTER);
        lbEmail.setBounds(18, 26, 71, 18);
        pnOutrasInf.add(lbEmail);

        tfEmail = new JTextField();
        tfEmail.setBackground((new Color(255, 255, 255)));
        tfEmail.setForeground(new Color(0, 0, 0));
        tfEmail.setFont(new Font("Lucida Sans", 0, 12));
        tfEmail.setText("");
        tfEmail.setToolTipText("Digite o e-mail do cliente.");
        tfEmail.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfEmail.setHorizontalAlignment(JTextField.LEFT);
        tfEmail.setEditable(true);
        tfEmail.setEnabled(true);
        tfEmail.setBounds(94, 25, 240, 20);
        pnOutrasInf.add(tfEmail);

        lbProfissao = new JLabel();
        lbProfissao.setText("Profissão:");
        lbProfissao.setForeground(new Color(0, 0, 0));
        lbProfissao.setFont(new Font("Lucida Sans", 0, 12));
        lbProfissao.setHorizontalAlignment(SwingConstants.CENTER);
        lbProfissao.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbProfissao.setVerticalAlignment(SwingConstants.CENTER);
        lbProfissao.setVerticalTextPosition(SwingConstants.CENTER);
        lbProfissao.setBounds(18, 51, 71, 18);
        pnOutrasInf.add(lbProfissao);

        tfProfissao = new JTextField();
        tfProfissao.setBackground((new Color(255, 255, 255)));
        tfProfissao.setForeground(new Color(0, 0, 0));
        tfProfissao.setFont(new Font("Lucida Sans", 0, 12));
        tfProfissao.setText("");
        tfProfissao.setToolTipText("Digite a profissão do cliente.");
        tfProfissao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfProfissao.setHorizontalAlignment(JTextField.LEFT);
        tfProfissao.setEditable(true);
        tfProfissao.setEnabled(true);
        tfProfissao.setBounds(94, 52, 240, 20);
        pnOutrasInf.add(tfProfissao);

        lbEmpresa = new JLabel();
        lbEmpresa.setText("Empresa:");
        lbEmpresa.setForeground(new Color(0, 0, 0));
        lbEmpresa.setFont(new Font("Lucida Sans", 0, 12));
        lbEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
        lbEmpresa.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbEmpresa.setVerticalAlignment(SwingConstants.CENTER);
        lbEmpresa.setVerticalTextPosition(SwingConstants.CENTER);
        lbEmpresa.setBounds(18, 79, 71, 18);
        pnOutrasInf.add(lbEmpresa);

        tfEmpresa = new JTextField();
        tfEmpresa.setBackground((new Color(255, 255, 255)));
        tfEmpresa.setForeground(new Color(0, 0, 0));
        tfEmpresa.setFont(new Font("Lucida Sans", 0, 12));
        tfEmpresa.setText("");
        tfEmpresa.setToolTipText("Digite o nomeda empresa onde o cliente trabalha.");
        tfEmpresa.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfEmpresa.setHorizontalAlignment(JTextField.LEFT);
        tfEmpresa.setEditable(true);
        tfEmpresa.setEnabled(true);
        tfEmpresa.setBounds(94, 79, 240, 20);
        pnOutrasInf.add(tfEmpresa);

        lbRenda = new JLabel();
        lbRenda.setText("Renda:");
        lbRenda.setForeground(new Color(0, 0, 0));
        lbRenda.setFont(new Font("Lucida Sans", 0, 12));
        lbRenda.setHorizontalAlignment(SwingConstants.CENTER);
        lbRenda.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbRenda.setVerticalAlignment(SwingConstants.CENTER);
        lbRenda.setVerticalTextPosition(SwingConstants.CENTER);
        lbRenda.setBounds(18, 106, 71, 18);
        pnOutrasInf.add(lbRenda);

        tfRenda = new JTextField();
        tfRenda.setBackground((new Color(255, 255, 255)));
        tfRenda.setForeground(new Color(0, 0, 0));
        tfRenda.setFont(new Font("Lucida Sans", 0, 12));
        tfRenda.setText("");
        tfRenda.setToolTipText("Digite a renda do cliente.");
        tfRenda.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfRenda.setHorizontalAlignment(JTextField.LEFT);
        tfRenda.setEditable(true);
        tfRenda.setEnabled(true);
        tfRenda.setBounds(94, 106, 123, 20);
        pnOutrasInf.add(tfRenda);

        lbAtivo = new JLabel();
        lbAtivo.setText("Ativo:");
        lbAtivo.setForeground(new Color(0, 0, 0));
        lbAtivo.setFont(new Font("Lucida Sans", 0, 12));
        lbAtivo.setHorizontalAlignment(SwingConstants.LEFT);
        lbAtivo.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbAtivo.setVerticalAlignment(SwingConstants.CENTER);
        lbAtivo.setVerticalTextPosition(SwingConstants.CENTER);
        lbAtivo.setBounds(224, 106, 72, 18);
        pnOutrasInf.add(lbAtivo);

        cbAtivo = new JComboBox();
        cbAtivo.setBackground(new Color(255, 255, 255));
        cbAtivo.setForeground(new Color(0, 0, 0));
        cbAtivo.setFont(new Font("Lucida Sans", 0, 12));
        cbAtivo.setToolTipText("Selecione o estado civil do cliente");
        cbAtivo.setModel(new DefaultComboBoxModel(new String[]{"SIM", "NÃO"}));
        cbAtivo.setSelectedIndex(-1);
        cbAtivo.setEditable(false);
        cbAtivo.setEnabled(true);
        cbAtivo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        cbAtivo.setBounds(263, 106, 65, 20);
        pnOutrasInf.add(cbAtivo);

        tfTotalClientes = new JTextField();
        tfTotalClientes.setBackground(new Color(173, 181, 197));
        tfTotalClientes.setForeground(new Color(0, 0, 0));
        tfTotalClientes.setFont(new Font("Lucida Sans", 0, 12));
        tfTotalClientes.setText("Total de clientes cadastrados: ");
        tfTotalClientes.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfTotalClientes.setEditable(false);
        tfTotalClientes.setEnabled(true);
        tfTotalClientes.setHorizontalAlignment(JTextField.CENTER);
        tfTotalClientes.setBounds(20, 134, 300, 20);
        pnOutrasInf.add(tfTotalClientes);

        pnBotoes = new JPanel();
        pnBotoes.setBorder(new TitledBorder(null, null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Lucida Sans", 0, 13), new Color(0, 0, 0)));
        pnBotoes.setLayout(null);
        pnBotoes.setBounds(12, 443, 700, 72);
        this.getContentPane().add(pnBotoes);

        btNovo = new JButton();
        btNovo.setFont(new Font("Lucida Sans", 0, 15));
        btNovo.setForeground(new Color(5, 91, 5));
        btNovo.setText("Novo");
        btNovo.setToolTipText("Insere uma nova cidade");
        btNovo.setMnemonic('N');
        btNovo.setIcon(new ImageIcon(getClass().getResource("/br/com/gstok/imagens/inserir-registro.png")));
        btNovo.setHorizontalAlignment(SwingConstants.CENTER);
        btNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
        btNovo.setVerticalAlignment(SwingConstants.CENTER);
        btNovo.setVerticalTextPosition(SwingConstants.CENTER);
        btNovo.setBounds(14, 14, 102, 44);
        pnBotoes.add(btNovo);

        btAlterar = new JButton();
        btAlterar.setFont(new Font("Lucida Sans", 0, 15));
        btAlterar.setForeground(new Color(130, 9, 130));
        btAlterar.setText("Alterar");
        btAlterar.setToolTipText("Altera a cidade selecionada");
        btAlterar.setMnemonic('A');
        btAlterar.setIcon(new ImageIcon(getClass().getResource("/br/com/gstok/imagens/atualizar-registro.png")));
        btAlterar.setHorizontalAlignment(SwingConstants.CENTER);
        btAlterar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btAlterar.setVerticalAlignment(SwingConstants.CENTER);
        btAlterar.setVerticalTextPosition(SwingConstants.CENTER);
        btAlterar.setEnabled(false);
        btAlterar.setBounds(117, 14, 111, 44);
        pnBotoes.add(btAlterar);

        btExcluir = new JButton();
        btExcluir.setFont(new Font("Lucida Sans", 0, 15));
        btExcluir.setForeground(new Color(115, 9, 9));
        btExcluir.setText("Excluir");
        btExcluir.setToolTipText("Exclui a cidade selecionada");
        btExcluir.setMnemonic('E');
        btExcluir.setIcon(new ImageIcon(getClass().getResource("/br/com/gstok/imagens/remover-registro.png")));
        btExcluir.setHorizontalAlignment(SwingConstants.CENTER);
        btExcluir.setHorizontalTextPosition(SwingConstants.RIGHT);
        btExcluir.setVerticalAlignment(SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(SwingConstants.CENTER);
        btExcluir.setEnabled(false);
        btExcluir.setBounds(229, 14, 112, 44);
        pnBotoes.add(btExcluir);

        btSalvar = new JButton();
        btSalvar.setFont(new Font("Lucida Sans", 0, 15));
        btSalvar.setForeground(new Color(0, 0, 255));
        btSalvar.setText("Salvar");
        btSalvar.setToolTipText("Salva as alterações");
        btSalvar.setMnemonic('S');
        btSalvar.setIcon(new ImageIcon(getClass().getResource("/br/com/gstok/imagens/salvar.png")));
        btSalvar.setHorizontalAlignment(SwingConstants.CENTER);
        btSalvar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btSalvar.setVerticalAlignment(SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(SwingConstants.CENTER);
        btSalvar.setEnabled(false);
        btSalvar.setBounds(342, 14, 110, 44);
        pnBotoes.add(btSalvar);

        btLimpar = new JButton();
        btLimpar.setFont(new Font("Lucida Sans", 0, 15));
        btLimpar.setForeground(new Color(145, 99, 8));
        btLimpar.setText("Limpar");
        btLimpar.setToolTipText("Limpa o formulário");
        btLimpar.setMnemonic('L');
        btLimpar.setIcon(new ImageIcon(getClass().getResource("/br/com/gstok/imagens/limpar.png")));
        btLimpar.setHorizontalAlignment(SwingConstants.CENTER);
        btLimpar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btLimpar.setVerticalAlignment(SwingConstants.CENTER);
        btLimpar.setVerticalTextPosition(SwingConstants.CENTER);
        btLimpar.setBounds(453, 14, 114, 44);
        pnBotoes.add(btLimpar);

        btFechar = new JButton();
        btFechar.setFont(new Font("Lucida Sans", 0, 15));
        btFechar.setForeground(new Color(255, 0, 0));
        btFechar.setText("Fechar");
        btFechar.setToolTipText("Fecha o formulário");
        btFechar.setMnemonic('F');
        btFechar.setIcon(new ImageIcon(getClass().getResource("/br/com/gstok/imagens/fechar.png")));
        btFechar.setHorizontalAlignment(SwingConstants.CENTER);
        btFechar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btFechar.setVerticalAlignment(SwingConstants.CENTER);
        btFechar.setVerticalTextPosition(SwingConstants.CENTER);
        btFechar.setBounds(568, 14, 113, 44);
        pnBotoes.add(btFechar);

        this.pack();
    }

    private void definirEventos() {

        btAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                abrirCadTelefones();
            }
        });

        btSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                salvarCliente();
            }
        });

        btLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                componentes = new JComponent[]{tfCodigo, tfCPF, tfRG, tfDtNasc, tfNome, tfLogradouro, tfNumero, tfBairro, tfCidades, tfCEP, tfComplemento, tfEmail, tfProfissao, tfEmpresa, tfRenda,
                                               cbEstCivil, cbAtivo, cbEstado, rbFeminino, rbMasculino};
                Funcoes.limparComponentes(componentes);
            }
        });

        btFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
            }
        });
    }

    private void salvarCliente() {

        if (tipoCadastro.equals("novo")) {

            cadastrarCliente();
        } else if (tipoCadastro.equals("alterar")) {

            atualizarCliente();
        }
    }

    private void abrirCadTelefones() {

        TelasUtil.abrirTelefoneGUI();
    }
    
    private void cadastrarCliente() {
        
    }
    
    private void atualizarCliente() {
    
    }

    public static void main(String[] args) {
        new ClientesFGUI().setVisible(true);
    }
}