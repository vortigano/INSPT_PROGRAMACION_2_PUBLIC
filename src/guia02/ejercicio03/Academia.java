package guia02.ejercicio03;

import java.util.ArrayList;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Academia {

    private ArrayList<Curso> cursos;

    public Academia()
    {
      cursos = new ArrayList<Curso>();
    }
    
    public void inscribirAlumno(String cursoCodigo, String alumnoNombre, String dni) {
        // Método a resolver...
    }

    public void abrirCurso(String cursoTitulo, int horas) {
        // Método a resolver...
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
          curso.getHoras() + " Horas");
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