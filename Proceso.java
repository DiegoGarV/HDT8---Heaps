/*
* Autores:
* Diego García 22404
* César López 22535
* Fecha: 31/03/2023
* Hoja de Trabajo #8
* Proceso
*/

/**
 * It takes an array of Proceso objects, sorts them by their nice value, and returns a string
 * containing the sorted array
 */
public class Proceso implements Comparable<Proceso>{
    private String nombre;
    private String usuario;
    private Integer nice;
    private Integer prioridad;
    
    // A constructor.
    public Proceso(String nombre, String usuario, Integer nice){
        this.nombre = nombre;
        this.usuario = usuario;
        this.nice = nice;
        this.prioridad = nice+120;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getNice() {
        return this.nice;
    }

    public void setNice(Integer nice) {
        this.nice = nice;
    }

    public Integer getPrioridad() {
        return this.prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
    
    /**
     * The compareTo() method compares two objects of the same type and returns a negative integer,
     * zero, or a positive integer as this object is less than, equal to, or greater than the specified
     * object
     * 
     * @param otro The other process to compare to.
     * @return The compareTo method is being returned.
     */
    @Override
    public int compareTo(Proceso otro) {
        return this.nice.compareTo(otro.nice);
    }
    
    /**
     * The function returns a string that contains the name, username, nice value, and priority of the
     * process
     * 
     * @return The name, user, nice, and priority of the process.
     */
    public String toString(){
        return (getNombre()+", "+getUsuario()+", "+getNice()+", PR="+getPrioridad());
    }
}