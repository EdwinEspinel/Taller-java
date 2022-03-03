package Taller2;

import java.io.IOException;
import java.util.Scanner;


public class FiguraGeometrica {
    private int opcion;
    private boolean bandera;
    public void Figuras() throws IOException{
    do {
        limpiarPantalla();
        menu();
        int opcion = capturar();
        boolean bandera = evaluar(opcion);
    } while (bandera == true);
    }
    private boolean evaluar(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                System.out.println("Ingrese la dimension del lago largo");
                int ladoLargo=capturar();
                System.out.println("Ingrese la dimension del lago corto");
                int ladoCorto=capturar();
                int medida=ladoCorto*ladoLargo;
                System.out.println("El area del rectangulo con las medidas indicadas es: "+medida);
                return true;
            case 2:
                System.out.println("Ingrese la dimension de la base");
                int base=capturar();
                System.out.println("Ingrese la dimension del lago corto");
                int altura=capturar();
                float medida2=(base*altura)/2;
                System.out.println("El area del triangulo con las medidas indicadas es: "+medida2);
                return true;
            case 3:
                System.out.println("Ingrese la dimension de la base menor");
                int baseMenor=capturar();
                System.out.println("Ingrese la dimension de la base mayor");
                int baseMayor=capturar();
                System.out.println("Ingrese la dimension de la altura");
                int altura2=capturar();
                float medida3=(baseMenor+baseMayor)*altura2/2;
                System.out.println("El area del trapecio con las medidas indicadas es: "+medida3);
                return true;
            case 0:
                return false;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
    }
    private void menu() {
        System.out.println("De qué figura desea calcular el area?");
        System.out.println("1. Rectangulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Trapecio");
        System.out.println("0. Salir");
    }
    private static int capturar() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
