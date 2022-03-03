package Taller1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static boolean bandera=true;
    private static int opcion;
    private static String nombre;
    private static String apellido;
    private static String NombreMa;
    private static String NombrePa;
    
    
    
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
    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                MisDatos p1 = new MisDatos();
                p1.MisDatos();
                return true;
            case 2:
                MisDatos p2 = new MisDatos();
                p2.setOpcion(opcion);
                p2.MisDatos();
                return true;
            case 3:
                MisDatos p3 = new MisDatos();
                p3.MisDatos();
                NombreMadre p4 = new NombreMadre();
                p4.NombreMadre();
                NombrePadre p5 = new NombrePadre();
                p5.NombrePadre();
                System.out.println("yo "+p3.getNombre()+" "+p3.getApellidos()+" Soy hijo de "+p4.getNombreMa()+" y "+p5.getNombrePa());
                return true;
            case 4:
                Capital p6 = new Capital();
                p6.Capital();
                return true;
            case 5:
                DatosMascota p7 = new DatosMascota();
                p7.DatosMascota();
                return true;
            case 0:
                return false;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
    }
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
