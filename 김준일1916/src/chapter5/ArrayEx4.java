package chapter5;

public class ArrayEx4 {
	/**
	 * 
	 * 이차원 배열
	 * 인덱스가 [][] 두개인 경우
	 * 
	 * 삼차원 배월부터는 다차원 배열이라고 부른다.
	 */
	public static void main(String[] args) {
		String[][] 반번호 = new String[4][3];
		String[][][] 학년반번호 = new String[3][4][3];
		System.out.println("학년은 총" + 학년반번호.length);
		System.out.println("반은 총" + 학년반번호[0].length);
		System.out.println("번호는 총" + 학년반번호[0][0].length);
		
		반번호[0][0] = "김호";
		반번호[0][1] = "박애진";
		반번호[0][2] = "박강민";
		
		반번호[1][0] = "서성준";
		반번호[1][1] = "이주엽";
		반번호[1][2] = "함동빈";
		
		반번호[2][0] = "권준혁";
		반번호[2][1] = "박지훈";
		반번호[2][2] = "강상훈";
		
		반번호[3][0] = "강지석";
		반번호[3][1] = "서보경";
		반번호[3][2] = "신석범";
		
		
		for(int i = 0; i < 반번호.length; i++) {
			System.out.println((i+1) + "반");
			for(int j = 0; j < 반번호[0].length; j++) {
				System.out.println((i+1) + "반 " + (j+1) + "번 " + 반번호[i][j]);
			}
		}
	}

}






