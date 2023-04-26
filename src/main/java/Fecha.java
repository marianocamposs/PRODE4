import java.util.ArrayList;
import java.util.HashMap;

public class  Fecha {

    private HashMap<String, Partido> partidos;

    public Fecha() {
        partidos = new HashMap<>();
    }

    public void agregarPartido(Partido nuevo) {
        partidos.put(nuevo.getOrden(), nuevo);
    }
}
/*
    public ArrayList<Fecha> resultado;

    public Fecha() {
        resultado = new ArrayList<>();
    }

    public void agregarPartido(Partido nuevo) {
        resultado.add(nuevo);
    }

    public int cantidadPartidos() {
        return resultado.size();
    }
}
/*
   public ArrayList<Partido> localVisite (String locev) {
       ArrayList<Partido> list = new ArrayList<>();

       for (Partido p : localVisite())
           public Partido buscaPartido () {
           return resultado.get();
       }

    //public String res() {
      //  String vel= "";
        //   for (int i = 0; i < cantidadPartidos(); i++) {
      //  for (Partido pa : resultado) {
       //     vel = pa.lev();

       // return vel;


     //   ArrayList<Partido> resultado = new ArrayList<>();

     //   for (Partido.p: partidos.values()){
       //     if(p.get)
      //  }


//metodo que permita buscar partido, y otro que recorra las apuestas y por cada uno busque el partido y compare
        // con un if y contar


*/


