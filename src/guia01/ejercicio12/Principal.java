/*
  12) Desarrollar la clase ImpresoraMonocromatica. Sus atributos serán si
    está o no encendida, la cantidad de hojas actualmente en su bandeja y el
    nivel de tinta negra. Inicialmente, toda impresora está apagada, sin hojas y
    con nivel de tinta en 100.
    Debe responder a los siguientes métodos:

    ▪ int nivelSegunCantCaracteres(int) {…}
    Devuelve cuánta cantidad de tinta debería usarse según la cantidad de 
    caracteres recibida por parámetro.

    ▪ void recargarBandeja(int) {…}
    Suma a la bandeja una cantidad de hojas. El máximo de la bandeja es de 35
    hojas. Se debe verificar no excederse de tal valor. Si el parámetro es
    negativo, la bandeja se deja como está.

    ▪ void imprimir(Documento) {…}
    Imprime en consola la fecha del documento (modelar la clase correspondiente)
    ,junto a su título y cuerpo, en el siguiente formato:
    
    Fecha                   **Titulo**
    
    Cuerpo
    
    Al hacerlo, se descuenta 1 punto de nivel de tinta por cada 50 caracteres
    del cuerpo impresos y se resta 1 hoja de la cantidad en bandeja por cada 20 
    caracteres del cuerpo impreso. Se debe verificar antes de imprimir que se
    cuente con nivel de tinta y cantidad de hojas suficientes.
    
*/
package guia01.ejercicio12;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
  }
  
}
