package br.com.gstok.produtos;

import br.com.gstok.fornecedores.Fornecedores;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Produtos")
public class Produtos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo")
    private int codigo;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "vlrCusto")
    private double vlrCusto;
    @Column(name = "vlrVenda")
    private double vlrVenda;
    @Column(name = "quantidade")
    private int quantidade;
    @Column(name = "qntMinina")
    private int qntMinima;
    @Column(name = "qntMaxima")
    private int qntMaxima;
    @ManyToMany(mappedBy = "produtos")
    private List<Fornecedores> fornecedor;

    public Produtos() {
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVlrCusto(double vlrCusto) {
        this.vlrCusto = vlrCusto;
    }

    public void setVlrVenda(double vlrVenda) {
        this.vlrVenda = vlrVenda;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setQntMinima(int qntMinima) {
        this.qntMinima = qntMinima;
    }

    public void setQntMaxima(int qntMaxima) {
        this.qntMaxima = qntMaxima;
    }

    public void setFornecedor(List<Fornecedores> fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVlrCusto() {
        return vlrCusto;
    }

    public double getVlrVenda() {
        return vlrVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getQntMinima() {
        return qntMinima;
    }

    public int getQntMaxima() {
        return qntMaxima;
    }

    public List<Fornecedores> getFornecedor() {
        return fornecedor;
    }
}