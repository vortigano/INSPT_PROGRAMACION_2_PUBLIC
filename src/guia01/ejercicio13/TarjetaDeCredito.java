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

    
}