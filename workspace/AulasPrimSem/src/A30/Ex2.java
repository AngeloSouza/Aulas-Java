
package A30;

import java.util.Scanner;


public class Ex2 {
    private static Scanner leia;

	public static void main(String[] args)
    {
        leia = new Scanner(System.in);
        System.out.println("digite algo");
        String palavra=leia.nextLine();
        System.out.println("Resultado= "+palavra.toUpperCase());
    }
}
