package Taller3;

import java.util.Scanner;

public class Calcular {
    private int a;
    private int b;
    Scanner input = new Scanner(System.in);
    public void Calculos(){
        System.out.println("Ingrese el numero del cual desea visualizar la tabla de multiplicar");
        a=input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+" X "+i+" = "+a*i );
        }
        
    }
    public Calcular(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Calcular() {
    }
    
}
