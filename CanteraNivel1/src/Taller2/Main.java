package Taller2;

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
        System.out.println("1. Punto  #1");
        System.out.println("2. Punto  #2");
        System.out.println("3. Punto  #3");
        System.out.println("4. Punto  #4  (Videos club)");
        System.out.println("5. Punto  #5  (Drogueria)");
        System.out.println("6. Punto  #6  (Taller motos)");
        System.out.println("7. Punto  #7  (Indice de Masa Corporal)");
        System.out.println("8. Punto  #8  (Pasteles)");
        System.out.println("9. Punto  #9  (Figuras)");
        System.out.println("10. Punto #10 (Pasteles)");
        System.out.println("0. Salir del taller");
        
    }
    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private static boolean evaluarOpcion(int opcion) throws IOException {
        Persona person = new Persona();
        switch (opcion) {
            case 1:
                person.Persona();
                if(person.getEdad()>=18){
                    System.out.println(person.getNombre()+" usted es mayor de edad");
                }
                return true;
            case 2:
                person.Persona();
                if (person.getEdad()<18){
                    System.out.println(person.getNombre()+" usted aun es un niño");
                }
                return true;
            case 3:
                person.Persona();
                if (person.getEdad()>=18){
                    System.out.println(person.getNombre()+" usted es mayor de edad, por lo tanto puede entrar a la fiesta");
                }
                if (person.getEdad()<18){
                    System.out.println(person.getNombre()+" usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
                }
                return true;
            case 4:
                Videotienda videotienda= new Videotienda();
                videotienda.videoTiendas();
                return true;
            case 5:
                Drogueria miSalud = new Drogueria();
                miSalud.droguerias();
                return true;
            case 6:
                TallerMotos maquinista = new TallerMotos();
                maquinista.TallerMaquinista();
                return true;
            case 7:
                IndiceMasa indice =new IndiceMasa();
                indice.EstadoPeso();
                return true;
            case 8:
                Pasteleria pasteles=new Pasteleria();
                pasteles.ElGordo();
                return true;
            case 9:
                FiguraGeometrica Tareas= new FiguraGeometrica();
                Tareas.Figuras();
                return true;
            case 10:
                Banco suBancoFiel=new Banco();
                suBancoFiel.Bancos();
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
