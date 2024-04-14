import com.google.gson.Gson;
import es.uah.matcom.mp.el3.a.ejemplo.Persona;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Persona p = new Persona("Antonio MOratilla", 97);

        String json = gson.toJson(p);

        System.out.println(json);
    }
}

