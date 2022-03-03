package Taller4;

public class Aleatorio {
    int [] vector = new int[20];
    public void aleatorios(){
        for(int i=0;i<19;i++){
            vector[i]=(int)(Math.random()*100)+1;
        }
        System.out.print("Numeros pares: ");
        int temp=0;
        int k=0;
        while(k<19){
            if(vector[k]%2==0){
                if(temp==1){
                System.out.print(", ");
                }
                temp=0;
                System.out.print(vector[k]);
                temp=1;
            }
            k++;
        }
            
        /*for(int i=0;i<19;i++){
            if(vector[i]%2==0){
                if(temp==1){
                System.out.print(", ");
                }
                temp=0;
                System.out.print(vector[i]);
                temp=1;
            }
        }*/
        System.out.println(".");
        System.out.print("Numeros impares: ");
        temp=0;
        for(int j=0;j<19;j++){            
            if(vector[j]%2!=0){
                if(temp==1){
                System.out.print(", ");
                temp=0;
                }
                System.out.print(vector[j]);
                temp=1;
            }            
        }
        System.out.println(".");
    }
}
