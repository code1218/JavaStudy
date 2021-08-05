package chapter9;

/**
 * 
 * 디자인 패턴
 * 싱글톤 패턴
 * 객체를 유일하게 하나만 생성해서 공유하는 기법
 * 생성자의 접근지정자가 private이다.
 */

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	private Car c;
	private int serialNum = 20210000;

	private CarFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public Car createCar() {
		serialNum++;
		return new Car(serialNum);
	}
	
	public static CarFactory getInstance() {
		return instance;
	}
}






