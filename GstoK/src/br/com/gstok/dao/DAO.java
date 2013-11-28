package br.com.gstok.dao;

import java.util.List;

public interface DAO<T> {

    public abstract void inserir(T entidade);

    public abstract List<T> listar(Class classe);

    public abstract void atualizar(T entidade);

    public abstract void excluir(T entidade);
}
