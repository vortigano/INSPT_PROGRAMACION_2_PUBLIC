package guia01.ejercicio03;

import guia01.ejercicio01.Persona;
import guia01.ejercicio04.Fecha;
import java.util.Random;

public class CuentaBancaria {
  
  private final   int           CBU_LEN = 22;
  private         String        cbu; //22 digitos
  private         TipoDeCuenta  tipoDeCuenta;
  private         double        saldo;
  /*
    10) Refactoreá la clase CuentaBancaria del ejercicio 3), agregando el atributo
    titular, que representa a la persona titular de la cuenta, y el atributo 
    fechaDeApertura.
  */
  private Persona titular;        // persona titular de la cuenta
  private Fecha   fechaDeApertura;
  
  /*
  Obtener el saldo actual.
  ▪ Depositar dinero en la cuenta (actualizando el saldo).
  ▪ Extraer dinero de la cuenta (actualizando el saldo). Solo puede quedar en 
  saldo negativo si es cuenta corriente.
  ▪ Obtener los últimos 3 dígitos del cbu.
  */
  
  public CuentaBancaria(String cbu, TipoDeCuenta tipoDeCuenta, double saldo, 
          Persona titular, Fecha fechaDeApertura)
  {
    if( cbu ==  null)
      cbu = "";
      
    if( cbu.length() != CBU_LEN)
    {
      this.cbu = crearCBU();
    }
    else
    {
      this.cbu = cbu;
    }
    setTipoDeCuenta(tipoDeCuenta);
    setSaldo(saldo);
    setTitular(titular);
    setFechaDeApertura(fechaDeApertura);
  }
  
  void setTitular(Persona titular)
  {
    if(titular != null)
    {
      this.titular = titular;
    }
    else
    {
      System.out.println("Persona no valida, falta titular");
    }
  }
  
  void setFechaDeApertura(Fecha fechaDeApertura)
  {
    if(fechaDeApertura!=null)
    {
      this.fechaDeApertura = fechaDeApertura;
    }
    else
    {
      System.out.println("Fecha de apertura no valida, falta fecha de apertura");
    }
  }
  
  private void setSaldo(double saldo)
  {
    this.saldo = saldo;
  }
  
  private void setTipoDeCuenta(TipoDeCuenta tipoDeCuenta)
  {
    this.tipoDeCuenta = tipoDeCuenta;
  }
  
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
    return "CuentaBancaria \n" 
            + " CBU_LEN = " + CBU_LEN 
            + ", cbu = " + cbu 
            + ", tipoDeCuenta = " + tipoDeCuenta 
            + ", saldo = " + saldo 
            + ",\n titular = " + titular.toString()
            + "\n fechaDeApertura = " + fechaDeApertura ;
  }
  
  private String crearCBU()
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
