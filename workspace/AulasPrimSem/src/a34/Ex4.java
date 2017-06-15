package a34;

import java.lang.Math;

public class Ex4 {
	static int[] mat=new int[11];

	public static void main(String[] args) {
		for(int i=0;i<mat.length;i++){		
			
			mat[i]=(int) Math.pow(2.0, i);
			
		}
		
		for(int i=0;i<mat.length;i++){		
			
			System.out.println(mat[i]);
		}

	}

}
