package br.com.gstok.clientes;

import br.com.gstok.pessoas.PessoaFisica;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ClientesPF")
public class ClientesF extends PessoaFisica{
    
    public ClientesF() {
    }
    
}
