package chapter6_5;

public class ShelfTest {

	public static void main(String[] args) {
		Stack shelfS = new BookShelf();
		shelfS.push("자바 프로그래밍");
		shelfS.push("명품 자바");
		shelfS.push("자바의 정석");
		shelfS.push("Do it 자바 입문");
		shelfS.push("java");
		
		System.out.println(shelfS.getStackSize() + " - " + shelfS.pop());
		System.out.println(shelfS.getStackSize() + " - " + shelfS.pop());
		System.out.println(shelfS.getStackSize() + " - " + shelfS.pop());
		System.out.println(shelfS.getStackSize() + " - " + shelfS.pop());
		System.out.println(shelfS.getStackSize() + " - " + shelfS.pop());

		Queue shelfQ = new BookShelf();
		shelfQ.enQueue("자바 프로그래밍");
		shelfQ.enQueue("명품 자바");
		shelfQ.enQueue("자바의 정석");
		shelfQ.enQueue("Do it 자바 입문");
		shelfQ.enQueue("java");
		
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize() + " - " + shelfQ.deQueue());
	}

}
