package guia02.ejercicio06;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Cliente {

  private String          dni;
  private String          nombre;
  private double          saldo;
  private TipoDeServicio  tipoDeServicio;

  public Cliente(String dni, String nombre, double saldoInicial, TipoDeServicio tipoDeServicio)
  {
    this.dni            = dni;
    this.nombre         = nombre;
    this.saldo          = saldoInicial;
    this.tipoDeServicio = tipoDeServicio;
  }
  
  public TipoDeServicio getServicio()
  {
    return tipoDeServicio;
  }
    
  public double obtenerSaldo()
  {
    return saldo;
  }
    
  public String getDni()
  {
    return dni;
  }

  @Override
  public String toString() {
    return String.format("\nCliente %s DNI %s Saldo $%.0f  Servicio %s", dni, nombre, saldo, tipoDeServicio);
  }
    
}