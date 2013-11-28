package br.com.gstok.grupos;

import br.com.gstok.usuarios.Usuarios;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Grupos")
public class Grupos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int codigo;
    private String nome;
    private boolean situacao;
    @ManyToMany
    private Set<Usuarios> usuarios;

    public Grupos() {
        usuarios = new HashSet<Usuarios>();
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public void setUsuarios(Set<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public Set<Usuarios> getUsuarios() {
        return usuarios;
    }
}