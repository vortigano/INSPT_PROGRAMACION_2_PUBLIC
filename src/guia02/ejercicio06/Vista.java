package guia02.ejercicio06;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Vista {

    private String clienteDni;
    private String peliculaNombre;
    private int visualizaciones;
    
    public Vista(String clienteDni, String peliculaNombre)
    {
      this.clienteDni     = clienteDni;
      this.peliculaNombre = peliculaNombre;
      visualizaciones     = 1;
    }
    
    public int getVisualizaciones()
    {
      return visualizaciones;
    }
    
    public void addVisualizacion(int visualizacion)
    {
      visualizaciones += visualizacion;
    }
    
    public void incVisualizacion()
    {
      visualizaciones ++;
    }
    
    public boolean esMismoDni(String dni)
    {
      return (this.clienteDni.equalsIgnoreCase(dni));
    }
    
    public boolean equalClienteDniYPelicula(String dni, String peliculaNombre)
    {
      boolean esIgual = false;
      if(dni!=null && peliculaNombre!=null)
      {
        if(dni.equalsIgnoreCase(this.clienteDni) && peliculaNombre.equals(this.peliculaNombre))
        {
          esIgual = true;
        }
      }
        
      return esIgual;
    }

  @Override
  public String toString() {
    return String.format("\nCliente %s  Pelicula %s  Visualizaciones %d", clienteDni, peliculaNombre, visualizaciones);
  }
    
    

}