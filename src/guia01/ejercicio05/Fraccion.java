package guia01.ejercicio05;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Fraccion {
    private int numerador  ;
    private int denominador;
    
    public Fraccion (int numerador, int denominador)
    {
        setNumerador(numerador);
        setDenominador(denominador);
    }
    
    public void sumaEntero(int numeroEntero)
    {
        numerador += (numeroEntero * denominador);
    }
    
    public void setNumerador(int numerador)
    {
        this.numerador = numerador;
    }
    
    public void setDenominador(int denominador)
    {
        if(denominador != 0)
            this.denominador = denominador;
        else
            this.denominador = 1;
    }

    public double get_valor_decimal()
    {
        double retorno = 0;
        
        if(denominador!=0)
            retorno = (double) numerador / denominador;
        
        return retorno;
    }
    
    public void mostrar()
    {
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
        return Integer.toString(numerador) + " / " + Integer.toString(denominador);
    }
    
}
