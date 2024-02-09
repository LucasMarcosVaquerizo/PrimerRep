package es.uah.matcom.ed.ejemplos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Juguete1Test {

    @Test
    void getNombre() {
    }

    void modificaciones(){
        Juguete1 j = new Juguete1();
        assertDoesNotThrow(() -> j.modificaciones());
        assertEquals("Lucas",j.getNombre(),"El nombre no es correcto");

    }

    @Test
    void intruccionesDeControl() {
        Juguete1 j = new Juguete1();
        assertDoesNotThrow(() -> j.intruccionesDeControl());
    }

    @Test
    void getSegundos() {
        Juguete1 j = new Juguete1();
        assertTrue((j.getSegundos()>0), "El tiempo es cero o negativo");
    }
}