package chapter6_5;

public class ShelfTest {

	public static void main(String[] args) {
		Stack shelfS = new BookShelf();
		shelfS.push("�ڹ� ���α׷���");
		shelfS.push("��ǰ �ڹ�");
		shelfS.push("�ڹ��� ����");
		shelfS.push("Do it �ڹ� �Թ�");
		shelfS.push("java");
		
		System.out.println(shelfS.getStackSize() + " - " + shelfS.pop());
		System.out.println(shelfS.getStackSize() + " - " + shelfS.pop());
		System.out.println(shelfS.getStackSize() + " - " + shelfS.pop());
		System.out.println(shelfS.getStackSize() + " - " + shelfS.pop());
		System.out.println(shelfS.getStackSize() + " - " + shelfS.pop());

		Queue shelfQ = new BookShelf();
		shelfQ.enQueue("�ڹ� ���α׷���");
		shelfQ.enQueue("��ǰ �ڹ�");
		shelfQ.enQueue("�ڹ��� ����");
		shelfQ.enQueue("Do it �ڹ� �Թ�");
		shelfQ.enQueue("java");
		
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
	}

}
