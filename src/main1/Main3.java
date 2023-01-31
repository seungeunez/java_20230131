package main1;

//문자열 String 클래스
public class Main3 {

	public static void main(String[] args) {

		// Scanner와 달리 import 안함
		// import 안하는 이유? java.lang.* 안에 있기때문에 굳이 안하는 것
		// 클래스명 객체명 = new 클래스명(준비물);
		String str = new String("hello world");
		
		String str1 = "Hello World"; // 위의 코드가 귀찮으니 원시타입 처럼 쓸 수도 있음
									 // 원시타입 처럼 쓰지만 클래스임
		
	
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str1.length());	// 길이 출력
		
		
		//String 클래스의 기능중에서 substring을 사용한 경우
		System.out.println(str1.substring(0, 3)); //위치가 0부터 2까지의 문자열 출력
												  // 마지막 위치는 출력 안 함 
		
		
		
		String[] ret = str.split(" ");	// 원하는 기준 문자로 분할하기
										// 내가 설정한것은 공백이니 공백 앞,뒤 문자를 나눔
		System.out.println(ret[0]);	// ret[0] = hello 
		System.out.println(ret[1]);	// ret[1] = world
		
		
		
		
		
		
		
	}

}
