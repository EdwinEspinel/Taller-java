package Taller2;

import java.util.Scanner;

public class Usuario {
    private String nombre;
    private int id;
    private int saldo;
    Scanner input = new Scanner(System.in);
    
    public void solicitarNombre(){
        System.out.println("Ingrese el titular de la cuenta");
        nombre = input.nextLine();
    }
    public void solicitarId(){
        System.out.println("Ingrese el id de la cuenta");
        id = input.nextInt();
    }
    public void solicitarSaldo(){
        System.out.println("Ingrese el titular de la cuenta");
        saldo = input.nextInt();
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

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Usuario(String nombre, int id, int saldo) {
        this.nombre = nombre;
        this.id = id;
        this.saldo = saldo;
    }

    public Usuario() {
        
    }
   
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", id=" + id + ", saldo=" + saldo + '}';
    }
}
