package guia01.ejercicio01;

import guia01.ejercicio04.Fecha;
import guia01.ejercicio09.Domicilio;
import java.time.Year;

public class Persona {
  private String nombre;
  private String apellido;
  private Fecha fechaDeNacimiento;
  private Domicilio domicilio;
  private static final int AÑO_MINIMO = 1900;
  // podrían ir como atributo de fecha luego
  private static final int FECHA_DIA_POR_DEFECTO = 1;
  private static final int FECHA_MES_POR_DEFECTO = 1;
  
  public Persona(){
    domicilio = new Domicilio();
    setFechaDeNacimiento();
  };
  
  public Persona(String nombre, String apellido, int anyoDeNacimiento)
  {
    domicilio = new Domicilio();
    setNombre(nombre);
    setApellido(apellido);
    setFechaDeNacimiento();
    setAñoDeNacimiento(anyoDeNacimiento);
  }
  
  public Persona(String nombre, String apellido, Fecha fechaDeNacimiento)
  {
    domicilio = new Domicilio();
    setNombre(nombre);
    setApellido(apellido);
    setFechaDeNacimiento(fechaDeNacimiento);
  }
  
  public Persona(String nombre, String apellido, Fecha fechaDeNacimiento, Domicilio domicilio)
  {
    setNombre(nombre);
    setApellido(apellido);
    setFechaDeNacimiento(fechaDeNacimiento);
    setDomicilio(domicilio);
  }
  
  void setDomicilio(Domicilio domicilio)
  {
    this.domicilio = domicilio;
  }
  
  // devolver el nombre completo de la persona
  public String getNombreCompleto()
  {
      return (nombre + " " + apellido);
  }
  
  // Mostrar su estado en la consola.
  public void mostrarEstado()
  {
      //String borde = "******* Persona [" + this + "] *******";
      
      //System.out.println(borde);
      //System.out.println("  ESTADO  ");
      //System.out.println("  Nombre              : " + nombre);
      //System.out.println("  Apellido            : " + apellido);
      //System.out.println("  Anyo de Nacimiento  : " + fechaDeNacimiento.getAnio());
      //domicilio.mostrar();
      //borde = borde.replaceAll(".", "-");
      //System.out.println(borde);
      toString();
  }

  @Override
  public String toString() {
    return "nombre: " + nombre + ", apellido: " + apellido + ",\n fechaDeNacimiento: " + fechaDeNacimiento + ", domicilio: " + domicilio ;
  }
  
  
  
  private int getAñoActual()
  {
      return Year.now().getValue();
  }
  
  // Obtener su edad actual
  public int getEdad()
  {
      //return (getAñoActual() - añoDeNacimiento);
    return (getAñoActual() - fechaDeNacimiento.getAnio());
  }
  
  // Saber si es mayor que una edad dada.
  public boolean esMayorQue(int edadDada)
  {
      return(getEdad()>edadDada);
  }
  
  public void setNombre(String nombre)
  {
      if(nombre!=null)
        this.nombre = nombre;
      else
        System.err.println("El nombre ingresado es nulo.");
  }
  
  public void setApellido(String apellido)
  {
      if(apellido!=null)
        this.apellido = apellido;
      else
        System.err.println("El apellido ingresado es nulo.");
  }
  
  public void setNombreCompleto(String nombre, String apellido)
  {
      //validacion mínima
      if(nombre!=null)
        this.nombre   = nombre;
      else
        System.err.println("El nombre ingresado es nulo.");  
      
      if(apellido!=null)
        this.apellido = apellido;
      else
        System.err.println("El apellido ingresado es nulo.");
  }
  
  public void setAñoDeNacimiento(int añoDeNacimiento)
  {
      if(añoDeNacimiento > AÑO_MINIMO && añoDeNacimiento < getAñoActual())
        this.fechaDeNacimiento.setAnyo(añoDeNacimiento);
      else
        System.err.println("Año de nacimiento ingresado no válido.");
  }
  
  public void setFechaDeNacimiento()
  {
    fechaDeNacimiento = new Fecha(
            FECHA_DIA_POR_DEFECTO,
            FECHA_MES_POR_DEFECTO,
            getAñoActual());
  }
  
  public void setFechaDeNacimiento(Fecha fechaDeNacimiento)
  {
    this.fechaDeNacimiento = fechaDeNacimiento;
  }
}
