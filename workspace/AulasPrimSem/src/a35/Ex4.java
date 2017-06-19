package a35;

public class Ex4 {
	private static int[] num={5, 7, 9, 2};
	
	public void exibir(){
		for(int i=0;i<num.length;i++){
			
			System.out.println(num[i]+" - "+num[(num.length-i)-1]);
			
		}
	}

	public static void main(String[] args) {
		Ex4 c=new Ex4();
		c.exibir();

	}

}
