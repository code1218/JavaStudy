package chapter6_4;

public abstract class Computer {
	//�߻� �޼ҵ�
	public abstract void display();
	public abstract void typing();
	
	//�Ϲ� �޼ҵ�
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
