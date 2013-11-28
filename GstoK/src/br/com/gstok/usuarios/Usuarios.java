package br.com.gstok.usuarios;

import br.com.gstok.grupos.Grupos;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Usuarios")
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int codigo;
    private String matricula;
    private char[] senha;
    @Temporal(TemporalType.DATE)
    private Date dtExpSenha;
    private boolean ativo;
    @ManyToMany(mappedBy = "usuarios")
    private Set<Grupos> grupos;

    public Usuarios() {
        grupos = new HashSet<Grupos>();
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    public void setDtExpSenha(Date dtExpSenha) {
        this.dtExpSenha = dtExpSenha;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setGrupos(Set<Grupos> grupos) {
        this.grupos = grupos;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMatricula() {
        return matricula;
    }

    public char[] getSenha() {
        return senha;
    }

    public Date getDtExpSenha() {
        return dtExpSenha;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public Set<Grupos> getGrupos() {
        return grupos;
    }
}