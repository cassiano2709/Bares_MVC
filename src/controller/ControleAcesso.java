
package controller;

import java.util.ArrayList;
import negocio.Bar;
import negocio.Cliente;
import negocio.RegistraCliente;


public class ControleAcesso {
    Bar bar;
    
    public ControleAcesso(String nome) {
        bar = new Bar(nome);
    }
    
    public String getNome(){
        return bar.getNome();
    }
    
    public void cadastraCliente(String nome, String cpf, int idade, char genero){
        RegistraCliente registro = new RegistraCliente();
        registro.salvaClienteEntrada(new Cliente(nome, cpf, idade, genero));
        
        bar.adicionaCliente(nome, cpf, idade, genero);
    }
    
    public void removerCliente(String cpf){
        RegistraCliente registro = new RegistraCliente();
        registro.salvaClienteSaida(consultaCliente(cpf));
        
        bar.removeCliente(cpf);
    }
    
    public Cliente consultaCliente(String cpf){
        return bar.consultaCliente(cpf);
    }
    
    public boolean containsCliente(String cpf){
        return bar.containsCliente(cpf);
    }
    
    public ArrayList<String> mostraClientes(){
        return bar.mostraClientes();
    }
        
    public int numeroClientes(){
        return bar.numeroClientes();
    }
    
    public String numeroClientesPorGenero(){
        return bar.numeroClientesPorGenero();
    }
    
    public String toString(){
        return bar.toString();
    }
}
