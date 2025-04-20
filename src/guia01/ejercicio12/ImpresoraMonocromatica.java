package guia01.ejercicio12;

/**
 *
 * @author Alberto Martín Capurro
 */
public class ImpresoraMonocromatica {
  private boolean   estaEncendia              = false;
  private int       cantidadDeHojasActual     = 0;
  // podría usarse double para el nivel de tinta
  private int       nivelDeTintaNegra         = 100;
  // registro de caracteres impresos en el nivel actual
  private int       charsDeNivelActual        = 0;
  private final int CHARS_POR_NIVEL_DE_TINTA  = 50;
  
  private final int HOJAS_MAXIMO_EN_BANDEJA   = 35;
  
  // Devuelve cuánta cantidad de tinta debería usarse según la cantidad de 
  // caracteres recibida por parámetro (Si son menos de 50 caracteres perdería
  // presición pero es lo que pide el enunciado).
  // Lo codifico como si fuera el nivel necesario MÍNIMO para imprimir dichos
  // caracteres.
  public int nivelSegunCantCaracteres(int nChars)
  {
    //1 punto de nivel de tinta por cada 50 caracteres del cuerpo 
    return ( Math.ceilDiv( nChars , CHARS_POR_NIVEL_DE_TINTA));
  }
  
  // Suma a la bandeja una cantidad de hojas. El máximo de la bandeja es de 35 
  // hojas. Se debe verificar no excederse de tal valor. Si el parámetro es 
  // negativo, la bandeja se deja como está.
  public void recargarBandeja(int nHojas)
  {
    if(nHojas>0 && (cantidadDeHojasActual + nHojas)<= HOJAS_MAXIMO_EN_BANDEJA )
    {
      cantidadDeHojasActual += nHojas;
    }
  }
  
  public int getCantidadDeHojasActual()
  {
    return cantidadDeHojasActual;
  }
  
  //void imprimir(Documento) {…}
}
