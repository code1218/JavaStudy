package chapter7;

public class ThreeDPrinter<T> { 
	private T material; //Àç·á
	
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}
	
}
