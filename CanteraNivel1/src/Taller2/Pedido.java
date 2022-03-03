package Taller2;

import java.util.Scanner;

public class Pedido {
    Scanner input = new Scanner(System.in);
    private String nombre;
    private int cantidad;
    private String sabor;
    
    public void solicitarNombre(){
        System.out.println("Ingrese el nombre del cliente");
        nombre = input.nextLine();
    }
    public void solicitarSabor(){
        System.out.println("Ingrese el sabor que desea comprar");
        nombre = input.nextLine();
    }
    public void solicitarCantidad(){
        System.out.println("Ingrese la cantidad de tortas que desea comprar");
        cantidad = input.nextInt();
    }

    public Pedido(String nombre, int cantidad, String sabor) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.sabor = sabor;
    }
    public Pedido() {
        
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
}
