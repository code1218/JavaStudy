package chapter1;

public class ConversionEx {
	// 행당 줄만 주석 처리
	/* 해당 주석 기호 사이의 모든 소스를 주석처리 */
	/**
	 * 
	 * 클래스 또는 메소드의 정보를 담는 주석
	 */
	public static void main(String[] args) {
		int i_Num = 10;
		int i_Num2 = 20;
		
		double d_Num = 10.08;
		double d_Num2 = 45.13;
		
		int i_Sum = (int)(d_Num + d_Num2);
		double d_Sum = i_Num + i_Num2;
		
		double d_Sum2 = i_Sum;
		
		System.out.println(i_Sum);
		System.out.println(d_Sum);

	}

}
