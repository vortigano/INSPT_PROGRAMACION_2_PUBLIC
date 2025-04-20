package guia01.ejercicio13;

import guia01.ejercicio01.Persona;
import guia01.ejercicio04.Fecha;
import guia01.ejercicio09.Domicilio;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Principal {

    public static void main(String[] args) {
        Posnet posnet = new Posnet();
        Persona p = new Persona("Juan", "Lopez", new Fecha(10, 5, 1990),
                new Domicilio("Calle falsa", 1234, "Barrio Seguro"));
        TarjetaDeCredito t = new TarjetaDeCredito("BancoFalso", "123456789", 1500,
                EntidadFinanciera.VISA, p);
        
        System.out.println("Tarjeta antes del pago: ");
        System.out.println(t);
        
        System.out.println("Tarjeta tras pagar...");
        Ticket ticketGenerado = posnet.efectuarPago(t, 10000, 5);
        System.out.println(ticketGenerado);
        
        System.out.println("Tarjeta despues del pago");
        System.out.println(t);
    }

}