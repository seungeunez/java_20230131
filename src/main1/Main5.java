package main1;

import java.util.Date;

import cls.Board;

public class Main5 {

	public static void main(String[] args) {

		// 1. 객체 생성
		Board board = new Board();

		// 2. 객체를 기반으로 메소드를 사용해서 적절한 일을 수행

		board.setBrdNo(128L); // long 썼을 땐 꼭 L을 넣자
		board.setBrdTitle("Java");
		board.setBrdContent("java class");
		board.setBrdWriter("seung eun");
		board.setBrdHit(10000000L); // long 썼을 땐 꼭 L을 넣자

		board.setBrdDate(new Date());
//		Date date = new Date();
//		board.setBrdDate(date);	위에랑 같은 뜻임 귀찮게 둘로 나누지말고 하나로 합치자

		// 3. toString을 호출해서 현재의 값을 반환 후 출력
		System.out.println(board.toString());

	}

}
