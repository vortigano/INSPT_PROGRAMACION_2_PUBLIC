package guia01.ejercicio03;

import java.util.Random;

public class CuentaBancaria {
  public static enum TipoDeCuenta { CAJA_DE_AHORRO, CUENTA_CORRIENTE };
    
  private final String cbu; //22 digitos
  private final TipoDeCuenta tipoDeCuenta;
  private Double saldo;
  
  /*
  Obtener el saldo actual.
  ▪ Depositar dinero en la cuenta (actualizando el saldo).
  ▪ Extraer dinero de la cuenta (actualizando el saldo). Solo puede quedar en 
  saldo negativo si es cuenta corriente.
  ▪ Obtener los últimos 3 dígitos del cbu.
  */
  
  public CuentaBancaria(TipoDeCuenta tipoDeCuenta)
  {
      this.cbu          = crearCBU();
      this.tipoDeCuenta = tipoDeCuenta;
      this.saldo        = 0.;
  }
  
  // Depositar dinero en la cuenta (actualizacion de saldo)
  public void depositar(double monto)
  {
    if(monto>0)
    {
      this.saldo +=monto;
    }
    else
    {
      System.out.println("El monto a depositar debe ser positivo");
    }
  }

  // Extraer dinero de la cuenta (actualizando el saldo). Solo puede quedar en 
  // saldo negativo si es cuenta corriente.
  public void extraer(double monto)
  {
    if(monto>0)
    {
      if( tipoDeCuenta == TipoDeCuenta.CUENTA_CORRIENTE || saldo >= monto)
      {
        saldo -= monto;
      }
      else
      {
        System.out.println("Saldo insuficiente para extraccion");
      }
    }
    else
    {
      System.out.println("El monto a extraer debe ser positivo");
    }
  }
  
  public String getUltimosTresDigitosCBU()
  {
    return (this.cbu.substring(this.cbu.length()-3));
  }
  
  public void mostrarDatos()
  {
      System.out.println(this.toString());
  }
  
  @Override
  public String toString() {
      return "CuentaBancaria{" + "CBU=" + cbu + ", tipoDeCuenta=" + tipoDeCuenta + ", saldo=" + saldo + '}';
  }
  
  private String crearCBU ()
  {
      Random rnd = new Random();
      String cbuLocal = "";
      for(int i = 0; i<22; i++)
        cbuLocal += rnd.nextInt(10);
      return cbuLocal;
  }
  
  public double getSaldo()
  {
    return saldo;
  }
  
}
