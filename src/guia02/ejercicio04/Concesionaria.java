package guia02.ejercicio04;

/**
 * 
 * @author Alberto Martín Capurro
 */
import java.util.ArrayList;

public class Concesionaria {

  private String nombre;
  private ArrayList<Vehiculo> listaDeVehiculos;

  public static final String SIN_NOMBRE = "SIN_NOMBRE";
  
  public Concesionaria(String nombre)
  {
    setNombre(nombre);
    listaDeVehiculos = new ArrayList<Vehiculo>();
  }
  
  public void mostrarVehiculos(TipoDeVehiculo tipo)
  {
    for (Vehiculo vehiculo : listaDeVehiculos)
    {
      if(vehiculo.esTipo(tipo))
        System.out.println("Concesionaria: " + nombre + ", Patente: " + vehiculo.getPatente()+ ", Tipo: "+ tipo);
    }
  }

  public void borrarVehiculo(String patente)
  {
    Vehiculo  vehiculo  = null;
    
    vehiculo = getVehiculo(patente);
    if(vehiculo != null)
    {
      listaDeVehiculos.remove(vehiculo);
      System.out.println("Vehiculo borrado " + patente);
    }
    else
    {
      System.out.println("Vehiculo no encontrado " + patente);
    }
    
  }
  
  /*
    Metodo auxiliar
  */
  public Vehiculo getVehiculo(String patente)
  {
    boolean   found     = false;
    Vehiculo  vehiculo  = null;
    //int       indice    = 0;
    for(int i=0; i<listaDeVehiculos.size() && !found; i++)
    {
      vehiculo = listaDeVehiculos.get(i);
      if(vehiculo.getPatente().equalsIgnoreCase(patente))
      {
        found   = true;
        //indice  = i;
      }
    }
    
    /*if(found)
    {
      listaDeVehiculos.remove(indice);
      System.out.println("Vehiculo borrado " + patente);
    }*/
    return found ? vehiculo : null;
  }
  
  /**
  * Metodo auxiliar al enunciado
  */
  public int getCantidadVehiculos()
  {
    return listaDeVehiculos.size();
  }
  
  /**
  * Metodo auxiliar al enunciado
  */
  public boolean agregarVehiculo(String patente, double precio, TipoDeVehiculo tipo)
  {
    boolean agregado = false;
    if(!existeVehiculo(patente))
    {
      Vehiculo vehiculo = new Vehiculo(patente, precio, tipo);
      listaDeVehiculos.add(vehiculo);
      agregado = true;
    }
    return agregado;
  }
  
  /**
   * Metodo auxiliar al enunciado
   */
  public boolean existeVehiculo(String patente)
  {
    boolean existe = false;
    for(int i=0; i<listaDeVehiculos.size() && !existe; i++)
    {
      Vehiculo vehiculo = listaDeVehiculos.get(i);
      if(vehiculo.getPatente().equalsIgnoreCase(patente))
      {
        existe = true;
      }
    }
    return existe;
  }
  
  /**
  * Metodo auxiliar al enunciado
  */
  private void setNombre(String nombre)
  {
    if(nombre == null || nombre.isBlank())
    {
      this.nombre = SIN_NOMBRE;
    }
    else
    {
      this.nombre = nombre;
    }
  }
  
  /**
  * Metodo auxiliar al enunciado
  */
  public String getNombre()
  {
    return nombre;
  }

}