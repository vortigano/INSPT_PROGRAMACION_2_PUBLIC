package guia01.ejercicio05;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    
    public void mostrar()
    {
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return Integer.toString(numerador) + " / " + Integer.toString(denominador);
    }
    
}
