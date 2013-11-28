package br.com.gstok.funcionarios;

import br.com.gstok.dao.ImpDao;
import java.util.List;

public class FuncionariosDao extends ImpDao {

    public void cadastrarFuncionario(Funcionarios funcionario) {

        super.inserir(funcionario);
    }

    public void alterarFuncionario(Funcionarios funcionario) {

        super.atualizar(funcionario);
    }

    public List<Funcionarios> listarFuncionarios(Funcionarios funcionario) {

        return super.listar(funcionario.getClass());
    }

    public void excluirFuncionario(Funcionarios funcionario) {

        super.excluir(funcionario);
    }
}