package main1;

import cls.KorScore;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1. 사용자가 입력한 값
		String[] s1 = { "송주현", "이혜빈", "최민서", "이도희", "황소영" };
		int[] s2 = { 20, 99, 70, 98, 100 };
		
		// 2. KorScore 클래스로 계산해야하는 데이터를 전송(setter)
		KorScore obj = new KorScore();
		obj.setStudent(s1);
		obj.setScore(s2);
		
		
		// 3. 전체 합계를 구하기
		
		// 4. 전체 평균 구하기
		
		// 5. 최대 점수 구하기
		
		// 6. 최소 점수 구하기
		
		// 7. 90점 이상인 사람 몇 명일까
		
		// 8. 확인
		System.out.println(obj.toString());

	}
	
	

}
