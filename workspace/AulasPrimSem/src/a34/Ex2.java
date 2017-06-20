package a34;

import java.util.Scanner;

public class Ex2 {
	static int x;
	static int y;
	static String simb;
	static int cont=1;
	static String tab[][]= { {"/","1","2","3"}, {"1","-","-","-"}, {"2","-","-","-"}, {"3","-","-","-"} };
	
	private void mostraTabuleiro(){
		
		for(int i=0;i<tab.length;i++){		
			for(int j=0;j<tab.length;j++){
				System.out.print(tab[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

	private void defineSimbolo(){	
		if(cont%2==0){
			simb="O";
		}else{
			simb="X";
		}
	}

	private void lerPosicao(){
		Scanner in=new Scanner(System.in);	
		
		System.out.println("informe a linha");
		x=in.nextInt();
		System.out.println("informe a coluna");
		y=in.nextInt();
		in.close();
	}
	
	private void validaJogada(){
		
		if(tab[x][y]=="-" && (y>1 && y<=3) && (x>=1 && x<=3)){
			tab[x][y]=simb;
		}else{
			System.out.println("posiçao invalida");
		}
	}
	
	public static void main(String[] args) {	
		Ex2 jogador=new Ex2();
		
		jogador.mostraTabuleiro();
		do{
			jogador.defineSimbolo();
			jogador.lerPosicao();
			jogador.validaJogada();
			jogador.mostraTabuleiro();
			cont++;
		}while(cont<9);
		
	}

}
