package chapter7;

public class Powder {
	public void doPrinting() {
		System.out.println("Powder로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 Powder입니다.";
	}
}
