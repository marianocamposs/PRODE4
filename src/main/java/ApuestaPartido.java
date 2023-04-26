
public class ApuestaPartido {
    private Apuesta apostador;
    private Partido partido;

    public ApuestaPartido(Apuesta apostador, Partido partido) {
        this.apostador = apostador;
        this.partido = partido;
    }

    public Apuesta getApostador() {
        return apostador;
    }

    public Partido getPartido() {
        return partido;
    }
}
