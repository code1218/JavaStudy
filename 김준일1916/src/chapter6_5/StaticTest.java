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
		System.out.println("학번: " + code);
		System.out.println("이름: " + name);
		System.out.println();
	}
	
	public static void testPrint() {
		System.out.println("생성 없이 static 메소드 사용하기.");
	}
}

public class StaticTest {

	public static void main(String[] args) {
		Student[] s = new Student[10];
		
		Student s1 = new Student("김호");
		Student s2 = new Student("김호");
		Student s3 = new Student("서성준");
		Student s4 = new Student("함동빈");
		Student s5 = new Student("박강민");
		Student s6 = new Student("권준혁");
		Student s7 = new Student("강상훈");
		Student s8 = new Student("강지석");
		
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;
		s[4] = s5;
		s[5] = s6;
		s[6] = s7;
		s[7] = s8;
		s[8] = new Student("박지훈");
		s[9] = s1;
		
		boolean flag1 = s[0].equals(s[1]);
		boolean flag2 = s[0].equals(s[9]);
		boolean flag3 = s[0].getCode() == s[1].getCode();
		
		System.out.println("두 학생이 같은 학생입니까?" + flag1);
		System.out.println("두 학생이 같은 학생입니까?" + flag2);
		
		System.out.println("총 학생 수: " + (Student.student_code - 20210000));
		
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
