package Taller1;

import java.util.Scanner;

public class DatosMascota {
    private String dueño;
    private int edad;
    private String NombreMas;
    private String tipoMas;
    private Scanner input;

    public void DatosMascota() {
    input = new Scanner(System.in);
    
    solicitarNombre();
    dueño = capturarDatoString();
    solicitarNombreMas();
    NombreMas = capturarDatoString(); 
    solicitarEdad();
    edad = capturarDatoInt();
    solicitarTipo();
    tipoMas = capturarDatoString();
    }
    private void solicitarNombre()
    {
        System.out.println("Ingrese por favor el nombre del dueño de la mascota");
    }
    private void solicitarNombreMas()
    {
        System.out.println("Ingrese por favor el nombre de la mascota");
    }
    
    private void solicitarEdad()
    {
        System.out.println("Ingres por favor la edad de la mascota (años)");
    }
    private void solicitarTipo()
    {
        System.out.println("Ingrese que tipo de mascota es (perro, gato...)");
    }
    
    private String capturarDatoString()
    {
        return input.nextLine();
    }
    private int capturarDatoInt()
    {
        return input.nextInt();
    }
    
    
}
