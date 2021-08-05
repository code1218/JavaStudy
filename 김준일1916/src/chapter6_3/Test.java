package chapter6_3;

/**
 * 
 * 다형성
 * 상위 객체를 통해 형태를 변화시키는 것
 * 업캐스팅, 다운캐스팅
 * 
 * 자식 -> 부모 (업캐스팅)
 * 
 * 부모 -> 자식 (다운캐스팅)
 *
 */

public class Test {

	public static void main(String[] args) {
		Test1 t1_1 = new Test2(); //Test2를 생성하게되면 new Test1()가 포함.
		Test1 t1_2 = new Test3();
		
		t1_1.add();
		t1_2.add();
		
		Test2 t2 = (Test2)t1_1;
		t2.sub();
	}

}






