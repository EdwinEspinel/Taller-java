package Taller2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TallerMotos {
    private boolean bandera4;
    private int opcion4;
    private List<Moto>Motos;
    Scanner input = new Scanner(System.in);
    private int seleccion;
    private int temp;
    private String temp2;
    
    public void TallerMaquinista() throws IOException{
        bandera4=true;
        Motos=new ArrayList<Moto>();
        do {
            limpiarPantalla();
            menu();
            opcion4 = capturar();
            bandera4 = evaluar(opcion4);
        } while (bandera4 == true);
    }
    private boolean evaluar(int opcion3) throws IOException {
        switch (opcion3) {
            case 1:
                Moto motoServicio = new Moto();
                motoServicio.solicitarMarca();
                motoServicio.solicitarDueño();
                motoServicio.solicitarComentarios();
                motoServicio.solicitarPlaca();
                Motos.add(motoServicio);
                System.out.println("Se ha ingresado exitosamente el vehiculo");
                return true;
            case 2:
                System.out.println("Ingrese la placa del vehiculo");
                seleccion = capturar();
                for (Moto iteradorMoto:Motos){
                    if(iteradorMoto.getPlaca()==seleccion){
                        System.out.println("Ingrese los arreglos que se realizaron");
                        String arreglos = input.nextLine();
                        iteradorMoto.setArreglos(arreglos) ;   
                        temp=1;
                    }  
                }
                if(temp==0){
                    System.out.println("Placa incorrecta");
                }
                return true;
            case 3:
                temp=0;
                System.out.println("Ingrese la placa del vehiculo que desea retirar");
                seleccion = capturar();
                for (Moto misMotos:Motos){
                    if(misMotos.getPlaca()==seleccion){
                        Scanner inp = new Scanner(System.in);
                        System.out.println(misMotos.toString());
                        System.out.println("Desea retirar la moto (S/N)");
                        temp2=inp.nextLine();
                        if(temp2.equals("S")){
                           Motos.remove(misMotos);
                           temp=1;
                           break;
                        }                            
                    }
                }
                if(temp==0){
                    System.out.println("Su moto no se encuentra en nuestro taller o la placa ingresada es incorrecta");
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
    private void menu() {
        System.out.println("Qué dese hacer?");
        System.out.println("1. Ingresar una moto");
        System.out.println("2. añadir arreglos");
        System.out.println("3. Retirar una moto");
        System.out.println("0. Salir");
    }
    private int capturar() {
        return input.nextInt();
    }
    private void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
