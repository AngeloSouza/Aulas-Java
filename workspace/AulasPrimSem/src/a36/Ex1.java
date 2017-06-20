package a36;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex1 {
	
	public static String[] leLinha(String linha){
		
	}
	
	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("teste.txt");
		BufferedReader br=new BufferedReader(fr);
		
		while(br.ready()){
			System.out.println("> "+br.readLine());
		}
		
		br.close();
		fr.close();
	
		
		FileWriter fw=new FileWriter("teste.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("CQD");
		
		bw.close();
		fw.close();
		
	}

}
