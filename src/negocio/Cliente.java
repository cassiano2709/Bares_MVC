/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author 12205008
 */
public class Cliente {
    private String nome;
    private String cpf;
    private char genero;
    private int idade;

    public Cliente(String nome, String cpf, int idade, char genero) {
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.idade = idade; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != "")
            this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(nome != "")
            this.cpf = cpf;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        if(genero != ' ')
            this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0)
            this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nGenero " + genero + "\nIdade " + idade;
    }
    
    
}
