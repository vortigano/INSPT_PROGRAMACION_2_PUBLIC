package guia02.ejercicio05;

import java.util.ArrayList;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Principal {

    public static void main(String[] args) {
        PrestigiosoHotel hotel = new PrestigiosoHotel();
        System.out.println("Habitaciones disponibles: " + hotel.obtenerHabitacionesDisponibles().size());
        System.out.println(hotel.obtenerHabitacionesDisponibles().toString());
        
        ArrayList<Adicional> adicionales = new ArrayList<Adicional>();
        adicionales.add( new Adicional(100, "15/10/2024", TipoDePrestacion.DESAYUNO) );
        adicionales.add( new Adicional(120, "16/10/2024", TipoDePrestacion.ROOM_SERVICE) );
        adicionales.add( new Adicional(140, "17/10/2024", TipoDePrestacion.TRASLADO) );
        adicionales.add( new Adicional(160, "17/10/2024", TipoDePrestacion.TRASLADO) );
        adicionales.add( new Adicional(180, "17/10/2024", TipoDePrestacion.ROOM_SERVICE) );
        
        hotel.agregarHuesped("Pepe", 1, adicionales, 2);
        
        adicionales.clear();
        //adicionales.add( new Adicional(100, "13/10/2024", TipoDePrestacion.DESAYUNO) );
        //adicionales.add( new Adicional(120, "15/10/2024", TipoDePrestacion.ROOM_SERVICE) );
        //adicionales.add( new Adicional(140, "18/10/2024", TipoDePrestacion.TRASLADO) );
        hotel.agregarHuesped("Pepo", 2, adicionales, 1);
        
        adicionales.clear();
        adicionales.add( new Adicional(100, "13/10/2024", TipoDePrestacion.DESAYUNO) );
        adicionales.add( new Adicional(120, "15/10/2024", TipoDePrestacion.ROOM_SERVICE) );
        adicionales.add( new Adicional(140, "18/10/2024", TipoDePrestacion.TRASLADO) );
        hotel.agregarHuesped("Nino", 3, adicionales, 3);
        
        System.out.println("checkout 0 " + hotel.realizarCheckOut(0));
        System.out.println("checkout 1 " + hotel.realizarCheckOut(1));
        System.out.println("checkout 2 " + hotel.realizarCheckOut(2));
        System.out.println("checkout 3 " + hotel.realizarCheckOut(3));
        
    }

}