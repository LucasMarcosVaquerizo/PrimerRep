import es.uah.matcom.ed.ejemplos.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Juguete1 miObjeto = new Juguete1();

        System.out.println(miObjeto.getNombre());

        System.out.println("El número de  segundos es:" + miObjeto.getSegundos());

        String resultado="";
        String concatenar="HolaBuenas";
        while (tiempo){
            resultado = resultado+concatenar;
        }

        StringBuilder resultadosb=new StringBuilder();
        while(tiempo){
            resultadosb.append(concatenar);
        }

    }
}
