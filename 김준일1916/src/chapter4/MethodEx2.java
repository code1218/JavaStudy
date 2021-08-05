package chapter4;

public class MethodEx2 {
	
	// void란?
	// 아무것도 존재하지 않는다, 공허하다, 비어있다.
	
	// 반환값과 매개변수가 없는 메소드
	void carc() {
		System.out.println("반환값과 매개변수가 없는 메소드입니다.");
	}
	
	// 반환값이 없는 메소드
	void carc2(int 월급, double 세율) {
		int 세후월급;
		if(월급 == 0) {
			return;
		}
		세후월급 = 월급 - (int)(월급 * 세율);
		System.out.println("당신의 세후 월급은 " + 세후월급 + "원입니다.");
	}
	
	// 매개변수가 없는 메소드
	String carc3() {
		int x = 0;
		int y = 0;
		String xy;
		xy = "(" + x +", " + y + ")축";
		return xy;
	}
	
	// 반환값과 매개변수가 모두 있는 메소드
	int carc4(int 월급, double 세율) {
		int 세후월급;
		세후월급 = 월급 - (int)(월급 * 세율);
		return 세후월급;
	}
	
	
	public static void main(String[] args) {
		MethodEx2 me2 = new MethodEx2();
		me2.carc(); // 메소드(함수)를 호출한다. 콜한다.
		me2.carc2(5000000, 0.1);
		String xyTest = me2.carc3();
		System.out.println(xyTest);
		System.out.println(me2.carc3());
		System.out.println("당신의 세후 월급은 " + me2.carc4(5000000, 0.1) + "입니다.");
		
		
		

	}

}
