package main1;

//원시타입은 import안해도 되는데 직접만든 것들은 해야함
import cls.Member;

public class Main4 {

	public static void main(String[] args) {
		// 클래스명 객체명 = new 클래스명();
		Member member = new Member();
		
		//아이디 설정
		member.setUserId("aaa");
		
		String result = member.getUserId();
		System.out.println(result);

	}

}
