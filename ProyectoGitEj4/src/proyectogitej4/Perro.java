
package proyectogitej4;


public class Perro {
    
    String nombre;
    Integer edad;
    String tamaño;
    Boolean cola;
    Double peso;

    public Perro() {
    }

    public Perro(String nombre, Integer edad, String tamaño, Boolean cola, Double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamaño = tamaño;
        this.cola = cola;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Boolean getCola() {
        return cola;
    }

    public void setCola(Boolean cola) {
        this.cola = cola;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    
    
}
