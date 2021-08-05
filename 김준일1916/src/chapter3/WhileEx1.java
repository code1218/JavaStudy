package chapter3;

public class WhileEx1 {

	public static void main(String[] args) {
		int i = 1;
		
		while(i < 10) {
			if(i % 2 == 0) {
				i++;
				continue;
			}
			
			System.out.println("2 X " + i + " = " + (2 * i));
			i++;
		}

	}

}
