package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		// kim, pack, lee, song 4명의 인스턴스를 생성.
		Student kim = new Student("대학생", 20210702, "김기태", 4, 89); //대학생, 20210702, 김기태, 4, 89
		Student pack = new Student("고등학생", 20210703, "박강민", 3, 85); //고등학생, 20210703, 박강민, 3, 85
		Student lee = new Student("중학생", 20210704, "이주엽", 2, 90); //중학생, 20210704, 이주엽, 2, 90
		Student song = new Student("초등학생", 20210705, "송지효", 6, 95); //초등학생, 20210705, 송지효, 6, 95
		Student ham = new Student();
		
		kim.student_info();
		pack.student_info();
		lee.student_info();
		song.student_info();
		ham.student_info();
		
	}

}
