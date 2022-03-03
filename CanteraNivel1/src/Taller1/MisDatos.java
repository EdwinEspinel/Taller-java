package Taller1;

import java.util.Scanner;


public class MisDatos {
    private String nombre;
    private String apellidos;
    private int edad;
    private double estatura;
    private Scanner input;
    private int opcion;

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    
            
    public void MisDatos()
    {
    input = new Scanner(System.in);
    solicitarNombre();
    nombre = capturarDatoString();
    solicitarApellido();
    apellidos = capturarDatoString();
    if (opcion==2)
    {
       solicitarEdad();
       edad = capturarDatoInt();
       solicitarEstatura();
       estatura = capturarDatoDouble();    
       
    }
    
    }
    
    private void solicitarNombre() 
    {
        System.out.println("Por favor su nombre");
    }   
    
    private void solicitarApellido()
    {
        System.out.println("Por favor apellido");
    }
    private void solicitarEdad() 
    {
        System.out.println("Por favor su edad");
    }   
    
    private void solicitarEstatura() 
    {
        System.out.println("Por favor su estatura");
    }   
    
    private String capturarDatoString()
    {
        return input.nextLine();
    }

    private int capturarDatoInt()
    {
        return input.nextInt();
    }

    private double capturarDatoDouble()
    {
        return input.nextDouble();
    }
}
