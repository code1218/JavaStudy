package chapter6_5;

class Student {
	public static int student_code = 20210000;
	private int code;
	private String name;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return code;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return code == obj.hashCode();
	}
	
	/*
	public boolean equals(Student s) {
		// TODO Auto-generated method stub
		return code == s.code;
	}
	*/
	
	public Student(String name) {
		student_code++;
		this.code = student_code;
		this.name = name;
	}
	
	public void studentInfo() {
		System.out.println("�й�: " + code);
		System.out.println("�̸�: " + name);
		System.out.println();
	}
	
	public static void testPrint() {
		System.out.println("���� ���� static �޼ҵ� ����ϱ�.");
	}
}

public class StaticTest {

	public static void main(String[] args) {
		Student[] s = new Student[10];
		
		Student s1 = new Student("��ȣ");
		Student s2 = new Student("��ȣ");
		Student s3 = new Student("������");
		Student s4 = new Student("�Ե���");
		Student s5 = new Student("�ڰ���");
		Student s6 = new Student("������");
		Student s7 = new Student("������");
		Student s8 = new Student("������");
		
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;
		s[4] = s5;
		s[5] = s6;
		s[6] = s7;
		s[7] = s8;
		s[8] = new Student("������");
		s[9] = s1;
		
		boolean flag1 = s[0].equals(s[1]);
		boolean flag2 = s[0].equals(s[9]);
		boolean flag3 = s[0].getCode() == s[1].getCode();
		
		System.out.println("�� �л��� ���� �л��Դϱ�?" + flag1);
		System.out.println("�� �л��� ���� �л��Դϱ�?" + flag2);
		
		System.out.println("�� �л� ��: " + (Student.student_code - 20210000));
		
		Student.testPrint();
		
		/*
		for(int i = 0; i < s.length; i++) {
			s[i].studentInfo();
		}
		*/
		
		for(Student student : s) {
			student.studentInfo();
		}
	}

}
