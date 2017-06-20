package a34;

import java.util.Scanner;

public class Ex3 {
	static float[][] mat=new float[4][3];
	static int linha;
	static float soma;

	private void lerInformacao(){
		Scanner in=new Scanner(System.in);	
		for(int j=0;j<mat.length;j++){
			for(int i=0;i<mat[2].length;i++){
				System.out.println("informe um numero para a posiçao "+j+"x"+i);
				mat[j][i]=in.nextFloat();
			}
		}
		in.close();
	}
	
	private void lerLinha(){
		Scanner in=new Scanner(System.in);	
		
		System.out.println("informe a linha a ser somada");
		linha=in.nextInt();
		in.close();
	}
	
	private float calcular(int l){
		for(int i=0;i<mat[l].length;i++){
			
			soma += mat[l][i];
		}
		return soma;
	}
	
	public static void main(String[] args) {
		boolean flag=true;
		Ex3 c=new Ex3();
		c.lerInformacao();
		c.lerLinha();
		do{
			
			if(linha>=0 && linha<=3){
				System.out.println("a soma da linha "+linha+" é "+c.calcular(linha));
				flag = false;
			}else{
				System.out.println("numero d linha invalido deve ser entre 0 e 3");
				c.lerLinha();
			}
		}while(flag);
		
		for(int i=0;i<mat.length;i++){		
			for(int j=0;j<mat[2].length;j++){
				System.out.print(mat[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}

	}

}
