/*
  Modelá la clase Fecha, la cual posea como atributos el día, el mes y el año.
  Luego, implementá métodos que permitan:
  ▪ Obtener la fecha como cadena, en formato "dd/mm/aaaa".
  ▪ Saber si es Navidad.
  ▪ Sumar un mes.
  Finalmente, instanciá una fecha en el método main y probá todos sus métodos.

  6) Refactoreá las clases de los cuatros ejercicios anteriores con los 
    siguientes cambios:
    ▪ Agregar un constructor que inicialice todos sus atributos por parámetro.
    ▪ Establecer sus atributos como privados y colocar los getters/setters que 
      correspondan.
    ▪ Implementar el método toString() y comprobar su funcionamiento.
*/
package guia01.ejercicio04;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha date1 = new Fecha(21,8,2023);
        Fecha date2 = new Fecha(11,2,1986);
        Fecha date3 = new Fecha(4,12,1973);
        Fecha date4 = new Fecha(25,12,1999);
        
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        
        
        System.out.println("Es Navidad?: " + date2.esNavidad()); //1
        //1 es equivalente a 2.1+2.2
        Boolean natal = date2.esNavidad(); //2.1
        System.out.println("Es Navidad?: " + natal); //2.2
        
        System.out.println(date4);
        System.out.println("Es Navidad?: " + date4.esNavidad());
        Boolean nata2 = date4.esNavidad(); //2.1
        System.out.println("Es Navidad?: " + nata2); //2.2
        
        date3.sumarMes();
        System.out.println(date3);
    }
    
}
