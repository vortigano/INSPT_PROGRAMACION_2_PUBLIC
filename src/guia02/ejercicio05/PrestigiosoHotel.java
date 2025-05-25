package guia02.ejercicio05;

import java.util.ArrayList;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class PrestigiosoHotel {

    private String                nombre;
    private String                direccion;
    private ArrayList<Habitacion> habitaciones;
    
    private int                   habitacion_contador;
    
    private final int             HABITACIONES_TOTAL = 4;
    
    public PrestigiosoHotel()
    {
      nombre        = "PRESTIGIOSO HOTEL";
      direccion     = "Calle Falsa 123";
      iniciarHabitaciones();
      
    }
    
    public ArrayList<Habitacion> obtenerHabitacionesDisponibles()
    {
      ArrayList<Habitacion> disponibles = new ArrayList<Habitacion>();
      for (Habitacion hab : habitaciones)
      {
        if(!hab.estaOcupada())
        {
          disponibles.add(hab);
        }
      }
      return disponibles;
    }

    public double realizarCheckOut(int numeroDeHabitacion)
    {
      int indexHab  = getHabIndexByHabNum(numeroDeHabitacion);
      if(indexHab >= 0 && habitaciones.get(indexHab).estaOcupada())
      {
        System.out.println("Checkout en habitacion: "+ numeroDeHabitacion);
        //System.out.printf("Monto a abonar $%7.2f \n", habitaciones.get(indexHab).calcularTotal());
        double retorno = habitaciones.get(indexHab).calcularTotal();
        
        habitaciones.get(indexHab).realizarCheckOut();
        
        return retorno;
      }
      else
      {
        //System.out.println("No se pudo realizar checkout en habitacion: "+ numeroDeHabitacion);
        return -1;
      }
    }
    
    /**
     * Metodo auxiliar
     */
    private void iniciarHabitaciones()
    {
      habitaciones = new ArrayList<Habitacion>();
      for(int i=0; i<HABITACIONES_TOTAL; i++)
      {
        habitaciones.add( new Habitacion(habitacion_contador++, 10 * habitacion_contador));
      }
    }
    
    /**
     * Metodo auxiliar
     */
    public void agregarHuesped(String nombre, int diasDeEstadia, ArrayList<Adicional> adicionales, int habitacionNumero)
    {
      int indexHab    = getHabIndexByHabNum(habitacionNumero);
      if(indexHab >= 0)
      {
        Habitacion hab  = habitaciones.get(indexHab);
        if(hab.agregarHuesped(nombre, diasDeEstadia))
        {
          hab.setAdicionales(adicionales);
          
          System.out.println("Se agrego huesped "+ nombre +", Habitacion "+ indexHab + " Dias: " + diasDeEstadia);
          if(adicionales!=null)
            System.out.println("Adicionales " + adicionales);
        }
        else
        {
          System.out.println("No se pudo agregar huesped "+ nombre +" en Habitacion " + habitacionNumero + " ocupada");
        }
        
      }
      else
      {
        System.out.println("No se pudo agregar huesped "+ nombre +" en Habitacion " + habitacionNumero + " no encontrada");
      }
    }
    
    /**
     * Metodo auxiliar
     */
    private int getHabIndexByHabNum(int habNum)
    {
      int     index = -1;
      
      for(int i = 0; i < habitaciones.size() && index==-1; i++)
      {
        Habitacion hab = habitaciones.get(i);
        if(hab.isHabNum(habNum))
        {
          index = i;
        }
      }
      
      return  index;
    }
            
}