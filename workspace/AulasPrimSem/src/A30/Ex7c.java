package A30;

public class Ex7c {
	public static void main(String[] args) {
        String name = "angelo silva e souza";
        name = name.replaceAll("da|das|do|dos|de|di|du|e ", "");
        String[] array = name.split(" ");
        String ini="";
        for (String s : array){
        	ini += s.charAt(0);     	
        }

		System.out.println(ini.toUpperCase());
	}
}
