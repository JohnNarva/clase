import java.util.Scanner;
public class EjecutarMensaje {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String fecha,nombre,descripcion,veri;
        Mensaje pers1 = new Mensaje();
        System.out.println("escribir la fecha");
        fecha= sc.nextLine();
        System.out.println("escribir la descripcion");
        descripcion= sc.nextLine();
        System.out.println("escribir el nombre");
        nombre= sc.nextLine();
        
        veri=pers1.verificar(fecha,descripcion,nombre);
        if(veri.equals("false")){
            System.out.println("no se ha podido guardar (espacios en blanco)");
        }else{
            pers1.presentar();
        }
        
        
    }

    
    
}
