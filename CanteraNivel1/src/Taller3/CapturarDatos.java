package Taller3;

import java.util.Scanner;

public class CapturarDatos {
    private String nombre;
    private int l=0;
    Scanner input = new Scanner(System.in);
    public void Capturar(){
        for(int i=2;i!=1;i++){
        menu();
        i=input.nextInt();
        if(i==1){
            System.out.println("Ingrese su nombre por favor");
            Scanner inp = new Scanner(System.in);
            nombre=inp.nextLine();
            l=1;
            }
        if(l==0){
            System.out.println("Aun no ha ingresado un nombre");
            }
        if(l==1){
            System.out.println("Cordial saludo "+nombre+" cómo se encuentra el día de hoy");
        }
        }
    }
    private static void menu() {
        System.out.println("Que desea hacer?");
        System.out.println("1. Ingresar datos");
        System.out.println("2. Saludar persona");
        System.out.println("0. Salir");        
        }
}
