package guia01.ejercicio14;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class ModuloDeLeche {

  private int             cantidad;
  public static final int MIN_CANTIDAD    = 0;
  public static final int MAX_CANTIDAD    = 5;
  //private TexturaDeLeche texturaActual;
  public void cargarLeche(int cantidad) {
      this.cantidad += cantidad;
      if (this.cantidad > MAX_CANTIDAD)
      {
          this.cantidad = MAX_CANTIDAD;
      }
  }
  
  public int getCantidadDeLeche() 
  {
    return cantidad;
  }

  public void consumir(TipoDeCafe cafe) {
    cantidad -= cafe.getCantLeche();
  }
  
  @Override
  public String toString() {
    return "cantidad: " + cantidad;
  }

    
}