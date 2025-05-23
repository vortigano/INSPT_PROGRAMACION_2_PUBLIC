package guia02.ejercicio03;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Academia {

    private ArrayList<Curso> cursos;
    
    private static int codigoCursoCount = 0;
    
    public Academia()
    {
      cursos = new ArrayList<Curso>();
    }
    
    public void inscribirAlumno(String cursoCodigo, String alumnoNombre, String dni) {
        // Método a resolver...
    }

  public void abrirCurso(String cursoTitulo, int horas) 
  {
    
    if(!cursoExisteTitulo(cursoTitulo))
    {
      Curso nuevoCurso = new Curso(horas, cursoTitulo, generarCodigoCurso());
      
      cursos.add(nuevoCurso);
    }
    else
    {
      System.out.println("No se pudo abrir ese curso");
    }
      
    
  }
  
  private String generarCodigoCurso()
  {
    return String.format("%04x", codigoCursoCount++);
  }

  public void cerrarCurso(String cursoCodigo)
  {
    boolean encontrado  = false;
    Curso   curso       = null;
    
    
    for (int i = 0; i < cursos.size() && !encontrado; i++)
    {
      curso = cursos.get(i);
      if(curso.getCodigo().equals(cursoCodigo))
      {
        encontrado = true;
      }
    }
    
    if(encontrado)
    {
      cursos.remove(curso);
    }
  }

  public void imprimirListadoDeCursos()
  {
    if(!cursos.isEmpty())
    {
      for (Curso curso : cursos) {
        System.out.println(
          curso.getCodigo() + " " + 
          curso.getTitulo() + " " +
          curso.getHoras() + " Hs");
      }
    }
    else
    {
      System.out.println("No hay cursos en la academia");
    }
    
  }

  public void imprimirAlumnosPorCurso(String cursoCodigo) {
    
    if(cursoExisteCodigo(cursoCodigo))
    {
      Curso curso = cursos.get(getIndexByCodigo(cursoCodigo));
      
      if (curso.getAlumnos().isEmpty()) {
        System.out.println("El curso no tiene alumnos inscritos.");
      } 
      else
      {
        for (Alumno alumno : curso.getAlumnos()) {
          System.out.println("NOMBRE: " + alumno.getNombre() + " " + alumno.getDNI());
        }
      }
    }
    else
    {
      System.out.println("No existe el curso solicitado " + cursoCodigo);
    }
  }

  public void imprimirAlumnosPorEncimaDe(String codigoCurso, double promedio) {
    if(cursoExisteCodigo(codigoCurso))
    {
      Curso curso = cursos.get(getIndexByCodigo(codigoCurso));
      
      ArrayList<Alumno> alumnos = curso.buscarAlumnosPorEncimaDe(promedio);
      
      if (alumnos.isEmpty()) {
        System.out.println("No se hallan alumnos por encima del promedio en 2 evaluaciones: " + promedio);
      } 
      else
      {
        for (Alumno alumno : alumnos) {
          System.out.println("NOMBRE: " + alumno.getNombre() + " " + alumno.getDNI() + " " + alumno.getPromedio());
        }
      }
      
    }
  }
    
  private int getIndexByCodigo(String cursoCodigo)
  {
    boolean found = false;
    int     index = -1;
    Curso   curso;
    
    for(int i = 0; i < cursos.size() && !found; i++)
    {
      curso = cursos.get(i);
      if(curso.getCodigo().equals(cursoCodigo))
      {
        index = i;
      }
    }
    
    return  index;
  }
    
  private boolean cursoExisteCodigo(String codigo)
  {
    boolean existe  = false;
    int i = 0;
    
    while (i < cursos.size() && !existe) {
      if (cursos.get(i).getCodigo().equals(codigo))
      {
        System.out.println("El curso buscado por codigo " + codigo + " existe");
        existe = true;
      }
      i++;
    }
    
    return existe;
  }

  private boolean cursoExisteTitulo(String titulo)
  {
    boolean existe  = false;
    int i = 0;
    
    while (i < cursos.size() && !existe) {
      if (cursos.get(i).getTitulo().equals(titulo))
      {
        System.out.println("El curso buscado por titulo " + titulo + " existe");
        existe = true;
      }
      i++;
    }
    
    return existe;
  }
}