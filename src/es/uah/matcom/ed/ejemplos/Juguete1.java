package es.uah.matcom.ed.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Esto es una clase de ejmplo de laboratorio de Estructura de Datos.
 */
public class Juguete1 {

    Boolean verdadero = true;
    Boolean falso = false;
    String nombre = "Lucas Marcos";

    public String getNombre() {
        return nombre + " Vaquerizo";
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void intruccionesDeControl(){
        boolean v = true;
        boolean b = false;
        if (true){
            //Bloque verdadero
            v=true;
            b=v;
        } else {
            //bloque falso
            v=false;
        }


        int y = 0;
        for (int x=0;x<10;x++){
            System.out.println(x);
            y=x;
        }

        for (;y<10;y++){
            System.out.println("En el bucle y " + y);
        }

        for (;y<10;){
            System.out.println("En el segundo bucle y " + y);
            y++;
        }
    }

    public long getSegundos(){
        return LocalDateTime.now().atZone(ZoneId.systemDefault()).toEpochSecond();
    }

}




