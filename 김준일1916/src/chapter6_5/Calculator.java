package chapter6_5;

public class Calculator implements Calc{
	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	@Override
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}
	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}
	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}else {
			return Calc.ERROR;
		}
	}
}





