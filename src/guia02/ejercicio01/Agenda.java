package guia02.ejercicio01;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Agenda {
    private ArrayList<Persona> personas;

    public Agenda() {
        // Al construirse una agenda, se construye una lista vacía (no queda en null)
        this.personas = new ArrayList<Persona>();
    }  
    
    public int cantPersonas() {
        return personas.size();
    }    
    
    public void listarPersonas() {
//        for (int i = 0; i < personas.size(); i++) {
//            Persona p = personas.get(i); 
//            System.out.println(p);
//        }
        for (Persona p : personas) {
            System.out.println(p);
        }
    }

    public Persona devolverUltimo() {
        Persona pEncontrada = null;
        
        if(!personas.isEmpty())
          pEncontrada = personas.getLast();
        
        return pEncontrada;
    }

    public Persona buscarPersona(String DNI) {
        Persona pEncontrada = null;
        int i = 0;
        
        while (i < cantPersonas() && !this.personas.get(i).mismoDni(DNI)) {
            i++;
        }
        if (i < cantPersonas()) {
            pEncontrada = this.personas.get(i);
        }        
        return pEncontrada;

    }

    public boolean agregarPersona(String DNI, String nombre, String apellido, Domicilio dom) {
        Persona buscada = buscarPersona(DNI);
        boolean sePudo = buscada == null;
        if (sePudo) {
            this.personas.add( new Persona(DNI, nombre, apellido, 0, dom) );
        }        
        return sePudo;

    }

    public Persona removerPersona(String DNI) {
        
        return null;

    }

    public boolean modificarDomicilio(String DNI, Domicilio nuevo) {
      //debe buscar persona por dni y luego modificar domicilio
      Persona buscada           = buscarPersona(DNI);
      boolean seEncontro        = buscada != null;
      boolean domicilioValido   = nuevo   != null;
      boolean modificado        = false;
      
      if(seEncontro && domicilioValido)
      {
        buscada.setDomicilio(nuevo);
        modificado  = true;
      }
      return modificado;
    }

    public ArrayList<Persona> obtenerPorBarrio(String barrio) {

        return null;

    }

    public void vaciar() {

    }

}
