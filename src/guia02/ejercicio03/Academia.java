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

  public void abrirCurso(String cursoTitulo, int horas) {
    Curso nuevoCurso = new Curso(horas, cursoTitulo, generarCodigoCurso());
    cursos.add(nuevoCurso);
  }
  
  private String generarCodigoCurso()
  {
    return String.format("%04x", codigoCursoCount++);
  }

    public void cerrarCurso(String cursoCodigo) {
        // Método a resolver...
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
        // Método a resolver...
    }

    public void imprimirAlumnosPorEncimaDe(double promedio) {
        // Método a resolver...
    }

}