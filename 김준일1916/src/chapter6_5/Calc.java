package chapter6_5;

/**
 * 
 * �������̽�(interface)
 * ��ӿ� ���� ���Ǹ� �ϴ� ��.
 * ����� �ƴ϶� �����̶� �Ѵ�. (implement)
 * ����� ���� ��� X
 * �������̽��� ������ ���� ������ �����ϴ�.
 * �⺻������ ��� �޼ҵ尡 �߻�(abstract)�޼ҵ��̴�.
 * ��� ������ static ����̴�.
 * 
 *
 */

public interface Calc {
	//�������̽������� static, final ���� ������ �� �ִ�.
	static final double PI = 3.14;
	int ERROR = -999999999;
	
	//�������̽������� abstract ���� ������ �� �ִ�.
	abstract int add(int num1, int num2);	//����
	int sub(int num1, int num2);	//����
	int times(int num1, int num2);	//����
	int divide(int num1, int num2);	//������
	
	//�Ϲ� �޼ҵ带 �����ϰ� ���� �� ���.
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
	}
	
	/**
	 *  
	 * static(����)
	 * �� �ϳ� �ۿ� ����.
	 * ������� �ϳ��� ���� ������ �����Ͽ� ����ϱ� ���� static�� �����Ѵ�.
	 * static�� Ư¡���δ� ��Ʈ�� ���ڸ�ü�� ���Ѵ�.(������)
	 * 
	 */
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		return total;
	}
	
	
}






