
import java.util.Random;

public class LanzamientoDados {
    public static void main(String[] args) {
        int jugador1 = 0;
        int jugador2 = 0;
        Random random = new Random();
        int numeroAleatorio;
        int lanzada;

        for (int i=1;i<=2;i++){
            numeroAleatorio= random.nextInt(1,7);
            System.out.println("la lanzada numero " + i +" del jugador numero 1 es:  " + numeroAleatorio);
            jugador1=jugador1+numeroAleatorio;
        }
        System.out.println("el total de ambos lanzamientos para el judador 1 es:  " + jugador1 + "\n");

        for (int i=1;i<=2;i++){
            numeroAleatorio= random.nextInt(1,7);
            System.out.println("la lanzada numero " + i +" del jugador numero 2 es:  " + numeroAleatorio);
            jugador2=jugador2+numeroAleatorio;
        }
        System.out.println("el total de ambos lanzamientos para el judador 2 es:  " + jugador2 + "\n");

        if (jugador1 > jugador2){
            System.out.println("el ganador es el jugador numero 1");
        }else if (jugador1<jugador2){
            System.out.println("el ganador es el jugador numero 2");
        }

        if (jugador1==jugador2){
            System.out.println("JUEGO EMPATADO");
        }
    }
}