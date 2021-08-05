package chapter6_4;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer(); 
		//Computer 클래스는 추상 클래스이기 때문에 생성 불가
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook1();
		//NoteBook1은 typing메소드가 완성되지 않았기 때문에 추상 클래스이다.
		Computer c4 = new NoteBook2();
		
		NoteBook1 n1 = new NoteBook2(); // 업캐스팅
		//DeskTop d1 = new NoteBook2(); // 전혀 다른 클래스를 업캐스팅 중.
		
		Computer[] c = new Computer[10];
		
		c[0] = c2; //DeskTop 클래스
		c[1] = c4; //NoteBook2 클래스
		c[2] = n1; //NoteBook1 클래스
		
		for(int i = 0; i < c.length; i++) {
			if(c[i] == null) {
				continue;
			}
			c[i].display();
			c[i].typing();
			c[i].turnOn();
			c[i].turnOff();
			System.out.println();
		}
	}

}




