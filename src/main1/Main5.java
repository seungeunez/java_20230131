package main1;

import java.util.Date;
import cls.Board;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Board board = new Board();
		
		Date date = new Date();
		
		board.setBrdNo(128);
		board.setBrdTitle("Java");
		board.setBrdContent("java class");
		board.setBrdWriter("seung eun");
		board.setBrdHit(10000000);
		board.setBrdDate(date);
		
		
		System.out.println(board.toString());
		

	}

}
