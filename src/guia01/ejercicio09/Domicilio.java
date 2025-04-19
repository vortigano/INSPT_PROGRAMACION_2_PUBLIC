package guia01.ejercicio09;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Domicilio {
  private String  calle;
  private int     altura;
  private String  barrio;
  
  public Domicilio()
  {
    setDomicilio("Sin calle", 1, "Sin barrio");
  }
  
  public Domicilio(String calle, int altura, String barrio)
  {
    setDomicilio(calle, altura, barrio);
  }
  
  public void setDomicilio(String calle, int altura, String barrio)
  {
    this.calle  = calle;
    this.altura = altura;
    this.barrio = barrio;
  }
  
  public void setCalle(String calle)
  {
    if( calle !=null )
      this.calle = calle;
  }
  
  public void setAltura(int altura)
  {
    if( altura > 0)
      this.altura = altura;
  }
  
  public void setBarrio(String barrio)
  {
    if( barrio !=null )
      this.barrio = barrio;
  }

  public String getCalle(){
    return calle;
  }
  
  public int    getAltura()
  { 
    return altura;
  }
  
  public String getBarrio(){
    return barrio;
  }
  
  public void mostrar()
  {
    System.out.println(toString());
  }
  
  @Override
  public String toString() {
    return "Domicilio{" + "calle=" + calle + ", altura=" + altura + ", barrio=" + barrio + '}';
  }
  
  
}
