package chapter3;

public class ForEx1 {

	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i < 10; i++) {
			sum1 = i + 2;
			sum2 = i + 3;
			System.out.println("sum1: " + sum1 + " sum2: " + sum2);
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
