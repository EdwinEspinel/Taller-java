package Taller1;

import java.util.Scanner;

public class Capital {
    private String ciudad;
    private String pais;
    private Scanner input;
    
    public void Capital (){
        input = new Scanner(System.in);
        solicitarCiudad();
        ciudad = capturarString();
        solicitarPais();
        pais = capturarString();
        
        System.out.println("La cidudad "+ciudad+" es la capital del pais "+pais);
    }
    private void solicitarPais()
    {
        System.out.println("Ingrese por favor el pais del cual dicha ciudad es la capital");
    }
    private void solicitarCiudad()
    {
        System.out.println("Ingrese por favor el nombre de la ciudad capital");
    }
    
    private String capturarString()
    {
        return input.nextLine();
    }
}
