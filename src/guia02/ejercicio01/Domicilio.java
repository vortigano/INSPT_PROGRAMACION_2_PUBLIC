package guia02.ejercicio01;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Domicilio {
    private String  calle;
    private int     numero;
    private String  barrio;

    public Domicilio(String calle, int numero, String barrio) {
        // Este constructor debería llamar a los setters asociados a cada atributo...
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
    }
    
    public String getBarrio()
    {
      return barrio;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", numero=" + numero + ", barrio=" + barrio + '}';
    }
    
    
}
