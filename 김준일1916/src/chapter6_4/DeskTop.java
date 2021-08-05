package chapter6_4;

public class DeskTop extends Computer{
	@Override
	public void display() {
		System.out.println("데스크탑 화면을 표시합니다.");
	}
	@Override
	public void typing() {
		System.out.println("데스크탑 키보드의 입력을 받습니다.");
	}
}
