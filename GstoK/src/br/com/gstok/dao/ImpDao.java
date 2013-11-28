package br.com.gstok.dao;

import br.com.gstok.hibernate.CRUD;
import java.util.List;

public abstract class ImpDao<T> implements DAO {

    private CRUD crud = new CRUD();

    @Override
    public void inserir(Object entidade) {
        crud.salvar(entidade);
    }

    @Override
    public List<T> listar(Class classe) {
        return crud.listarTudo(classe);
    }

    @Override
    public void atualizar(Object entidade) {
        crud.atualizar(entidade);
    }

    @Override
    public void excluir(Object entidade) {
        crud.deletar(entidade);
    }
}