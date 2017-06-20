package a34;

import java.util.Scanner;

public class Ex1_2 {
	static String[] nome=new String[8];
	static float[][] nota=new float[8][3]; 
	static int i;
	
	private void lerInformacao(){
		Scanner in=new Scanner(System.in);	
		
		System.out.println("informe o nome do aluno");
		nome[i]=in.nextLine();
		System.out.println("informe a nota 1");
		nota[i][0]=in.nextFloat();
		System.out.println("informe a nota 2");
		nota[i][1]=in.nextFloat();
		System.out.println("informe a nota 3");
		nota[i][2]=in.nextFloat();
		in.close();	
	}

	private void mostraInformaçao(){
		System.out.println("Nomes------N1---N2---N3-----Media");
		for(int i=0;i<nota.length;i++){		
				System.out.println(nome[i]+"------"+nota[i][0]+"---"+nota[i][1]+"---"+nota[i][2]+"-----"+(nota[i][0]+nota[i][1]+nota[i][2])/3);
		}
	}
	
	public static void main(String[] args) {
		Ex1_2 c=new Ex1_2();
		for(i=0;i<nota.length;i++){
			c.lerInformacao();
		}
		c.mostraInformaçao();

	}

}
