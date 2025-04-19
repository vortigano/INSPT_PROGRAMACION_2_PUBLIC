package guia01.ejercicio08;

import java.util.Random;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Password {
  private final int   PASSWORD_FUERTE_LEN_MINIMA            = 8;
  private final int   PASSWORD_LONGITUD_MINIMA_POR_DEFECTO  = 6;
  private final int   PASSWORD_LONGITUD_MINIMA_AL_CAMBIAR   = 6;
  private String      pass;
  
  
  /**
   * Crea un password cuyo valor viene dado por parámetro.
   * 
   * @param pass Contraseña propuesta para la contraseña
   */
  public Password(String pass){
    this();
    this.nuevoValor(pass);
  }
  
  /**
   *  Crea un password cuyo valor se crea automáticamente.
   */
  public Password(){
    pass = generarAleatorio(PASSWORD_LONGITUD_MINIMA_POR_DEFECTO);
  }
  
  /**
  * Devuelve si la password es fuerte o no. Una password es fuerte cuando tenga 
  * al menos 8 caracteres.
  *
  * @return {@code true} si la password es fuerte, {@code false} caso contrario.
  */
  public boolean esFuerte()
  {
    return pass.length() >= PASSWORD_FUERTE_LEN_MINIMA;
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
    boolean pudoEstablecerse = false;
    if(pass==null)
      pass="";
    
    if(pass.length()>= PASSWORD_LONGITUD_MINIMA_POR_DEFECTO)
    {
      this.pass = pass;
      pudoEstablecerse = true;
    }
    
    return pudoEstablecerse;
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
    String retorno = null;
    
    if(len >= PASSWORD_LONGITUD_MINIMA_AL_CAMBIAR)
    {
      retorno = "";
      Random rnd = new Random();
      char temp;
      
      for(int i=0; i<len; i++)
      {
        temp    = (char) rnd.nextInt('A', 'z'+1);
        retorno += temp;
      }
    }
    return retorno;
  }

  public void mostrar() {
    System.out.println("Password: " + pass);
  }
  
  
}
