package Taller4;

public class Matriz {
    String matriz [][] = new String [4][5];
    public void matrices(){
    matriz[0][0] = "01";
    matriz[0][1] = "02";
    matriz[0][2] = "03";
    matriz[0][3] = "04";
    matriz[0][4] = "05";
	
    matriz[1][0] = "06";
    matriz[1][1] = "07";
    matriz[1][2] = "08";
    matriz[1][3] = "09";
    matriz[1][4] = "10";
	
    matriz[2][0] = "11";
    matriz[2][1] = "12";
    matriz[2][2] = "13";
    matriz[2][3] = "14";
    matriz[2][4] = "15";
	
    matriz[3][0] = "16";
    matriz[3][1] = "17";
    matriz[3][2] = "18";
    matriz[3][3] = "19";
    matriz[3][4] = "20";
        for(int i=0;i<=3;i++){
            System.out.print("- ");
            if (i==0 | i==2){
                for (int j=0;j<=4;j++){
                System.out.print(matriz[i][j]+" ");
                }
                System.out.println("");
            }
            if (i==1 | i==3){
                for (int k=4;k>=0;k--){
                System.out.print(matriz[i][k]+" ");
                }
                System.out.println("");
            }
            
        }
    }
    
}