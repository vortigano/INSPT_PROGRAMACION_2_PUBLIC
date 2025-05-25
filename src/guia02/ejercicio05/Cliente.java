package guia02.ejercicio05;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Cliente {

  private String  nombre;
  private int     diasDeEstadia;

  public Cliente (String nombre, int diasDeEstadia)
  {
    this.nombre         = nombre;
    setDiasDeEstadia(diasDeEstadia);
  }
  
  private void setDiasDeEstadia(int diasDeEstadia)
  {
    if(diasDeEstadia<=0)
    {
      this.diasDeEstadia = 1;
    }
    else
    {
      this.diasDeEstadia = diasDeEstadia;
    }
  }
  
  public String getNombre()
  {
    return nombre;
  }
  
  public int getDiasDeEstadia()
  {
    return diasDeEstadia;
  }
}