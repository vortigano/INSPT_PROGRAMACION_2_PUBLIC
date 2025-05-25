package guia02.ejercicio06;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Pelicula {

    private String          nombre;
    private TipoDeServicio  tipoDeServicio;

    public Pelicula(String nombre, TipoDeServicio tipo)
    {
      this.nombre         = nombre;
      this.tipoDeServicio = tipo;
    }
    
    public String getNombre()
    {
      return nombre;
    }
    
    public TipoDeServicio getTipoDeServicio()
    {
      return tipoDeServicio;
    }

  @Override
  public String toString() {
    return String.format("\nPelicula %s, Servicio %s", nombre, tipoDeServicio);
  }
    
    
}