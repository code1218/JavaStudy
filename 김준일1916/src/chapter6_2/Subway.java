package chapter6_2;

public class Subway {
	private String subwayNumber; //ÁöÇÏÃ¶¹øÈ£
	private int passengerCount; //Å¾½ÂÁßÀÎ ½Â°´¼ö
	private int money; //¼öÀÔ
	
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
		System.out.println("ÁöÇÏÃ¶ " + subwayNumber + "ÀÇ ½Â°´Àº " + passengerCount + "¸íÀÔ´Ï´Ù.");
		System.out.println("ÃÑ ¼öÀÔÀº " + money + "ÀÔ´Ï´Ù.");
	}
}
