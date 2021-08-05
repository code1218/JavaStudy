package chapter3;

public class LoopEx {

	public static void main(String[] args) {
		// 반복문
		// for, while(do ~ while)
		for(int i = 0; i < 100; i++) {
			if(i % 2 == 0) { //i가  짝수이면
				continue;
			}
			// 반복적으로 실행될 명령문1
			// 반복적으로 실행될 명령문2
			// 반복적으로 실행될 명령문3
			// 반복적으로 실행될 명령문4
		}
		int i = 0;
		while(i < 100) {
			if(i % 2 == 0) { //i가  짝수이면
				i++;
				continue;
			}
			// 반복적으로 실행될 명령문1
			// 반복적으로 실행될 명령문2
			// 반복적으로 실행될 명령문3
			// 반복적으로 실행될 명령문4
			i++;
		}

	}

}
