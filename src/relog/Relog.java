
package relog;

public class Relog {

  
    private int hora;
    private int minuto;
    private int segungo;
    
     public Relog() {
         this(1,1,1);
    }

    public Relog(int hora) {        
        this(hora,0,0);        
    }

    public Relog(int hora, int minuto, int segungo) {
        setHora(hora);
        setMinuto(minuto);
        setSegungo(segungo);
    }

    public Relog(int hora, int minuto) {
        this(hora,minuto,0);
    }
  
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora>=0&&hora<=23){
            this.hora = hora;
        }else{
            System.out.println("hora incorrecta");
            this.hora=0;
        }
    }

    public int getMinuto() {
        
        return minuto;
    }

    public void setMinuto(int minuto) {
        if(minuto>=0&&minuto<=59){
            this.minuto = minuto;
        }else {
            System.out.println("minuto incorrecto");
            this.minuto=0;
        }
    }

    public int getSegungo() {
        return segungo;
    }

    public void setSegungo(int segundo) {
        if(segundo>=0&&segundo<=59){
        this.segungo = segungo;
        }else{
        System.out.println("segundo incorrecto");
            this.segungo=0;
        }
    }
    
    public String mostrarTiempo24Horas(){
        return String.format("%02d:%02d:%02d",hora,minuto,segungo);
    }
    public void mostrarTiempo12Horas(){
        
    }
    
}
