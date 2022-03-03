package Taller3;

import java.util.Scanner;

public class Contacto {
    Scanner input = new Scanner(System.in);
    private String nombre;
    private int numero;
    private String organización;
    
    public void solicitarNombre(){
        System.out.println("Ingrese sabe de la torta");
        nombre = input.nextLine();
    }
    public void solicitarNumero(){
        System.out.println("Ingrese sabe de la torta");
        numero = input.nextInt();
    }
    public void solicitarOrganización(){
        System.out.println("Ingrese sabe de la torta");
        nombre = input.nextLine();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Contacto{" + "input=" + input + ", nombre=" + nombre + ", numero=" + numero + ", organizaci\u00f3n=" + organización + '}';
    }
    
}
