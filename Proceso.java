
/*
* Autores:
* Diego García 22404
* César López 22535
* Fecha: 31/03/2023
* Hoja de Trabajo #8
* Proceso
*/

import java.util.Arrays;

public class Proceso implements Comparable<Proceso>{
    private String nombre;
    private String usuario;
    private Integer nice;
    private Integer prioridad;
    
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
    
    @Override
    public int compareTo(Proceso otro) {
        return this.nice.compareTo(otro.nice);
    }
    
    public String toString(){
        return (getNombre()+", "+getUsuario()+", "+getNice()+", PR="+getPrioridad());
    }

    public String procesosOrdenados(Proceso[] procesos) {
        String orden = "";
        Arrays.sort(procesos);
    
        System.out.println("Procesos ordenados por valor nice:");
        for (Proceso proceso : procesos) {
            orden+=proceso.toString();
        }

        return orden;
    }
}
