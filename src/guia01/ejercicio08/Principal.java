/*
  8) Desarrollá la clase Password, que permita tener contraseñas como objetos. 
    Su único atributo será el valor de la password (String). Debe responder a 
    los siguientes métodos:

    ▪ boolean esFuerte() {…}
    Devuelve si la password es fuerte o no. Una password es fuerte cuando tenga 
    al menos 8 caracteres.

    ▪ boolean nuevoValor(String) {…}
    Establece como nuevo valor de password el recibido como parámetro, siempre 
    y cuando su longitud sea mayor o igual a 6, si no, lo deja como estaba. 
    Devuelve si se pudo o no establecer el valor.

    ▪ String generarAleatorio(int) {…}
    Devuelve una cadena que representa un valor de password aleatorio cuya 
    longitud coincida con el parámetro recibido. Si el parámetro es menor que 6,
    devuelve null.
    Además, deben poder crearse passwords con o sin valor inicial, por ello es
    que la clase contará con un constructor sobrecargado:

    ▪ Password(String) {…}
    Crea un password cuyo valor viene dado por parámetro.

    ▪ Password() {…}
    Crea un password cuyo valor se crea automáticamente.
*/
package guia01.ejercicio08;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Ejercicio 08");
  }
  
}
