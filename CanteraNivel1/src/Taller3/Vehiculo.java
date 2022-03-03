package Taller3;

import java.util.Scanner;

public class Vehiculo {
    Scanner input = new Scanner(System.in);
    private String nombre;
    private String marca;
    private int placa;
    private int telefono;
    
    public void solicitarPlaca(){
        System.out.println("Ingrese la placa del vehiculo");
        placa = input.nextInt();
    }
    public void solicitarMarca(){
        System.out.println("Ingrese la marca del vehiculo");
        marca = input.nextLine();
    }
    public void solicitarNombreDueño(){
        System.out.println("Ingrese el nombre del dueño del vehiculo");
        nombre= input.nextLine();
    }
    public void solicitarTelefonoDueño(){
        System.out.println("Ingrese el telefono del dueño del vehiculo");
        telefono = input.nextInt();
    }
    @Override
    public String toString() {
        return "Vehiculo{" + "input=" + input + ", nombre=" + nombre + ", marca=" + marca + ", placa=" + placa + ", telefono=" + telefono + '}';
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
    
    
}
