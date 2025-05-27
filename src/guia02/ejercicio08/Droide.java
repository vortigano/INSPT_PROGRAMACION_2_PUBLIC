package guia02.ejercicio08;
        
import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author Alberto Martín Capurro
 */
public class Droide {

    private ArrayList<Pieza>  regPiezasOperativas;
    private ArrayList<Pieza>  regPiezasNoOperativas;
    private ArrayList<Droide> regDroides;
    
    private String            droideId;
    
    public Droide(String droideID)
    {
      regPiezasOperativas     = new ArrayList<Pieza>();
      regPiezasNoOperativas   = new ArrayList<Pieza>();
      regDroides              = new ArrayList<Droide>();
      this.droideId           = droideID;
      construirDroide();
    }
    
    public ReparacionInforme autoRepararse()
    {
      ReparacionInforme reporte = ReparacionInforme.REPARACION_IMPOSIBLE;
      boolean pudoRepararSe       = false;
      boolean quedanNoOperativas  = false;

      for (int i = 0; i < regPiezasNoOperativas.size(); i++)
      {
        Pieza piezaRota = regPiezasNoOperativas.get(i);
        boolean piezaReparada = false;

        for (int j = 0; j < regDroides.size() && !piezaReparada; j++)
        {
          Droide otro = regDroides.get(j);
          Pieza reemplazo = otro.entregarPiezaSaludable(piezaRota.getTipo());

          if (reemplazo != null)
          {
            regPiezasOperativas.add(reemplazo);
            regPiezasNoOperativas.remove(i);
            i--; // Ajusto el indice por el remove previo
            piezaReparada = true;
            pudoRepararSe = true;
          }
        }
        if (!piezaReparada)
        {
          quedanNoOperativas = true;
        }
      }

      if (!quedanNoOperativas && pudoRepararSe)
      {
        reporte = ReparacionInforme.COMPLETAMENTE_OPERATIVO;
      } else if (quedanNoOperativas && pudoRepararSe) 
      {
        reporte = ReparacionInforme.REPARACION_PARCIAL;
      } else 
      {
        reporte = ReparacionInforme.REPARACION_IMPOSIBLE;
      }
      
      return reporte;
    }
    
    public void desgaste()
    {
      Random r = new Random();
    
      // Aplico desgaste a toda la lista
      for (Pieza p : regPiezasOperativas)
      {
        p.desgaste(r.nextDouble(0, 80));
      }

      for (int i = 0; i<regPiezasOperativas.size(); i++)
      {
        Pieza p = regPiezasOperativas.get(i);
        if (!p.esSaludable())
        {
          regPiezasNoOperativas.add(p);
          regPiezasOperativas.remove(i);
          // CUIDADO: Ajusto el indice por remover un elemento
          i--;
        }
      }
    }
    
    public void mostrarInformacion()
    {
      System.out.println(whoTalks() + " Piezas Operativas");
      System.out.println(regPiezasOperativas.toString());
      System.out.println(whoTalks() + " Piezas No Operativas");
      System.out.println(regPiezasNoOperativas.toString());
      System.out.println(whoTalks() + " Droides registrados");
      System.out.println(regDroides.toString());
    }
    
    public Pieza entregarPiezaSaludable(TipoPieza tipo)
    {
      Pieza retorno = null;
      boolean piezaEncontrada = false;

      for (int i = 0; i < regPiezasOperativas.size() && !piezaEncontrada; i++)
      {
        Pieza p = regPiezasOperativas.get(i);
        if (p.getTipo() == tipo && p.esSaludable())
        {
          retorno = p;
          regPiezasOperativas.remove(i);
          piezaEncontrada = true;
        }
      }

      if (piezaEncontrada) {
        System.out.println(whoTalks() + " entrega pieza " + tipo);
      }
      
      return retorno;
    }
    
    public void agregarPiezas(ArrayList<Pieza> registro, Pieza pieza)
    {
      if(registro!=null && pieza!=null)
      {
        registro.add(pieza);
        System.out.println( whoTalks() + "Se agrego la pieza " + pieza);
      }
      else
      {
        System.out.println( whoTalks() + "No se puede agregar la pieza");
      }
    }
    
    public void registrarDroide(Droide d)
    {
      
      if(d!=null && d!=this && !regDroides.contains(d))
      {
        System.out.println(whoTalks() + " droide " + d.getId());
        regDroides.add(d);
      }
    }
    
    public String getId()
    {
      return droideId;
    }
    
    private String whoTalks()
    {
      return "> " +droideId + ":";
    }
    
    private void construirDroide()
    {
      Pieza[] piezas = new Pieza[]{
        new Pieza(TipoPieza.BATERIA_DE_LITIO),
        new Pieza(TipoPieza.CAMARA_INFRARROJA),
        new Pieza(TipoPieza.ORUGA_DE_ACERO),
        new Pieza(TipoPieza.ORUGA_DE_ACERO),
        new Pieza(TipoPieza.RADIO),
        new Pieza(TipoPieza.SENSOR_DE_PROXIMIDAD),
        new Pieza(TipoPieza.SERVOMOTOR),
        new Pieza(TipoPieza.VISOR_NOCTURNO)
      };
      
      for (Pieza pieza : piezas) {
        agregarPiezas(regPiezasOperativas, pieza);
      }
      System.out.println("----------------------------");
    }

  @Override
  public String toString() {
    return String.format("%s", getId());
  }
}