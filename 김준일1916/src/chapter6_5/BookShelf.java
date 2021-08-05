package chapter6_5;

public class BookShelf extends Shelf implements Stack, Queue{
	@Override
	public void push(String title) {
		shelf.add(title);
		
	}
	@Override
	public String pop() {
		return shelf.remove(getStackSize()-1);
	}
	@Override
	public int getStackSize() {
		// TODO Auto-generated method stub
		return getCount();
	}
	
	@Override
	public void enQueue(String title) {
		shelf.add(title);
		
	}
	@Override
	public String deQueue() {
		return shelf.remove(0);
	}
	@Override
	public int getQueueSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}
