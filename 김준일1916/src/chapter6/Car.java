package chapter6;

public class Car {
	String �𵨸�;
	String ������;
	String ����;
	int maxSpeed = 200;
	int minSpeed = 0;
	int speed = 0;
	
	// �����ε�
	// ���� �̸��� �޼ҵ� �Ǵ� �����ڸ� �Ű������� ���� �ٸ� ���·� ���� �� �� �ִ� ��.
	
	public Car() {
		
	}
	
	public Car(String ������, String �𵨸�, String ����) {
		this.������ = ������;
		this.�𵨸� = �𵨸�;
		this.���� = ����;
	}
	
	public Car(String ������, String �𵨸�, String ����, int �ִ�ӵ�) {
		this.������ = ������;
		this.�𵨸� = �𵨸�;
		this.���� = ����;
		maxSpeed = �ִ�ӵ�;
		speed = 100;
	}

	void speedUp() {
		if(speed < maxSpeed) {
			speed += 5;
		}else {
			System.out.println("���̻� �ӵ��� �ø� �� �����ϴ�.");
		}
	}
	
	void speedDown() {
		if(minSpeed < speed) {
			speed -= 5;
		}else {
			System.out.println("���� ����");
		}
	}
	
	void info() {
		System.out.println("�������: " + ������);
		System.out.println("�𵨸�: " + �𵨸�);
		System.out.println("����: " + ����);
		if(speed < maxSpeed && speed > minSpeed) {
			System.out.println("���� �ӵ�: �ü� " + speed +"km");
		}else {
			System.out.println("������ ���� �����Դϴ�.");
		}
	}
	
}
