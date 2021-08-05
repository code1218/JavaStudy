package chapter3;

import java.util.Scanner;

public class LoopEx3 {

	public static void main(String[] args) {
		// 모든 프로그램은 무한 루프 안에서 작동한다.
		
		Scanner input = new Scanner(System.in); 
		// 키보드의 입력을 받을 수 있게 도와주는 것
		
		boolean mLoop = true;
		// 마스터 루프를 제어하기 위한 제어장치.
		
		String selecter = null;
		// selecter 변수에 비어있는 값을 저장
		
		while(mLoop) { // 무한반복(무한루프)
			System.out.println("1. 하위 항목으로 이동");
			System.out.println("q. 프로그램 종료");
			System.out.print("명령을 선택해 주세요: ");
			selecter = input.nextLine(); 
			//문자열 입력 받아서 selecter에 저장
			
			// selecter.equals("문자열") 문자열이 서로 같은지 비교
			// 같으면 true, 다르면 false
			if(selecter.equals("q")) {
				break;
			}
			else if(selecter.equals("1")) {
				while(true) {
					System.out.println("1. 하위 항목 그대로 유지");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.print("명령을 선택해 주세요: ");
					selecter = input.nextLine();
					
					if(selecter.equals("1")) {
						System.out.println("하위 항목에서 그대로 유지합니다.");
					}else if(selecter.equals("b")) {
						break;
					}else if(selecter.equals("q")) {
						mLoop = false;
						break;
					}else {
						System.out.println("1, b, q만 입력이 가능합니다.");
					}
				}
			}
			else {
				System.out.println("1 또는 q만 입력이 가능합니다.");
			}
		}
		System.out.println("프로그램이 종료 되었습니다.");
	}

}
