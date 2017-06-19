package a35;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
	static int n;
	static ArrayList<String> nomes = new ArrayList<String> ();
	static ArrayList<Float> salario = new ArrayList<Float> ();
	static float porcent;
	static float teto;
	

	public void lerInformacao(){
		do{
			System.out.println("informe o nome do funcionario");
			nomes.add(extracted().nextLine());
			System.out.println("informe o salario deste funcionario");
			salario.add(extracted().nextFloat());
			
			System.out.println("deseja continuar?(-1 para sair)");
			n=extracted().nextInt();	
		}while(! (n == -1));
	}

	private Scanner extracted() {
		return new Scanner(System.in);
	}
	
	public void segundaInformacao(){
		System.out.println("informe a porcentagem do ajuste salarial");
		porcent=extracted().nextFloat();
		System.out.println("informe o teto salarial");
		teto=extracted().nextFloat();
	}
	
	public void mini(){
		
		for(int i=0;i<nomes.size();i++){
				nomes.set(i, nomes.get(i).toLowerCase());		
		}
		
	}
	
	public void reajuste(){
		for(int i=0;i<salario.size();i++){
			if(salario.get(i)<teto){
				float resp=salario.get(i)+(salario.get(i)/porcent);
				salario.set(i, resp);
				nomes.set(i, nomes.get(i).toUpperCase());		
			}
		}
	}
	
	public static void main(String[] args) {
		Ex2 c=new Ex2();
		c.lerInformacao();
		c.segundaInformacao();
		c.mini();
		c.reajuste();
		
		for(int i=0;i<salario.size();i++){
			System.out.println(nomes.get(i)+" tem o salario de "+salario.get(i));
		}
		

	}

}
