package Taller2;

import java.util.Scanner;

public class Persona {
    private int edad;
    private String nombre;
    private Scanner input;
    
    public void Persona(){
        input = new Scanner(System.in);
        solicitarNombre();
        nombre = capturarDatoString();
        solicitarEdad();
        edad = capturarDatoInt();
    }
    private void solicitarEdad(){
        System.out.println("Ingrese su edad por favor");
    }
    private void solicitarNombre(){
        System.out.println("Ingrese su nombre por favor");
    }
    private int capturarDatoInt(){
        return input.nextInt();
    }
    private String capturarDatoString(){
        return input.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
}
