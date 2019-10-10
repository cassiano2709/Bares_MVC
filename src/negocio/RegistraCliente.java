
package negocio;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import persistencia.ClienteArquivo;


public class RegistraCliente {
    private ClienteArquivo arquivo;
    private GregorianCalendar calendar;
    private Locale locale;
    private SimpleDateFormat formatador;

    public RegistraCliente() {
        this.arquivo = new ClienteArquivo(); 
        calendar = new GregorianCalendar();
        locale = new Locale("pt","BR");
        formatador = new SimpleDateFormat("h:mm a",locale);  
    }
    
    public void salvaClienteEntrada(Cliente cliente){
        arquivo.salvaClienteEntrada(cliente,formatador.format(calendar.getTime()));
    }
    public void salvaClienteSaida(Cliente cliente){
        arquivo.salvaClienteSaida(cliente, formatador.format(calendar.getTime()));
    }
    
    
}
