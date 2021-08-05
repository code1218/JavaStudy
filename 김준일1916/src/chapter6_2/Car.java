package chapter6_2;

public class Car{
	private String company; //회사
	private String model; //모델명
	private String color; //색상
	private int year; //연식
	
	//get은 매개변수X 반환형O
	//set은 매개변수O 반환형X
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setYear(int year) {
		this.year = year+1;
	}
	
	public int getYear() {
		return year-1;
	}
	
}
