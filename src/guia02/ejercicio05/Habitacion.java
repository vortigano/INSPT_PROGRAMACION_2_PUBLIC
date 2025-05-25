package guia02.ejercicio05;

import java.util.ArrayList;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Habitacion {

    private int                   numero;
    private double                precioPorDia;
    private Cliente               huesped;
    private ArrayList<Adicional>  adicionales;

    public Habitacion(int numero, double precioPorDia)
    {
      this.numero       = numero;
      this.precioPorDia = precioPorDia;
      this.adicionales  = new ArrayList<Adicional>();
    }

    public double calcularTotal()
    {
      double total = 0;
      
      if(estaOcupada())
      {
        for (Adicional adicional : adicionales) {
          total += adicional.getPrecio();
        }

        total += precioPorDia * huesped.getDiasDeEstadia();
      }
      
      return total;
    }

    public boolean estaOcupada()
    {
        return huesped != null;
    }

  @Override
  public String toString() {
    String retorno = 
            String.format("\nNumero: %02d  Precio por dia: $%6.2f  Cliente %12s  Estadia: %3d", 
                    numero, precioPorDia, 
                    (estaOcupada())?(huesped.getNombre()):("------------"),
                    (estaOcupada())?(huesped.getDiasDeEstadia()):(0));
    return retorno;
  }
    
  /**
   * Metodo auxiliar
   */
  public boolean agregarHuesped(String nombre, int diasDeEstadia)
  {
    boolean agregado = false;
    if(!estaOcupada())
    {
      huesped   = new Cliente(nombre, diasDeEstadia); 
      agregado  = true;
    }
    return agregado;
  }
  
  /**
   * Metodo auxiliar
   */
  public boolean isHabNum(int num)
  {
    return numero == num;
  }
  
  /**
   * Metodo auxiliar
   */
  public void setAdicionales(ArrayList<Adicional> adicionales)
  {
    this.adicionales = new ArrayList<Adicional>(adicionales);
  }
  
  public void realizarCheckOut()
  {
    huesped     = null;
    if(adicionales!=null)
    {
      adicionales.clear();
    }
    
  }

}