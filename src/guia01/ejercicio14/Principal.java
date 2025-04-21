package guia01.ejercicio14;

/**
* Código base generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Principal {

    public static void main(String[] args) {
        MaquinaDeCafe maquina = new MaquinaDeCafe("Oster");

        maquina.encender();
        maquina.setTemperaturaAgua(71);
        maquina.mostrarEstado();
        System.out.println("\nCarga leche");
        maquina.cargarLeche(5);
        //maquina.cargarLeche(-30);
        maquina.mostrarEstado();
        
        
        System.out.println("\nSirve LATTE");
        maquina.servirCafe(TipoDeCafe.LATTE);
        maquina.mostrarEstado();
        
        System.out.println("\nSirve LATTE");
        maquina.servirCafe(TipoDeCafe.LATTE);
        maquina.mostrarEstado();
        
        System.out.println("\nSirve EXPRESSO");
        maquina.servirCafe(TipoDeCafe.EXPRESSO);
        maquina.mostrarEstado();
        
        maquina.cargarLeche(5);
        System.out.println("\nSirve LAGRIMA");
        maquina.servirCafe(TipoDeCafe.LAGRIMA);
        maquina.mostrarEstado();
        
        maquina.apagar();
        
    }

}