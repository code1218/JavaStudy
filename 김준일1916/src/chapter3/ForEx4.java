package chapter3;

public class ForEx4 {

	public static void main(String[] args) {
		// ¹Ýº¹¹®
		int[] num = {1,2,3,4,5,6,7,8,9};
		String[] str = {"a", "b", "c", "d"};
		char[] ch = {'a', 'b', 'c', 'd'};
		
		int[] num2 = new int[10];
		
		for(int i = 0;i < 10;i++) {
			System.out.println(i);
		}
		
		for(int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}
		
		for(int i =0; i < num2.length; i++) {
			num2[i] = (i*100) + 100;
		}
		
		for(int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}
		

	}

}
