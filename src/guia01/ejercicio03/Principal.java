/*
  Modelá la clase CuentaBancaria, la cual posea como atributos la clave bancaria
  uniforme (CBU), el tipo (caja de ahorro o cuenta corriente) y el saldo 
  (inicialmente en 0). Luego, implementá métodos que permitan:
  ▪ Obtener el saldo actual.
  ▪ Depositar dinero en la cuenta (actualizando el saldo).
  ▪ Extraer dinero de la cuenta (actualizando el saldo). Solo puede quedar en 
  saldo negativo si es cuenta corriente.
  ▪ Obtener los últimos 3 dígitos del CBU.

  6) Refactoreá las clases de los cuatros ejercicios anteriores (5,4,3,2)
    con los siguientes cambios:
    ▪ Agregar un constructor que inicialice todos sus atributos por parámetro.
    ▪ Establecer sus atributos como privados y colocar los getters/setters que
      correspondan.
    ▪ Implementar el método toString() y comprobar su funcionamiento.

  10) Refactoreá la clase CuentaBancaria del ejercicio 3), agregando el atributo
    titular, que representa a la persona titular de la cuenta, y el atributo 
    fechaDeApertura.
*/
package guia01.ejercicio03;

import guia01.ejercicio01.Persona;
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
        //CuentaBancaria cuenta01 = new CuentaBancaria(TipoDeCuenta.CAJA_DE_AHORRO);
        Persona titularDeCuenta01 = new Persona(
                "Homero",
                "Simpson",
                new Fecha(12,5,1990),
                new Domicilio("Calle 1", 123, "Barrio Rojo"));
        
        CuentaBancaria cuenta01 = 
                new CuentaBancaria(
                        "12345678901234589012",
                        TipoDeCuenta.CAJA_DE_AHORRO, 
                        1000,
                        titularDeCuenta01,
                        new Fecha(12,12,2008)
                );
        
        System.out.println(cuenta01.toString());
        cuenta01.depositar(12);
        cuenta01.mostrarDatos();
        cuenta01.depositar(-12);
        cuenta01.mostrarDatos();
        cuenta01.extraer(16);
        cuenta01.mostrarDatos();
        cuenta01.extraer(8.50);
        System.out.println("Saldo : " + cuenta01.getSaldo());
        System.out.println("Ultimos 3 digitos: " + cuenta01.getUltimosTresDigitosCBU());
    }
    
}
