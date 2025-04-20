package guia01.ejercicio13;

public class Posnet {

    public static final double  RECARGO_POR_CUOTA = 0.03;
    public static final int     MIN_CANT_CUOTAS   = 1;
    public static final int     MAX_CANT_CUOTAS   = 6;

    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAAbonar, int cantidadDeCuotas) {
      Ticket elTicket = null;
      
      // validacion de datos
      if( datosValidos(tarjeta, montoAAbonar, cantidadDeCuotas) )
      {
        double montoFinal = montoAAbonar + montoAAbonar * recargoSegunCuotas(cantidadDeCuotas);
        if( tarjeta.tieneSaldoDisponible(montoFinal) )
        {
          tarjeta.descontar(montoFinal);
          //elTicket = new Ticket()
          String nombreYApellido  = tarjeta.nombreCompletoDelTitular();
          double montoPorCuota    = montoFinal / cantidadDeCuotas;
          elTicket = new Ticket(nombreYApellido, montoFinal, montoPorCuota);
        }
      }
      return elTicket;
    }
    
    private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cuotas)
    {
      return true; //falta hacer...
    }
    
    private double recargoSegunCuotas(int cuotas)
    {
      return 0.0; //falta hacer...
    }

}