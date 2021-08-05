package chapter6_3;

abstract class Animal {
	public abstract void move();
}

class Human extends Animal {
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}

class Tiger extends Animal {
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest {
	Animal[] list = new Animal[5];
	
	public void addAnimal() {
		list[0] = new Human();
		list[1] = new Tiger();
		list[2] = new Eagle();
		
		for(int i = 0; i < list.length; i++) {
			if(list[i] == null) {
				continue;
			}
			list[i].move();
		}
	}
	
	public void casting() {
		for(int i = 0; i < list.length; i++) {
			if(list[i] == null) {
				continue;
			}
			Animal ani = list[i];
			//Animal ani = list[0]; // new Human();
			//Animal ani = list[1]; // new Tiger();
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		
		test.addAnimal();
		System.out.println("업캐스팅");
		System.out.println();
		test.casting();
		System.out.println("다운캐스팅");
		
	}

}
