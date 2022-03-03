package Taller2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    private int opcion;
    private boolean bandera;
    private List<Usuario>usuarios;
    Scanner input = new Scanner(System.in);
    public void Bancos() throws IOException{
        bandera=true;
        usuarios=new ArrayList<Usuario>();
        do {
            limpiarPantalla();
            menu();
            opcion = input.nextInt();
            bandera = evaluar(opcion);
        } while (bandera == true);
    }
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    private static void menu() {
        System.out.println("Que transacción desea realizar?");
        System.out.println("1. Ingresar un cliente");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Consignar dinero");
        System.out.println("4. Consultar saldo");
        System.out.println("0. Salir del taller");
        
    }
    private boolean evaluar(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                Usuario nuestroUsuarios = new Usuario();
                nuestroUsuarios.solicitarNombre();
                nuestroUsuarios.solicitarId();
                nuestroUsuarios.solicitarSaldo();
                usuarios.add(nuestroUsuarios);
                return true;
            case 2:
                System.out.println("Ingrese el id de la cuenta");
                int idTemp=input.nextInt();
                System.out.println("Ingrese el valor a retirar");
                int retiro=input.nextInt();
                int temp=0,temp2=0;
                for (Usuario iteradorUsuarios:usuarios){
                    if(iteradorUsuarios.getId()==(idTemp)){
                        temp=1;
                        if (iteradorUsuarios.getSaldo()>=retiro){
                            int cantTemp=iteradorUsuarios.getSaldo();
                            int cantTemp2=cantTemp-retiro;
                            iteradorUsuarios.setSaldo(cantTemp2);
                            System.out.println("Retiro realizado satisfactoriamente, su nuevo saldo es de: "+ cantTemp2);
                            temp2=1;
                            break;
                        }
                        if(temp2==0){
                            System.out.println("No posee saldo suficiente para este retiro");
                        }
                    }
                }
                if (temp==0){
                    System.out.println("La cuenta que desea consultar no existe en nuestro banco");
                }
                return true;
            case 3:
                System.out.println("Ingrese el id de la cuenta");
                int idTemp2=input.nextInt();
                System.out.println("Ingrese el valor a consignar");
                int consignacion=input.nextInt();
                int temp4=0;
                for (Usuario iteradorUsuarios:usuarios){
                    if(iteradorUsuarios.getId()==(idTemp2)){
                        temp4=1;
                        int cantTemp=iteradorUsuarios.getSaldo();
                        int cantTemp2=cantTemp+consignacion;
                        iteradorUsuarios.setSaldo(cantTemp2);
                        System.out.println("Consignacion realizada satisfactoriamente, su nuevo saldo es: "+cantTemp2);
                    }
                }
                if (temp4==0){
                    System.out.println("La cuenta que desea consultar no existe en nuestro banco");
                }
                return true;
            case 4:
                System.out.println("Ingrese el id de la cuenta");
                int idTemp3=input.nextInt();
                int temp5=0;
                for (Usuario iteradorUsuarios:usuarios){
                    if(iteradorUsuarios.getId()==(idTemp3)){
                        temp5=1;
                        System.out.println("La cuenta a nombre de "+iteradorUsuarios.getNombre()+" tiene un saldo de: "+ iteradorUsuarios.getSaldo());
                    }
                }
                if (temp5==0){
                    System.out.println("La cuenta que desea consultar no existe en nuestro banco");
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
