/*
    Modelá la clase Fraccion, la cual posea como atributos numerador y
    denominador. Luego, implementá métodos que permitan:
    ▪ [OK] Mostrarse en consola, con el formato "numerador/denominador".
    ▪ [OK] Obtener el valor decimal.
    ▪ [OK] Sumarle un entero.
    ▪ [OK] Sumarle una fracción.
    ▪ [OK] Simplificar la fracción.
    ▪ [OK] Saber si la fracción es propia, impropia u aparente.
    Finalmente, instanciá una fracción en el método main y probá todos sus 
    métodos.

    Fracciones propias: son aquellas en las que el numerador es menor que el 
    denominador. Fracciones aparentes: son aquellas cuyo numerador es múltiplo
    del denominador. Fracciones impropias: son aquellas en las que el numerador
    es mayor que el denominador, pero no múltiplo.
*/
package guia01.ejercicio05;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 3  / 5   propia
        // -3 / 5   propia
        // 7  / 4   impropia
        // -7 / 4   impropia
        // 6  / 3   aparente
        // -6 / 3   aparente
        // 0 / 1    aparente
        // 0 / -3   aparente
        // 0 / 3    aparente
        System.out.println("Ejercicio 05");
        Fraccion frac = new Fraccion(0,-3);
        frac.mostrar();
        System.out.println("El valor decimal es: " + frac.get_valor_decimal());
        System.out.println("---- Sumar entero ----");
        frac.sumaEntero(0);
        frac.mostrar();
        System.out.println("El valor decimal es: " + frac.get_valor_decimal());
        System.out.println("---- Suma fraccion ----");
        System.out.println("      Simplifica ");
        frac.sumaFraccion(new Fraccion(0,1));
        frac.simplificar();
        frac.mostrar();
        System.out.println("El valor decimal es: " + frac.get_valor_decimal());
        System.out.println("La fraccion es: " + frac.getTipo());
    }
    
}
