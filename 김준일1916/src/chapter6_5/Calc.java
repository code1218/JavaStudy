package chapter6_5;

/**
 * 
 * 인터페이스(interface)
 * 약속에 대한 정의를 하는 것.
 * 상속이 아니라 구현이라 한다. (implement)
 * 상속은 다중 상속 X
 * 인터페이스의 구현은 다중 구현이 가능하다.
 * 기본적으로 모든 메소드가 추상(abstract)메소드이다.
 * 모든 변수가 static 상수이다.
 * 
 *
 */

public interface Calc {
	//인터페이스에서는 static, final 예약어를 생략할 수 있다.
	static final double PI = 3.14;
	int ERROR = -999999999;
	
	//인터페이스에서는 abstract 예약어를 생략할 수 있다.
	abstract int add(int num1, int num2);	//덧셈
	int sub(int num1, int num2);	//뺄셈
	int times(int num1, int num2);	//곱셈
	int divide(int num1, int num2);	//나눗셈
	
	//일반 메소드를 정의하고 싶을 때 사용.
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	/**
	 *  
	 * static(정적)
	 * 단 하나 밖에 없다.
	 * 만들어진 하나를 여러 곳에서 공유하여 사용하기 위해 static을 선언한다.
	 * static의 특징으로는 폰트가 이텔릭체로 변한다.(기울어짐)
	 * 
	 */
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		return total;
	}
	
	
}






