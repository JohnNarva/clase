
public class Mensaje {

    
    private String fecha;
    private String descripcion;
    private String nombre;
    private int dia;
    private int mes;
    private int año;
    
    // contructores
    
    public Mensaje() {
        
    }
    
    public Mensaje(String fecha, String descripcion, String nombre) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }
    
//metodos set y get
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //netodo para verificar q no haya espacios nulos
    public  String verificar(String fecha,String descripcion,String nombre){
        if (fecha.equals("")|| descripcion.equals("")|| nombre.equals("")){
            return "false";
        }else{
            setFecha(fecha);
            setDescripcion(descripcion);
            setNombre(nombre);
        }
      return "se a guardado con exito";
    }
    public void presentar(){
        System.out.println("FECHA: "+getFecha());
        System.out.println("DESCRIPCION: "+getDescripcion());
        System.out.println("NOMBRE: "+getNombre());
    }
    
}
