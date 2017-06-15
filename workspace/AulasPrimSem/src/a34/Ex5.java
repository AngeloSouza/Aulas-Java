package a34;

import java.util.Random;

public class Ex5 {
	static int[] mat=new int[15];
	static int[] mat2=new int[15];
	
	public static int fatorial(int x){
		
		if(x==0)
			return 1;
		
		int res=x*(fatorial(x-1));
		
			return res;	
		
	}
	
	public static void main(String[] args) {
		Random r=new Random();
		
		for(int i=0;i<mat.length;i++){
			
			mat[i]=r.nextInt(9);	
		}
		
		for(int i=0;i<mat2.length;i++){
			
			mat2[i]=fatorial(mat[i]);	
		}
		
		for(int j=0;j<mat.length;j++){		
			
			System.out.println(j+" "+mat[j]+" "+mat2[j]);
			
		}
	}

}
