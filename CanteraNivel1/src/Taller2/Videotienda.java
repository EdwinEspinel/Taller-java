package Taller2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Videotienda {
    private boolean bandera2;
    private int opcion2;
    private List<Pelicula>peliculas;
    Scanner input = new Scanner(System.in);
    private String seleccion;
    private String comentar;
    private int coment;
    
    public void videoTiendas() throws IOException{
        do {
            bandera2=true;
            limpiarPantalla();
            menu();
            opcion2 = capturar();
            bandera2 = evaluar(opcion2);
        } while (bandera2 == true);

    }
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    private void menu() {
        System.out.println("Qué dese hacer?");
        System.out.println("1. Ingresar una pelicula al inventario");
        System.out.println("2. Consultar las peliculas disponibles");
        System.out.println("3. Solicitar una pelicula en prestamo");
        System.out.println("4. Devolver una pelicula");
        System.out.println("0. Salir");
    }
    private static int capturar() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private boolean evaluar(int opcion2) throws IOException {
        switch (opcion2) {
            case 1:
                Pelicula peliculaAgregar = new Pelicula();
                peliculaAgregar.solicitarNombrePeli();
                peliculaAgregar.solicitarEstado();
                peliculaAgregar.solicitarComentarios();
                peliculas.add(peliculaAgregar);
                
                return true;
            case 2:
                for (Pelicula mipelicula:peliculas){
                    if(mipelicula.getEstado().equals("Disponible")){
                        System.out.println(mipelicula.toString());
                    }
                }
                return true;
            case 3:
                System.out.println("Ingrese el nombre de la pelicula");
                seleccion = capturarString();
                for (Pelicula mipelicula:peliculas){
                    if(mipelicula.getNombre().equals(seleccion)){
                        System.out.println(mipelicula.toString());
                        if(mipelicula.getEstado().equals("Disponible")){
                            mipelicula.setEstado("Prestada");
                            System.out.println("Prestamo realizado correctamente");
                        }
                        else{
                            System.out.println("La pelicula solicitada no esta disponible");
                        }
                    }
                    else{
                        System.out.println("No poseemos la pelicula solicitada");
                    }
                }
                
                return true;
            case 4:
                System.out.println("Ingrese el nombre de la pelicula");
                seleccion = capturarString();
                for (Pelicula mipelicula:peliculas){
                    if(mipelicula.getNombre().equals(seleccion)){
                        if(mipelicula.getEstado().equals("Prestada")){
                            mipelicula.setEstado("Disponible");
                            System.out.println("Devolución realizada correctamente");
                            System.out.println("Si desea realizar un comentario de la pelicula escriba 1, sino escriba 0");
                            coment = capturar();
                            if(coment==1){
                                System.out.println("Ingrese el comentario que desea realizar");
                                seleccion = capturarString();
                                mipelicula.setComentarios(seleccion);
                            }
                        }
                        else{
                            System.out.println("La pelicula que desea devolver no es de nosotros");
                        }
                    }
                    else{
                        System.out.println("La pelicual que desea devolver no es de nosotros");
                    }
                }
                
                return true;
            case 0:
                return false;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
        
    }
    public Videotienda() {
        peliculas = new ArrayList<Pelicula>();
    }
    private static String capturarString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
    
}
