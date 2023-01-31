package main1;

public class Main1 {

	public static void main(String[] args) {
		// 원시 타입
		// 정수형 byte, short, int, long
		// 실수형 float, double
		// 문자형 char
		// 논리형 boolean
		
		//클래스
		// 정수형 Byte, Short, Integer, Long => 클래스로 만들어 놓은 것 
		// String	//String은 원시타입 아님 char만 원시타입임
		
		// 기존에 존재하는 것들 중 내가 원하는 타입 없을 수 있으니 타입을 직접 만들 수도 있음
		// 내가 만드는 타입은 클래스임
		
		// 타입을 왜 배웠냐면 내가 원하는 타입을 만들고 그 중에 얘네를 뽑아서 쓰는거임
		
		char[] name= {'t','s','e'};	//하나씩 따로 하는게 불편해서 String으로 하는거임
		
		int age=13;
		
		
		
		//조건문
		// if(조건) 비교: >= <= == !=
		// if(조건 && 조건) AND: &&, OR: ||, NOT: !
		if(age >= 50) {
			System.out.println("50보다 크거나 같습니다");
		}else {
			System.out.println("50보다 작습니다");
		}
			
		
		// 반복문: for, while, do while
		int i = 0;	//반복문 임시 변수
		for(i=1; i<=5; i++) {// 1 2 3 4 5 6(X) => 6까지 가고 탈출함
			System.out.print(i+" ");	// 출력 => 1 2 3 4 5
		}
		
		System.out.println();
		
		// 반복문+조건문(1) beak;
		for(i=1; i<=1000; i++) {	// 1부터 1001까지 가는데 1001에서 탈출
			if(i>=10) {	// i가 10이 됐을 때
				break;  // 반복문 강제 종료시킴	 10일때 종료 11부터는 수행X
				//break;의 역할은 강제종료
			}
		}
		
		// 반복문+조건문(2) continue;
		// 1~10까지 홀수 출력
		for(i=1; i<=10; i++) {
			if(i%2==0) {	//짝수일 경우에
				continue;	// 현위치를 기준으로 아래 소스코드는 수행되지 않음
			}
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		
		System.out.println(Integer.SIZE);	// 32bit => 4byte
		System.out.println(Double.SIZE);
		
		System.out.println("결과는" + 13);	//여기서는 String을 쓴것
		
		


	}

}
