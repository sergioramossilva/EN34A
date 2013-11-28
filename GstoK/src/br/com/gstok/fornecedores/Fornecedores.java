package br.com.gstok.fornecedores;

import br.com.gstok.pessoas.PessoaJuridica;
import br.com.gstok.produtos.Produtos;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Fornecedores")
public class Fornecedores extends PessoaJuridica {

    @ManyToMany
    private List<Produtos> produtos;

    public Fornecedores() {
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }
}