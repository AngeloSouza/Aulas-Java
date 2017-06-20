package a35;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
	private static ArrayList<String> nome = new ArrayList<String> ();;
	
	public void lerInformacao(){
		Scanner in=new Scanner(System.in);
		for(int i=0;i<3;i++){
			
			System.out.println("informe o nome do funcionario");
			nome.add(in.nextLine());
			
		}
		in.close();
	}
	
	
	public void organizar(){
		String aux;
		boolean flag;
		for(int i = 0; i < nome.size(); ++i)
		{
			flag = true;
			for(int j = 0; j < (nome.size() - 1); ++j)
			{
				if(nome.get(j).compareTo(nome.get(j+1))>0)
				{
					aux = nome.get(j);
					nome.set(j, nome.get(j+1));
					nome.set(j+1, aux);
					flag = false;
					}
				}
			if(flag)
			{
				break;
			}
		}
		
		for (int i = 0; i < nome.size(); ++i)
		{
			System.out.println(nome.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		Ex5 c=new Ex5();
		c.lerInformacao();
		c.organizar();

	}

}
