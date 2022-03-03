package Taller4;

public class Primo {
    public void primos(){
        int temp2=0;
        for(int i=1000;i>1;i--){
            int temp=0;
            
            for(int j=1;j<1000;j++){
                if(i%j==0){
                    temp=temp+1;
                }
                if(temp==3){
                    break;
                }
            }
            if(temp==2){
                if(temp2==1){
                System.out.print(", ");
                }
                System.out.print(i);
                temp2=1;
            }
        }
        System.out.print(", ");
        System.out.println("1.");
    }
}
