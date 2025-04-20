package guia01.ejercicio13;

import guia01.ejercicio01.Persona;

public class TarjetaDeCredito {

    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;

  public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, EntidadFinanciera entidadFinanciera, Persona titular) {
    this.entidadBancaria = entidadBancaria;
    this.nroTarjeta = nroTarjeta;
    this.saldo = saldo;
    this.entidadFinanciera = entidadFinanciera;
    this.titular = titular;
  }
  
  public boolean tieneSaldoDisponible(double monto)
  {
    return saldo >= monto;
  }
  
  // la tarjeta de credito sabe descontar un valor de su propio saldo
  public void descontar(double monto)
  {
    saldo -= monto;
  }
  
  public String nombreCompletoDelTitular()
  {
    return "test name";
  }
  
  @Override
  public String toString() {
    return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
  }

    
}