package cls;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//위의 코드는 @들은 외부에서 처리하고 값가져오고 뭐 그런것들임 

// 5명의 학생의 국어 점수를 보관하고 처리할 클래스
public class KorScore {

	private String[] student = new String[5];
	private int[] score = new int[5];
	
	// getter, setter, toString 메소드가 존재함
	
	
	//학생들의 점수 합계를 구해주는 메소드
	public int sumScore() { // ()안에 데이터 필요없음 우리가 이미 값을 줬기 때문에 
		int sum = 0;
		

		
		return sum;
	}
	
}
