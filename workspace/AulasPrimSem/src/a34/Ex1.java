package a34;

import java.util.Scanner;

public class Ex1 {
	static int r;
	static int ini;
	static int resp[]=new int[10];
	private void conta(){
		resp[0]=ini+r;
		for(int i=1;i<resp.length;i++){
			resp[i]=resp[i-1]+r;
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Ex1 c=new Ex1();
		System.out.println("informe o numero inicial para a P.A. ");
		ini=in.nextInt();
		System.out.println("informe a rasao para a P.A. ");
		r=in.nextInt();
		c.conta();
		System.out.println(ini);
		for(int i=1;i<resp.length;i++){
			System.out.println(resp[i-1]+r);
		}
		

	}

}
