package guia01.ejercicio14;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class MaquinaDeCafe {

  private boolean       encendida;
  private String        marca;
  private ModuloDeAgua  moduloDeAgua;
  private ModuloDeLeche moduloDeLeche;
  private final double  TEMPERATURA_MINIMA  = 70;
  
  public MaquinaDeCafe(String marca)
  {
    setMarca(marca);
    moduloDeAgua  = new ModuloDeAgua  ();
    moduloDeLeche = new ModuloDeLeche ();
  }

  public void cargarLeche(int cantidadLeche)
  {
    if(cantidadLeche > 0)
      moduloDeLeche.cargarLeche(cantidadLeche);
  }

  private void setMarca(String marca)
  {
    this.marca = (marca!=null) ? marca : "Oster";
    this.marca = marca;
  }
  public void servirCafe(TipoDeCafe cafe) {
    if (encendida)
    {
      
      if (!estaEnManenimientoModAgua() && esSuficienteLaLeche(cafe))
      {
        moduloDeLeche.consumir(cafe);
        System.out.println("El cafe " + cafe.name() + " se ha servido correctamente."); 
      }
    } 
    else
    {
      System.out.println("INFO: Maquina apagada.");
    }
  }

  private boolean estaEnManenimientoModAgua()
  {
    boolean enMantenimiento = moduloDeAgua.estaEnMantenimiento();
    if(enMantenimiento)
    {
      System.out.println("ERROR: modulo de agua en mantenimiento."); 
    }
    return enMantenimiento;
  }

  // se pudo delegar a modulo de leche
  private boolean esSuficienteLaLeche(TipoDeCafe cafe)
  {
    boolean nivelSuficiente = (moduloDeLeche.getCantidadDeLeche() - cafe.getCantLeche()) >= 0;
    
    if (!nivelSuficiente)
    {
        System.out.println("ERROR: falta leche.");
    }
    return nivelSuficiente;
  }
  
  public void encender()
  {
    moduloDeAgua.encender();
    encendida = true;
  }

  public void apagar()
  {
    moduloDeAgua.apagar();
    encendida = false;
  }
  
  public void setTemperaturaAgua(double newTemp)
  {
    moduloDeAgua.setTemp(newTemp);
  }

  public void mostrarEstado()
  {
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return "----- Maquina de cafe ----\n" 
            + "encendida:" + encendida + 
            "\nmarca    :" + marca     + 
            "\nAgua     :" + moduloDeAgua + 
            "\nLeche    :" + moduloDeLeche;
  }
    
    
}