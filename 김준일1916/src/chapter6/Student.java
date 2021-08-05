package chapter6;

public class Student {
	String student_type; //초등학생, 중학생, 고등학생, 대학생
	int student_code; //학번(학생의 개인의 고유 코드)
	String student_name; //학생 이름
	int student_year; //학년
	int student_score; //성적 0 ~ 100점(평점)
	
	public Student() {
		student_type = "초등학생";
		student_code = 0;
		student_name = "학생명";
		student_year = 1;
		student_score = 0;
	}
	
	public Student(String student_type, int student_code, String student_name,
						int student_year, int student_score) {
		this.student_type = student_type;
		this.student_code = student_code;
		this.student_name = student_name;
		this.student_year = student_year;
		this.student_score = student_score;
	}
	
	void student_info() {
		System.out.println("학생 구분: " + student_type);
		System.out.println("학번: " + student_code);
		System.out.println("이름: " + student_name);
		System.out.println("학년: " + student_year);
		System.out.println("성적: " + student_score);
	}
}
