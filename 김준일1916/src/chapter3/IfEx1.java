package chapter3;

public class IfEx1 {

	public static void main(String[] args) {
		System.out.println("아침 기상");
		boolean 가방 = false;
		boolean 우산 = false;
		boolean 고데기 = false;
		char 날씨 = '비';
		
		if(날씨 == '비') {
			우산 = true;
			고데기 = false;
		}
		else {
			고데기 = true;
		}
		가방 = true;
		System.out.println("학원 도착" + 가방 + " " + 우산);

	}

}
