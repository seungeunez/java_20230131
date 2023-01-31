package main1;

import java.util.Date;

//원시타입은 import안해도 되는데 직접만든 것들은 해야함
import cls.Member;

public class Main4 {

	public static void main(String[] args) {
		// 클래스명 객체명 = new 클래스명();
		Member member = new Member();
		
		//값 설정
		member.setUserId("aaa"); 
		member.setUserAge(15); //int
		member.setUserEmail("a@a.com");
		member.setUserPW("bbb");
		member.setUserPhone("010-0001-0002");
		
		// 클래스명 date = new 클래스명();
		Date date = new Date();
		member.setUserDate(date);
		
		// get이 외부(Member)로 전달
		String result = member.getUserId();
		System.out.println(result);
		
		System.out.println(member.toString());
		
		

	}

}
