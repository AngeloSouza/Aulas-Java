package a36;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {
	
	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("teste.txt");
		BufferedReader br=new BufferedReader(fr);
		
		while(br.ready()){
			System.out.println("> "+br.readLine());
		}
		
		
	}

}
