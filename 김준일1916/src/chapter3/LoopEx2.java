package chapter3;

import java.util.Scanner;

public class LoopEx2 {

	public static void main(String[] args) {
		// ��� ���α׷��� ���� ���� �ȿ��� �۵��Ѵ�.
		
		Scanner input = new Scanner(System.in); 
		// Ű������ �Է��� ���� �� �ְ� �����ִ� ��
		
		boolean mLoop = true;
		// ������ ������ �����ϱ� ���� ������ġ.
		
		String selecter = null;
		// selecter ������ ����ִ� ���� ����
		
		while(true) { // ���ѹݺ�(���ѷ���)
			System.out.print("���α׷��� ���� �Ͻðڽ��ϱ�?(y/n)");
			selecter = input.nextLine(); 
			//���ڿ� �Է� �޾Ƽ� selecter�� ����
			
			// selecter.equals("���ڿ�") ���ڿ��� ���� ������ ��
			// ������ true, �ٸ��� false
			if(selecter.equals("y")) {
				break;
			}
			else if(selecter.equals("n")) {
				System.out.println("���α׷��� ��� ����");
			}
			else {
				System.out.println("y �Ǵ� n�� �Է��� �����մϴ�.");
			}
		}
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");

	}
	
	
	
	
	
	
	

}
