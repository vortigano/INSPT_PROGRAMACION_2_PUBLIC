/*
  1) Modelá la clase Persona, la cual posea como atributos nombre, apellido y 
    año de nacimiento.
    Luego, implementá métodos que permitan:
    ▪ Devolver el nombre completo de la persona.
    ▪ Mostrar su estado en la consola.
    ▪ Obtener su edad actual.
    ▪ Saber si es mayor que una edad dada.
    ▪ Cambiar su nombre.
    ▪ Cambiar su apellido.
    ▪ Cambiar su nombre y su apellido.
    Finalmente, instanciá una persona en el método main y probá todos sus 
    métodos.

  9) Refactoreá la clase Persona del ejercicio 1), cambiando el año de 
    nacimiento por su fecha de nacimiento y agregando el atributo domicilio,
    que contenga calle, altura y barrio.
*/
package guia01.ejercicio01;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.mostrarEstado();
        persona1.setApellido("Capurro");
        persona1.setNombre("Martin");
        persona1.setAñoDeNacimiento(1985);
        persona1.mostrarEstado();
        persona1.setNombreCompleto("Alberto", "Ojeda");
        persona1.mostrarEstado();
        System.out.println("La edad es: " + persona1.getEdad());
        int edadTest = 22;
        if(persona1.esMayorQue(edadTest))
            System.out.println("Su edad es mayor que " + edadTest + " : verdadero");
        else
            System.out.println("Su edad es mayor que " + edadTest + " : falso");
        edadTest = 44;
        if(persona1.esMayorQue(edadTest))
            System.out.println("Su edad es mayor que " + edadTest + " : verdadero");
        else
            System.out.println("Su edad es mayor que " + edadTest + " : falso");
        
    }
}
