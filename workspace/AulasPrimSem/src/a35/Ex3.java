package a35;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
	private static ArrayList<String> nomes = new ArrayList<String> ();
	
	public void consulta(){
		Scanner in=new Scanner(System.in);
		System.out.println("informe o indice que voce gostaria de consultar");
		int i =in.nextInt();
		if(i>=0 && i<nomes.size()){
			System.out.println(nomes.get(i));
		}else{
			System.out.println("indice informado invalido!");
		}
	}

	public void lerInformacao(){
		System.out.println("informe a quantidade de numeros que voce quer armazenar");
		int num=new Scanner(System.in).nextInt();
		for(int i =0;i<num;i++){
			System.out.println("informe o nome:");
			nomes.add(new Scanner(System.in).nextLine());
		}
	}
	
	public static void main(String[] args) {
		Ex3 c=new Ex3();
		c.lerInformacao();
		c.consulta();

	}

}
