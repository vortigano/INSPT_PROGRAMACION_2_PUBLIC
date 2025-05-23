package guia02.ejercicio03;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Principal {

  public static void main(String[] args) {
      /*Academia acad = new Academia();
      System.out.println("----   Listado de cursos   ----");
      acad.imprimirListadoDeCursos();
      System.out.println("----   Abriendo curso      ----");
      acad.abrirCurso("curso 1", 1);
      System.out.println("----   Listado de cursos   ----");
      acad.imprimirListadoDeCursos();
      System.out.println("----   Abriendo curso      ----");
      acad.abrirCurso("curso 2", 3);
      System.out.println("----   Listado de cursos   ----");
      acad.imprimirListadoDeCursos();
      System.out.println("----   Cerrar curso "+ "0001" + "  ----");
      acad.cerrarCurso("0001");
      System.out.println("----   Listado de cursos   ----");
      acad.imprimirListadoDeCursos();
      System.out.println("----   Imprimir alumnos por curso   ----");
      acad.imprimirAlumnosPorCurso("0000");
      System.out.println("----   Alumnos por encima del promedio   ----");
      acad.imprimirAlumnosPorEncimaDe("0000", 5);*/
      
      Academia acad = new Academia();
    System.out.println("----   Listado de cursos   ----");
    acad.imprimirListadoDeCursos();

    System.out.println("----   Abriendo curso      ----");
    acad.abrirCurso("curso 1", 1); // código "0000"

    System.out.println("----   Abriendo curso      ----");
    acad.abrirCurso("curso 2", 3); // código "0001"

    acad.inscribirAlumno("0000", "Luis", "111");
    acad.inscribirAlumno("0000", "Lucia", "222");
    acad.inscribirAlumno("0000", "Luis", "111"); // debería avisar que ya está inscrito
    

    System.out.println("----   Listado de cursos   ----");
    acad.imprimirListadoDeCursos();

    System.out.println("----   Imprimir alumnos por curso   ----");
    acad.imprimirAlumnosPorCurso("0000");

    System.out.println("----   Alumnos por encima del promedio   ----");
    acad.imprimirAlumnosPorEncimaDe("0000", 6.5);
    
    acad.agregarEvaluacion("0000", "111", 6.5, TipoDeEvaluacion.PRIMER_EXAMEN);
    acad.agregarEvaluacion("0000", "111", 6.5, TipoDeEvaluacion.SEGUNDO_EXAMEN);
    acad.agregarEvaluacion("0000", "222", 6.6, TipoDeEvaluacion.PRIMER_EXAMEN);
    acad.agregarEvaluacion("0000", "222", 6.5, TipoDeEvaluacion.SEGUNDO_EXAMEN);
    
    System.out.println("----   Alumnos por encima del promedio   ----");
    acad.imprimirAlumnosPorEncimaDe("0000", 6.5);
      
      
  }

}