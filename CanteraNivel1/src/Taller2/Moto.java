package Taller2;

import java.util.Scanner;

public class Moto {
    private String dueño;
    private String marca;
    private int placa;
    private String comentariosDueño;
    private String arreglos;
    Scanner input = new Scanner(System.in);
    
    public void solicitarMarca(){
        System.out.println("Ingrese la marca de la moto");
        marca = input.nextLine();
    }
    public void solicitarDueño(){
        System.out.println("Ingrese el nombre del dueño");
        dueño = input.nextLine();
    }
    public void solicitarComentarios(){
        System.out.println("Ingrese las recomendaciones del dueño");
        comentariosDueño = input.nextLine();
    }
    public String solicitarArreglos(){
        
        return arreglos;
    }
    public void solicitarPlaca(){
        System.out.println("Ingrese la placa de la moto");
        placa = input.nextInt();
    }
    

    public Moto(String dueño, String marca, int placa, String comentariosDueño, String arreglos) {
        this.dueño = dueño;
        this.marca = marca;
        this.placa = placa;
        this.comentariosDueño = comentariosDueño;
        this.arreglos = arreglos;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getComentariosDueño() {
        return comentariosDueño;
    }

    public void setComentariosDueño(String comentariosDueño) {
        this.comentariosDueño = comentariosDueño;
    }

    public String getArreglos() {
        return arreglos;
    }

    public void setArreglos(String arreglos) {
        this.arreglos = arreglos;
    }
    public Moto(){
        
    }

    public int getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Moto{" + "due\u00f1o=" + dueño + ", marca=" + marca + ", placa=" + placa + ", comentariosDue\u00f1o=" + comentariosDueño + ", arreglos=" + arreglos + '}';
    }
    
}
