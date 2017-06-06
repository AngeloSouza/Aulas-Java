
package A30;

import java.util.Scanner;


public class Ex3 {
    private static Scanner leia;

	public static void main(String[] args)
    {
        leia = new Scanner(System.in);
        System.out.println("digite algo");
        String palavra=leia.nextLine();
        int cont=0;
        for(int i=0;i<palavra.length();i++)
        {
            if(palavra.charAt(i)=='a' || palavra.charAt(i)=='e' || palavra.charAt(i)=='i'|| palavra.charAt(i)=='o' || palavra.charAt(i)=='u')
            {
                cont++;
            }
        }
        System.out.println("a palavra tem "+cont+" vogais");
    }
}
