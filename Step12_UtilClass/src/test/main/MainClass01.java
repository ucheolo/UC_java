package test.main;

import java.util.ArrayList;
import java.util.List;

/*
 *  java에서 배열은 크기를 조절할수 없는 고정 배열이다.
 *  
 *  따라서 동적으로 item을 추가하고 삭제하고 하는 작업을 하려면 일반배열을 사용할수 없다.
 *  
 *  그래서 해당 작업을 하려면 ArrayList 객체를 사용하면 된다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		// "김구라", "해골", "원숭이" 3개의 String type을 저장해 보세요.
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		// 0 번방의 아이템을 불러와서 item이라는 변수에 담아보세요
		String item = names.get(0);
		// 1 번방의 아이템을 삭제하려면?
		names.remove(1);
		// 0 번방에 "에이콘"을 넣고 싶으면?
		names.set(0, "에이콘");
		// 저장된 아이템 갯수(size)를 size라는 지역변수에 담아보세요
		int size = names.size();
		System.out.println(names + " " + size);
		
		// 저장된 모든 아이템 전체 삭제
		//names.removeAll(names);
		names.clear();
		if(names.isEmpty()) {
			System.out.println("비어있다");
		}
		
	}
}
