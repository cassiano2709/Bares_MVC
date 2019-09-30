/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;

/**
 *
 * @author 12205008
 */
public class Bar {
    private ArrayList<Cliente> lista;
    private String nome;
    
    public Bar(String nome) {
        this.nome = nome;
        lista = new ArrayList<Cliente>();
    }
    
    public Cliente consultaCliente(String cpf){
        for(Cliente cli: lista){
            if(cli.getCpf().equals(cpf)){
                return cli;
            }
        }
        return null;
    }
    
    public void adicionaCliente(String nome, String cpf, int idade, char genero){
        if(lista.contains(cpf) != true){
            lista.add(new Cliente(nome, cpf, idade, genero));
        }
    }
    
    public void removeCliente(String cpf){
        for(Cliente cli: lista){
            if(cli.getCpf().equals(cpf)){
                lista.remove(cli);
                //break para fechar a thread do do while
                break;
            }
        }
    }
    
    public int numeroClientes(){
        return lista.size();
    }
    
    public int numeroClientesPorGenero(char genero){
        int numeroPorGenero = 0;
        for(Cliente cli: lista){
            if(cli.getGenero() == genero){
                numeroPorGenero++;
            }
        }
        return numeroPorGenero;
    }
    
    public String numeroClientesPorGenero(){
        int percentualMasculino = 0;
        int percentualFeminino = 0;
        for(Cliente cli: lista){
            if(cli.getGenero() == 'M'){
                percentualMasculino++;
            }
        }
        for(Cliente cli: lista){
            if(cli.getGenero() == 'F'){
                percentualFeminino++;
            }
        }
        return "Homens: "+percentualMasculino + "\nMulheres: " +percentualFeminino;
    }
    
    public boolean containsCliente(String cpf){
        for(Cliente cli: lista){
            if(cli.getCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<String> mostraClientes(){
        ArrayList<String> listaCli = new ArrayList<String>();
        for(Cliente cli: lista){
            listaCli.add(cli.getNome());
        }
        return listaCli;
    }
    
    public String getNome(){
        return nome;
    }
    
    @Override
    public String toString() {
        return "Nome do estabelcimento: "+nome;
    }
       
    
    
}
