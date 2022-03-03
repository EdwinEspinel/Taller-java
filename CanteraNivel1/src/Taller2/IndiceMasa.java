package Taller2;

import java.util.Scanner;

public class IndiceMasa {
    private String nombre;
    private double peso;
    private double estatura;
    Scanner input = new Scanner(System.in);
    private double IMC;
    private String estado;
    public void EstadoPeso(){
        solicitarNombre();
        nombre=capturarDatoString();
        solicitarPeso();
        peso=capturarDatoDouble();
        solicitarEstatura();
        estatura=capturarDatoDouble();
        IMC=peso/Math.pow(estatura,2);
        if (IMC<18.5){
            estado="Bajo";
        }
        if (IMC>18.5  && IMC<=24.9){
            estado="ideal";
        }
        if (IMC>24.9  && IMC<=30.0){
            estado="un poco superior a el ideal";
        }
        if (IMC>=30.0){
            estado="muy superior al ideal (sobrepeso)";
        }
        System.out.println("Señor(a) "+nombre+" su indice de masa corporal es de "+IMC+" lo cual indica que su peso es "+estado);

    }
    public IndiceMasa(String nombre, int peso, double estatura) {
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
    }
    public IndiceMasa(){
        
    }
    private double capturarDatoDouble(){
        return input.nextDouble();
    }
    private int capturarDato(){
        return input.nextInt();
    }
    private String capturarDatoString(){
        return input.nextLine();
    }
    private void solicitarNombre(){
        System.out.println("Ingrese nombre por favor");
    }
    private void solicitarPeso(){
        System.out.println("Ingrese peso por favor (Kg)");
    }
    private void solicitarEstatura(){
        System.out.println("Ingrese estatura por favor (metros)");
    }
}
