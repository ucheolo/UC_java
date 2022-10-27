package test.main;

import test.mypac.*;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  1. MacBook 객체를 생성해서 참조값을 mac1이라는 지역변수에 담아보세요.
		 *  단, MacBook 클래스를 절대 수정하지 마세요
		 */
		MacBook mac = new MacBook(new Cpu(), new Memory(), new HardDisk() );
		//2. mac1 지역변수에 들어있는 참조값을 이용해서 .doGame()이라는 메소드를 호출해보세요.
		mac.doGame();
		
		//MacBook 클래스의 생성자의 인자로 전달할 값이 지역변수에 준비가 되어 있다고 가정
		Cpu c1 = new Cpu();
		Memory m1 = new Memory();
		HardDisk h1 = new HardDisk();
		
		//아래와 같이 MacBook 객체를 생성할수도 있다. 
		MacBook mac2 = new MacBook(c1, m1, h1);
		mac2.doGame();
	}
}
