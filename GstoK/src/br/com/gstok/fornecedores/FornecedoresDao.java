package br.com.gstok.fornecedores;

import br.com.gstok.dao.ImpDao;
import java.util.List;

public class FornecedoresDao extends ImpDao {

    public void cadastrarFornecedor(Fornecedores fornecedor) {

        super.inserir(fornecedor);
    }

    public void alterarFornecedor(Fornecedores fornecedor) {

        super.atualizar(fornecedor);
    }

    public List<Fornecedores> listarFornecedores(Fornecedores fornecedor) {

        return super.listar(fornecedor.getClass());
    }

    public void excluirFornecedores(Fornecedores fornecedor) {

        super.excluir(fornecedor);
    }
}
