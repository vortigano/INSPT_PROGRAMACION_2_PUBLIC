/*
  2) Desarrollar la clase Empleado, cuyos atributos sean su DNI, nombre, 
     apellido, salario base, estado civil (soltero, casado, divorciado o viudo)
     y cantidad de hijos.
     Se sabe que todos los empleados cobran el salario base más un plus del 3% 
     de éste por cada hijo, con un tope de hasta 10%. 
     Del salario resultante debe descontarse un 4% en caso de que el estado civil
     sea soltero.
     Desarrollar el método obtenerSalarioFinal() que retorne el valor del 
     salario del empleado según las reglas enunciadas.
  6) Refactoreá las clases de los cuatros ejercicios anteriores (5,4,3,2)
    con los siguientes cambios:
    ▪ Agregar un constructor que inicialice todos sus atributos por parámetro.
    ▪ Establecer sus atributos como privados y colocar los getters/setters que
      correspondan.
    ▪ Implementar el método toString() y comprobar su funcionamiento.
*/
package guia01.ejercicio02;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp02 = new Empleado(5678, "Juan", "Perez", 60000, Empleado.EstadoCivil.CASADO, 3);
        Empleado emp03 = new Empleado(4321, "Lucia", "Gomez", 45000, Empleado.EstadoCivil.VIUDO, 5);
        Empleado emp04 = new Empleado(8765, "Carlos", "Ruiz", 52000, Empleado.EstadoCivil.SOLTERO, 4);

        System.out.println(emp02);
        //System.out.println("Salario final: " + emp02.obtenerSalarioFinal());
        System.out.printf("Salario final: $%.2f\n", emp02.obtenerSalarioFinal());
        System.out.println(emp03);
        System.out.println("Salario final: " + emp03.obtenerSalarioFinal());
        System.out.println(emp04);
        System.out.println("Salario final: " + emp04.obtenerSalarioFinal());
    }
    
}
