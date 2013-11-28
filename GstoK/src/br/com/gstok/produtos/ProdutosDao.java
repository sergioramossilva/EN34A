package br.com.gstok.produtos;

import br.com.gstok.dao.ImpDao;
import java.util.List;

public class ProdutosDao extends ImpDao {

    public void cadastrarProduto(Produtos produto) {

        super.inserir(produto);
    }

    public void alterarProduto(Produtos produto) {

        super.atualizar(produto);
    }

    public List<Produtos> listarProdutos(Produtos produto) {

        return super.listar(produto.getClass());
    }

    public void excluirProduto(Produtos produto) {

        super.excluir(produto);
    }
}

