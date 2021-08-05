package chapter6;

public class CarTest2 {

	public static void main(String[] args) {
		Car 자동차1 = new Car("테슬라", "S", "black");
		Car 자동차2 = new Car("현대자동차", "쏘나타", "white");
		Car 자동차3 = new Car();
		Car 자동차4 = new Car("기아자동차", "k8", "red", 280);
		
		
		자동차1.info();
		System.out.println();
		자동차2.info();
		System.out.println();
		자동차3.info();
		System.out.println();
		자동차4.info();
		System.out.println(자동차4.maxSpeed);
		
	}

}
