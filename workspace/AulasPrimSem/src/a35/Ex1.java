package a35;

import java.util.Scanner;

public class Ex1 {
	
	private Scanner in;

	private int lerInformacao(){
		in = new Scanner(System.in);	
		System.out.println("informe o numero de termos da serie de fibonaci ");
		int n=in.nextInt();
		return n;
	}
	
	private void mostraSequencia(int n){
		int[] mat=new int[n];
		mat[0]=1;
		mat[1]=1;
		System.out.println(mat[0]);
		System.out.println(mat[1]);
		for(int i=2;i<mat.length;i++){		
			mat[i]=mat[i-1]+mat[i-2];
			System.out.println(mat[i]);
		}
	}
	
	public static void main(String[] args) {
		Ex1 c=new Ex1();
		int n=c.lerInformacao();
		c.mostraSequencia(n);
		
	}

}
