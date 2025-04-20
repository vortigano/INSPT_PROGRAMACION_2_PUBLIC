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
  
  //Devuelve cuánta cantidad de tinta debería usarse según la cantidad de caracteres recibida
  //por parámetro (Si son menos de 50 caracteres perdería presición pero
  //es lo que pide el enunciado).
  //Lo codifico como si fuera el nivel necesario MÍNIMO para imprimir dichos
  //caracteres.
  int nivelSegunCantCaracteres(int nChars)
  {
    //1 punto de nivel de tinta por cada 50 caracteres del cuerpo 
    return ( Math.ceilDiv( nChars , CHARS_POR_NIVEL_DE_TINTA));
  }
  
  
  //void recargarBandeja(int) {…}
  
  //void imprimir(Documento) {…}
}
