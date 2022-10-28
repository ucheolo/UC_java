package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;

public class MainClass03 {
	public static void main(String[] args) {
		// Zoo 클래스에 있는 getMonkey() 메소드를 호출해서
		// 리턴되는 값을 m1이라는 지역변수에 담아 보세요.
		
		//Monkey m1 = new Zoo().getMonkey();
		Zoo z = new Zoo();
		Monkey m1 = z.getMonkey(); // Zoo.Monkey m1 = z.getMonkey()도 가능
		m1.say();
		
		Tiger t1 = z.getTiger();
		t1.say();
		
		// 메소드 안에도 클래스 정의 할수 있다.
		// 지역 내부 클래스, Local Inner Class
		class Gura{
			public void say() {
				System.out.println("안녕 나는 Gura야!");
			}
		}
		
		Gura g1 = new Gura();
		g1.say();
	}
}
