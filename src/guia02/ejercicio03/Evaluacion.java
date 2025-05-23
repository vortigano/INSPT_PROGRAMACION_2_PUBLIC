package guia02.ejercicio03;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Evaluacion {

    private double            nota;
    private TipoDeEvaluacion  tipo;
    
    private static final int  NOTA_MINIMA = 0;
    private static final int  NOTA_MAXIMA = 10;

  public Evaluacion(double nota, TipoDeEvaluacion tipo) {
    setNota(nota);
    setTipo(tipo);
  }

  public double getNota() {
    return nota;
  }

  public void setNota(double nota) {
    if(nota < NOTA_MINIMA)
    {
      nota = NOTA_MINIMA;
    }
    else if(nota > NOTA_MAXIMA)
    {
      nota = NOTA_MAXIMA;
    }

    this.nota = nota;
  }

  public TipoDeEvaluacion getTipo() {
    return tipo;
  }

  public void setTipo(TipoDeEvaluacion tipo) {
    this.tipo = tipo;
  }

}