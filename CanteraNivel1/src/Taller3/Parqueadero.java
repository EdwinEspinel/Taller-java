package Taller3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parqueadero {
    Scanner input = new Scanner(System.in);
    private boolean bandera2;
    private int opcion2;
    private List<Vehiculo>vehiculos;
    private int placa;
    public void ElGuardian() throws IOException{
        bandera2=true;
        vehiculos=new ArrayList<Vehiculo>();
        do {
            limpiarPantalla();
            menu();
            opcion2 = capturar();
            bandera2 = evaluar(opcion2);
        } while (bandera2 == true);
    }
    private void menu() {
        System.out.println("Qué dese hacer?");
        System.out.println("1. Ingresar un nuevo numero");
        System.out.println("2. Consultar un contacto");
        System.out.println("3. Eliminar un contacto");
        System.out.println("0. Salir");
    }
    private static int capturar() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    private boolean evaluar(int opcion3) throws IOException {
        switch (opcion3) {
            case 1:
                Scanner inp = new Scanner(System.in);
                System.out.println("Ingrese la placa del vehiculo");
                placa=inp.nextInt();
                int temp=0;
                for (Vehiculo iteradorContactos:vehiculos){
                    if(iteradorContactos.getPlaca()==placa){ 
                        System.out.println("Este vehiculo ya se encuentra dentro del parqueadero");
                        temp=1;
                        break;
                    }
                }
                if (temp==0){
                    Vehiculo misVehiculos = new Vehiculo();
                    misVehiculos.setPlaca(placa);
                    misVehiculos.solicitarMarca();
                    misVehiculos.solicitarNombreDueño();
                    misVehiculos.solicitarTelefonoDueño();
                    vehiculos.add(misVehiculos);
                }
                return true;
            case 2:
                Scanner inp2 = new Scanner(System.in);
                System.out.println("Ingrese la placa del vehiculo que desea consultar");
                placa=inp2.nextInt();
                int temp2=0;
                for (Vehiculo iteradorContactos:vehiculos){
                    if(iteradorContactos.getPlaca()==placa){ 
                        iteradorContactos.toString();
                        temp2=1;
                    }
                }
                if (temp2==0){
                    System.out.println("El vehiculo no se encuentra en el parqueadero");
                }
                return true;
            case 3:
                Scanner inp3 = new Scanner(System.in);
                int i=1;
                int a;
                System.out.println("Seleccione el contacto que desea eliminar");
                for (Vehiculo iteradorContactos:vehiculos){
                    System.out.print(i+"  ");
                    iteradorContactos.toString();
                    i++;
                    }
                a=inp3.nextInt();
                for (Vehiculo iteradorContactos:vehiculos){
                    if(a==i){
                        vehiculos.remove(iteradorContactos);
                        break;
                    }
                    i++;
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
}
