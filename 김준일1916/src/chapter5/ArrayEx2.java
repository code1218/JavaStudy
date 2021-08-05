package chapter5;

public class ArrayEx2 {

	public static void main(String[] args) {
		String[] Ã¥²ÈÀÌ = new String[10];
		String[] reverseÃ¥²ÈÀÌ = new String[10];
		String[] Ã¥²ÈÀÌ2 = new String[10];
		
		Ã¥²ÈÀÌ[4] = "ÀÚ¹ÙÀÇ Á¤¼®";
		Ã¥²ÈÀÌ[6] = "¸íÇ° ÀÚ¹Ù";
		Ã¥²ÈÀÌ[7] = "Do it ÀÚ¹ÙÇÁ·Î±×·¡¹Ö ÀÔ¹®";
		Ã¥²ÈÀÌ[8] = "ÇÁ·Î±×·¡¹Ö ÀÔ¹®";
		
		Ã¥²ÈÀÌ2[0] = "c¾ð¾î ÇÁ·Î±×·¡¹Ö";
		
		System.out.println(Ã¥²ÈÀÌ[0]);
		
		for(int i = 0; i < Ã¥²ÈÀÌ.length; i++) {
			if(Ã¥²ÈÀÌ[i] == null) {
				continue;
			}
			System.out.println(Ã¥²ÈÀÌ[i]);
			
		}
		/*
		reverseÃ¥²ÈÀÌ[9] = Ã¥²ÈÀÌ[0];
		reverseÃ¥²ÈÀÌ[8] = Ã¥²ÈÀÌ[1];
		reverseÃ¥²ÈÀÌ[7] = Ã¥²ÈÀÌ[2];
		reverseÃ¥²ÈÀÌ[6] = Ã¥²ÈÀÌ[3];
		reverseÃ¥²ÈÀÌ[5] = Ã¥²ÈÀÌ[4];
		reverseÃ¥²ÈÀÌ[4] = Ã¥²ÈÀÌ[5];
		*/
		
		for(int i = 0, j = Ã¥²ÈÀÌ.length - 1; i < Ã¥²ÈÀÌ.length; i++, j--) {
			reverseÃ¥²ÈÀÌ[j] = Ã¥²ÈÀÌ[i];
		}
		
		
		for(int i = 0; i < Ã¥²ÈÀÌ.length; i++) {
			if(Ã¥²ÈÀÌ[6] == null) {
				continue;
			}
			for(int j = 0; j < Ã¥²ÈÀÌ2.length; j++) {
				if(Ã¥²ÈÀÌ2[j] != null) {
					continue;
				}
				Ã¥²ÈÀÌ2[j] = Ã¥²ÈÀÌ[i];
				break;
			}
		}
		System.out.println("Ã¥²ÈÀÌ2");
		for(int i = 0; i < Ã¥²ÈÀÌ2.length; i++) {
			if(Ã¥²ÈÀÌ2[i] == null) {
				continue;
			}
			System.out.println(Ã¥²ÈÀÌ2[i] + " index: " + i);
		}
		

	}

}






