package chapter6_5;

/**
 * 
 * ť(Queue)
 * FIFO(first in first out)
 * �����Ͱ� ó�� �� ���� ���� ���� ������ �ڷᱸ��.
 * �������� �߰� -> enQueue
 * �������� ���� -> deQueue
 *
 */

public interface Queue {
	void enQueue(String title);
	String deQueue();
	int getQueueSize();
}





