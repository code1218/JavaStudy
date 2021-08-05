package chapter5;

/**
 * 
 * Array(배열)
 * -> 같은 자료형의 데이터끼리의 집합
 * -> 데이터의 묶음.
 * 
 * [](대괄호) 인덱스를 사용하면 무조건 배열이다.
 * [] 인덱스 연산자
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
		//배열의 선언
		int[] arr; 
		//int arr[];
		
		//배열 초기화(생성)
		arr = new int[10];
		
		arr[0] = 0;
		//선언과 초기화를 동시에 진행
		int[] arr2 = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] arr3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		//arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; 사용불가
		
		for(int i = 0; i < 10; i++) {
			arr[i] = i;
		}
		
		// length 배열의 크기값
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}







