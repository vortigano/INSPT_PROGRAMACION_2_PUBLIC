package guia01.ejercicio12;

import guia01.ejercicio04.Fecha;

/**
 *
 * @author Alberto Martín Capurro
 */
public class Documento {
  private Fecha   fechaDocumento;
  private String  titulo;
  private String  cuerpo;
  
  public Documento(Fecha fechaDocumento, String titulo, String cuerpo)
  {
    this.fechaDocumento = fechaDocumento;
    this.titulo         = titulo;
    this.cuerpo         = cuerpo;
  }
  
  public String getFecha()
  {
    return fechaDocumento.toString();
  }
  public String getTitulo()
  {
    return titulo.toString();
  }
  
  public String getCuerpo()
  {
    return cuerpo.toString();
  }
  
//  public void mostrarFecha()
//  {
//    System.out.println(fechaDocumento.toString());
//  }
//  
//  public void mostrarTitulo()
//  {
//    System.out.println(" --- titulo --- ");
//    System.out.println(titulo);
//  }
//
//  public void mostrarCuerpo()
//  {
//    System.out.println(" --- cuerpo --- ");
//    System.out.println(cuerpo);
//  }

  public void mostrarDocumento()
  {
    System.out.println(toString());
  }
  
  public int getNCharsCuerpo()
  {
    return cuerpo.length();
  }
  
  @Override
  public String toString() {
    return  "Fecha  {" + fechaDocumento + "}" +
            "\ntitulo {" + titulo + "}"+
            "\ncuerpo {" + cuerpo + "}\n";
  }
  
          
}
