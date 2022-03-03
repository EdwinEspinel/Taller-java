
package Taller1;

import java.util.Scanner;


public class NombreMadre {
    String NombreMa;
    private Scanner input;
    
    public void NombreMadre()
    {
    solicitarNombre();
    NombreMa = capturarDato();
    }

    public String getNombreMa() {
        return NombreMa;
    }
    
    private void solicitarNombre() {
        System.out.println("Por favor el nombre de su madre");
    }   
    
    private String capturarDato() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
