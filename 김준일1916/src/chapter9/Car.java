package chapter9;

public class Car {
	private int serialNum;
	
	public Car(int serialNum) {
		this.serialNum = serialNum;
	}
	
	public void carInfo() {
		System.out.println("시리얼 넘버: " + serialNum + " 차량");
	}
}
