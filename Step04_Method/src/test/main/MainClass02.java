package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		
		/*
		 *  콘솔창에 "안녕하세요"를 출력하려고 한다.
		 *  
		 *  해당 목표를 달성하려면 콘솔창에 출력을 할수 있는 기능을 가진 객체가 필요하다.
		 *  
		 *  그 객체는 어디에 있나? System클래스의 out이라는 static필드에 해당객체의 참조값(키값)이 들어있다.
		 *  
		 *  그 객체는 무슨 type 인가? PrintStream type 이다.
		 *  
		 *  그 객체를 누가 생성했나? java에서 이미 생성해서 미리 준비된 객체이다.
		 *  
		 *  System 클래스는 왜 import 안해도 사용할수 있지?
		 *  
		 *  System, String 등의 클래스는 java.lang 패키지에 있는 클래스이며 
		 *  해당 패키지에 있는 모든 클래스는 마치 기본 클래스 처럼 import없이 사용할수 있다.
		 */
		System.out.println("안녕하세요");
	}
}
