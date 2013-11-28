package br.com.gstok.usuarios;

import br.com.gstok.dao.ImpDao;
import java.util.List;

public class UsuariosDao extends ImpDao {

    public void cadastrarUsuario(Usuarios usuario) {

        super.inserir(usuario);
    }

    public void alterarUsuario(Usuarios usuario) {

        super.atualizar(usuario);
    }

    public List<Usuarios> listarUsuarios(Usuarios usuario) {

        return super.listar(usuario.getClass());
    }

    public void excluirUsuario(Usuarios usuario) {

        super.excluir(usuario);
    }
}