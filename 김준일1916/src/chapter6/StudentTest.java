package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		// kim, pack, lee, song 4���� �ν��Ͻ��� ����.
		Student kim = new Student("���л�", 20210702, "�����", 4, 89); //���л�, 20210702, �����, 4, 89
		Student pack = new Student("����л�", 20210703, "�ڰ���", 3, 85); //����л�, 20210703, �ڰ���, 3, 85
		Student lee = new Student("���л�", 20210704, "���ֿ�", 2, 90); //���л�, 20210704, ���ֿ�, 2, 90
		Student song = new Student("�ʵ��л�", 20210705, "����ȿ", 6, 95); //�ʵ��л�, 20210705, ����ȿ, 6, 95
		Student ham = new Student();
		
		kim.student_info();
		pack.student_info();
		lee.student_info();
		song.student_info();
		ham.student_info();
		
	}

}
