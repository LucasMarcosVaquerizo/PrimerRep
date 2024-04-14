package es.uah.matcom.mp.el3.a.ejemplo;

public class Persona {
    private String nombre = "Jhon Doe";
    private int edad = 18;

    public Persona(String nombre,int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int newEdad) {
        this.edad = newEdad;
    }

}

