package chapter4;

import java.util.Scanner;
// ctrl + shift + o

public class MethodEx3 {
	
	Scanner input = new Scanner(System.in);
	
	String mainDisplay() {
		System.out.println("1. ���ϱ�");
		System.out.println("2. ����");
		System.out.println("3. ���ϱ�");
		System.out.println("4. ������");
		System.out.println("q. ���α׷� ����");
		System.out.print("����� ������ �ּ���: ");
		return input.nextLine();
	}
	
	double calc(String selecter, double num1, double num2) {
		double result = 0;
		
		if(selecter.equals("1")) {
			// ���ϱ�
			result = num1 + num2;
		}else if(selecter.equals("2")) {
			// ����
			result = num1 - num2;
		}else if(selecter.equals("3")) {
			// ���ϱ�
			result = num1 * num2;
		}else if(selecter.equals("4")) {
			if(num2 == 0) {
				result = 0;
			}else {
				result = num1 / num2;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		MethodEx3 me3 = new MethodEx3();
		
		String selecter;
		//���ڿ� selecter ������ ����
		
		String input1, input2;
		double num1, num2;
		//���� �ݺ��� �����Ѵ�.
		while(true) {
			selecter = me3.mainDisplay();
			if(selecter.equals("q")) {
				break;
			}else if(selecter.equals("1") || selecter.equals("2")
					 || selecter.equals("3")  || selecter.equals("4")) {
				System.out.print("ù��° ���ڸ� �Է��� �ּ���: ");
				input1 = me3.input.nextLine();
				System.out.print("�ι�° ���ڸ� �Է��� �ּ���: ");
				input2 = me3.input.nextLine();
				
				num1 = Double.parseDouble(input1); // ���ڿ��� �Ǽ�(�Ҽ��� ����)�� ��ȯ
				num2 = Double.parseDouble(input2);
				
				System.out.println("��� ���: " + me3.calc(selecter, num1, num2));
				
			}else {
				System.out.println("<�Է¿���!>");
			}
			System.out.println();
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");

	}

}
