package chapter3;

public class LoopEx {

	public static void main(String[] args) {
		// �ݺ���
		// for, while(do ~ while)
		for(int i = 0; i < 100; i++) {
			if(i % 2 == 0) { //i��  ¦���̸�
				continue;
			}
			// �ݺ������� ����� ��ɹ�1
			// �ݺ������� ����� ��ɹ�2
			// �ݺ������� ����� ��ɹ�3
			// �ݺ������� ����� ��ɹ�4
		}
		int i = 0;
		while(i < 100) {
			if(i % 2 == 0) { //i��  ¦���̸�
				i++;
				continue;
			}
			// �ݺ������� ����� ��ɹ�1
			// �ݺ������� ����� ��ɹ�2
			// �ݺ������� ����� ��ɹ�3
			// �ݺ������� ����� ��ɹ�4
			i++;
		}

	}

}
