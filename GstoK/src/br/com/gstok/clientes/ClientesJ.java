package br.com.gstok.clientes;

import br.com.gstok.pessoas.PessoaJuridica;
import br.com.gstok.socios.Socios;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ClientesPJ")
public class ClientesJ extends PessoaJuridica {

    private Socios socios;

    public ClientesJ() {
    }
    
    public ClientesJ(Socios socios) {
        this.socios = socios;
    }

    public Socios getSocios() {
        return socios;
    }

    public void setSocios(Socios socios) {
        this.socios = socios;
    }
    
}
