/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import negocio.Bar;
import negocio.Cliente;
import negocio.RegistraCliente;

/**
 *
 * @author 12205008
 */
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
