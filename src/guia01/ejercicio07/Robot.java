package guia01.ejercicio07;

import guia01.ejercicio01.Persona;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Robot {
  private String nombre = "robo";
  
  public Robot(String nombre)
  {
    this.nombre = nombre;
  }
  
  public void Saludar()
  {
    System.out.println("Hola, mi nombre es " 
            + nombre 
            + ". En que puedo ayudarte?");
  }
  
  public void Saludar(Persona persona)
  {
    System.out.println("Hola "
            + persona.getNombreCompleto()
            + ", mi nombre es " 
            + nombre 
            + ". En que puedo ayudarte?");
  }
}
