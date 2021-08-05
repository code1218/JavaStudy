package chapter2;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sNum1;
		String sNum2;
		int sum;
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		sNum1 = input.nextLine();
		System.out.print("두번째 숫자를 입력하세요: ");
		sNum2 = input.nextLine();
		
		sum = Integer.parseInt(sNum1) + Integer.parseInt(sNum2);
		
		System.out.println("입력한 두 수의 합은 " + sum);

	}

}
