/*
  Modelá la clase CuentaBancaria, la cual posea como atributos la clave bancaria
  uniforme (CBU), el tipo (caja de ahorro o cuenta corriente) y el saldo 
  (inicialmente en 0). Luego, implementá métodos que permitan:
  ▪ Obtener el saldo actual.
  ▪ Depositar dinero en la cuenta (actualizando el saldo).
  ▪ Extraer dinero de la cuenta (actualizando el saldo). Solo puede quedar en 
  saldo negativo si es cuenta corriente.
  ▪ Obtener los últimos 3 dígitos del CBU.
*/
package guia01.ejercicio03;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta01 = new CuentaBancaria(CuentaBancaria.TipoDeCuenta.CAJA_DE_AHORRO);
        
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
