package chapter2;


/**
 * 
 * 논리 연산자
 * &&(곱) AND연산자	true(1) && true(1) => true(1)
 * 					true(1) && false(0) => false(0)
 * 					false(0) && false(0) => false(0)
 * 둘다 참일때만 실행을 해야하는 경우
 * 
 * ||(합) OR연산자		true(1) || true(1) => true(1)
 * 					true(1) || false(0) => true(1)
 * 					false(0) || false(0) => false(0)
 * 둘중에 하나라도 참이면 실행을 해야하는 경우
 * 
 * !(부정) NOT연산자
 * true의 결과를 false로 또는 false의 결과를 true로 변환
 *
 */
public class OperationEx2 {

	public static void main(String[] args) {
		char select = 'y';
		char select2 = 'y';
		
		System.out.println(select == 'y' && select2 == 'Y');
		System.out.println(!(select == 'y' || select == 'Y'));
	}

	
	
	
	
	
}
