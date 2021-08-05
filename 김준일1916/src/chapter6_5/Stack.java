package chapter6_5;

/**
 * 
 * 스택(stack)
 * LIFO
 * 가장 마지막에 들어온 것이 가장 먼저 나가는 자료구조.
 * 값의 추가 -> push(푸쉬)
 * 값의 삭제 -> pop(팝)
 *
 */

public interface Stack {
	void push(String title);
	String pop();
	int getStackSize();
}





