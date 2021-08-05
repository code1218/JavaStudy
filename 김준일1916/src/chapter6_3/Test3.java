package chapter6_3;

public class Test3 extends Test1 {

	public Test3() {
		super("자식2");
		System.out.println("자식2 클래스");
	}
	
	@Override
	public void add() {
		System.out.println("네 수를 더합니다.");
	}
	
	public void sub() {
		System.out.println("네 수를 뺍니다.");
	}
	
}
