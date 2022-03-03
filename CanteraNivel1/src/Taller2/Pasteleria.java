package Taller2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Pasteleria {
    Scanner input = new Scanner(System.in);
    private boolean bandera5;
    private int opcion5;
    private List<Torta>tortas;
    private List<Pedido>pedidos;
    private List<Venta>ventas;
    
    public void ElGordo() throws IOException{
        bandera5=true;
        tortas=new ArrayList<Torta>();
        pedidos=new ArrayList<Pedido>();
        do {
            limpiarPantalla();
            menu();
            opcion5 = capturar();
            bandera5 = evaluar(opcion5);
        } while (bandera5 == true);
    }
    private boolean evaluar(int opcion3) throws IOException {
        switch (opcion3) {
            case 1:
                Torta misTortas = new Torta();
                misTortas.solicitarSabor();                      
                misTortas.solicitarPorciones();
                misTortas.solicitarDecoraciones();
                misTortas.solicitarCantidad(); 
                tortas.add(misTortas);
                return true;
            case 2:
                System.out.println("Ingrese la fecha de hoy por favor");
                int fechaTemp=input.nextInt();
                Pedido misPedidos = new Pedido();
                misPedidos.solicitarNombre();
                pedidos.add(misPedidos);
                System.out.println("Ingrese el sabor que desea");
                String saborTemp=input.nextLine();
                System.out.println("Ingrese la cantidad de tortas que desea");
                int cantidadTemp=input.nextInt();
                misPedidos.setCantidad(cantidadTemp);
                misPedidos.setSabor(saborTemp);
                Venta misVentas = new Venta();
                int contador=0;
                for (Venta iteradorVentas:ventas){
                    if(iteradorVentas.getSabor().equals(saborTemp)){
                        if (iteradorVentas.getFecha()==fechaTemp){
                            int cantTemp=iteradorVentas.getCantidad();
                            int cantTemp2=cantTemp+cantidadTemp;
                            iteradorVentas.setCantidad(cantTemp2);
                            contador=1;
                            break;
                        }
                    }
                }
                if (contador==1){
                    misVentas.setCantidad(cantidadTemp);
                    misVentas.setFecha(fechaTemp);
                    misVentas.setSabor(saborTemp);
                }
                return true;
            case 3:
                System.out.println("ingrese por favor el dia del que desea ver la ventas");
                int dia=input.nextInt();
                for (Venta iteradorVentas:ventas){
                    if(iteradorVentas.getFecha()==dia){
                        System.out.println(iteradorVentas.toString());
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
    private void menu() {
        System.out.println("Qué dese hacer?");
        System.out.println("1. Ingresar una torta al inventario");
        System.out.println("2. Ingresar un pedido al inventario");
        System.out.println("3. Determinar cuantas ventas se han realizado y de cada torta");
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
}
