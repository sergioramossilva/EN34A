package br.com.gstok.produtos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class ProdutosGUI extends JDialog {

    private JPanel pnBotoes;
    private JPanel pnEstoque;
    private JPanel pnProdutos;
    private JPanel pnValores;
    private JLabel lbAviso;
    private JLabel lbCodigo;
    private JLabel lbDescMax;
    private JLabel lbDescricao;
    private JLabel lbEmEstoque;
    private JLabel lbFornecedor;
    private JLabel lbMarca;
    private JLabel lbModelo;
    private JLabel lbQntMax;
    private JLabel lbQntMin;
    private JLabel lbTitulo;
    private JLabel lbVlrCusto;
    private JLabel lbVlrVenda;
    private JButton btAlterar;
    private JButton btExcluir;
    private JButton btFechar;
    private JButton btLimpar;
    private JButton btNovo;
    private JButton btSalvar;
    private JTextField tfAviso;
    private JTextField tfCodFornecedor;
    private JTextField tfCodigo;
    private JTextField tfDescMax;
    private JTextField tfDescricao;
    private JTextField tfEmEstoque;
    private JTextField tfMarca;
    private JTextField tfModelo;
    private JTextField tfNomeFornecedor;
    private JTextField tfQntMax;
    private JTextField tfQntMin;
    private JTextField tfTotalEstoque;
    private JTextField tfVlrCusto;
    private JTextField tfVlrVenda;

    public ProdutosGUI() {

        iniciarComponentes();
        definirEventos();
    }

    private void iniciarComponentes() {

        this.setPreferredSize(new Dimension(623, 395));
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("GstoK - Cadastro de Produtos");
        this.setResizable(true);
        this.setModal(true);
        this.setIconImage(getToolkit().getImage(this.getClass().getResource("/br/com/gstok/imagens/gstok.png")));
        this.getContentPane().setLayout(null);

        lbTitulo = new JLabel();
        lbTitulo.setText("Cadastro de Produtos");
        lbTitulo.setForeground(new Color(0, 90, 0));
        lbTitulo.setFont(new Font("Lucida Sans", 1, 17));
        lbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
        lbTitulo.setVerticalAlignment(SwingConstants.CENTER);
        lbTitulo.setVerticalTextPosition(SwingConstants.CENTER);
        lbTitulo.setBounds(12, 12, 592, 21);
        this.getContentPane().add(lbTitulo);

        pnProdutos = new JPanel();
        pnProdutos.setBorder(new TitledBorder(null, "Dados Cadastrais", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Lucida Sans", 0, 13), new Color(0, 0, 0)));
        pnProdutos.setLayout(null);
        pnProdutos.setBounds(12, 39, 592, 123);
        this.getContentPane().add(pnProdutos);

        lbCodigo = new JLabel();
        lbCodigo.setText("Código:");
        lbCodigo.setForeground(new Color(0, 0, 0));
        lbCodigo.setFont(new Font("Lucida Sans", 0, 12));
        lbCodigo.setHorizontalAlignment(SwingConstants.CENTER);
        lbCodigo.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbCodigo.setVerticalAlignment(SwingConstants.CENTER);
        lbCodigo.setVerticalTextPosition(SwingConstants.CENTER);
        lbCodigo.setBounds(18, 23, 44, 18);
        pnProdutos.add(lbCodigo);

        tfCodigo = new JTextField();
        tfCodigo.setBackground(new Color(255, 255, 255));
        tfCodigo.setForeground(new Color(0, 0, 0));
        tfCodigo.setFont(new Font("Lucida Sans", 0, 12));
        tfCodigo.setToolTipText("Código automático");
        tfCodigo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfCodigo.setEditable(false);
        tfCodigo.setEnabled(false);
        tfCodigo.setHorizontalAlignment(JTextField.CENTER);
        tfCodigo.setBounds(74, 23, 74, 20);
        pnProdutos.add(tfCodigo);

        lbDescricao = new JLabel();
        lbDescricao.setText("Descrição:");
        lbDescricao.setForeground(new Color(0, 0, 0));
        lbDescricao.setFont(new Font("Lucida Sans", 0, 12));
        lbDescricao.setHorizontalAlignment(SwingConstants.CENTER);
        lbDescricao.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbDescricao.setVerticalAlignment(SwingConstants.CENTER);
        lbDescricao.setVerticalTextPosition(SwingConstants.CENTER);
        lbDescricao.setBounds(160, 23, 60, 18);
        pnProdutos.add(lbDescricao);

        tfDescricao = new JTextField();
        tfDescricao.setBackground(new Color(255, 255, 255));
        tfDescricao.setForeground(new Color(0, 0, 0));
        tfDescricao.setFont(new Font("Lucida Sans", 0, 12));
        tfDescricao.setToolTipText("Digite a descrição do sistema");
        tfDescricao.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfDescricao.setEditable(true);
        tfDescricao.setEnabled(true);
        tfDescricao.setHorizontalAlignment(JTextField.LEFT);
        tfDescricao.setBounds(232, 23, 342, 20);
        pnProdutos.add(tfDescricao);

        lbMarca = new JLabel();
        lbMarca.setText("Marca:");
        lbMarca.setForeground(new Color(0, 0, 0));
        lbMarca.setFont(new Font("Lucida Sans", 0, 12));
        lbMarca.setHorizontalAlignment(SwingConstants.CENTER);
        lbMarca.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbMarca.setVerticalAlignment(SwingConstants.CENTER);
        lbMarca.setVerticalTextPosition(SwingConstants.CENTER);
        lbMarca.setBounds(18, 54, 39, 18);
        pnProdutos.add(lbMarca);

        tfMarca = new JTextField();
        tfMarca.setBackground(new Color(255, 255, 255));
        tfMarca.setForeground(new Color(0, 0, 0));
        tfMarca.setFont(new Font("Lucida Sans", 0, 12));
        tfMarca.setToolTipText("Digite a marca do produto");
        tfMarca.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfMarca.setEditable(true);
        tfMarca.setEnabled(true);
        tfMarca.setHorizontalAlignment(JTextField.CENTER);
        tfMarca.setBounds(74, 54, 200, 20);
        pnProdutos.add(tfMarca);

        lbModelo = new JLabel();
        lbModelo.setText("Modelo:");
        lbModelo.setForeground(new Color(0, 0, 0));
        lbModelo.setFont(new Font("Lucida Sans", 0, 12));
        lbModelo.setHorizontalAlignment(SwingConstants.CENTER);
        lbModelo.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbModelo.setVerticalAlignment(SwingConstants.CENTER);
        lbModelo.setVerticalTextPosition(SwingConstants.CENTER);
        lbModelo.setBounds(286, 54, 46, 18);
        pnProdutos.add(lbModelo);

        tfModelo = new JTextField();
        tfModelo.setBackground(new Color(255, 255, 255));
        tfModelo.setForeground(new Color(0, 0, 0));
        tfModelo.setFont(new Font("Lucida Sans", 0, 12));
        tfModelo.setToolTipText("Digite o modelo do produto");
        tfModelo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfModelo.setEditable(true);
        tfModelo.setEnabled(true);
        tfModelo.setHorizontalAlignment(JTextField.CENTER);
        tfModelo.setBounds(344, 54, 230, 20);
        pnProdutos.add(tfModelo);

        lbFornecedor = new JLabel();
        lbFornecedor.setText("Fornecedor:");
        lbFornecedor.setForeground(new Color(0, 0, 0));
        lbFornecedor.setFont(new Font("Lucida Sans", 0, 12));
        lbFornecedor.setHorizontalAlignment(SwingConstants.CENTER);
        lbFornecedor.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbFornecedor.setVerticalAlignment(SwingConstants.CENTER);
        lbFornecedor.setVerticalTextPosition(SwingConstants.CENTER);
        lbFornecedor.setBounds(18, 85, 69, 18);
        pnProdutos.add(lbFornecedor);

        tfCodFornecedor = new JTextField();
        tfCodFornecedor.setBackground(new Color(255, 255, 255));
        tfCodFornecedor.setForeground(new Color(0, 0, 0));
        tfCodFornecedor.setFont(new Font("Lucida Sans", 0, 12));
        tfCodFornecedor.setToolTipText("Digite o código do fornecedor");
        tfCodFornecedor.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfCodFornecedor.setEditable(true);
        tfCodFornecedor.setEnabled(true);
        tfCodFornecedor.setHorizontalAlignment(JTextField.CENTER);
        tfCodFornecedor.setBounds(99, 85, 74, 20);
        pnProdutos.add(tfCodFornecedor);

        tfNomeFornecedor = new JTextField();
        tfNomeFornecedor.setBackground(new Color(255, 255, 255));
        tfNomeFornecedor.setForeground(new Color(0, 0, 0));
        tfNomeFornecedor.setFont(new Font("Lucida Sans", 0, 12));
        tfNomeFornecedor.setToolTipText("Digite o nome do fornecedor");
        tfNomeFornecedor.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfNomeFornecedor.setEditable(true);
        tfNomeFornecedor.setEnabled(true);
        tfNomeFornecedor.setHorizontalAlignment(JTextField.CENTER);
        tfNomeFornecedor.setBounds(179, 85, 395, 20);
        pnProdutos.add(tfNomeFornecedor);

        pnValores = new JPanel();
        pnValores.setBorder(new TitledBorder(null, "Valores", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Lucida Sans", 0, 13), new Color(0, 0, 0)));
        pnValores.setLayout(null);
        pnValores.setBounds(12, 168, 220, 119);
        this.getContentPane().add(pnValores);

        lbVlrCusto = new JLabel();
        lbVlrCusto.setText("Vlr. Custo:");
        lbVlrCusto.setForeground(new Color(0, 0, 0));
        lbVlrCusto.setFont(new Font("Lucida Sans", 0, 12));
        lbVlrCusto.setHorizontalAlignment(SwingConstants.CENTER);
        lbVlrCusto.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbVlrCusto.setVerticalAlignment(SwingConstants.CENTER);
        lbVlrCusto.setVerticalTextPosition(SwingConstants.CENTER);
        lbVlrCusto.setBounds(18, 23, 60, 18);
        pnValores.add(lbVlrCusto);

        tfVlrCusto = new JTextField();
        tfVlrCusto.setBackground(new Color(255, 255, 255));
        tfVlrCusto.setForeground(new Color(0, 0, 0));
        tfVlrCusto.setFont(new Font("Lucida Sans", 0, 12));
        tfVlrCusto.setToolTipText("Digite o valor de custo do produto");
        tfVlrCusto.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfVlrCusto.setEditable(true);
        tfVlrCusto.setEnabled(true);
        tfVlrCusto.setHorizontalAlignment(JTextField.CENTER);
        tfVlrCusto.setBounds(95, 23, 107, 20);
        pnValores.add(tfVlrCusto);

        lbVlrVenda = new JLabel();
        lbVlrVenda.setText("Vlr. Venda:");
        lbVlrVenda.setForeground(new Color(0, 0, 0));
        lbVlrVenda.setFont(new Font("Lucida Sans", 0, 12));
        lbVlrVenda.setHorizontalAlignment(SwingConstants.CENTER);
        lbVlrVenda.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbVlrVenda.setVerticalAlignment(SwingConstants.CENTER);
        lbVlrVenda.setVerticalTextPosition(SwingConstants.CENTER);
        lbVlrVenda.setBounds(18, 54, 65, 18);
        pnValores.add(lbVlrVenda);

        tfVlrVenda = new JTextField();
        tfVlrVenda.setBackground(new Color(255, 255, 255));
        tfVlrVenda.setForeground(new Color(0, 0, 0));
        tfVlrVenda.setFont(new Font("Lucida Sans", 0, 12));
        tfVlrVenda.setToolTipText("Digite o valor de custo do produto");
        tfVlrVenda.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfVlrVenda.setEditable(true);
        tfVlrVenda.setEnabled(true);
        tfVlrVenda.setHorizontalAlignment(JTextField.CENTER);
        tfVlrVenda.setBounds(95, 54, 107, 20);
        pnValores.add(tfVlrVenda);

        lbDescMax = new JLabel();
        lbDescMax.setText("Dsc.Max:");
        lbDescMax.setForeground(new Color(0, 0, 0));
        lbDescMax.setFont(new Font("Lucida Sans", 0, 12));
        lbDescMax.setHorizontalAlignment(SwingConstants.CENTER);
        lbDescMax.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbDescMax.setVerticalAlignment(SwingConstants.CENTER);
        lbDescMax.setVerticalTextPosition(SwingConstants.CENTER);
        lbDescMax.setBounds(18, 85, 56, 18);
        pnValores.add(lbDescMax);

        tfDescMax = new JTextField();
        tfDescMax.setBackground(new Color(255, 255, 255));
        tfDescMax.setForeground(new Color(0, 0, 0));
        tfDescMax.setFont(new Font("Lucida Sans", 0, 12));
        tfDescMax.setToolTipText("Digite o valor de custo do produto");
        tfDescMax.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfDescMax.setEditable(true);
        tfDescMax.setEnabled(true);
        tfDescMax.setHorizontalAlignment(JTextField.CENTER);
        tfDescMax.setBounds(93, 85, 107, 20);
        pnValores.add(tfDescMax);

        pnEstoque = new JPanel();
        pnEstoque.setBorder(new TitledBorder(null, "Estoque", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Lucida Sans", 0, 13), new Color(0, 0, 0)));
        pnEstoque.setLayout(null);
        pnEstoque.setBounds(238, 168, 366, 119);
        this.getContentPane().add(pnEstoque);

        lbQntMin = new JLabel();
        lbQntMin.setText("Qnt. Min.:");
        lbQntMin.setForeground(new Color(0, 0, 0));
        lbQntMin.setFont(new Font("Lucida Sans", 0, 12));
        lbQntMin.setHorizontalAlignment(SwingConstants.CENTER);
        lbQntMin.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbQntMin.setVerticalAlignment(SwingConstants.CENTER);
        lbQntMin.setVerticalTextPosition(SwingConstants.CENTER);
        lbQntMin.setBounds(18, 23, 56, 18);
        pnEstoque.add(lbQntMin);

        tfQntMin = new JTextField();
        tfQntMin.setBackground(new Color(255, 255, 255));
        tfQntMin.setForeground(new Color(0, 0, 0));
        tfQntMin.setFont(new Font("Lucida Sans", 0, 12));
        tfQntMin.setToolTipText("Digite a quantidade mínima que deve haver no estoque");
        tfQntMin.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfQntMin.setEditable(true);
        tfQntMin.setEnabled(true);
        tfQntMin.setHorizontalAlignment(JTextField.CENTER);
        tfQntMin.setBounds(90, 23, 76, 20);
        pnEstoque.add(tfQntMin);

        lbAviso = new JLabel();
        lbAviso.setText("Avisar com:");
        lbAviso.setForeground(new Color(0, 0, 0));
        lbAviso.setFont(new Font("Lucida Sans", 0, 12));
        lbAviso.setHorizontalAlignment(SwingConstants.CENTER);
        lbAviso.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbAviso.setVerticalAlignment(SwingConstants.CENTER);
        lbAviso.setVerticalTextPosition(SwingConstants.CENTER);
        lbAviso.setBounds(194, 23, 67, 18);
        pnEstoque.add(lbAviso);

        tfAviso = new JTextField();
        tfAviso.setBackground(new Color(255, 255, 255));
        tfAviso.setForeground(new Color(0, 0, 0));
        tfAviso.setFont(new Font("Lucida Sans", 0, 12));
        tfAviso.setToolTipText("Digite a quantidade que deve haver para emitir um aviso");
        tfAviso.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfAviso.setEditable(true);
        tfAviso.setEnabled(true);
        tfAviso.setHorizontalAlignment(JTextField.CENTER);
        tfAviso.setBounds(273, 23, 75, 20);
        pnEstoque.add(tfAviso);

        lbQntMax = new JLabel();
        lbQntMax.setText("Qnt. Max.:");
        lbQntMax.setForeground(new Color(0, 0, 0));
        lbQntMax.setFont(new Font("Lucida Sans", 0, 12));
        lbQntMax.setHorizontalAlignment(SwingConstants.CENTER);
        lbQntMax.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbQntMax.setVerticalAlignment(SwingConstants.CENTER);
        lbQntMax.setVerticalTextPosition(SwingConstants.CENTER);
        lbQntMax.setBounds(18, 55, 60, 18);
        pnEstoque.add(lbQntMax);

        tfQntMax = new JTextField();
        tfQntMax.setBackground(new Color(255, 255, 255));
        tfQntMax.setForeground(new Color(0, 0, 0));
        tfQntMax.setFont(new Font("Lucida Sans", 0, 12));
        tfQntMax.setToolTipText("Digite a quantidade máxima que deve haver no estoque");
        tfQntMax.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfQntMax.setEditable(true);
        tfQntMax.setEnabled(true);
        tfQntMax.setHorizontalAlignment(JTextField.CENTER);
        tfQntMax.setBounds(90, 55, 78, 20);
        pnEstoque.add(tfQntMax);

        lbEmEstoque = new JLabel();
        lbEmEstoque.setText("Em Estoque:");
        lbEmEstoque.setForeground(new Color(0, 0, 0));
        lbEmEstoque.setFont(new Font("Lucida Sans", 0, 12));
        lbEmEstoque.setHorizontalAlignment(SwingConstants.CENTER);
        lbEmEstoque.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbEmEstoque.setVerticalAlignment(SwingConstants.CENTER);
        lbEmEstoque.setVerticalTextPosition(SwingConstants.CENTER);
        lbEmEstoque.setBounds(188, 55, 72, 18);
        pnEstoque.add(lbEmEstoque);

        tfEmEstoque = new JTextField();
        tfEmEstoque.setBackground(new Color(255, 255, 255));
        tfEmEstoque.setForeground(new Color(0, 0, 0));
        tfEmEstoque.setFont(new Font("Lucida Sans", 0, 12));
        tfEmEstoque.setToolTipText("Quantidade do produto em estoque");
        tfEmEstoque.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfEmEstoque.setEditable(false);
        tfEmEstoque.setEnabled(true);
        tfEmEstoque.setHorizontalAlignment(JTextField.CENTER);
        tfEmEstoque.setBounds(273, 55, 76, 20);
        pnEstoque.add(tfEmEstoque);

        tfTotalEstoque = new JTextField();
        tfTotalEstoque.setBackground(new Color(173, 181, 197));
        tfTotalEstoque.setForeground(new Color(0, 0, 0));
        tfTotalEstoque.setFont(new Font("Lucida Sans", 0, 12));
        tfTotalEstoque.setText("Total de produtos no estoque: ");
        tfTotalEstoque.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfTotalEstoque.setEditable(false);
        tfTotalEstoque.setEnabled(true);
        tfTotalEstoque.setHorizontalAlignment(JTextField.CENTER);
        tfTotalEstoque.setBounds(18, 85, 330, 20);
        pnEstoque.add(tfTotalEstoque);

        pnBotoes = new JPanel();
        pnBotoes.setBorder(new TitledBorder(null, null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Lucida Sans", 0, 13), new Color(0, 0, 0)));
        pnBotoes.setLayout(null);
        pnBotoes.setBounds(12, 293, 592, 64);
        this.getContentPane().add(pnBotoes);

        btNovo = new JButton();
        btNovo.setFont(new Font("Lucida Sans", 0, 15));
        btNovo.setForeground(new Color(5, 91, 5));
        btNovo.setText("Novo");
        btNovo.setToolTipText("Insere uma nova cidade");
        btNovo.setMnemonic('N');
        // btNovo.setIcon(new ImageIcon(getClass().getResource("/br/org/gstok/imagens/inserir-registro.png")));
        btNovo.setHorizontalAlignment(SwingConstants.CENTER);
        btNovo.setHorizontalTextPosition(SwingConstants.RIGHT);
        btNovo.setVerticalAlignment(SwingConstants.CENTER);
        btNovo.setVerticalTextPosition(SwingConstants.CENTER);
        btNovo.setBounds(14, 14, 89, 36);
        pnBotoes.add(btNovo);

        btAlterar = new JButton();
        btAlterar.setFont(new Font("Lucida Sans", 0, 15));
        btAlterar.setForeground(new Color(130, 9, 130));
        btAlterar.setText("Alterar");
        btAlterar.setToolTipText("Altera a cidade selecionada");
        btAlterar.setMnemonic('A');
        // btAlterar.setIcon(new ImageIcon(getClass().getResource("/br/org/gstok/imagens/atualizar-registro.png")));
        btAlterar.setHorizontalAlignment(SwingConstants.CENTER);
        btAlterar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btAlterar.setVerticalAlignment(SwingConstants.CENTER);
        btAlterar.setVerticalTextPosition(SwingConstants.CENTER);
        btAlterar.setEnabled(false);
        btAlterar.setBounds(109, 14, 89, 36);
        pnBotoes.add(btAlterar);

        btExcluir = new JButton();
        btExcluir.setFont(new Font("Lucida Sans", 0, 15));
        btExcluir.setForeground(new Color(115, 9, 9));
        btExcluir.setText("Excluir");
        btExcluir.setToolTipText("Exclui a cidade selecionada");
        btExcluir.setMnemonic('E');
        // btExcluir.setIcon(new ImageIcon(getClass().getResource("/br/org/gstok/imagens/remover-registro.png")));
        btExcluir.setHorizontalAlignment(SwingConstants.CENTER);
        btExcluir.setHorizontalTextPosition(SwingConstants.RIGHT);
        btExcluir.setVerticalAlignment(SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(SwingConstants.CENTER);
        btExcluir.setEnabled(false);
        btExcluir.setBounds(204, 14, 89, 36);
        pnBotoes.add(btExcluir);

        btSalvar = new JButton();
        btSalvar.setFont(new Font("Lucida Sans", 0, 15));
        btSalvar.setForeground(new Color(0, 0, 255));
        btSalvar.setText("Salvar");
        btSalvar.setToolTipText("Salva as alterações");
        btSalvar.setMnemonic('S');
        // btSalvar.setIcon(new ImageIcon(getClass().getResource("/br/org/gstok/imagens/salvar.png")));
        btSalvar.setHorizontalAlignment(SwingConstants.CENTER);
        btSalvar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btSalvar.setVerticalAlignment(SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(SwingConstants.CENTER);
        btSalvar.setEnabled(false);
        btSalvar.setBounds(299, 14, 89, 36);
        pnBotoes.add(btSalvar);

        btLimpar = new JButton();
        btLimpar.setFont(new Font("Lucida Sans", 0, 15));
        btLimpar.setForeground(new Color(145, 99, 8));
        btLimpar.setText("Limpar");
        btLimpar.setToolTipText("Limpa o formulário");
        btLimpar.setMnemonic('L');
        //btLimpar.setIcon(new ImageIcon(getClass().getResource("/br/org/gstok/imagens/limpar.png")));
        btLimpar.setHorizontalAlignment(SwingConstants.CENTER);
        btLimpar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btLimpar.setVerticalAlignment(SwingConstants.CENTER);
        btLimpar.setVerticalTextPosition(SwingConstants.CENTER);
        btLimpar.setBounds(394, 14, 89, 36);
        pnBotoes.add(btLimpar);

        btFechar = new JButton();
        btFechar.setFont(new Font("Lucida Sans", 0, 15));
        btFechar.setForeground(new Color(255, 0, 0));
        btFechar.setText("Fechar");
        btFechar.setToolTipText("Fecha o formulário");
        btFechar.setMnemonic('F');
        //btFechar.setIcon(new ImageIcon(getClass().getResource("/br/org/gstok/imagens/fechar.png")));
        btFechar.setHorizontalAlignment(SwingConstants.CENTER);
        btFechar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btFechar.setVerticalAlignment(SwingConstants.CENTER);
        btFechar.setVerticalTextPosition(SwingConstants.CENTER);
        btFechar.setBounds(489, 14, 89, 36);
        pnBotoes.add(btFechar);

        this.pack();

    }

    private void definirEventos() {
    }
}