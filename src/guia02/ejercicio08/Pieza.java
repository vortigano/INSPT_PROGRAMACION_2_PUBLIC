package guia02.ejercicio08;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Pieza {

  public static final double  SALUDABLE_MIN = 50;
  public static final double  SALUD_NUEVO   = 100;
  public static final double  DESGASTE_MAX  = 100;
  public static final double  DESGASTE_MIN  = 0;
  private TipoPieza           tipo;
  private double              salud;

  public Pieza(TipoPieza tipo)
  {
    this.tipo   = tipo;
    this.salud  = 100;
  }
  
  public TipoPieza getTipo()
  {
    return tipo;
  }

  public boolean esSaludable()
  {
    return (salud >= SALUDABLE_MIN);
  }
  
  void desgaste(double porcentajeDeDesgaste)
  {
    if(porcentajeDeDesgaste > DESGASTE_MAX)
    {
      porcentajeDeDesgaste = DESGASTE_MAX;
    }
    else if(porcentajeDeDesgaste < DESGASTE_MIN)
    {
      porcentajeDeDesgaste = DESGASTE_MIN;
    }
    
    this.salud *= ((100 - porcentajeDeDesgaste) * 0.01);
    
  }

  @Override
  public String toString() {
    return String.format("\nPIEZA: %24s    SALUD: %6.1f   %s", tipo.getNombre(), salud, (esSaludable())?("-"):("ROTO"));
  }
   
}