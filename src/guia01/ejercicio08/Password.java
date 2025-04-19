package guia01.ejercicio08;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Password {
  private String pass;
  
  
  /**
   * Crea un password cuyo valor viene dado por parámetro.
   * 
   * @param pass Contraseña propuesta para la contraseña
   */
  public Password(String pass){
    
  }
  
  /**
   *  Crea un password cuyo valor se crea automáticamente.
   * 
   */
  public Password(){
    
  }
  
  /**
  * Devuelve si la password es fuerte o no. Una password es fuerte cuando tenga 
  * al menos 8 caracteres.
  *
  * @return {@code true} si la password es fuerte, {@code false} caso contrario.
  */
  public boolean esFuerte()
  {
    return false;
  }
  
  /**
   * Establece como nuevo valor de password el recibido como parámetro, siempre 
   * y cuando su longitud sea mayor o igual a 6, si no, lo deja como estaba. 
   * Devuelve si se pudo o no establecer el valor.
   * 
   * @param pass La nueva contraseña propuesta.
   * @return {@code true} si se pudo establecer el valor, {@code false} caso
   * contrario.
   */
  public boolean nuevoValor(String pass)
  {
    return false;
  }
  
  /**
   * Devuelve una cadena que representa un valor de password aleatorio cuya
   * longitud coincida con el parámetro recibido. Si el parámetro es menor 
   * que 6, devuelve {@code null}.
   * 
   * @param len Longitud deseada para la contraseña generada.
   * @return Una cadena aleatoria de longitud {@code len}, o {@code null} 
   * si {@code len < 6}.
   */
  public String generarAleatorio(int len)
  {
    return (len>=6 ? "123456" : null);
  }
  
  
}
