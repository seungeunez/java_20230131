package main1;

//해결해야 정답
//배열은 효율적으로 보기위해?
public class Main2 {

	public static void main(String[] args) {

		// 배열의 위치는 0부터 시작한다 0 1 2 3 4 이런식으로
		// 맨 마지막 위치는 (전체개수-1)이다
		int i; // 반복문 임시변수
		int[] age = { 1, 2, 3, 4, 5 }; // 나이 변수가 5개 생성
		// 위의 코드가 밑과 동일하다
		/*
		 * int age1 = 1; int age2 = 2; int age3 = 3; int age4 = 4; int age5 = 5;
		 */

		System.out.println(age[0]);
		System.out.println(age[4]);

		for (i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		System.out.println();

		
		
		// Q1. age의 값들을 반대로 출력하세요(1) 이게 낫다
		//  4부터 0까지 거꾸로 출력해야하니깐 4-1 3-1 2-1 이런식으로 함

		for (i=age.length-1; i >= 0; i--) {
			System.out.print(age[i]);
		}

		System.out.println();
		
		// Q1. age의 값들을 반대로 출력하세요(2)

		for (i = 0; i < age.length; i++) {
			System.out.print(age[4 - i] + " ");
		}

		System.out.println();
		
		

		// Q2. age의 값들의 합과 평균 구하기
		int sum = 0;
		float avg = 0;

		for (i = 0; i < age.length; i++) {
			sum += age[i];
		}
		System.out.print("합:" + sum);
		System.out.println();
		avg = sum / age.length;
		System.out.println("평균:" + avg);

		System.out.println();

		
		
		// Q3. age 5개 중에서 짝수만 출력

		for (i = 0; i < age.length; i++) {
			if (age[i] % 2 == 0)
				System.out.print(age[i]);

		}

	}

}
