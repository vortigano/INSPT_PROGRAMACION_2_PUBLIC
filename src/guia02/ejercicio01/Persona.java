package guia02.ejercicio01;

import java.time.Year;

/**
 * 
 * @author Alberto Martín Capurro y Charly Cimino
 */

public class Persona {
    // Modelá la clase Persona, la cual posea como atributos nombre, apellido y año de nacimiento. 
    
    // Atributos    
    private String DNI;
    private String nombre;
    private String apellido;
    private int anioDeNacimiento;
    private Domicilio domicilio;
    
    /* Constructor de la clase
        Debe llamarse igual que la clase
        No retorna nada (ni si quiera void)
        Se ejecuta por única vez en el momento del 'new'
    */

    public Persona(String DNI, String nombre, String apellido, int anioDeNacimiento, Domicilio domi) {
        setDNI(DNI);
        setNombre(nombre);
        setApellido(apellido);
        setAnioDeNacimiento(anioDeNacimiento);
        setDomicilio(domi);
        
        // System.out.println("Nacio la persona " + this);
    }
    
    
    // Métodos
    // Devolver el nombre completo de la persona.
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

    public String getApellido() {
        return apellido;
    }
    
    // Mostrar su estado en la consola.
    // Obtener su edad actual.
    public int edad() {
        // final int ANIO_ACTUAL = Year.now().getValue();
        return anioActual() - anioDeNacimiento;
    }
    
    private int anioActual() {
        return Year.now().getValue();
    }
    
    // Saber si es mayor que una edad dada.
    public boolean esMayorQue(int unaEdadDada) {
        // Reutilizo el método edad(), no vuelvo a hacer el calculo
        return edad() > unaEdadDada;
    }

    public void setAnioDeNacimiento(int anioDeNacimiento) {
        if (anioDeNacimiento > 1900 && anioDeNacimiento < anioActual() ) {
            this.anioDeNacimiento = anioDeNacimiento;  
        }
    }  

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    // Cambiar su nombre.
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    // Cambiar su apellido.
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }    
    
    public String getBarrio()
    {
        return domicilio.getBarrio();
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", anioDeNacimiento=" + anioDeNacimiento + ", domicilio=" + domicilio + '}';
    }

    public boolean mismoDni(String otroDNI) {
        return this.DNI.equals(otroDNI);
    }
    
}
