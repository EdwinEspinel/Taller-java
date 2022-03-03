package Taller4;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static boolean bandera=true;
    private static int opcion;
    public static void main(String[] args) throws IOException{
        do {
            limpiarPantalla();
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);
    }
    private static void menu() {
        System.out.println("Escoja un punto del taller");
        System.out.println("1. Punto #1");
        System.out.println("2. Punto #2");
        System.out.println("3. Punto #3");
        System.out.println("4. Punto #4");
        System.out.println("5. Punto #5");
        System.out.println("0. Salir del taller");
        
    }
    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                Vector vectores = new Vector();
                vectores.vectores();
                return true;
            case 2:
                Aleatorio aleatorios = new Aleatorio();
                aleatorios.aleatorios();
                return true;
            case 3:
                Primo primos = new Primo();
                primos.primos();
                return true;
            case 4:
                Matriz matrices = new Matriz();
                matrices.matrices();
                return true;
            case 5:
                Cuadro cuadrado = new Cuadro();
                cuadrado.cuadrados();
                return true;
            case 0:
                return false;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
        }
}
