package Taller2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Drogueria {
    
    private boolean bandera3;
    private int opcion3;
    private List<ProductoDrogueria>Medicamentos;
    Scanner input = new Scanner(System.in);
    private String seleccion;
    private int temp;
    private int factura;
    private int temp2;
    private String temp3;
    
    public void droguerias() throws IOException{
        factura=0;
        bandera3=true;
        Medicamentos=new ArrayList<ProductoDrogueria>();
        do {
            limpiarPantalla();
            menu();
            opcion3 = capturar();
            bandera3 = evaluar(opcion3);
        } while (bandera3 == true);

    }
    private boolean evaluar(int opcion3) throws IOException {
        switch (opcion3) {
            case 1:
                ProductoDrogueria misMedicamentos = new ProductoDrogueria();
                misMedicamentos.solicitarNombreMedicamento();
                misMedicamentos.solicitarPresentacion();
                misMedicamentos.solicitarTamaño();
                misMedicamentos.solicitarPrecio();
                misMedicamentos.solicitarCantidad();
                Medicamentos.add(misMedicamentos);
                return true;
            case 2:
                temp2=0;
                System.out.println("Ingrese medicamento que desea consultar");
                seleccion = capturarString();
                for (ProductoDrogueria drogas:Medicamentos){
                    if(drogas.getNombre().equals(seleccion)){
                        System.out.println(drogas.toString());
                        temp2=1;
                    }
                }
                if(temp2==0){
                    System.out.println("No tenemos el medicamento que desea");
                }
                return true;
            case 3:
                temp2=0;
                System.out.println("Desea realizar una compra nueva o continuar una antigua (N/A)");
                temp3=capturarString();
                if(temp3.equals("N")){
                    factura=0;
                }
                System.out.println("Ingrese medicamento que desea comprar");
                seleccion = capturarString();
                for (ProductoDrogueria drogas:Medicamentos){
                    if(drogas.getNombre().equals(seleccion)){
                        System.out.println("Compra realizada exitosamente");
                        factura=factura+drogas.getPrecio();
                        System.out.println("El valor a pagar es de: "+factura);
                        temp=drogas.getCantidad();
                        temp--;
                        drogas.setCantidad(temp);
                        temp2=1;
                    }
                }
                if(temp2==0){
                    System.out.println("No tenemos el medicamento que desea");
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
        System.out.println("1. Ingresar un medicamento");
        System.out.println("2. Consultar las caracteristicas de un medicamento");
        System.out.println("3. Comprar un medicamento");
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
    private static String capturarString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
