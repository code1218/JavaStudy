package chapter2;

/**
 * 
 * 삼항연산자
 * 조건식이	참이면 :(콜론) 앞에 있는 결과를 반환
 * 			거짓이면 :(콜론) 뒤에 있는 결과를 반환
 *
 */
public class OperationEx3 {
	public static void main(String[] args) {
		char select = 'Y';
		boolean trueFalse = false;
		
		trueFalse = (select == 'y' ? true : false);
		System.out.println(
		select == 'y' ? "참입니다." : (select == 'Y' ? "참입니다." : "거짓입니다."));
		/*
		 * score = 89;
		 * grade = 'F';
		 * score == 0~59면 "F학점"을 출력
		 * score == 60~69면 "D학점"을 출력
		 * score == 70~79면 "C학점"을 출력
		 * score == 80~89면 "B학점"을 출력
		 * score == 90~100면 "A학점"을 출력
		 * System.out.println("학생의 학점은 " + grade + "학점");
		 */
		int score = 89;
		char grade = 'F';
		grade = 
		(score >= 0 && score < 60) ? 'F' : 
			(score < 70) ? 'D' : 
				(score < 80) ? 'C' : 
					(score < 90) ? 'B' : 
						(score <= 100) ? 'A' : ' ';                            
				
		System.out.println("학생의 학점은 " + grade + "학점");		
	}
}






