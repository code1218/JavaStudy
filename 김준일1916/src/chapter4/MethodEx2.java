package chapter4;

public class MethodEx2 {
	
	// void��?
	// �ƹ��͵� �������� �ʴ´�, �����ϴ�, ����ִ�.
	
	// ��ȯ���� �Ű������� ���� �޼ҵ�
	void carc() {
		System.out.println("��ȯ���� �Ű������� ���� �޼ҵ��Դϴ�.");
	}
	
	// ��ȯ���� ���� �޼ҵ�
	void carc2(int ����, double ����) {
		int ���Ŀ���;
		if(���� == 0) {
			return;
		}
		���Ŀ��� = ���� - (int)(���� * ����);
		System.out.println("����� ���� ������ " + ���Ŀ��� + "���Դϴ�.");
	}
	
	// �Ű������� ���� �޼ҵ�
	String carc3() {
		int x = 0;
		int y = 0;
		String xy;
		xy = "(" + x +", " + y + ")��";
		return xy;
	}
	
	// ��ȯ���� �Ű������� ��� �ִ� �޼ҵ�
	int carc4(int ����, double ����) {
		int ���Ŀ���;
		���Ŀ��� = ���� - (int)(���� * ����);
		return ���Ŀ���;
	}
	
	
	public static void main(String[] args) {
		MethodEx2 me2 = new MethodEx2();
		me2.carc(); // �޼ҵ�(�Լ�)�� ȣ���Ѵ�. ���Ѵ�.
		me2.carc2(5000000, 0.1);
		String xyTest = me2.carc3();
		System.out.println(xyTest);
		System.out.println(me2.carc3());
		System.out.println("����� ���� ������ " + me2.carc4(5000000, 0.1) + "�Դϴ�.");
		
		
		

	}

}
