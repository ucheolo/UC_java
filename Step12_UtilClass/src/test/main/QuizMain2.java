package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuizMain2 {
	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		
		/*
		 *  검색할 단어를 입력하세요 : house
		 *  house 의 뜻은 집입니다.
		 *  
		 *  검색할 단어를 입력하세요 : gura
		 *  gura 는 목록에 없습니다.
		 */
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색할 단어를 입력하세요(종료=>q) : ");
			String word = scanner.nextLine();
			
			if(word.equals("q")) {
				break;
			}
			
			if(!dic.containsKey(word)) {
				System.out.println(word+" 는 목록에 없습니다.");
			}else {
				System.out.println(word+" 의 뜻은 "+dic.get(word)+"입니다.");
			}
		}
		System.out.println("종료하였습니다.");
			
	}
}
