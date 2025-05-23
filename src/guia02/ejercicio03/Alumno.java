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
      evaluaciones = new ArrayList<Evaluacion>();
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
    
    /**
      La implementación del método calcularPromedio de la clase Alumno,
      que debe calcular el promedio de dicho alumno entre todas las evaluaciones
      que haya rendido.
    */
    public double calcularPromedio()
    {
      double promedio = 0;
      if(!evaluaciones.isEmpty())
      {
        for (Evaluacion e : evaluaciones) {
          promedio += e.getNota();
        }
        promedio /= evaluaciones.size();
      }
      
      return promedio;
    }
    
    public void agregarEvaluacion(double nota, TipoDeEvaluacion tipo)
    {
      this.evaluaciones.add(new Evaluacion(nota, tipo));
      calcularPromedio();
    }
    
    public int cantidadEvaluaciones() {
      return evaluaciones.size();
    }
    
    public double getPromedio()
    {
      return calcularPromedio();
    }
}