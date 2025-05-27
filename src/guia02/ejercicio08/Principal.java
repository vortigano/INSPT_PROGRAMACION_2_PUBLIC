package guia02.ejercicio08;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Principal {

  public static void main(String[] args) {
    Droide[] droides = new Droide[]{
        new Droide("Droide-1"),
        new Droide("Droide-2"),
        new Droide("Droide-3"),
        new Droide("Droide-4")
    };
    
    Droide miDroide = droides[0];
    miDroide.registrarDroide(droides[1]);
    miDroide.registrarDroide(droides[2]);
    miDroide.registrarDroide(droides[3]);
    
    miDroide.mostrarInformacion();
    
    miDroide.desgaste();
    
    miDroide.mostrarInformacion();
    
    System.out.println("--------- AUTOREPARARSE -----------\n");
    System.out.println(miDroide.autoRepararse());
    System.out.println("\n-----------------------------------");
    
    miDroide.mostrarInformacion();
    
  }

}