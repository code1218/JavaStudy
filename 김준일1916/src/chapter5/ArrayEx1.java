package chapter5;

/**
 * 
 * Array(�迭)
 * -> ���� �ڷ����� �����ͳ����� ����
 * -> �������� ����.
 * 
 * [](���ȣ) �ε����� ����ϸ� ������ �迭�̴�.
 * [] �ε��� ������
 * int num, num1, num2, num3, num4, num5;
 * num = 0;
 * num1 = 1;
 * num2 = 2;
 * num3 = 3;
 * num4 = 4;
 * num5 = 5;
 * 
 * System.out.println(num);
 * System.out.println(num1);
 * System.out.println(num2);
 * System.out.println(num3);
 * System.out.println(num4);
 * System.out.println(num5);
 * 
 * int[] num = new int[6];
 * num[0] = 0;
 * num[1] = 1; 
 * num[2] = 2; 
 * num[3] = 3; 
 * num[4] = 4; 
 * num[5] = 5; 
 * 
 * int i = 0;
 * num[i];
 * 
 * for(int i = 0; i < 6; i++){
 * 		System.out.println(num[i]);
 * }
 * 
 *
 */

public class ArrayEx1 {

	public static void main(String[] args) {
		//�迭�� ����
		int[] arr; 
		//int arr[];
		
		//�迭 �ʱ�ȭ(����)
		arr = new int[10];
		
		arr[0] = 0;
		//����� �ʱ�ȭ�� ���ÿ� ����
		int[] arr2 = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] arr3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		//arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; ���Ұ�
		
		for(int i = 0; i < 10; i++) {
			arr[i] = i;
		}
		
		// length �迭�� ũ�Ⱚ
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}







