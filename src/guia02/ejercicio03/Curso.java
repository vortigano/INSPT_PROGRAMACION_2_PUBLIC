package guia02.ejercicio03;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Curso {

    private int               horas;
    private String            codigoAlfaNumerico;
    private String            titulo;
    private ArrayList<Alumno> alumnos;
    
    public static final int HORAS_MAX       = 12;
    public static final int HORAS_MIN       =  1;
    public static final String SIN_TITULO   = "Sin titulo";
    
    public static final int EVALUACIONES_ENCIMA_DE_PROMEDIO = 2;

    public Curso(int horas, String titulo, String codigoAlfaNumerico) {
      this.codigoAlfaNumerico = codigoAlfaNumerico;
      setHoras(horas);
      setTitulo(titulo);
      this.alumnos            = new ArrayList<Alumno>();
    }
    
    public String getCodigo()
    {
      return codigoAlfaNumerico;
    }
    
    public int getHoras()
    {
      return horas;
    }
    
    public String getTitulo()
    {
      return titulo;
    }

    private void setHoras(int horas)
    {
      if(horas > HORAS_MAX)
      {
        horas = HORAS_MAX;
        System.out.println("Horas por encima de la maxima " +
                HORAS_MAX + 
                ". Se asigna horario por defecto maxima.");
      }
      else if(horas < HORAS_MIN)
      {
        horas = HORAS_MIN;
        System.out.println("Horas por debajo de la minima " +
                HORAS_MIN + 
                ". Se asigna horario por defecto minima.");
      }
      this.horas = horas;
    }
    
    private void setTitulo(String titulo)
    {
      if(titulo!=null && !titulo.isBlank())
      {
        this.titulo = titulo;
      }
      else
      {
        this.titulo = SIN_TITULO;
      }
    }
    
    public ArrayList<Alumno> buscarAlumnosPorEncimaDe(double promedio)
    {
      ArrayList<Alumno> alumnosEncontrados = new ArrayList<Alumno>();
      
      for (Alumno alumnoEncontrado : alumnos)
      {
        if(alumnoEncontrado.cantidadEvaluaciones() >= 
                EVALUACIONES_ENCIMA_DE_PROMEDIO)
        {
          if(alumnoEncontrado.calcularPromedio() > promedio)
          {
            alumnosEncontrados.add(alumnoEncontrado);
          }
        }
      }
      
      return alumnosEncontrados;
    }
    
    public ArrayList<Alumno> getAlumnos()
    {
      return alumnos;
    }
    
    public boolean existeAlumnoByDNI(String DNI)
    {
      boolean existe = false;
      
      for(int i=0; i<alumnos.size() && !existe; i++)
      {
        Alumno alumno = alumnos.get(i);
        if(alumno.getDNI().equals(DNI))
        {
          existe = true;
        }
      }
      
      return existe;
    }
    
    public int getIndexByDNI(String DNI)
    {
      boolean found = false;
      int index = -1;
      
      for(int i = 0; i<alumnos.size() && !found; i++)
      {
        Alumno alumno = alumnos.get(i);
        if(alumno.getDNI().equals(DNI))
        {
          index = i;
          found = true;
        }
      }
      return index;
    }
}