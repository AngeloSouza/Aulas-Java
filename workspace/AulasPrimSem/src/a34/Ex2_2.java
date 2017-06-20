package a34;

import java.util.Random;
import java.util.Scanner;

public class Ex2_2 {
	static int[][] mat=new int[4][4]; 

	private void lerInformacao(){
		Random r=new Random();
		Scanner in=new Scanner(System.in);	
		for(int j=0;j<mat.length;j++){
			for(int i=0;i<mat.length;i++){
				//System.out.println("informe um numero para a posiçao "+j+"x"+i);
				//mat[j][i]=in.nextInt();
				mat[j][i]=r.nextInt(20);
				
			}
		}
		in.close();
	}

	
	private int calcular(int x,int y,int z,int w){
		int resp=x+y+z+w;
		return resp;
	}

	
	public static void main(String[] args) {
		Ex2_2 c=new Ex2_2();
		c.lerInformacao();

		System.out.println("a soma da primeira diagonal é "+c.calcular(mat[0][0],mat[1][1],mat[2][2],mat[3][3]));
		System.out.println("a soma da segunda diagonal é "+c.calcular(mat[3][0],mat[2][1],mat[1][2],mat[0][3]));

	}
}
