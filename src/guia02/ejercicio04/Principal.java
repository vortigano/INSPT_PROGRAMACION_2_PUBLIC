package guia02.ejercicio04;

import java.util.ArrayList;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Principal {

  public static void main(String[] args) {
     Marca marca = new Marca();
     marca.mostrarConcesionaria();
     marca.agregarConcesionaria("");
     marca.mostrarConcesionaria();
     marca.agregarConcesionaria("CONCE-1");
     marca.agregarConcesionaria("CONCE-2");
     marca.agregarConcesionaria("CONCE-3");
     marca.mostrarConcesionaria();
     //marca.removerConcesionaria("CONCE-2");
     //marca.removerConcesionaria("CONCE-2");
     
     System.out.println("Trata de agregar 1");
     marca.agregarVehiculo("CONCE-1", "AAA-000", 10, TipoDeVehiculo.AUTO);
     
     System.out.println("Trata de agregar 2");
     marca.agregarVehiculo("CONCE-1", "AAA-111", 10, TipoDeVehiculo.AUTO);
     
     System.out.println("Trata de agregar 3");
     marca.agregarVehiculo("CONCE-2", "AAA-222", 10, TipoDeVehiculo.CAMIONETA);
     
     System.out.println("Trata de agregar 4");
     marca.agregarVehiculo("CONCE-3", "CCC-333", 20, TipoDeVehiculo.UTILITARIO);
     
     System.out.println("Trata de agregar 4");
     marca.agregarVehiculo("CONCE-3", "ZZZ-444", 440, TipoDeVehiculo.AUTO);
     
     System.out.println("Trata de agregar 5");
     marca.agregarVehiculo("CONCE-3", "QQQ-000", 440, TipoDeVehiculo.AUTO);
     
     
     marca.mostrarVehiculos();
     ArrayList<Concesionaria> con = marca.obtenerConcesionariaMaxVeh();
     if(!con.isEmpty())
     {
       for (Concesionaria concesionaria : con) 
       {
         System.out.println("Concesionaria con maxima cant de vehiculos: " + concesionaria.getNombre());
       }
     }
     
     String patente = "AAA-000";
     System.out.println("Intenta borrar vehiculo " + patente);
     
     marca.borrarVehiculo(patente);
     
     System.out.println("Mostrar vehiculos: ");
     marca.mostrarVehiculos();
     
     Concesionaria conDest = marca.getConcesionariaByName("CONCE-1");
     
     marca.cambiarVehiculoDeConcesionaria("CCC-333", conDest);
     
     System.out.println("Mostrar vehiculos: ");
     marca.mostrarVehiculos();
     
     conDest = marca.getConcesionariaByName("CONCE-10");
     
     marca.cambiarVehiculoDeConcesionaria("CCC-333", conDest);
     
     System.out.println("Mostrar vehiculos: ");
     marca.mostrarVehiculos();
     
     conDest = marca.getConcesionariaByName("CONCE-2");
     
     marca.cambiarVehiculoDeConcesionaria("NOEXISTE", conDest);
     
     System.out.println("Mostrar vehiculos: ");
     marca.mostrarVehiculos();
     
  }

}