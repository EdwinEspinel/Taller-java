package Taller3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Directorio {
    Scanner input = new Scanner(System.in);
    private boolean bandera;
    private int opcion;
    private List<Contacto>contactos;
    private String nombre;

    public void Telefonos() throws IOException{
        bandera=true;
        contactos=new ArrayList<Contacto>();
        do {
            limpiarPantalla();
            menu();
            opcion = capturar();
            bandera = evaluar(opcion);
        } while (bandera == true);
    }
    private void menu() {
        System.out.println("Qué dese hacer?");
        System.out.println("1. Ingresar un nuevo numero");
        System.out.println("2. Consultar un contacto");
        System.out.println("3. Eliminar un contacto");
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
    private boolean evaluar(int opcion3) throws IOException {
        switch (opcion3) {
            case 1:
                Scanner inp = new Scanner(System.in);
                System.out.println("Ingrese el nombre del contacto");
                nombre=inp.nextLine();
                int temp=0;
                for (Contacto iteradorContactos:contactos){
                    if(iteradorContactos.getNombre().equals(nombre)){ 
                        System.out.println("Este contacto ya se encuentra en tu lista");
                        temp=1;
                        break;
                    }
                }
                if (temp==0){
                    Contacto misContactos = new Contacto();
                    misContactos.setNombre(nombre);
                    misContactos.solicitarNumero();
                    misContactos.solicitarOrganización();
                    contactos.add(misContactos);
                }
                return true;
            case 2:
                Scanner inp2 = new Scanner(System.in);
                System.out.println("Ingrese el nombre del contacto que desea buscar");
                nombre=inp2.nextLine();
                int temp2=0;
                for (Contacto iteradorContactos:contactos){
                    if(iteradorContactos.getNombre().equals(nombre)){ 
                        iteradorContactos.toString();
                        temp2=1;
                    }
                }
                if (temp2==0){
                    System.out.println("El contacto no se encuentra en tu lista");
                }
                return true;
            case 3:
                Scanner inp3 = new Scanner(System.in);
                int i=1;
                int a;
                System.out.println("Seleccione el contacto que desea eliminar");
                for (Contacto iteradorContactos:contactos){
                    System.out.print(i+"  ");
                    iteradorContactos.toString();
                    i++;
                    }
                a=inp3.nextInt();
                for (Contacto iteradorContactos:contactos){
                    if(a==i){
                        contactos.remove(iteradorContactos);
                        break;
                    }
                    i++;
                    }
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
