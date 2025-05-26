package guia02.ejercicio07;
     
/**
 * 
 * @author Alberto Martín Capurro
 */   
import java.util.ArrayList;

public class Alumno {

  private String nombre;
  private String mail;
  private ArrayList<Materia> listaMateriasAprobadas;

  public Alumno(String nombre, String mail)
  {
    this.nombre                   = nombre;
    this.mail                     = mail;
    this.listaMateriasAprobadas   = new ArrayList<Materia>();
  }
  
  public String getNombre()
  {
    return nombre;
  }
  
  public String getMail()
  {
    return mail;
  }
  
  public boolean mismoNombre(String nombre)
  {
    return nombre != null && this.nombre.equalsIgnoreCase(nombre);
  }
  
  public int materiasAprobadas()
  {
    int aprobadas = 0;
    
    for (Materia materia : listaMateriasAprobadas)
    {
      if(materia.estaAprobada())
      {
        aprobadas ++;
      }
    }
    
    return aprobadas;
  }
  
  public boolean promedioMayorOIgualQue(double promedioMinimo)
  {
    double sumatoria = 0;
    
    for (Materia materiaAprobada : listaMateriasAprobadas)
    {
      sumatoria += materiaAprobada.getNotaFinal();
    }
    
    if(listaMateriasAprobadas.size()>0)
    {
      sumatoria /= listaMateriasAprobadas.size();
    }
    
    return sumatoria >= promedioMinimo;
  }
  
  
  /**
   * Agrega la materia SOLO si no existe ya
   * 
   */
  public void agregarMateria(Materia materia)
  {
    boolean encontrada = false;
    for (int i = 0; i < listaMateriasAprobadas.size() && !encontrada; i++) 
    {
      Materia mat = listaMateriasAprobadas.get(i);
      if(mat.getTipo() == materia.getTipo())
      {
        encontrada = true;
      }
    }
    
    if(!encontrada)
    {
      Materia matNueva = materia;
      listaMateriasAprobadas.add(materia);
      System.out.println("Se agrego la materia [" + materia.getTipo().getNombre() + "]");
    }
    else
    {
      System.out.println("La materia [" + materia.getTipo().getNombre() + "] no se pudo agregar porque ya estaba registrada");
    }
    
  }

  @Override
  public String toString() {
    return String.format("\n %s %s %s", nombre, mail, listaMateriasAprobadas.toString());
  }
          
}