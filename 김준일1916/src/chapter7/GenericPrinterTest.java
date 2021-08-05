package chapter7;

public class GenericPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter<Powder> printerP = new ThreeDPrinter<Powder>();
		ThreeDPrinter<Plastic> printerPt = new ThreeDPrinter<Plastic>();
		
		Powder temp = new Powder();
		
		printerP.setMaterial(temp);
		Powder p = printerP.getMaterial();
		System.out.println(p);
		
		printerPt.setMaterial(new Plastic());
		Plastic pt = printerPt.getMaterial();
		System.out.println(pt);

	}

}
