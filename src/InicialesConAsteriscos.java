
public class InicialesConAsteriscos {
        public static void main(String[] args) {

            String nombre = "Rroselin Mariel Ponce Zuniga";
            String[] palabras = nombre.split(" ");

            for (String palabra : palabras) {
                char inicial = palabra.charAt(0);
                imprimirInicialConAsteriscos(inicial);
            }
        }
        public static void imprimirInicialConAsteriscos(char inicial) {
            switch (Character.toUpperCase(inicial)) {
                case 'R':
                    System.out.println("********");
                    System.out.println("*       *");
                    System.out.println("*       *");
                    System.out.println("*******");
                    System.out.println("*      * ");
                    System.out.println("*       * ");
                    System.out.println("*        * ");
                    System.out.println("\n");
                    break;
                case 'M':
                    System.out.println("*       *");
                    System.out.println("* *   * *");
                    System.out.println("*   *   *");
                    System.out.println("*       *");
                    System.out.println("*       *");
                    System.out.println("*       *");
                    System.out.println("\n");
                    break;
                case 'P':
                    System.out.println("***** *");
                    System.out.println("*      *");
                    System.out.println("***** *");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("\n");
                    break;
                case 'Z':
                    System.out.println("********");
                    System.out.println("      *");
                    System.out.println("    *");
                    System.out.println("  *");
                    System.out.println("*");
                    System.out.println("********");
                    break;
                default:
                    System.out.println("Inicial no reconocida: " + inicial);
                    break;
            }
    }

}
