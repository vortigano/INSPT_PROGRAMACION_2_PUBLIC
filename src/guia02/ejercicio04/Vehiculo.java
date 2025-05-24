package guia02.ejercicio04;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Vehiculo {

    private String              patente;
    private double              precio;
    private TipoDeVehiculo      tipo;
    
    public static final double  PRECIO_MINIMO  = 1;
    public static final String  SIN_PATENTE    = "SINPAT";
    
    public Vehiculo(String patente, double precio, TipoDeVehiculo tipo)
    {
      setPatente(patente);
      setPrecio(precio);
      this.tipo = tipo;
    }
    
    private void setPatente(String patente)
    {
      if(patente==null || patente.isBlank())
      {
        System.out.println("Patente invalida se asigna " + SIN_PATENTE);
      }
      else
      {
        this.patente = patente;
      }
    }
    
    private void setPrecio(double precio)
    {
      if(precio > PRECIO_MINIMO)
        this.precio = precio;
      else
      {
        System.out.println("Precio de vehiculo por debajo del minimo. Se asigna precio minimo "+ PRECIO_MINIMO );
        this.precio = PRECIO_MINIMO;
      }
        
    }
    
    public String getPatente()
    {
      return patente;
    }
    
    public double getPrecio()
    {
      return precio;
    }
    
    public boolean esTipo(TipoDeVehiculo tipo)
    {
      return this.tipo == tipo;
    }
    
}