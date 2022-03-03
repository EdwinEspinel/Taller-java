package Taller3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Escuela {
    Scanner input = new Scanner(System.in);
    private boolean bandera3;
    private int opcion3;
    private List<Estudiante>estudiantes;
    private int id;
    private String examen;
    
    public void ElMaestro() throws IOException{
        bandera3=true;
        estudiantes=new ArrayList<Estudiante>();
        do {
            limpiarPantalla();
            menu();
            opcion3 = capturar();
            bandera3 = evaluar(opcion3);
        } while (bandera3 == true);
    }
    private boolean evaluar(int opcion3) throws IOException {
        switch (opcion3) {
            case 1:
                Scanner inp = new Scanner(System.in);
                System.out.println("Ingrese la identificación del estudiante");
                id=inp.nextInt();
                int temp=0;
                for (Estudiante iteradorEstudiantes:estudiantes){
                    if(iteradorEstudiantes.getId()==id){ 
                        System.out.println("Este estudiante ya se encuentra registrado");
                        temp=1;
                        break;
                    }
                }
                if (temp==0){
                    Estudiante misEstudiantes = new Estudiante();
                    misEstudiantes.setId(id);
                    misEstudiantes.solicitarNombre();
                    System.out.println("El estudiante ya presento el examen?");
                    examen=inp.nextLine();
                    if(examen.equals("si"))
                        misEstudiantes.solicitarNota();
                    estudiantes.add(misEstudiantes);
                }
                return true;
            case 2:
                Scanner inp2 = new Scanner(System.in);
                System.out.println("Ingrese el id del estudiante");
                id=inp2.nextInt();
                int temp2=0;
                for (Estudiante iteradorEstudiantes:estudiantes){
                    if(iteradorEstudiantes.getId()==id){ 
                        iteradorEstudiantes.toString();
                        temp2=1;
                    }
                }
                if (temp2==0){
                    System.out.println("El estudiante no se encuentra registrado");
                }
                return true;
            case 3:
                Scanner inp3 = new Scanner(System.in);
                int i=1;
                int a;
                System.out.println("Seleccione el estudiante que desea eliminar");
                for (Estudiante iteradorEstudiantes:estudiantes){
                    System.out.print(i+"  ");
                    iteradorEstudiantes.toString();
                    i++;
                    }
                a=inp3.nextInt();
                for (Estudiante iteradorEstudiantes:estudiantes){
                    if(a==i){
                        estudiantes.remove(iteradorEstudiantes);
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
    private void menu() {
        System.out.println("Qué dese hacer?");
        System.out.println("1. Ingresar un nuevo estudiante");
        System.out.println("2. Consultar el estado de un estudiante");
        System.out.println("3. Eliminar un estudiante");
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
