package chapter6;

public class CarArrayTest {

	public static void main(String[] args) {
		Car[] 차고 = new Car[5];
		
		int 학년1 = 1;
		int[] 학년 = new int[3];
		
		학년[0] = 학년1;
		학년[1] = 2;
		
		
		//인스턴스 주소값
		Car 테슬라s = new Car();
		System.out.println(테슬라s);
		차고[0] = 테슬라s;
		차고[1] = new Car();
		차고[2] = new Car();
		차고[3] = new Car();
		차고[4] = new Car();
		
		차고[0].제조사 = "테슬라";
		차고[1].제조사 = "기아자동차";
		차고[2].제조사 = "볼보";
		
		

	}

}
