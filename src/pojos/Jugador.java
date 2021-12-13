
package pojos;

public class Jugador extends Equipo{
        //atributos
    String nombre_jugador;
    String apellido;
    String direccion;

    public Jugador() {
    }

    public Jugador(String nombre_jugador, String apellido, String direccion, int id, String nombre_equipo) {
        super(id, nombre_equipo);
        this.nombre_jugador = nombre_jugador;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getNombre_jugador() {
        return nombre_jugador;
    }

    public void setNombre_jugador(String nombre_jugador) {
        this.nombre_jugador = nombre_jugador;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
