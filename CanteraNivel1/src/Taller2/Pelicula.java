package Taller2;

import java.util.Scanner;

public class Pelicula {
    private String nombre;
    private String estado;
    private String comentarios;
    Scanner input = new Scanner(System.in);
    
    public void solicitarNombrePeli(){
        System.out.println("Ingrese el nombre de la pelicula");
        nombre= input.nextLine();
    }
    public void solicitarEstado(){
        System.out.println("Ingrese si la pelicula esta disponible o prestada");
        estado= input.nextLine();
    }
    public void solicitarComentarios(){
        System.out.println("Ingrese comentarios del estado de la pelicula");
        comentarios= input.nextLine();
    }
    public Pelicula(){
        
    }

    public Pelicula(String nombre, String estado, String comentarios) {
        this.nombre = nombre;
        this.estado = estado;
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", estado=" + estado + ", comentarios=" + comentarios+ '}';
    }

    public String getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
