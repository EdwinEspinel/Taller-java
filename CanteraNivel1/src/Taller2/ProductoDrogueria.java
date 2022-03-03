package Taller2;

import java.util.Scanner;

public class ProductoDrogueria {
    private String nombre;
    private String presentacion;
    private int tamaño;
    private int precio;
    private int cantidad;
    Scanner input = new Scanner(System.in);
    
    public void solicitarNombreMedicamento(){
        System.out.println("Ingrese el nombre del producto");
        nombre = input.nextLine();
    }
    public void solicitarPresentacion(){
        System.out.println("Ingrese la presentacion del producto");
        presentacion = input.nextLine();        
    }
    public void solicitarTamaño(){
        System.out.println("Ingrese el tamaño o la cantidad del producto");
        tamaño = input.nextInt();
    }
    public void solicitarCantidad(){
        System.out.println("Ingrese la cantidad de unidades disponibles");
        cantidad = input.nextInt();
    }

    @Override
    public String toString() {
        return "ProductoDrogueria{" + "nombre=" + nombre + ", presentacion=" + presentacion + ", tama\u00f1o o cantidad=" + tamaño + ", precio=" + precio + ", Unidades disponibles=" + cantidad + '}';
    }
    
    public void solicitarPrecio(){
        System.out.println("Ingrese el valor del medicamento");
        precio = input.nextInt();
    }
    public ProductoDrogueria(){
        
    }

    public int getCantidad() {
        return cantidad;
    }    

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public ProductoDrogueria(String nombre, String presentacion, int tamaño, int precio, int cantidad) {
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.tamaño = tamaño;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
