package chapter6_2;

public class TakeTrans {

	public static void main(String[] args) {
		Student kim = new Student("��ȣ", 20000);
		Student pack = new Student("�ھ���", 30000);
		
		Bus b1 = new Bus("43�� 1317");
		Bus b2 = new Bus("14�� 7777");
		
		Subway s1 = new Subway("1ȣ��");
		Subway s2 = new Subway("2ȣ��");
		
		kim.takeBus(b1, 13000);
		pack.takeBus(b1, 13000);
		
		kim.showInfo();
		pack.showInfo();
		b1.showInfo();
		
		kim.getOffBus(b1);
		b1.showInfo();
		pack.getOffBus(b1);
	}

}
