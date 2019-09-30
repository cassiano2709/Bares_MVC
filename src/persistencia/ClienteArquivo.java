/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import negocio.Cliente;
import negocio.DAOClienteArquivo;

/**
 *
 * @author 12205008
 */
public class ClienteArquivo implements DAOClienteArquivo{    
    private static FileWriter arqEntrada, arqSaida;
    private static  PrintWriter gravarArqEntrada, gravarArqSaida;
    
    public ClienteArquivo(){
        criaPath();
    }
    
    private static void criaPath(){
        try{
            arqEntrada = new FileWriter("H:\\arquivoEntrada.txt", true);
            arqSaida = new FileWriter("H:\\arquivoSaida.txt", true);
            gravarArqEntrada = new PrintWriter(arqEntrada, true);
            gravarArqSaida = new PrintWriter(arqSaida, true);
        }catch(IOException ex){}
    }
    
    public static void fechaArquivoEntrada(){
        try{
            arqEntrada.close();
        } catch(IOException ex){
            System.out.println("Exception "+ex);
        }
    }
    
    @Override
    public void salvaClienteEntrada(Cliente cli, String horario){
        gravarArqEntrada.printf(cli.getNome()+" "+horario+"%n");
    }
    
    
    public void salvaClienteSaida(Cliente cli, String horario){
        gravarArqSaida.printf(cli.getNome()+" "+horario+"%n");
    }
    
    public void iniciaArqivo() throws IOException{
        //FileWriter arqEntrada = new FileWriter("D:\\arquivoEntrada.txt");
    }
    
    public void fechaArquivo(){
    
    }
}
