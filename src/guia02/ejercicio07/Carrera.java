package guia02.ejercicio07;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Carrera {

    private static final int    MATERIAS_APROBADAS_MINIMO = 5;
    private static final int    CANDIDATOS_MAXIMO         = 20;
    private ArrayList<Alumno>   listaAlumnos;

    public Carrera()
    {
      listaAlumnos = new ArrayList<Alumno>();
    }
    
    public ArrayList<Candidato> obtenerCandidatos(double promedioMinimo) {
        
      ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
      
      for (int i = 0; i < listaAlumnos.size(); i++)
      {
        Alumno alu = listaAlumnos.get(i);
        if(candidatoConsiderado(alu) && alu.promedioMayorOIgualQue(promedioMinimo) && candidatos.size()<CANDIDATOS_MAXIMO)
        {
          //System.out.println("Candidato considerado!!! " + alu.getNombre());
          candidatos.add( new Candidato(alu.getNombre(), alu.getMail()));
        }

      }
      return candidatos;
    }

    public boolean candidatoConsiderado(Alumno alumno)
    { 
      return alumno.materiasAprobadas() >= MATERIAS_APROBADAS_MINIMO;
    }
    
    /**
     * 
     */
    public void registrarMateriasPorAlumno(String nombre, Materia materia)
    {
      if(existeAlumnoByName(nombre))
      {
        int index = getIndexAlumnoDeListaByNombre(nombre);
        Alumno aluTmp = listaAlumnos.get(index);
        aluTmp.agregarMateria(materia);
      }
    }

    /**
     * Prefiero registrar en lugar de inscribir
     * porque así puedo cargar el alumno y las materias 
     * de una sola vez y poder testear
     */
    public void registrarAlumno(String nombre, String mail)
    {      
      if(nombre==null || nombre.isBlank() || 
         mail==null   || mail.isBlank())
      {
        System.out.println("Argumentos invalidos, no se puede inscribir");
      }
      else
      {
        if(!existeAlumnoByName(nombre))
        {
          Alumno aluNuevo = new Alumno(nombre, mail);
          listaAlumnos.add(aluNuevo);
          System.out.println("Alumno " + nombre +" inscripto");
        }
        else
        {
          System.out.println("Ya existe alumno " + nombre +". No se reinscribe");
        }
        
      }
    }
    
    /**
     * 
     */
    public boolean existeAlumnoByName(String nombre)
    {
      return (getIndexAlumnoDeListaByNombre(nombre)!=-1);
    }
    /**
     * Metodo auxiliar
     */
    public int getIndexAlumnoDeListaByNombre(String nombre)
    {
      int     index       = -1;
      boolean encontrado  = false;
      
      for (int i = 0; i < listaAlumnos.size() && !encontrado; i++)
      {
        Alumno aluTemp = listaAlumnos.get(i);
        if(aluTemp.mismoNombre(nombre))
        {
          encontrado  = true;
          index       = i;
        }
      }
      return index;
    }
    
    /**
     * Metodo auxiliar
     */
    public void mostrarListaDeAlumnos()
    {
      System.out.printf("Lista de alumnos registrados %4d\n", listaAlumnos.size());
      System.out.println(listaAlumnos);
    }
}