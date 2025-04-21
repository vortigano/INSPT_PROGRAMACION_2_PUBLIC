package guia01.ejercicio14;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class ModuloDeAgua {
  
  public static final double  MIN_TEMP      = 0;
  public static final double  MAX_TEMP      = 120;
  
  public static final double  MIN_TEMP_OK   = 70;
  public static final double  TEMP_DEFECTO  = 80;
  
  private double  temperatura;
  private boolean enMantenimiento;

  private void   checkMantenimiento()
  {
    enMantenimiento = temperatura <= MIN_TEMP_OK;
  }
  public boolean estaEnMantenimiento()
  {
    checkMantenimiento();
    return enMantenimiento;
  }
  
  
  public void setTemp(double newTemp)
  {
    if(newTemp>= MIN_TEMP && newTemp <= MAX_TEMP)
    {
      temperatura = newTemp;
      checkMantenimiento();
    }  
    else
    {
      System.out.println("INFO: Se intento establecer temperatura fuera de rango");
      System.out.println("INFO: MAX TEMP: " + MAX_TEMP +  " MIN TEMP:" + MIN_TEMP );
    }
  }
  
  public void encender()
  {
    this.temperatura = TEMP_DEFECTO;
  }

  public void apagar()
  {
    this.temperatura = 0;
  }
  
  @Override
  public String toString() {
    return "temp: " + temperatura + " en mantenimiento: " + enMantenimiento ;
  }

}