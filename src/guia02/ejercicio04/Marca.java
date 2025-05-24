package guia02.ejercicio04;

/**
 * 
 * @author Alberto Martín Capurro
 */
import java.util.ArrayList;

public class Marca {

  private ArrayList<Concesionaria> listaDeConcesionarias;

  public Marca()
  {
    listaDeConcesionarias = new ArrayList<Concesionaria>();
  }
    
  public void mostrarVehiculos()
  {
    for (Concesionaria con : listaDeConcesionarias)
    {
      con.mostrarVehiculos(TipoDeVehiculo.AUTO);
      con.mostrarVehiculos(TipoDeVehiculo.CAMIONETA);
      con.mostrarVehiculos(TipoDeVehiculo.UTILITARIO);
    }
  }

  public ArrayList<Concesionaria> obtenerConcesionariaMaxVeh() {
    ArrayList<Concesionaria> conList = new ArrayList<Concesionaria>();
    int maximaCantDeVehiculos = 0;
    
    for (Concesionaria con : listaDeConcesionarias)
    {
      if(maximaCantDeVehiculos < con.getCantidadVehiculos())
      {
        maximaCantDeVehiculos = con.getCantidadVehiculos();
      }
    }
    
    for (int i = 0; i < listaDeConcesionarias.size() && maximaCantDeVehiculos>0; i++)
    {
      Concesionaria con = listaDeConcesionarias.get(i);
      if(con.getCantidadVehiculos() == maximaCantDeVehiculos)
      {
        conList.add(con);
      }
    }
    return conList;
  }

  public void borrarVehiculo(String patente)
  {
    if(patente!=null && !patente.isBlank())
    {
      if(existeVehiculoEnAlgunaConcesionaria(patente))
      {
        boolean foundConcesionaria = false;
        Concesionaria con = null;
        
        for(int i=0; i<listaDeConcesionarias.size() && !foundConcesionaria; i++)
        {
          con = listaDeConcesionarias.get(i);
          if(con.existeVehiculo(patente))
          {
            foundConcesionaria = true;
          }
        }
        con.borrarVehiculo(patente);
      }
      else
      {
        System.out.println("El vehiculo a borrar no existe " + patente);
      }
    }
    else
    {
      System.out.println("La patente no es valida");
    }
    
  }

  public void cambiarVehiculoDeConcesionaria(String patente, Concesionaria concesionariaDestino)
  {
    //primero   debe existir patente
    if(existeVehiculoEnAlgunaConcesionaria(patente))
    {
      //segundo   debe existir concesionaria destino  
      if(concesionariaDestino != null && existeConcesionaria(concesionariaDestino.getNombre()))
      {
        double precio = getPrecio(patente);
                
        //tercero   borrar de donde exista
        borrarVehiculo(patente);
        
        //cuarto    agregar a destino
        agregarVehiculo(concesionariaDestino.getNombre(), patente, precio, TipoDeVehiculo.AUTO);
      }
    }
    else
    {
      System.out.println("No existe vehiculo para cambiar PATENTE: " + patente);
    }
  }
  
  /**
  
  */
  private double getPrecio(String patente)
  {
    double precio = 0;
    if(patente!=null && !patente.isBlank())
    {
      if(existeVehiculoEnAlgunaConcesionaria(patente))
      {
        boolean foundConcesionaria = false;
        Concesionaria con = null;
        
        for(int i=0; i<listaDeConcesionarias.size() && !foundConcesionaria; i++)
        {
          con = listaDeConcesionarias.get(i);
          if(con.existeVehiculo(patente))
          {
            foundConcesionaria = true;
          }
        }
        
        Vehiculo ve = con.getVehiculo(patente);
        precio = ve.getPrecio();
      }
      else
      {
        System.out.println("El vehiculo buscado no existe " + patente);
      }
    }
    else
    {
      System.out.println("La patente buscada no es valida");
    }
    
    return precio;
  }
  
  /**
  * Metodo auxiliar al enunciado
  */
  public void agregarVehiculo(String concesionariaNombre, String patente, double precio, TipoDeVehiculo tipo)
  {
    if(!existeVehiculoEnAlgunaConcesionaria(patente))
    {
      if(existeConcesionaria(concesionariaNombre))
      {
        Concesionaria con = listaDeConcesionarias.get(getIndexConcesionariaByName(concesionariaNombre));
        if(con.agregarVehiculo(patente, precio, tipo))
        {
          System.out.println("Se agrego vehiculo " + patente);
        }
        else
        {
          System.out.println("No se pudo agregar vehiculo " + patente);
        }
      }
      else
      {
        System.out.println("No se halla concesionaria para agregar vehiculo " + patente);
      }
    }
    else
    {
      if(patente!=null || !patente.isBlank())
        System.out.println("El vehiculo patente " + patente + " ya esta asociado a una concesionaria");
      else
        System.out.println("La patente " + patente + " para vehiculo es invalida");
    }
  }
  
  /**
  * Metodo auxiliar al enunciado
  */
  public boolean existeVehiculoEnAlgunaConcesionaria(String patente)
  {
    boolean existe = false;
    
    for(int i=0; i<listaDeConcesionarias.size() && !existe; i++)
    {
      Concesionaria con = listaDeConcesionarias.get(i);
      
      if(con.existeVehiculo(patente))
      {
        existe = true;
      }
    }
    
    return existe;
  }
  
  /**
  * Metodo auxiliar al enunciado
  */
  public void removerConcesionaria(String nombre)
  {
    if(nombre == null || nombre.isBlank())
    {
      System.out.println("Nombre de concesionaria no valido");
    }
    else
    {
      if(existeConcesionaria(nombre))
      {
        System.out.println("Se ha removido concesionaria " + nombre);
        listaDeConcesionarias.remove(getIndexConcesionariaByName(nombre));
      }
      else
      {
        System.out.println("No se encuentra concesionaria para remover " + nombre);
      }
    }
  }
  
  /**
   * Metodo auxiliar
   */
  public int getIndexConcesionariaByName(String nombre)
  {
    boolean found = false;
    int     indice = -1;
    
    for(int i = 0; i < listaDeConcesionarias.size() && !found; i++)
    {
      Concesionaria concesionaria = listaDeConcesionarias.get(i);
      if(concesionaria.getNombre().equalsIgnoreCase(nombre))
      {
        found = true;
        indice = i;
      }
    }
    return indice;
  }

  /**
  * Metodo auxiliar al enunciado
  */
  public void agregarConcesionaria(String nombre)
  {
    if(nombre == null || nombre.isBlank())
    {
      System.out.println("Nombre para concesionaria no valido");
    }
    else
    {
      if(existeConcesionaria(nombre))
      {
        System.out.println("La consecionaria ya existe no se puede agregar nuevamente");
      }
      else
      {
        listaDeConcesionarias.add(new Concesionaria(nombre));
        System.out.println("Se agrego concesionaria " + nombre);
      }
    }
  }
  
  /**
   * Metodo auxiliar al enunciado
   */
  public boolean existeConcesionaria(String nombre)
  {
    boolean existe = false;
    
    for(int i=0; i< listaDeConcesionarias.size() && !existe; i++)
    {
      Concesionaria concesionaria = listaDeConcesionarias.get(i);
      if(concesionaria.getNombre().equalsIgnoreCase(nombre))
      {
        existe = true;
      }
    }
    
    return existe;
  }
  
  /**
   * Metodo auxiliar al enunciado
   */
  public void mostrarConcesionaria()
  {
    if(listaDeConcesionarias.isEmpty())
    {
      System.out.println("No hay concesionarias registradas");
    }
    else
    {
      for (Concesionaria concesionaria : listaDeConcesionarias)
      {
        System.out.println("Concesionaria: " + concesionaria.getNombre());
      }
    }
  }
  
  public Concesionaria getConcesionariaByName(String nombre)
  {
    Concesionaria conRet = null;
    
    if(nombre!=null && !nombre.isBlank())
    {
      if(existeConcesionaria(nombre))
      {
        int index = getIndexConcesionariaByName(nombre);
      
        conRet = listaDeConcesionarias.get(index);
      }
      else
      {
        System.out.println("No existe concesionaria");
      }
    }
    
    return conRet;
  }

}