package chapter2;

/**
 * 
 * ���׿�����
 * ���ǽ���	���̸� :(�ݷ�) �տ� �ִ� ����� ��ȯ
 * 			�����̸� :(�ݷ�) �ڿ� �ִ� ����� ��ȯ
 *
 */
public class OperationEx3 {
	public static void main(String[] args) {
		char select = 'Y';
		boolean trueFalse = false;
		
		trueFalse = (select == 'y' ? true : false);
		System.out.println(
		select == 'y' ? "���Դϴ�." : (select == 'Y' ? "���Դϴ�." : "�����Դϴ�."));
		/*
		 * score = 89;
		 * grade = 'F';
		 * score == 0~59�� "F����"�� ���
		 * score == 60~69�� "D����"�� ���
		 * score == 70~79�� "C����"�� ���
		 * score == 80~89�� "B����"�� ���
		 * score == 90~100�� "A����"�� ���
		 * System.out.println("�л��� ������ " + grade + "����");
		 */
		int score = 89;
		char grade = 'F';
		grade = 
		(score >= 0 && score < 60) ? 'F' : 
			(score < 70) ? 'D' : 
				(score < 80) ? 'C' : 
					(score < 90) ? 'B' : 
						(score <= 100) ? 'A' : ' ';                            
				
		System.out.println("�л��� ������ " + grade + "����");		
	}
}






