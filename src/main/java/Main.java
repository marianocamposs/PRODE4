import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args)  throws IOException {

//Se comienza leyendo dos tablas  llamadas "apuestas.csv" y "resultados.csv",
//una contiene las apuestas realizadas y la otra los resultados de partidos.
// A continuación, utilizamos dos objetos Scanner para leer los datos de cada archivo.
// Luego, se utilizan los métodos "useDelimiter" para establecer los delimitadores para el análisis de texto.


        Scanner scanner = new Scanner(new File("resultados.csv"));
        Scanner scanner2 = new Scanner(new File("apuestas.csv"));
        Scanner teclado = new Scanner(System.in);

        scanner.useDelimiter("[;\\n\\r]+");
        scanner2.useDelimiter("[;\\n\\r]+");

//Después creamos dos objetos: un objeto "Jugada" y un objeto "Fecha".
// Estos objetos son las clases que necesitan ser relacionadas.

        Jugada listaApuesta = new Jugada();
        Fecha listaPartidos = new Fecha();

//Entramos en ciclo while que lee cada línea de texto del archivo "resultados.csv". Para cada línea de texto o renglon de la tabla,
// el programa crea un nuevo objeto "Partido" utilizando los datos leídos y lo agrega a la lista de Fecha.

        while (scanner.hasNext()){
            String orden = scanner.next();
            String equipoL = scanner.next();
            int golesEquipoL = scanner.nextInt();
            int golesEquipoV = scanner.nextInt();
            String equipoV = scanner.next();

//Creamos la variable localEV y en un if definimos en base a los goles de las variables
// goles Local y goles Visitante cual fue el resultado :

            String localEV ;
            if (golesEquipoL==golesEquipoV) {localEV= "EMPATE";}
            else if (golesEquipoL>golesEquipoV) {localEV= "LOCAL";}
            else  {localEV= "VISITANTE";}

            Partido nuevo = new Partido (orden,equipoL,golesEquipoL,golesEquipoV,equipoV,localEV);
            listaPartidos.agregarPartido(nuevo);
          System.out.println(nuevo);
        }
        scanner.close();
//A continuación, el bucle "while" que lee cada línea de la tabla  "apuestas.csv".
// Para cada línea, el programa crea un nuevo objeto "Apuesta" utilizando los datos leídos y lo agrega
// a la lista de apuestas.
       while (scanner2.hasNextInt()) {
            int documento = scanner2.nextInt();
            String apostador = scanner2.next();
            String equipoLocal = scanner2.next();
            String equipoVisi = scanner2.next();
            String resultado = scanner2.next();


            Apuesta nueva = new Apuesta (documento, apostador,equipoLocal, equipoVisi, resultado);
            listaApuesta.agregarApuesta(nueva);
            System.out.println(nueva);
        }
        scanner2.close();
//creamos un objeto "ApuestaPartido" para cada apuesta y su correspondiente partido, y compararlos entre sí.
//Recorremos las listas de apuestas y partidos y creamos un objeto "ApuestaPartido"
// para cada combinación de apuesta y partido. Luego, comparamos estos objetos partido a partido para
// determinar cuántos aciertos tuvo cada apostador.

    /*    for (Apuesta apostador : listaApuesta.agregarApuesta();) {
            int aciertos = 0;

            for (Partido partido : listaPartidos.();) {
                ApuestaPartido apuestaPartido = new ApuestaPartido(apostador, partido);

                if (apuestaPartido.getApostador().apostoPorGanador() && apuestaPartido.getPartido().ganoLocal()) {
                    aciertos++;
                } else if (apuestaPartido.getApostador().apostoPorEmpate() && apuestaPartido.getPartido().empataron()) {
                    aciertos++;
                } else if (apuestaPartido.getApostador().apostoPorPerdedor() && apuestaPartido.getPartido().ganoVisitante()) {
                    aciertos++;
                }
            }

            System.out.println("El apostador " + apostador.getNombre() + " acertó " + aciertos + " partidos.");
        }

        //esto es apra buscar un documento y ver cuantos puntos obtuvo ese apostador
        // System.out.println("Ingrese el documento del apostador que busca: ");

       // int documentoBuscado = teclado.nextInt();

       /* Apostador encontrado = listaApuesta.buscarApostador(documentoBuscado);
        if(encontrado ==null){
            System.out.println("No se encuentra");} else {
            System.out.println(encontrado);
        */
    }
       }





