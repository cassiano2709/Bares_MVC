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
public interface DAOClienteArquivo {
    
    public void salvaClienteEntrada(Cliente cliente, String horario);
    public void salvaClienteSaida(Cliente cliente, String horario);
}
