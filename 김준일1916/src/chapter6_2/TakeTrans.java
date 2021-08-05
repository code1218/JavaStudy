package chapter6_2;

public class TakeTrans {

	public static void main(String[] args) {
		Student kim = new Student("김호", 20000);
		Student pack = new Student("박애진", 30000);
		
		Bus b1 = new Bus("43다 1317");
		Bus b2 = new Bus("14나 7777");
		
		Subway s1 = new Subway("1호선");
		Subway s2 = new Subway("2호선");
		
		kim.takeBus(b1, 13000);
		pack.takeBus(b1, 13000);
		
		kim.showInfo();
		pack.showInfo();
		b1.showInfo();
		
		kim.getOffBus(b1);
		b1.showInfo();
		pack.getOffBus(b1);
	}

}
