package chapter6_2;

public class Subway {
	private String subwayNumber; //����ö��ȣ
	private int passengerCount; //ž������ �°���
	private int money; //����
	
	public Subway(String subwayNumber) {
		this.subwayNumber = subwayNumber;
		passengerCount = 0;
		money = 0;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void getOff() {
		passengerCount--;
	}
	
	public void showInfo() {
		System.out.println("����ö " + subwayNumber + "�� �°��� " + passengerCount + "���Դϴ�.");
		System.out.println("�� ������ " + money + "�Դϴ�.");
	}
}
