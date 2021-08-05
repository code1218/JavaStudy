package chapter3;

public class SwitchCaseEx {

	public static void main(String[] args) {
		int 라운드 = 10;
		boolean 죽음 = false;
		
		switch(라운드) {
			case 1:
				if(죽음 == true) {
					System.out.println(라운드 + "라운드 게임에서 패배하였습니다.");
					라운드 = 1;
					break;
				}
				System.out.println(라운드 + "라운드 게임에서 승리하셨습니다.");
				라운드++;
			case 2:
				if(죽음 == true) {
					System.out.println(라운드 + "라운드 게임에서 패배하였습니다.");
					라운드 = 1;
					break;
				}
				System.out.println(라운드 + "라운드 게임에서 승리하셨습니다.");
				라운드++;
			case 3:
				if(죽음 == true) {
					System.out.println(라운드 + "라운드 게임에서 패배하였습니다.");
					라운드 = 1;
					break;
				}
				System.out.println(라운드 + "라운드 게임에서 승리하셨습니다.");
				라운드++;
			case 4:
				if(죽음 == true) {
					System.out.println(라운드 + "라운드 게임에서 패배하였습니다.");
					라운드 = 1;
					break;
				}
				System.out.println(라운드 + "라운드 게임에서 승리하셨습니다.");
				라운드++;
			case 5:
				if(죽음 == true) {
					System.out.println(라운드 + "라운드 게임에서 패배하였습니다.");
					라운드 = 1;
					break;
				}
				System.out.println(라운드 + "라운드 게임에서 승리하셨습니다.");
				라운드++;
			case 6:
				if(죽음 == true) {
					System.out.println(라운드 + "라운드 게임에서 패배하였습니다.");
					라운드 = 1;
					break;
				}
				System.out.println(라운드 + "라운드 게임에서 승리하셨습니다.");
				라운드++;
			case 7:
				if(죽음 == true) {
					System.out.println(라운드 + "라운드 게임에서 패배하였습니다.");
					라운드 = 1;
					break;
				}
				System.out.println(라운드 + "라운드 게임에서 승리하셨습니다.");
				라운드++;
			case 8:
				if(죽음 == true) {
					System.out.println(라운드 + "라운드 게임에서 패배하였습니다.");
					라운드 = 1;
					break;
				}
				System.out.println("모든 라운드 게임에서 승리하셨습니다.");
			default:
		}
		System.out.println("게임종료");

	}

}
