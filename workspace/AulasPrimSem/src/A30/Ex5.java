
package A30;

import java.util.Scanner;

public class Ex5 {
    private static Scanner leia;

	public static void main(String[] args)
    {
        leia = new Scanner(System.in);
        System.out.println("digite algo");
        String palavra=leia.nextLine();
        if(palavra.substring(palavra.length()-3,palavra.length()).equalsIgnoreCase("rio"))
        {
            System.out.println("termina");
        }else{
            System.out.println("nao termina");
        }
    }  
}
