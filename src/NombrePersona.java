import java.util.Scanner;


public class NombrePersona {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombreCompleto;
        System.out.println("ingrese su nombre completo separado por espacio");
        nombreCompleto= entrada.nextLine();

        String[] palabras = nombreCompleto.split(" ");


        for (String nombre : palabras) {
            System.out.println(nombre + ": " + nombre.length() + " letras");
        }


    }


}
