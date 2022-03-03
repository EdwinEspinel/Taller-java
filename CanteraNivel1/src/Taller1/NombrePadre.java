package Taller1;

import java.util.Scanner;


public class NombrePadre {
    String NombrePa;
    private Scanner input;
    
    public void NombrePadre()
    {
    solicitarNombre();
    NombrePa = capturarDato();
    }

    public String getNombrePa() {
        return NombrePa;
    }
    
    
    private void solicitarNombre() {
        System.out.println("Por favor el nombre de su padre");
    }   
    
    private String capturarDato() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
