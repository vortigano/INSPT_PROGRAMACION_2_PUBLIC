package guia01.ejercicio02;

public class Empleado {
    
  public static enum EstadoCivil {SOLTERO, CASADO, DIVORCIADO, VIUDO};
    
  private final int     dni;
  private String        nombre;
  private String        apellido;
  private double        salarioBase;
  private EstadoCivil   estadoCivil;
  private int           cantidadDeHijos;
  Empleado (int dni, String nombre, String apellido, double salarioBase, EstadoCivil estadoCivil, int cantidadDeHijos)
  {
      this.dni              = dni;
      this.nombre           = nombre;
      this.apellido         = apellido;
      this.salarioBase      = salarioBase;
      this.estadoCivil      = estadoCivil;
      this.cantidadDeHijos  = cantidadDeHijos;
  }

  @Override
  public String toString() {
    return "Empleado{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", salarioBase=" + salarioBase + ", estadoCivil=" + estadoCivil + ", cantidadDeHijos=" + cantidadDeHijos + '}';
  }
  
  private static double pctDeBasePorHijoAumento     = 0.03;
  private static double pctMaxDeBasePorHijoAumento  = 0.10;
  private static double pctSolteroDescuento         = 0.04;
  
  public double obtenerSalarioFinal()
  {
      double  salarioFinal = 0, porcentajeDeSalario = 0;
      
      // calcular porcentaje de salario por hijo
      porcentajeDeSalario = pctDeBasePorHijoAumento * this.cantidadDeHijos;
      
      // limitado de porcentaje de salario base basado en hijos
      if(porcentajeDeSalario> pctMaxDeBasePorHijoAumento)
        porcentajeDeSalario = pctMaxDeBasePorHijoAumento;
      // salario resultante = salarioBase + 3% de salarioBase por hijo (hasta 10% de salarioBase)
      salarioFinal = this.salarioBase + this.salarioBase * porcentajeDeSalario;
           
      // si es soltero se descuenta 4% del resultante
      if(this.estadoCivil == EstadoCivil.SOLTERO)
      {
        salarioFinal *= (1 - pctSolteroDescuento);
      }
      return salarioFinal;
  }

}
