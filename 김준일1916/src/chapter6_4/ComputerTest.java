package chapter6_4;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer(); 
		//Computer Ŭ������ �߻� Ŭ�����̱� ������ ���� �Ұ�
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook1();
		//NoteBook1�� typing�޼ҵ尡 �ϼ����� �ʾұ� ������ �߻� Ŭ�����̴�.
		Computer c4 = new NoteBook2();
		
		NoteBook1 n1 = new NoteBook2(); // ��ĳ����
		//DeskTop d1 = new NoteBook2(); // ���� �ٸ� Ŭ������ ��ĳ���� ��.
		
		Computer[] c = new Computer[10];
		
		c[0] = c2; //DeskTop Ŭ����
		c[1] = c4; //NoteBook2 Ŭ����
		c[2] = n1; //NoteBook1 Ŭ����
		
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




