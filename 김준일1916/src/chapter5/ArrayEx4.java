package chapter5;

public class ArrayEx4 {
	/**
	 * 
	 * ������ �迭
	 * �ε����� [][] �ΰ��� ���
	 * 
	 * ������ ������ʹ� ������ �迭�̶�� �θ���.
	 */
	public static void main(String[] args) {
		String[][] �ݹ�ȣ = new String[4][3];
		String[][][] �г�ݹ�ȣ = new String[3][4][3];
		System.out.println("�г��� ��" + �г�ݹ�ȣ.length);
		System.out.println("���� ��" + �г�ݹ�ȣ[0].length);
		System.out.println("��ȣ�� ��" + �г�ݹ�ȣ[0][0].length);
		
		�ݹ�ȣ[0][0] = "��ȣ";
		�ݹ�ȣ[0][1] = "�ھ���";
		�ݹ�ȣ[0][2] = "�ڰ���";
		
		�ݹ�ȣ[1][0] = "������";
		�ݹ�ȣ[1][1] = "���ֿ�";
		�ݹ�ȣ[1][2] = "�Ե���";
		
		�ݹ�ȣ[2][0] = "������";
		�ݹ�ȣ[2][1] = "������";
		�ݹ�ȣ[2][2] = "������";
		
		�ݹ�ȣ[3][0] = "������";
		�ݹ�ȣ[3][1] = "������";
		�ݹ�ȣ[3][2] = "�ż���";
		
		
		for(int i = 0; i < �ݹ�ȣ.length; i++) {
			System.out.println((i+1) + "��");
			for(int j = 0; j < �ݹ�ȣ[0].length; j++) {
				System.out.println((i+1) + "�� " + (j+1) + "�� " + �ݹ�ȣ[i][j]);
			}
		}
	}

}






