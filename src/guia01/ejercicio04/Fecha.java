package guia01.ejercicio04;

public class Fecha {
  private int dia;
  private int mes;
  private int anyo;

  public Fecha(int dia, int mes, int anyo) {
    setAnyo(anyo);
    setMes(mes);
    setDia(dia);
  }
  
  public int getDia() {
    return dia;
  }

  public int getMes() {
    return mes;
  }

  public int getAnio() {
    return anyo;
  }

  public void setDia(int dia) {
    if(dia > 0 && dia <31)
      this.dia = dia;
    else
    {
      System.out.println("Fecha de dia fuera de rango");  
      this.dia = 1;
    }
      
  }

  public void setMes(int mes) {
    if(mes > 0 && mes <13)
    {
      this.mes = mes;
    }  
    else
    {
      System.out.println("Mes fuera de rango");
      this.mes = 1;
    }
  }

  public void setAnyo(int anyo) {
    if(anyo > 0)
    {
      this.anyo = anyo;
    }
  }
  
  public boolean esNavidad (){
        return getDia()==25 && getMes()==12;
    }
    
    public void sumarMes(){
        if(getMes()<=11){
            setMes(mes+1);
        }
        else{
            setMes(1);
            setAnyo(anyo+1);
        }
    }
    
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anyo;
    }

}
