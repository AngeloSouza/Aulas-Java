package a32;

public class UsaEstoque {

	public static void main(String[] args) {
		Estoque estoque1,estoque2,estoque3;
		
		estoque1=new Estoque("Impressora Jato de Tinta",13,6);
		estoque2=new Estoque("Monitor LCD 17 polegadas",11,13);
		estoque3=new Estoque("Impressora Jato de Tinta",6,2);
		
		estoque1.darBaixa(5);
		estoque2.repor(7);
		estoque3.darBaixa(4);
		if(estoque1.precisaRepor())
		{
			System.out.println("Estoque 1 precisa de reposiçao.");
		}else{
		    System.out.println("Estoque 1 esta com a quantidade minima preenchida.");
		}
		
		if(estoque2.precisaRepor())
		{
			System.out.println("Estoque 2 precisa de reposiçao.");
		}else{
		    System.out.println("Estoque 2 esta com a quantidade minima preenchida.");
		}
		
		if(estoque3.precisaRepor())
		{
			System.out.println("Estoque 3 precisa de reposiçao.");
		}else{
		    System.out.println("Estoque 3 esta com a quantidade minima preenchida.");
		}
		
		System.out.println(estoque1.mostra());
		System.out.println(estoque2.mostra());
		System.out.println(estoque3.mostra());
		

	}

}
