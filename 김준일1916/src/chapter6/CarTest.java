package chapter6;

public class CarTest {

	public static void main(String[] args) {
		Car[] ���� = new Car[5];
		String[] å���� = new String[10];
		
		Car �׽���3 = new Car();
		�׽���3.������ = "�׽���";
		�׽���3.�𵨸� = "�׽���3";
		�׽���3.���� = "��";
		
		�׽���3.speedUp();
		�׽���3.speedUp();
		�׽���3.speedUp();
		�׽���3.speedUp();
		�׽���3.speedUp();
		�׽���3.info();
		
		Car �׷��� = new Car();
		�׷���.������ = "�����ڵ���";
		�׷���.�𵨸� = "IG";
		�׷���.���� = "ȭ��Ʈ";
		
		�׷���.speedDown();
		�׷���.info();

	}

}
