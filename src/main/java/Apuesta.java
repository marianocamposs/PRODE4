import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Apuesta {

    private int documento;
    private String apostador;
    private String equipoLocal;
    private String equipoVisi;
    private String resultado;

    @Override
    public String toString() {
        return "El apostador: " + apostador + ", Con DNI n: " + documento + " aposto para el partido de " + equipoLocal + " vs " +
                equipoVisi + "= " + resultado;
    }
    }


    //  public Apostador buscarApostador(int buscado) {
        //     return apostadores.get(buscado);

//for comun acceder a los pronosticos
    // Apuesta []




