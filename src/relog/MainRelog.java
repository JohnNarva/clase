
package relog;


public class MainRelog {
    public static void main(String[] args) {
        Relog relog = new Relog(12,59,59);
        System.out.println(relog.mostrarTiempo24Horas());
    }
}
