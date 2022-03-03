package Taller3;

public class Figura {
    private int figura;
    private int dimension;

    public void setFigura(int figura) {
        this.figura = figura;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
    
    public void Figura(){
        if (figura==1){
            for (int i=0;i<dimension;i++){
               for(int j=0;j<=i;j++){
                   System.out.print("*");
               }
               System.out.println("");
            }
        }
        if (figura==2){
            int a=0;
            for (int i=dimension-1;i>=0;i--){
                for(int j=0;j<i;j++){
                   System.out.print(" ");
                }
                a=a+1;
                for(int f=0;f<a;f++){
                   System.out.print("*");
                }
                System.out.println("");
               
            }
            }
        if(figura==3){
            int a=0;
            for (int i=dimension-1;i>=0;i--){
                for(int j=0;j<i;j++){
                   System.out.print(" ");
                   if (j>(dimension+1/2)+1){
                       break;
                   }
                }
                a=a+1;
                for(int f=0;f<a;f++){
                    if(f==0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print("**");
                    }
                }                
                System.out.println("");
            }
            int u=(2*a)-1;
            a=(a+3)/3;
            u=u-(2*a);
            for(int k=0;k<a;k++){
                System.out.print(" ");
            }
            for(int k=0;k<u;k++){
                System.out.print("*");
            }
            for(int k=0;k<a;k++){
                System.out.print(" ");
            }
            System.out.println("");
            int h=a;
            for(int o=0;o<h;o++){
                for(int k=0;k<a;k++){
                    System.out.print(" ");
                }
                for(int k=0;k<u;k++){
                    System.out.print("*");
                }
                for(int k=0;k<a;k++){
                    System.out.print(" ");
                }
                System.out.println(" ");
                u=u+2;
                a=a-1;
            }
            }
    }
}
