package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		String str = "abcde12345";
		int result = str.length();
		char result2 = str.charAt(4);
		/*
		 * String 객체의 메소드를 할용해서
		 * str 변수 안에 있는 문자를 모두 대문자(UpperCase)로 변환해서
		 * str2라는 이름의 변수에 담아보세요
		 */
		String str2 = str.toUpperCase();
		
		String greet = "Hello! mimi, Bye! mimi";
		// 위의 문자열에서 mimi라는 문자열을 mama라는 문자열로 교체해서 결과를 greet2에 담아보세요
		// 단, String객체의 메소드를 활용해서
		String greet2 = greet.replace("mimi", "mama");
		
		String message = "My name is Kimgura";
		/*
		 *  1. 위의 문자열이 My라는 문자열로 시작하는지 여부(true or false)를 isStart라는 변수에 담아
		 *  
		 *  2. 위의 문자열에서 i가 문자열의 몇번째 인덱스에 위치하고 있는지를 index라는 변수에 담아
		 */
		boolean isStart = message.startsWith("My");
		int index = message.indexOf("i");
		System.out.println(isStart);
		System.out.println(index);
	}
}
/*
 * heap 영역(사물함영역)에 만들어지는 무언가를 객체라고한다.
 * java를 객체지향언어라고 한다.
 * 객체는 필드와 메소드로 이루어져있다.
 * 필드는 값의 저장소, 메소드는 기능이다.
 * 즉, java로 프로그래밍 한다는 것은 여러가지 type 객체의 필드와 메소드를 활용해서
 * 어떤 목적을 달성하는 것이다.
 */