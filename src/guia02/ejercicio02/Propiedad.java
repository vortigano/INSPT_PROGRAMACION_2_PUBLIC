package guia02.ejercicio02;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Propiedad {

  private String          domicilio;
  private double          precio;
  private TipoDePropiedad tipo;

  public Propiedad(String domicilio, double precio, TipoDePropiedad tipo) {
    setDomicilio(domicilio);
    setPrecio   (precio);
    setTipo     (tipo);
  }

  public String getDomicilio() {
    return domicilio;
  }

  public void setDomicilio(String domicilio) {
    this.domicilio = domicilio;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public TipoDePropiedad getTipo() {
    return tipo;
  }

  public void setTipo(TipoDePropiedad tipo) {
    this.tipo = tipo;
  }

}