
package negocio;


public interface DAOClienteArquivo {
    
    public void salvaClienteEntrada(Cliente cliente, String horario);
    public void salvaClienteSaida(Cliente cliente, String horario);
}
