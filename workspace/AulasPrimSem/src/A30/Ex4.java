
package A30;

import java.util.Scanner;


public class Ex4 {
  private static Scanner leia;

public static void main(String[] args)
    {
        leia = new Scanner(System.in);
        System.out.println("digite algo");
        String palavra=leia.nextLine();
        if(palavra.substring(0,3).equalsIgnoreCase("uni"))
        {
            System.out.println("contem");
        }else{
            System.out.println("nao contem");
        }
    }  
}
