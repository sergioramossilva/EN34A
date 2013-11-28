package br.com.gstok.cidades;

import br.com.gstok.dao.ImpDao;
import java.util.List;

public class CidadesDao extends ImpDao {

    public void cadastrarCidade(Cidades cidade) {

        super.inserir(cidade);
    }

    public void alterarCidade(Cidades cidade) {

        super.atualizar(cidade);
    }

    public List<Cidades> listarCidades(Cidades cidade) {

        return super.listar(cidade.getClass());
    }

    public void excluirCidade(Cidades cidade) {

        super.excluir(cidade);
    }
}