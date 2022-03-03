package Taller3;

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
        System.out.println("6. Punto #6");
        System.out.println("7. Punto #7");
        System.out.println("8. Punto #8");
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
                int dimension;
                System.out.println("Ingrese la dimension que desea");
                dimension=capturarOpcion();
                Figura figuras = new Figura();
                figuras.setFigura(opcion);
                figuras.setDimension(dimension);
                figuras.Figura();
                return true;
            case 2:
                int dimension2;
                System.out.println("Ingrese la dimension que desea");
                dimension2=capturarOpcion();
                Figura figuras2 = new Figura();
                figuras2.setFigura(opcion);
                figuras2.setDimension(dimension2);
                figuras2.Figura();
                return true;
            case 3:
                int dimension3;
                System.out.println("Ingrese la dimension que desea");
                dimension3=capturarOpcion();
                Figura figuras3 = new Figura();
                figuras3.setFigura(opcion);
                figuras3.setDimension(dimension3);
                figuras3.Figura();
                return true;
            case 4:
                Calcular tablas = new Calcular();
                tablas.Calculos();
                return true;
            case 5:
                CapturarDatos capturar=new CapturarDatos();
                capturar.Capturar();
                return true;
            case 6:
                Directorio telefonos = new Directorio();
                telefonos.Telefonos();
                return true;
            case 7:
                Parqueadero parqueadero = new Parqueadero();
                parqueadero.ElGuardian();
                return true;
            case 8:
                Escuela escuela = new Escuela();
                escuela.ElMaestro();
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
