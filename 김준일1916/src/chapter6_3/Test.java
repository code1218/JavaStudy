package chapter6_3;

/**
 * 
 * ������
 * ���� ��ü�� ���� ���¸� ��ȭ��Ű�� ��
 * ��ĳ����, �ٿ�ĳ����
 * 
 * �ڽ� -> �θ� (��ĳ����)
 * 
 * �θ� -> �ڽ� (�ٿ�ĳ����)
 *
 */

public class Test {

	public static void main(String[] args) {
		Test1 t1_1 = new Test2(); //Test2�� �����ϰԵǸ� new Test1()�� ����.
		Test1 t1_2 = new Test3();
		
		t1_1.add();
		t1_2.add();
		
		Test2 t2 = (Test2)t1_1;
		t2.sub();
	}

}






