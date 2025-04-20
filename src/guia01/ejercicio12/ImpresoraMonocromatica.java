package guia01.ejercicio12;

/**
 *
 * @author Alberto Martín Capurro
 */
public class ImpresoraMonocromatica {
  private boolean   estaEncendida;
  private int       cantidadDeHojasActual;
  // podría usarse double para el nivel de tinta
  private int       nivelDeTintaNegra;
  // registro de caracteres impresos en el nivel actual
  private int       charsDeNivelActual;
  private final int CHARS_POR_NIVEL_DE_TINTA  = 2;//50;
  private final int MAX_CHARS_POR_HOJA        = 20;
  private final int HOJAS_MAXIMO_EN_BANDEJA   = 35;
  private final int TINTA_MINIMO_PARA_CARGAR  = 1;
  
  private final int     CHARS_DE_NIVEL_ACTUAL_POR_DEFECTO = 0;
  private final int     TINTA_INICIAL_POR_DEFECTO         = 2;//100;
  private final boolean ENCENDIDA_INICIAL_POR_DEFECTO     = false;
  private final int     CANTIDAD_INICIAL_DE_HOJAS         = 0;
  
  public ImpresoraMonocromatica()
  {
    this.charsDeNivelActual     = CHARS_DE_NIVEL_ACTUAL_POR_DEFECTO;
    this.nivelDeTintaNegra      = TINTA_INICIAL_POR_DEFECTO;
    this.cantidadDeHojasActual  = CANTIDAD_INICIAL_DE_HOJAS;
    this.estaEncendida          = ENCENDIDA_INICIAL_POR_DEFECTO;
  }
  
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
  
  public void cargarTinta(int carga)
  {
    if( carga >= TINTA_MINIMO_PARA_CARGAR )
    {
      System.out.println("INFO: Cargando tinta " + carga);
      nivelDeTintaNegra += carga;
    }
  }
  
  public void mostrarNivelDeTinta()
  {
    System.out.println("Nivel de tinta actual " + nivelDeTintaNegra);
  }
  
  public void encender()
  {
    System.out.println("INFO: Impresora encender.");
    estaEncendida = true;
  }
  
  public void apagar()
  {
    System.out.println("INFO: Impresora apagar.");
    estaEncendida = false;
  }
  
  // Imprime en consola la fecha del documento5, junto a su título y cuerpo, en
  // el siguiente formato:
  // <fecha>         ** <titulo> ** 
  // <cuerpo>
  // Al hacerlo, se descuenta 1 punto de nivel de tinta por cada 50 caracteres 
  // del cuerpo impresos y se resta 1 hoja de la cantidad en bandeja por cada 
  // 20 caracteres del cuerpo impreso. Se debe verificar antes de imprimir que 
  // se cuente con nivel de tinta y cantidad de hojas suficientes.
  public void imprimir(Documento doc)
  {
    boolean tituloMostrado = false;
    
    System.out.println("INFO: Solicitud de impresion.");

    if (estaEncendida)
    {
      String cuerpo   = doc.getCuerpo();
      int totalChars  = cuerpo.length();
      int impresos = 0;
      
      boolean hayRecursos = cantidadDeHojasActual > 0 && nivelDeTintaNegra > 0;

      while (impresos < totalChars && hayRecursos)
      {
        if (!tituloMostrado) 
        {
          System.out.printf("%s\t** %s **\n", doc.getFecha(), doc.getTitulo());
          tituloMostrado = true;
        }
        int charsRestantes            = totalChars - impresos;
        int charsDisponiblesPorTinta  = 
                nivelDeTintaNegra * CHARS_POR_NIVEL_DE_TINTA - charsDeNivelActual;
        int charsImprimibles          = 
                Math.min(MAX_CHARS_POR_HOJA, Math.min(charsRestantes,
                        charsDisponiblesPorTinta));

        if (charsImprimibles > 0) 
        {
          String bloque = cuerpo.substring(impresos, impresos + charsImprimibles);
          System.out.println(bloque);

          impresos += charsImprimibles;
          charsDeNivelActual += charsImprimibles;

          int tintaUsada = charsDeNivelActual / CHARS_POR_NIVEL_DE_TINTA;
          nivelDeTintaNegra -= tintaUsada;
          charsDeNivelActual %= CHARS_POR_NIVEL_DE_TINTA;

          cantidadDeHojasActual -= 1;

          hayRecursos = cantidadDeHojasActual > 0 && nivelDeTintaNegra > 0;
        }
        else 
        {
          // Si no se puede imprimir nada más
          hayRecursos = false;
        }
      }

      System.out.printf("INFO: Total impreso : %4d caracteres.\n", impresos);
      System.out.printf("INFO: Tinta restante:  %3d  |   Hojas restantes: %3d.\n",
            nivelDeTintaNegra, cantidadDeHojasActual);

      if (impresos < totalChars)
      {
        System.out.println("INFO: Impresion incompleta, falta de recursos.");
      }
    } 
    else 
    {
      System.out.println("INFO: Impresora apagada.");
    }
  }
}
