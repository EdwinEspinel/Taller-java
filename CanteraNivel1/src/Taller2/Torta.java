package Taller2;

import java.util.Scanner;

public class Torta {
    Scanner input = new Scanner(System.in);
    private String sabor;
    private int porciones;
    private String decoraciones;
    private int cantidad;
    
    public void solicitarSabor(){
        System.out.println("Ingrese sabe de la torta");
        sabor = input.nextLine();
    }
    public void solicitarPorciones(){
        System.out.println("Ingrese la cantidad de porciones que trae la torta");
        sabor = input.nextLine();
    }
    public void solicitarDecoraciones(){
        System.out.println("Ingrese las decoraciones que posee la torta");
        sabor = input.nextLine();
    }
    public void solicitarCantidad(){
        System.out.println("Ingrese la cantidad de tortas de dicho saber que existen en el inventario");
        sabor = input.nextLine();
    }
   
    public Torta(String sabor, int porciones, String decoraciones) {
        this.sabor = sabor;
        this.porciones = porciones;
        this.decoraciones = decoraciones;
    }
    public Torta(){
        
    }
    public int getCantidad() {
        return cantidad;
    }
    
}
