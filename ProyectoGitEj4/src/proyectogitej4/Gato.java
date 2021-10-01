package proyectogitej4;

public class Gato {

    String nombre;
    Integer edad;
    String tamaño;
    Double peso;

    public Gato() {
    }

    public Gato(String nombre, Integer edad, String tamaño, Double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamaño = tamaño;
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

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    
}
