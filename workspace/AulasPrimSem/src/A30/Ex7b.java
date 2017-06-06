package A30;

import java.text.Normalizer;

public class Ex7b {

	public static void main(String[] args) {
		String name = "ângelo silva souza";
		name = Normalizer.normalize(name, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "" );
		name = name.replaceAll("da|das|do|dos|de|di|du|e ", "") ;
		name = name.replaceAll("\\B\\w\\s*", "") ;
		
		System.out.println(name.toUpperCase());

	}

}
