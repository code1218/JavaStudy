package chapter6_3;

/**
 * 
 * ���(extends)
 * �θ�� �ڽ� ����
 * �޼ҵ� �������̵�(�޼ҵ� ������)
 * -> �θ��� ������ ������ �ڽ��� ���� �ʰ� �� ���� �������� ������Ű�� ��
 * -> �θ��� �޼ҵ� ������ �״�� ������� �ʰ� ���Ӱ� �����Ͽ� ����ϴ� ��
 * this(�ڽ�), super(�θ�)
 *
 */

class Person{ //���
	private String name;		//��� �̸�
	private String job;			//��� ����
	private String maleFemale;	//��� ����
	
	// getter/setter ����Ű -> Alt + Shift + s
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMaleFemale() {
		return maleFemale;
	}

	public void setMaleFemale(String maleFemale) {
		this.maleFemale = maleFemale;
	}
	
	public Person() {
		
	}

	public Person(String name, String job, String maleFemale) {
		this.name = name;
		this.job = job;
		this.maleFemale = maleFemale;
	}
	
	public void speak() {
		System.out.println(name + "���� ���� �մϴ�.");
	}
}

public class Student extends Person { //�л�
	private String student_type;
	private String schoolName;
	private int year;

	public void studentInfo() {
		System.out.println("<�л� ����>");
		System.out.println("�̸�: " + super.getName());
		System.out.println("����: " + super.getJob());
		System.out.println("����: " + super.getMaleFemale());
		System.out.println("�з±���: " + student_type);
		System.out.println("�б���: " + schoolName);
		System.out.println("�г�: " + year);
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("������");
		s1.setJob("����");
		s1.setMaleFemale("��");
		s1.student_type = "���п�";
		s1.schoolName = "�λ걳�����п�";
		s1.year = 2;
		
		s1.studentInfo();

	}

}
