package br.com.gstok.cidades;

import br.com.gstok.enumeracoes.Estados;
import br.com.gstok.utilidades.Formatador;
import br.com.gstok.utilidades.Funcoes;
import br.com.gstok.utilidades.Icones;
import br.com.gstok.utilidades.TelasUtil;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class CidadesGUI extends JDialog {

    private static final long serialVersionUID = 1L;
    private JPanel pnPrincipal;
    private JPanel pnResultados;
    private JPanel pnBotoes;
    private JLabel lbTitulo;
    private JLabel lbCodigo;
    private JLabel lbNomeCidade;
    private JLabel lbEstado;
    private JLabel lbDDD;
    private JLabel lbPesquisar;
    private JTextField tfCodigo;
    private JTextField tfNomeCidade;
    private JTextField tfDDD;
    private JTextField tfPesquisar;
    private JComboBox cbEstado;
    private JTable tbListaCidade;
    private JScrollPane spRolagem;
    private JButton btPesquisar;
    private JButton btNovo;
    private JButton btAlterar;
    private JButton btSalvar;
    private JButton btExcluir;
    private JButton btLimpar;
    private JButton btFechar;
    private DefaultTableModel tmCidades;
    private ListSelectionModel lsmCidades;
    private List<Cidades> municipios;
    private String tipoCadastro;
    private JComponent[] componentes;
    private Icones icones = new Icones();

    public CidadesGUI() {

        iniciarComponentes();
        definirEventos();
        listarCidades();
    }

    private void iniciarComponentes() {

        this.setPreferredSize(new Dimension(732, 420));
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("GstoK - Cadastro de Cidades");
        this.setResizable(false);
        this.setModal(true);
        this.setIconImage(getToolkit().getImage(this.getClass().getResource("/br/com/gstok/imagens/gstok.png")));
        this.getContentPane().setLayout(null);

        lbTitulo = new JLabel();
        lbTitulo.setText("Cadastro de Cidades");
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
        pnPrincipal.setBounds(12, 46, 700, 65);
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
        tfCodigo.setName("tfCodigo");
        tfCodigo.setBackground(new Color(255, 255, 255));
        tfCodigo.setForeground(new Color(0, 0, 0));
        tfCodigo.setFont(new Font("Lucida Sans", 0, 12));
        tfCodigo.setText("");
        tfCodigo.setToolTipText("Código automático");
        tfCodigo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfCodigo.setEditable(false);
        tfCodigo.setEnabled(true);
        tfCodigo.setHorizontalAlignment(JTextField.CENTER);
        tfCodigo.setBounds(74, 25, 70, 20);
        pnPrincipal.add(tfCodigo);

        lbNomeCidade = new JLabel();
        lbNomeCidade.setText("Nome:");
        lbNomeCidade.setForeground(new Color(0, 0, 0));
        lbNomeCidade.setFont(new Font("Lucida Sans", 0, 12));
        lbNomeCidade.setHorizontalAlignment(SwingConstants.CENTER);
        lbNomeCidade.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbNomeCidade.setVerticalAlignment(SwingConstants.CENTER);
        lbNomeCidade.setVerticalTextPosition(SwingConstants.CENTER);
        lbNomeCidade.setBounds(156, 26, 44, 18);
        pnPrincipal.add(lbNomeCidade);

        tfNomeCidade = new JTextField();
        tfNomeCidade.setBackground(new Color(255, 255, 255));
        tfNomeCidade.setForeground(new Color(0, 0, 0));
        tfNomeCidade.setFont(new Font("Lucida Sans", 0, 12));
        tfNomeCidade.setText("");
        tfNomeCidade.setToolTipText("Digite o nome da Cidade");
        tfNomeCidade.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfNomeCidade.setHorizontalAlignment(JTextField.LEFT);
        tfNomeCidade.setEditable(false);
        tfNomeCidade.setEnabled(true);
        tfNomeCidade.setBounds(212, 25, 243, 20);
        pnPrincipal.add(tfNomeCidade);

        lbEstado = new JLabel();
        lbEstado.setText("Estado:");
        lbEstado.setForeground(new Color(0, 0, 0));
        lbEstado.setFont(new Font("Lucida Sans", 0, 12));
        lbEstado.setHorizontalAlignment(SwingConstants.CENTER);
        lbEstado.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbEstado.setVerticalAlignment(SwingConstants.CENTER);
        lbEstado.setVerticalTextPosition(SwingConstants.CENTER);
        lbEstado.setBounds(459, 26, 62, 18);
        pnPrincipal.add(lbEstado);

        cbEstado = new JComboBox();
        cbEstado.setBackground(new Color(255, 255, 255));
        cbEstado.setForeground(new Color(0, 0, 0));
        cbEstado.setFont(new Font("Lucida Sans", 0, 12));
        cbEstado.setToolTipText("Selecione o Estado da Cidade");
        cbEstado.setModel(new DefaultComboBoxModel(Estados.values()));
        cbEstado.setSelectedIndex(-1);
        cbEstado.setEditable(false);
        cbEstado.setEnabled(false);
        cbEstado.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        cbEstado.setBounds(528, 25, 62, 20);
        pnPrincipal.add(cbEstado);

        lbDDD = new JLabel();
        lbDDD.setText("DDD:");
        lbDDD.setForeground(new Color(0, 0, 0));
        lbDDD.setFont(new Font("Lucida Sans", 0, 12));
        lbDDD.setHorizontalAlignment(SwingConstants.CENTER);
        lbDDD.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbDDD.setVerticalAlignment(SwingConstants.CENTER);
        lbDDD.setVerticalTextPosition(SwingConstants.CENTER);
        lbDDD.setBounds(604, 26, 36, 18);
        pnPrincipal.add(lbDDD);

        tfDDD = new JTextField();
        tfDDD.setBackground(new Color(255, 255, 255));
        tfDDD.setForeground(new Color(0, 0, 0));
        tfDDD.setFont(new Font("Lucida Sans", 0, 12));
        tfDDD.setText("");
        tfDDD.setToolTipText("Digite o DDD da Cidade");
        tfDDD.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfDDD.setHorizontalAlignment(JTextField.LEFT);
        tfDDD.setEditable(false);
        tfDDD.setEnabled(false);
        tfDDD.setBounds(650, 25, 32, 20);
        pnPrincipal.add(tfDDD);

        pnResultados = new JPanel();
        pnResultados.setBorder(new TitledBorder(null, "Lista de Cidades", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Lucida Sans", 0, 13), new Color(0, 0, 0)));
        pnResultados.setLayout(null);
        pnResultados.setBounds(12, 115, 700, 207);
        this.getContentPane().add(pnResultados);

        lbPesquisar = new JLabel();
        lbPesquisar.setText("Digite o nome da cidade:");
        lbPesquisar.setForeground(new Color(0, 0, 0));
        lbPesquisar.setFont(new Font("Lucida Sans", 0, 12));
        lbPesquisar.setHorizontalAlignment(SwingConstants.CENTER);
        lbPesquisar.setHorizontalTextPosition(SwingConstants.RIGHT);
        lbPesquisar.setVerticalAlignment(SwingConstants.CENTER);
        lbPesquisar.setVerticalTextPosition(SwingConstants.CENTER);
        lbPesquisar.setBounds(18, 22, 150, 18);
        pnResultados.add(lbPesquisar);

        tfPesquisar = new JTextField();
        tfPesquisar.setBackground(new Color(255, 255, 255));
        tfPesquisar.setForeground(new Color(0, 0, 0));
        tfPesquisar.setFont(new Font("Lucida Sans", 0, 12));
        tfPesquisar.setText("");
        tfPesquisar.setToolTipText("Digite o nome da Cidade para pesquisar");
        tfPesquisar.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tfPesquisar.setHorizontalAlignment(JTextField.LEFT);
        tfPesquisar.setEditable(true);
        tfPesquisar.setEnabled(true);
        tfPesquisar.requestFocus();
        tfPesquisar.setBounds(173, 21, 275, 20);
        pnResultados.add(tfPesquisar);

        btPesquisar = new JButton();
        btPesquisar.setForeground(new Color(150, 0, 255));
        btPesquisar.setFont(new Font("Lucida Sans", 0, 12));
        btPesquisar.setText("Pesquisar");
        btPesquisar.setMnemonic('P');
        btPesquisar.setToolTipText("Pesquisa uma cidade no banco de dados");
        btPesquisar.setIcon(icones.getIconePesquisar());
        btPesquisar.setHorizontalAlignment(SwingConstants.CENTER);
        btPesquisar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btPesquisar.setVerticalAlignment(SwingConstants.CENTER);
        btPesquisar.setVerticalTextPosition(SwingConstants.CENTER);
        btPesquisar.setEnabled(true);
        btPesquisar.setBounds(457, 21, 120, 20);
        pnResultados.add(btPesquisar);

        tmCidades = new DefaultTableModel(null, new String[]{"Código", "Nome", "UF", "DDD"});

        tbListaCidade = new JTable();
        tbListaCidade.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        tbListaCidade.setGridColor(new Color(0, 0, 0));
        tbListaCidade.setShowGrid(true);
        tbListaCidade.setBackground(new Color(255, 255, 255));
        tbListaCidade.setFont(new Font("Lucida Sans", 0, 12));
        tbListaCidade.setForeground(new Color(0, 0, 0));
        tbListaCidade.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbListaCidade.setModel(tmCidades);
        lsmCidades = tbListaCidade.getSelectionModel();
        pnResultados.add(tbListaCidade);

        spRolagem = new JScrollPane();
        spRolagem.setViewportView(tbListaCidade);
        spRolagem.setBounds(18, 53, 664, 136);
        pnResultados.add(spRolagem);

        pnBotoes = new JPanel();
        pnBotoes.setBorder(new TitledBorder(null, null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Lucida Sans", 0, 13), new Color(0, 0, 0)));
        pnBotoes.setLayout(null);
        pnBotoes.setBounds(12, 328, 700, 72);
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
        btFechar.setIcon(icones.getIconeFechar());
        btFechar.setHorizontalAlignment(SwingConstants.CENTER);
        btFechar.setHorizontalTextPosition(SwingConstants.RIGHT);
        btFechar.setVerticalAlignment(SwingConstants.CENTER);
        btFechar.setVerticalTextPosition(SwingConstants.CENTER);
        btFechar.setBounds(568, 14, 113, 44);
        pnBotoes.add(btFechar);

        this.pack();
    }

    private void definirEventos() {

        lsmCidades.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {

                    tbCidadesLinhaSelecionada(tbListaCidade);
                }
            }
        });

        btPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                pesquisarCidade();
            }
        });

        btNovo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tipoCadastro = "novo";
                novaCidade();
            }
        });

        btAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tipoCadastro = "alterar";
                alteraCidade();
            }
        });

        btExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tipoCadastro = "excluir";
                excluiCidade();
            }
        });

        btSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarCidade();
            }
        });

        btLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                componentes = new JComponent[]{tfCodigo, tfNomeCidade, cbEstado, tfDDD, tfPesquisar};
                Funcoes.limparComponentes(componentes);
                listarCidades();
            }
        });

        btFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
            }
        });
    }

    private void listarCidades() {

        Cidades c = new Cidades();
        CidadesDao dao = new CidadesDao();
        municipios = dao.listarCidades(c);
        mostrarCidades(municipios);

    }

    private void tbCidadesLinhaSelecionada(JTable tb) {

        if (tb.getSelectedRow() != -1) {

            tfCodigo.setText(Funcoes.IntToString(municipios.get(tb.getSelectedRow()).getCodigo()));
            tfNomeCidade.setText(municipios.get(tb.getSelectedRow()).getNome());
            cbEstado.setSelectedItem(municipios.get(tb.getSelectedRow()).getUf());
            tfDDD.setText(municipios.get(tb.getSelectedRow()).getDdd());

            if (!btAlterar.isEnabled() || !btExcluir.isEnabled()) {

                Funcoes.habilitarComponentes(new JComponent[]{btAlterar, btExcluir});
            }
        } else {

            componentes = new JComponent[]{tfCodigo, tfNomeCidade, cbEstado, tfDDD};
            Funcoes.limparComponentes(componentes);
        }
    }

    private void mostrarCidades(List<Cidades> cidades) {

        while (tmCidades.getRowCount() > 0) {

            tmCidades.removeRow(0);
        }

        if (cidades.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Nenhuma cidade encontrada!", "Erro de Busca", JOptionPane.ERROR_MESSAGE, icones.getIconeErro());
        } else {

            String[] campos = new String[]{null, null, null, null};
            for (int i = 0; i < cidades.size(); i++) {

                tmCidades.addRow(campos);
                tmCidades.setValueAt(cidades.get(i).getCodigo(), i, 0);
                tmCidades.setValueAt(cidades.get(i).getNome(), i, 1);
                tmCidades.setValueAt(cidades.get(i).getUf(), i, 2);
                tmCidades.setValueAt(cidades.get(i).getDdd(), i, 3);
            }
        }
    }

    private void pesquisarCidade() {

        componentes = new JComponent[]{tfPesquisar};
        String nome = Formatador.formatarTexto(tfPesquisar.getText());

        if (!nome.equals("")) {

            List<Cidades> listaCidades = municipios;
            List<Cidades> cidadesEncontradas = null;

            for (Cidades c : listaCidades) {

                if (c.getNome().contains(nome)) {

                    cidadesEncontradas = listaCidades.subList(listaCidades.indexOf(c), (listaCidades.indexOf(c) + 1));
                }
            }

            mostrarCidades(cidadesEncontradas);
        } else {

            TelasUtil.camposInvalidos(componentes);
        }
    }

    private void novaCidade() {

        if (btAlterar.isEnabled() || btExcluir.isEnabled()) {
            Funcoes.desabilitarComponentes(new JComponent[]{btAlterar, btExcluir});
        }

        componentes = new JComponent[]{tfNomeCidade, cbEstado, tfDDD, btSalvar};
        Funcoes.limparComponentes(componentes);
        Funcoes.habilitarComponentes(componentes);
    }

    private void alteraCidade() {

        if (btNovo.isEnabled() || btExcluir.isEnabled()) {

            Funcoes.desabilitarComponentes(new JComponent[]{btNovo, btExcluir});
        }

        componentes = new JComponent[]{tfNomeCidade, cbEstado, tfDDD, btSalvar};
        Funcoes.habilitarComponentes(componentes);
    }

    private void excluiCidade() {

        if (btNovo.isEnabled() || btAlterar.isEnabled() || btSalvar.isEnabled()) {

            Funcoes.desabilitarComponentes(new JComponent[]{btNovo, btAlterar, btSalvar});
        }
        deletarCidade();
    }

    private void salvarCidade() {

        if (tipoCadastro.equals("novo")) {

            cadastrarCidade();
            Funcoes.desabilitarComponentes(new JComponent[]{tfNomeCidade, cbEstado, tfDDD});
        } else if (tipoCadastro.equals("alterar")) {

            atualizarCidade();
            Funcoes.desabilitarComponentes(new JComponent[]{tfNomeCidade, cbEstado, tfDDD});
        }
    }

    private void cadastrarCidade() {

        componentes = new JComponent[]{tfNomeCidade, cbEstado, tfDDD};
        if (Funcoes.verificarComponentes(componentes)) {

            String nome = Formatador.formatarTexto(tfNomeCidade.getText());
            String uf = Formatador.formatarTexto(cbEstado.getSelectedItem().toString());
            String ddd = Formatador.formatarTexto(tfDDD.getText());

            Cidades cidade = new Cidades();
            cidade.setNome(nome);
            cidade.setUf(uf);
            cidade.setDdd(ddd);

            CidadesDao dao = new CidadesDao();
            dao.cadastrarCidade(cidade);
            Funcoes.desabilitarComponentes(componentes);

            listarCidades();
        }
    }

    private void atualizarCidade() {

        componentes = new JComponent[]{tfNomeCidade, cbEstado, tfDDD};
        if (Funcoes.verificarComponentes(componentes)) {

            int codigo = Funcoes.StringToInt(tfCodigo.getText());
            String nome = Formatador.formatarTexto(tfNomeCidade.getText());
            String uf = Formatador.formatarTexto(cbEstado.getSelectedItem().toString());
            String ddd = Formatador.formatarTexto(tfDDD.getText());

            Cidades cidade = new Cidades();
            cidade.setNome(nome);
            cidade.setUf(uf);
            cidade.setDdd(ddd);
            cidade.setCodigo(codigo);;

            CidadesDao dao = new CidadesDao();
            dao.alterarCidade(cidade);
            Funcoes.desabilitarComponentes(componentes);

            listarCidades();
        }

    }

    private void deletarCidade() {

        int codigo = Funcoes.StringToInt(tfCodigo.getText());

        Cidades cidade = new Cidades();
        cidade.setCodigo(codigo);

        CidadesDao dao = new CidadesDao();
        dao.excluirCidade(cidade);
        Funcoes.desabilitarComponentes(new JComponent[]{btNovo, btAlterar});

        listarCidades();
    }
}