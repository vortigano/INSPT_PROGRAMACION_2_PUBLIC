package guia02.ejercicio07;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Materia {

  public static final double NOTA_MAXIMA        = 10;
  public static final double NOTA_APROBADO_MIN  = 6;
  public static final double NOTA_MINIMA        = NOTA_APROBADO_MIN;
  
  private double      notaFinal;
  private MateriaTipo tipo;

  public Materia(MateriaTipo tipo, double notaFinal)
  {
    this.tipo = tipo;
    setNotaFinal(notaFinal);
  }
  
  public boolean estaAprobada()
  {
    return this.notaFinal >= NOTA_APROBADO_MIN;
  }
  
  public double getNotaFinal()
  {
    return notaFinal;
  }

  private void setNotaFinal(double notaFinal)
  {
    if(notaFinal < NOTA_MINIMA)
    {
      notaFinal = NOTA_MINIMA;
    }
    else if(notaFinal > NOTA_MAXIMA)
    {
      notaFinal = NOTA_MAXIMA;
    } 
    
    this.notaFinal = notaFinal;
  }
  
  public MateriaTipo getTipo()
  {
    return tipo;
  }

  @Override
  public String toString() {
    return String.format("\nMateria %12s   Nota Final %2.2f", this.tipo.getNombre(), this.notaFinal);
  }
  
  
}