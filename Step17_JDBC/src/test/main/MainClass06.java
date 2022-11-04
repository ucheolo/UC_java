package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;

/*
 *  JDBC ( Java DataBase Connectivity )
 *  
 *  DataBase 에 연결해서 SELECT, INSERT, UPDATE, DELETE 작업하기
 *  
 *  Oracle 에 연결하기 위해서는 드라이버 클래스가 들어있는 ojdbc6.jar 파일을
 *  사용할수 있도록 설정해야 한다.
 */
public class MainClass06 {
   public static void main(String[] args) {
    
      //시퀀스(member_seq)를 이용해서 회원정보 추가
      String name = "김구라";
      String addr = "노량진";
      
      
      //INSERT 작업을 위해서 필요한 객체의 참조값을 담을 지역 변수 미리 만들기 
      Connection conn = null;
      PreparedStatement pstmt=null;
      try {
    	 //Connection 객체의 참조값 얻어오기
    	  conn = new DBConnect().getConn();
         //실행할 미완성의 sql 문
         String sql="INSERT INTO member"
        		 + " (num, name, addr)"
        		 + " VALUES(member_seq.NEXTVAL, ?, ?)";
         //PreparedStatement 객체의 참조값 얻어오기
         pstmt=conn.prepareStatement(sql);
         // ? 에 값을 바인딩해서 미완성의 sql 문을 완성 시킨다.
         pstmt.setString(1, name);
         pstmt.setString(2, addr);
         //sql 문 실행하기
         pstmt.executeUpdate();
         System.out.println("회원 정보를 추가했습니다.");
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
    	  try {
    		  if(pstmt!=null)pstmt.close();
    		  if(conn!=null)conn.close();
    	  }catch(Exception e) {}
      }
   }
}





















