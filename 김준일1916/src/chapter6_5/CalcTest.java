package chapter6_5;

public class CalcTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		int num1 = 30, num2 = 5;
		
		int[] t = new int[4];
		
		t[0] = c.add(num1, num2);
		t[1] = c.sub(num1, num2);
		t[2] = c.times(num1, num2);
		t[3] = c.divide(num1, num2);
		
		/*
		for(int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
		*/
		
		for(int i : t) {
			System.out.println(i);
		}
		
		System.out.println(Calc.total(t));
		
		System.out.println(c.divide(100, 0));

	}

}
