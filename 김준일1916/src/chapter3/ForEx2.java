package chapter3;

public class ForEx2 {

	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(j % 2 == 0) {
					continue;
				}
				System.out.println(i + " X " + j + " = " + (i * j));
			}	
		}
		
		// 2 X 1 = 2
		// 2 X 2 = 4
		//  ...
		// 2 X 9 = 18


	}

}
