/*
    Modelá la clase Fraccion, la cual posea como atributos numerador y
    denominador. Luego, implementá métodos que permitan:
    ▪ [OK] Mostrarse en consola, con el formato "numerador/denominador".
    ▪ [OK] Obtener el valor decimal.
    ▪ [OK] Sumarle un entero.
    ▪ [] Sumarle una fracción.
    ▪ [] Simplificar la fracción.
    ▪ [] Saber si la fracción es propia, impropia u aparente.
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
        System.out.println("Ejercicio 05");
        Fraccion frac = new Fraccion(1, 2);
        frac.mostrar();
        System.out.println("El valor decimal es: " + frac.get_valor_decimal());
        System.out.println("---- Sumar entero ----");
        frac.sumaEntero(7);
        frac.mostrar();
        System.out.println("El valor decimal es: " + frac.get_valor_decimal());
        
    }
    
}
