package Taller3;

import java.util.Scanner;

public class Estudiante {
    Scanner input = new Scanner(System.in);
    private String nombre;
    private String examen;
    private String nota;
    private int id;

    public void solicitarId(){
        System.out.println("Ingrese el nombre del estudiante");
        id = input.nextInt();
    }
    public void solicitarNombre(){
        System.out.println("Ingrese el nombre del estudiante");
        nombre = input.nextLine();
    }
    public void solicitarNota(){
        System.out.println("El estudiante aprobo o reprobo el examen?");
        nota= input.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
