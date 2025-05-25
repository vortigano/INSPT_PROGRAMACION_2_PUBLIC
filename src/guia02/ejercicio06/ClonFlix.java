package guia02.ejercicio06;

import java.util.ArrayList;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class ClonFlix {

    private ArrayList<Cliente>  clientesLista;
    private ArrayList<Pelicula> peliculasLista;
    private ArrayList<Vista>    vistasLista;

    public ClonFlix()
    {
      clientesLista   = new ArrayList<>();
      peliculasLista  = new ArrayList<>();
      vistasLista     = new ArrayList<>();
    }
    
    public VerPeliculaEstado verPelicula(String dni, String peliculaNombre) {
        VerPeliculaEstado retorno = VerPeliculaEstado.ALQUILER_OK;
        
        if(!clienteExisteEnClientes(dni))
        {
          retorno = VerPeliculaEstado.CLIENTE_INEXISTENTE;
        }
        else if(!peliculaExisteEnPeliculas(peliculaNombre))
        {
          retorno = VerPeliculaEstado.CONTENIDO_INEXISTENTE;
        }
        else if(esClienteDeudor(dni))
        {
          retorno = VerPeliculaEstado.CLIENTE_DEUDOR;
        }
        else if(!puedeVerPelicula(dni, peliculaNombre))
        {
          retorno = VerPeliculaEstado.CONTENIDO_NO_DISPONIBLE;
        }
        else
        {
          // Registrar visualización
          registrarVista(dni, peliculaNombre);
        }
        

        return retorno;
    }
    
    /**
     * metodo axuiliar
     */
    public void registrarVista(String dni, String peliculaNombre)
    {
      
      // busca dni
      if( clienteExisteEnClientes(dni) )
      {
        // busca peliculaNombre
        if( peliculaExisteEnPeliculas(peliculaNombre))
        {
          boolean encontradaVista = false;
          int     indexVista = -1;
          Vista   vista = null;
          for(int i=0; i<vistasLista.size() && !encontradaVista; i++)
          {
            vista = vistasLista.get(i);
            
            if(vista.equalClienteDniYPelicula(dni, peliculaNombre))
            {
              encontradaVista = true;
              indexVista      = i;
            }
          }
          
          if(!encontradaVista)
          {
            vistasLista.add( new Vista(dni, peliculaNombre));
            System.out.println("Vista creada para "+ peliculaNombre); 
          }
          else
          {
            vista.incVisualizacion();
            System.out.println("Vista incrementada " + peliculaNombre + " : " + vista.getVisualizaciones()); 
          }
        }
        else
        {
          System.out.println("La pelicula no existe no se puede registrar vista "+ peliculaNombre); 
        }
      }
      else
      {
        System.out.println("el cliente no existe no se puede registrar vista "+ dni); 
      }
      
    }
    
    public boolean puedeVerPelicula(String dni, String peliculaNombre)
    {
      boolean puede = false;
      int     index;
      if( (index = getIndexClienteEnClientes(dni)) != -1)
      {
        Cliente cli = clientesLista.get(index);
        if( cli.getServicio() == TipoDeServicio.PREMIUM )
        {
          puede = true;
        }
        else
        {
          if( (index = getIndexPeliculaEnPeliculas(peliculaNombre)) != -1)
          {
            Pelicula pelicula = peliculasLista.get(index);
            if( pelicula.getTipoDeServicio() == TipoDeServicio.STANDARD )
            {
              puede = true;
            }
          }
        }
      }
      return puede;
    }
    
    public void darDeBaja(String dni)
    {
      int     index;
      boolean seDioDeBaja = false;
      while( (index = getIndexClienteEnVistas(dni)) != -1 )
      {
        Vista vista = vistasLista.get(index);
        System.out.printf("Removiendo: %s\n", vista);
        vistasLista.remove(index);
      }
      
      while( (index = getIndexClienteEnClientes(dni)) != -1)
      {
        seDioDeBaja = true;
        Cliente cli = clientesLista.get(index);
        System.out.printf("Dando de baja: %s\n", cli);
        clientesLista.remove(index);
      }
      
      if(seDioDeBaja)
        System.out.println("Se dio de baja " + dni);
      else
        System.out.println("No se pudo dar de baja dni no encontrado " + dni);
      
    }
    
    /**
     * metodo auxiliar
     */
    public void agregarPelicula(String nombrePelicula, TipoDeServicio tipo)
    {
      if(!peliculaExisteEnPeliculas(nombrePelicula))
      {
        peliculasLista.add(new Pelicula(nombrePelicula, tipo));
        System.out.printf("Se pudo agregar %s %s\n",nombrePelicula, tipo);
      }
      else
      {
        System.out.printf("No se pudo agregar %s %s\n",nombrePelicula, tipo);
      }
    }
    
    /**
     * metodo auxiliar
     */
    public boolean peliculaExisteEnPeliculas(String nombrePelicula)
    {
      return(getIndexPeliculaEnPeliculas(nombrePelicula)!= -1);
    }
    
    /**
     * metodo auxiliar
     */
    public int getIndexPeliculaEnPeliculas(String nombrePelicula)
    {
      boolean encontrado  = false;
      int     index       = -1;
      
      for (int i = 0; i < peliculasLista.size() && !encontrado; i++)
      {
        Pelicula pelicula = peliculasLista.get(i);
        if(pelicula.getNombre().equalsIgnoreCase(nombrePelicula))
        {
          encontrado  = true;
          index       = i;
        }
      }
      
      return index;
    }
    
    /**
     * metodo auxiliar
     */
    public void mostrarPeliculas()
    {
      System.out.println("Lista de peliculas, total "+ peliculasLista.size());
      System.out.println(peliculasLista);
    }
    
    /**
     * metodo axiliar
     */
    public void mostrarVistas()
    {
      System.out.println("Lista de vistas, total "+ vistasLista.size());
      System.out.println(vistasLista);
    }
    
    /**
     * metodo auxiliar
     */
    public void darDeAlta(String dni, String nombre, double saldoInicial, TipoDeServicio tipoDeServicio)
    {
      if(!clienteExisteEnClientes(dni))
      {
        clientesLista.add( new Cliente(dni, nombre, saldoInicial, tipoDeServicio));
        System.out.printf("Se pudo dar de alta %s %s %s\n",dni, nombre, tipoDeServicio);
      }
      else
      {
        System.out.printf("No se pudo dar de alta %s %s %s\n",dni, nombre, tipoDeServicio);
      }
    }
    
    /**
     * metodo auxiliar
     */
    public boolean esClienteDeudor(String dni)
    {
      boolean deudor = false;
      int indice;
      
      if( (indice = getIndexClienteEnClientes(dni)) != -1 )
      {
        Cliente cli = clientesLista.get(indice);
        if( cli.obtenerSaldo() > 0)
        {
          deudor = true;
        }
      }
      
      return deudor;
    }
    
    /**
     * metodo auxiliar
     */
    public boolean clienteExisteEnClientes(String dni)
    {
      int     indice  = getIndexClienteEnClientes(dni);
      return  indice != -1;
    }
    
    /**
     * metodo auxiliar
     */
    public int getIndexClienteEnClientes(String dni)
    {
      boolean encontrado  = false;
      int     index       = -1;
      
      for (int i = 0; i < clientesLista.size() && !encontrado; i++)
      {
        Cliente cli = clientesLista.get(i);
        if(cli.getDni().equalsIgnoreCase(dni))
        {
          encontrado  = true;
          index       = i;
        }
      }
      
      return index;
    }
        
    /**
     * metodo auxiliar
     */
    public int getIndexClienteEnVistas(String dni)
    {
      boolean encontrado  = false;
      int     index       = -1;
      
      for (int i = 0; i < vistasLista.size() && !encontrado; i++)
      {
        Vista vista = vistasLista.get(i);
        if(vista.esMismoDni(dni))
        {
          encontrado  = true;
          index       = i;
        }
      }
      
      return index;
    }
            
    /**
     * metodo auxiliar
     */
    public void mostrarClientes()
    {
      System.out.println("Lista de clientes, total "+ clientesLista.size());
      System.out.println(clientesLista);
    }
            

}