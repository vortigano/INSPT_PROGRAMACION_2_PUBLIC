package guia02.ejercicio07;
        
/**
 * 
 * @author Alberto Martín Capurro
 */
public class Candidato {

  private String nombre;
  private String mail;

  public Candidato(String nombre, String mail)
  {
    this.nombre = nombre;
    this.mail   = mail;
  }

  @Override
  public String toString() {
    return String.format("\nNombre %12s    Mail %12s ", nombre, mail);
  }
  
}