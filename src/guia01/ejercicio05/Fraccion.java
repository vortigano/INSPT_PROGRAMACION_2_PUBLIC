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
    
    private int getMCD(int num_a, int num_b)
    {
        int min = (num_a>num_b) ? (num_b) : (num_a);
        int max = (num_a>num_b) ? (num_a) : (num_b);
        //System.out.println(num_a);
        //System.out.println(num_b);
		
        int mcd = 1;
		
	for(int i=2; i<=Math.abs(min); i++)
	{
 	  if(Math.abs(min) % i == 0 && Math.abs(max) % i == 0)
 	  {
 	    //System.out.print("> " + i + " ");
 	    mcd = i;
 	  }
	}
	  
	//System.out.println("");
	//System.out.println("MCD " + mcd );
	return mcd;
    }
    
    public void simplificar()
    {
        int mcd = getMCD(numerador, denominador);
        numerador   /= mcd;
        denominador /= mcd;
        
        // si el denominador es negativo 
        // invierte el signo en numerador y denominador
        
        if(denominador <0)
        {
            denominador *=-1;
            numerador   *=-1;
        }
    }
    
    public void sumaFraccion(Fraccion sumando)
    {
        // sumando = c/d
        // a/b + c/d = (( a*d ) + ( c*b )) / ( b*d )
        // numerador = (( a*d ) + ( c*b ))   denominador=   ( b*d )
        // <num> / <den> + c / d = 
        //     <num> /b + c/d = (( <num> * d ) + ( <den> * b )) / ( <den> * d )
        
        int c = sumando.getNumerador();
        int d = sumando.getDenominador();
        
        setNumerador    ( ( getNumerador() * d ) + ( c * getDenominador() ) );
        setDenominador  ( getDenominador() * d);
    }
    
    public int getDenominador()
    {
        return denominador;
    }
    
    public int getNumerador()
    {
        return numerador;
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
        {
            setNumerador(0);
            this.denominador = 1;
        }
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
