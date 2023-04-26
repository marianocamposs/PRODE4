import java.util.HashMap;

public class Jugada {

    private HashMap<Integer, Apuesta> apuestas;

    public Jugada() {apuestas = new HashMap<>();}

    public void agregarApuesta(Apuesta nueva) {
        apuestas.put(nueva.getDocumento(), nueva);

    }

}
