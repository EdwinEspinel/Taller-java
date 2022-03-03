package Taller4;

import java.util.Scanner;



public class Cuadro {
    public void cuadrados(){
        int fila,columna;
        Scanner input = new Scanner(System.in);
        int matriz [][] = new int [10][10];
        for(int i=0;i<=9;i++){
            for(int j=0;j<=9;j++){
                int temp1=i+1;
                int temp2=j+1;
                matriz[i][j]=temp1*temp2;
                if(i==9){
                    System.out.print(+temp2+" x "+temp1+"  ");
                }
                else{
                    System.out.print(" "+temp2+" x "+temp1+"  ");
                }
                
            }
            System.out.println("");
        }
        System.out.println("Ingrese la fila de la cual desea ver el resultado ");
        fila=input.nextInt();
        System.out.println("Ingrese la columna de la cual desea ver el resultado ");
        columna=input.nextInt();
        System.out.println("El resultado a su seleccion es: "+(fila*columna));
    }
}
