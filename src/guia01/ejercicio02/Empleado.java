package guia01.ejercicio02;

public class Empleado {
    
  public static enum EstadoCivil {SOLTERO, CASADO, DIVORCIADO, VIUDO};
    
  private final static double PCT_DE_BASE_POR_HIJO_AUMENTO      = 0.03;
  private final static double PTC_MAX_DE_BASE_POR_HIJO_AUMENTO  = 0.10;
  private final static double PCT_SOLTERO_DESCUENTO             = 0.04;
    
  private final int     dni;
  private String        nombre;
  private String        apellido;
  private double        salarioBase;
  private EstadoCivil   estadoCivil;
  private int           cantidadDeHijos;
  
  public Empleado (int dni, String nombre, String apellido, double salarioBase, EstadoCivil estadoCivil, int cantidadDeHijos)
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
  
  public double obtenerSalarioFinal()
  {
      double  salarioFinal = 0, porcentajeDeSalario = 0;
      
      // calcular porcentaje de salario por hijo
      porcentajeDeSalario = PCT_DE_BASE_POR_HIJO_AUMENTO * this.cantidadDeHijos;
      
      // limitado de porcentaje de salario base basado en hijos
      if(porcentajeDeSalario> PTC_MAX_DE_BASE_POR_HIJO_AUMENTO)
        porcentajeDeSalario = PTC_MAX_DE_BASE_POR_HIJO_AUMENTO;
      // salario resultante = salarioBase + 3% de salarioBase por hijo (hasta 10% de salarioBase)
      salarioFinal = this.salarioBase + this.salarioBase * porcentajeDeSalario;
           
      // si es soltero se descuenta 4% del resultante
      if(this.estadoCivil == EstadoCivil.SOLTERO)
      {
        salarioFinal *= (1 - PCT_SOLTERO_DESCUENTO);
      }
      return salarioFinal;
  }

}
