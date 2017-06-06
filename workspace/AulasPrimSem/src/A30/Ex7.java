package A30;

import java.util.Scanner;

public class Ex7 {

    private static Scanner leia;

	public static void main(String[] args) {
        leia = new Scanner(System.in);
        System.out.println("digite o nome");
        String palavra = leia.nextLine();
        String nom = "";
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == ' ') {
                if (palavra.substring(i + 1, i + 2).equalsIgnoreCase("d")) {
                    if (palavra.substring(i + 2, i + 3).equalsIgnoreCase("a") || palavra.substring(i + 2, i + 3).equalsIgnoreCase("e") || palavra.substring(i + 2, i + 3).equalsIgnoreCase("i") || palavra.substring(i + 2, i + 3).equalsIgnoreCase("u") || palavra.substring(i + 2, i + 3).equalsIgnoreCase("o")) {
                        if (palavra.substring(i + 3, i + 5).equalsIgnoreCase("s ") || palavra.substring(i + 3, i + 4).equalsIgnoreCase(" ")) {
                            
                        } else {
                            nom = nom + palavra.charAt(i+1);
                        }

                    }
                } else if (palavra.substring(i + 1, i + 3).equalsIgnoreCase("e ")) {

                } else {
                    nom = nom + palavra.charAt(i+1);
                }
                
               
            }else if(i==0){
                nom = nom + palavra.charAt(i);
            }
        }
        System.out.println(nom.toUpperCase());
    }
}
