package guia02.ejercicio02;

import java.util.ArrayList;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Inmobiliaria {

  private ArrayList<Propiedad> propiedades;

  public Inmobiliaria()
  {
    propiedades = new ArrayList<Propiedad>();
  }

  private double precioTotal() {
    double precio = 0;
    
    for (Propiedad p : propiedades)
    {
      precio += p.getPrecio();
    }
    
    return precio;
  }
  
  public double promedioDePrecio() {
    double promedio = precioTotal();
    
    if(!propiedades.isEmpty())
    {
      promedio /= propiedades.size();
    }
    
    return promedio;
  }

  /*
  La implementación del método propiedadesMasEconomicas de la clase Inmobiliaria, el
  cual debe devolver una lista de propiedades cuyo precio esté por debajo del promedio
  general
  */
  public ArrayList<Propiedad> propiedadesMasEconomicas() {
      ArrayList<Propiedad> propiedadesEconomicas = new ArrayList<Propiedad>();
      
      for (Propiedad p : propiedades)
      {
        if(promedioDePrecio() > p.getPrecio())
        {
          propiedadesEconomicas.add(p);
        }
      }
      
      return propiedadesEconomicas;
  }

  public int cantidadDePropiedadesSegunTipo(TipoDePropiedad tipo) {
      int count = 0;
      
      for (Propiedad p : propiedades) {
      
        if(p.getTipo() == tipo)
        {
          count ++;
        }
      }
      
      return count;
  }

  //@Override
  //public String toString() {
  public String propiedadesToString(){
    String msg = "";
    if(!propiedades.isEmpty())
    {
      for (int i = 0; i < propiedades.size(); i++)
      {
        Propiedad p = propiedades.get(i);
        if(i!=0)
          msg += '\n';

        msg += i +") "+ p.getDomicilio() + " $" + p.getPrecio()+" "+ p.getTipo();
      }
    }
    else
    {
      msg = "No hay propiedades registradas.";
    }
    
    return msg;
  }
  
  //public String toString(ArrayList<Propiedad> propiedadLista)
  public String propiedadesToString(ArrayList<Propiedad> propiedadLista)
  {
    String msg = "";
    if(!propiedadLista.isEmpty())
    {
      for (int i = 0; i < propiedadLista.size(); i++)
      {
        Propiedad p = propiedadLista.get(i);
        if(i!=0)
          msg += '\n';

        msg += i +") "+ p.getDomicilio() + " $" + p.getPrecio()+" "+ p.getTipo();
      }
    }
    else
    {
      msg = "No hay propiedades registradas en el listado";
    }
    
    return msg;
  }

  void agregarPropiedad(String direccion, double precio, TipoDePropiedad tipo) {
    if( direccion!= null && !direccion.isBlank())
    {
      if( !existePropiedad(direccion))
      {
        Propiedad nuevaPropiedad = new Propiedad(direccion, precio, tipo);
        propiedades.add(nuevaPropiedad);
      }
      else
      {
        System.out.println("No se puede anyadir la propiedad ya existe en la lista.");
      }
    }
    else
    {
      System.out.println("No se puede añadir la propiedad, formato de propiedad invalido.");
    }
  }

  void removerPropiedad(String direccion)
  {
    int indice = getPropiedadIndice(direccion);
    
    if (indice != -1) 
    {
        propiedades.remove(indice);
        System.out.println("Propiedad removida.");
    } 
    else
    {
        System.out.println("La propiedad no se encuentra para ser removida.");
    }
    
  }
  
  int getPropiedadesSize()
  {
    return propiedades.size();
  }
  
  boolean mismaDireccion(Propiedad propiedad, String direccion)
  {
    boolean laMisma = false;
    if(propiedad != null)
    {
      laMisma = propiedad.getDomicilio().equals(direccion);
    }
    return laMisma;
  }
  
  int getPropiedadIndice(String direccion)
  {
    int i = 0;
    
    while(i < getPropiedadesSize() && !mismaDireccion(propiedades.get(i), direccion) )
    {
      i++;
    }
    
    return (i < getPropiedadesSize())?(i):-1;
  }
  
  boolean existePropiedad(String direccion)
  {
    boolean existe = false;
    int i = 0;
    
    while(i < getPropiedadesSize() && !mismaDireccion(propiedades.get(i), direccion) )
    {
      i++;
    }
    
    if(i < getPropiedadesSize())
    {
      existe = true;
    }
    
    return existe;
  }
}