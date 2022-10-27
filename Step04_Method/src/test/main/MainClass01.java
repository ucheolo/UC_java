package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		MyObject mo = new MyObject();
		mo.walk();
		int num = mo.getNumber();
		String greet = mo.getGreeting();
		
		Car car = mo.getCar();
		// setNum(), setName(), useCar() 메소드 호출
		
		// 메소드 호출하면서 인자로 전달할 데이터를 즉석에서 만들어서 전달
		mo.setNum(17);
		mo.setName("UC");
		mo.useCar(new Car());
		
		// 메소드 호출하면서 인자로 전달할 값이 지역변수에 이미 존재하는 경우라고 가정
		int a = 777;
		String b = "누구게";
		Car c1 = new Car();
		
		// 전달하 값이 들어있는 변수명으로 전달할수 있다.
		mo.setNum(a);
		mo.setName(b);
		mo.useCar(c1);
		
		//doSomething() 메소드 호출
		mo.doSomething(17, "gura", new Car());
	}
}
