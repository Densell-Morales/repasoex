
public class alumno  extends herencia { // extends sirve para poder heredar de una calse madre
    int id;
    String nombre;
    String apellido;

    public alumno() {
    }

    public alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void mostrarNombre(){
        System.out.println("Hola soy un alumno y se decir mi nombre");
    }
    public void saberAprobado(double calificacion){
        if (calificacion >=6){
            System.out.println("aprobe la materia");
        }
        else {
            System.out.println("reprobe la materia");
        }
    }

}
