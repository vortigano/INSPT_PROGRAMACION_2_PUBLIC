/*
  Utilizando las clases generadas hasta ahora, codificá en Java la siguiente 
  situación:
  Una cuenta bancaria de tipo caja de ahorros le pertenece a Fulano Gomez, 
  nacido el 16/04/1990 y otra de tipo cuenta corriente le pertenece a 
  Mengana Torres,nacida el 23/11/1991. 
  Ambos están casados y viven juntos en Av. Triunvirato 3174, Villa Ortúzar.
  Supongamos que Fulano y Mengana se mudan a nuevo hogar: ¿Hay que cambiar el 
  domicilio de cada uno o basta con cambiar uno de los dos?

  R: Usando un objeto común, Domicilio domicilioMatrimonio, basta con cambiar
  el domicilio en una de las personas asociadas en matrimonio para que este
  cambio se refleje en la otra persona.
*/

package guia01.ejercicio11;

import guia01.ejercicio01.Persona;
import guia01.ejercicio03.CuentaBancaria;
import guia01.ejercicio03.TipoDeCuenta;
import guia01.ejercicio04.Fecha;
import guia01.ejercicio09.Domicilio;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Domicilio domicilioMatrimonio = 
            new Domicilio("Av. Triunvirato", 3174, "Villa Ortuzar");
    Persona persona01 = new Persona(
            "Fulano",
            "Gomez", 
            new Fecha(16, 04, 1990),
            domicilioMatrimonio
    );
    Persona persona02 = new Persona(
            "Mengana",
            "Torres",
            new Fecha(23, 11, 1991),
            domicilioMatrimonio
    );
    CuentaBancaria cuenta1 = new CuentaBancaria(
            "", TipoDeCuenta.CAJA_DE_AHORRO, 0, persona01, new Fecha(24,12,2000));
    
    CuentaBancaria cuenta2 = new CuentaBancaria(
            "", TipoDeCuenta.CUENTA_CORRIENTE, 0, persona02, new Fecha(26,12,2000));
    
    cuenta1.mostrarDatos();
    cuenta2.mostrarDatos();
    
    //cambio de domicilio
    
    //domicilioMatrimonio.setCalle("Calle falsa");
    //domicilioMatrimonio.setAltura(12345);
    //domicilioMatrimonio.setBarrio("Barrio Chino");
    
    domicilioMatrimonio.setDomicilio("Calle falsa", 12345, "Barrio Chino");
    
    cuenta1.mostrarDatos();
    cuenta2.mostrarDatos();
  }
  
}
