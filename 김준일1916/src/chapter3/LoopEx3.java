package chapter3;

import java.util.Scanner;

public class LoopEx3 {

	public static void main(String[] args) {
		// ��� ���α׷��� ���� ���� �ȿ��� �۵��Ѵ�.
		
		Scanner input = new Scanner(System.in); 
		// Ű������ �Է��� ���� �� �ְ� �����ִ� ��
		
		boolean mLoop = true;
		// ������ ������ �����ϱ� ���� ������ġ.
		
		String selecter = null;
		// selecter ������ ����ִ� ���� ����
		
		while(mLoop) { // ���ѹݺ�(���ѷ���)
			System.out.println("1. ���� �׸����� �̵�");
			System.out.println("q. ���α׷� ����");
			System.out.print("����� ������ �ּ���: ");
			selecter = input.nextLine(); 
			//���ڿ� �Է� �޾Ƽ� selecter�� ����
			
			// selecter.equals("���ڿ�") ���ڿ��� ���� ������ ��
			// ������ true, �ٸ��� false
			if(selecter.equals("q")) {
				break;
			}
			else if(selecter.equals("1")) {
				while(true) {
					System.out.println("1. ���� �׸� �״�� ����");
					System.out.println("b. �ڷΰ���");
					System.out.println("q. ���α׷� ����");
					System.out.print("����� ������ �ּ���: ");
					selecter = input.nextLine();
					
					if(selecter.equals("1")) {
						System.out.println("���� �׸񿡼� �״�� �����մϴ�.");
					}else if(selecter.equals("b")) {
						break;
					}else if(selecter.equals("q")) {
						mLoop = false;
						break;
					}else {
						System.out.println("1, b, q�� �Է��� �����մϴ�.");
					}
				}
			}
			else {
				System.out.println("1 �Ǵ� q�� �Է��� �����մϴ�.");
			}
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	}

}
