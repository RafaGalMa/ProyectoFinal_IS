
package pojos;

public class Equipo {
    //atributos
    int id;
    String nombre_equipo;
    
   //Constructor vacio
    public Equipo() {
	
    }

    public Equipo(int id, String nombre_equipo) {
        this.id = id;
        this.nombre_equipo = nombre_equipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }
    
}
