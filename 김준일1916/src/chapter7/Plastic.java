package chapter7;

public class Plastic {
	public void doPrinting() {
		System.out.println("Plastic으로 출력합니다.");
	}
	
	@Override
	public String toString() {
		return "재료는 Plastic입니다.";
	}
}
