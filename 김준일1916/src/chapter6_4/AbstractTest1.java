package chapter6_4;

public class AbstractTest1 {

	public static void main(String[] args) {
		AbstractEx1 ae1 = new AbstractEx1C(); //업캐스팅
		AbstractEx1C ae1c = new AbstractEx1C();
		AbstractEx1C ae1c2 = (AbstractEx1C)ae1; //다운캐스팅
	}

}
