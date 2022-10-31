package test.main;

import java.util.HashMap;
/*
 *  java에서 어떤 데이터를 key : value의 쌍으로 관리하고 싶으면
 *  
 *  HashMap 객체를 사용한다.
 *  
 *  key의 generic도 마음대로 지정할수 있지만 보통 String type이다.
 *  
 *  value의 generic Object로 지정한다.
 */
public class MainClass06 {
	public static void main(String[] args) {
		/*
		 *  번호 : 1
		 *  이름 : 김구라
		 *  남자인지 여부 : true
		 */
		HashMap<String, Object> map1 =  new HashMap<>();
		map1.put("num",1);
		map1.put("name", "김구라");
		map1.put("isMan", true);
		
		// 리턴되는 Object type을 원래 type으로 casting해야한다.
		int num = (int)map1.get("num");
		String name = (String)map1.get("name");
		boolean isMan = (boolean)map1.get("isMan");
		
		//동일한 key 값으로 다시 담으면 수정
		map1.put("name", "에이콘");
		
		//특정 key 값으로 담긴 내용 삭제, 성공하면 true, 실패하면 false 리턴
		map1.remove("isMan");
		
		//모두 삭제
		map1.clear();
	}
}
