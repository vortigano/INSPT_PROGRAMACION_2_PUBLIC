package guia02.ejercicio05;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Adicional {

  private double            precio;
  private String            fechaDePrestacion;
  private TipoDePrestacion  tipo;
    
  public Adicional(double precio, String fechaDePrestacion, TipoDePrestacion tipo)
  {
    this.precio             = precio;
    this.fechaDePrestacion  = fechaDePrestacion;
    this.tipo               = tipo;
  }
  
  public double getPrecio()
  {
    return precio;
  }

  @Override
  public String toString() {
    return String.format("\nPrecio $%8.2f    Fecha: %10s   Tipo: %s", precio, fechaDePrestacion, tipo);
  }
}