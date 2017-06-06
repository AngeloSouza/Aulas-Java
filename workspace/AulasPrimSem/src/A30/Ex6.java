
package A30;

import java.util.Scanner;


public class Ex6 {
    private static Scanner leia;

	public static void main(String[] args)
    {
        leia = new Scanner(System.in);
        System.out.println("digite algo");
        String palavra=leia.nextLine();
        int cont=0;
        for(int i=0;i<palavra.length();i++)
        {
            if(palavra.charAt(i)=='0' || palavra.charAt(i)=='1'|| palavra.charAt(i)=='2' || palavra.charAt(i)=='3')
            {
                cont++;
            }else if(palavra.charAt(i)=='4' || palavra.charAt(i)=='5'|| palavra.charAt(i)=='6' || palavra.charAt(i)=='7')
            {
                cont++;
            }else if(palavra.charAt(i)=='8' || palavra.charAt(i)=='9')
            {
                cont++;
            }
        }
        System.out.println("a palavra tem "+cont+" numeros d 0 a 9");
    }
}
