package guia02.ejercicio03;

import java.util.ArrayList;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Alumno {

    private String                nombre;
    private String                DNI;
    private ArrayList<Evaluacion> evaluaciones;
    
    public static final String SIN_NOMBRE = "Sin nombre";
    public static final String SIN_DNI    = "Sin dni";

    public Alumno(String nombre, String DNI)
    {
      setNombre(nombre);
      setDNI(DNI);
    }
    
    public void setNombre(String nombre)
    {
      if(nombre != null && !nombre.isBlank())
      {
        this.nombre = nombre;
      }
      else
      {
        this.nombre = SIN_NOMBRE;
      }
    }
    
    public String getNombre()
    {
      return nombre;
    }
    
    public String getDNI()
    {
      return DNI;
    }
    
    public void setDNI(String DNI)
    {
      if (DNI != null && !DNI.isBlank()) {
        this.DNI = DNI;
      } 
      else 
      {
        this.DNI = SIN_DNI;
      }
    }
    
    public double calcularPromedio()
    {
        
      return 0;
    }
    
    public void agregarEvaluacion(double nota, TipoDeEvaluacion tipo)
    {
      this.evaluaciones.add(new Evaluacion(nota, tipo));
    }

}