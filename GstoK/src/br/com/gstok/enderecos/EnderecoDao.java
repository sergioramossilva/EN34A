package br.com.gstok.enderecos;

import br.com.gstok.dao.ImpDao;
import java.util.List;

public class EnderecoDao extends ImpDao {

    public void cadastrarEndereco(Enderecos endereco) {

        super.inserir(endereco);
    }

    public void alterarEndereco(Enderecos endereco) {

        super.atualizar(endereco);
    }

    public List<Enderecos> listarEnderecos(Enderecos endereco) {

        return super.listar(endereco.getClass());
    }

    public void excluirEndereco(Enderecos endereco) {

        super.excluir(endereco);
    }
}
