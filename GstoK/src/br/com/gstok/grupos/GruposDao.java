package br.com.gstok.grupos;

import br.com.gstok.dao.ImpDao;
import java.util.List;

public class GruposDao extends ImpDao {

    public void cadastrarGrupo(Grupos grupo) {

        super.inserir(grupo);
    }

    public void alterarGrupo(Grupos grupo) {

        super.atualizar(grupo);
    }

    public List<Grupos> listarGrupos(Grupos grupo) {

        return super.listar(grupo.getClass());
    }

    public void excluirGrupo(Grupos grupo) {

        super.excluir(grupo);
    }
}