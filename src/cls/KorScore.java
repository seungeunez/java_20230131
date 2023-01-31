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

	// 학생들의 점수 합계를 구해주는 메소드
	public int sumScore() { // ()안에 데이터 필요없음 우리가 이미 값을 줬기 때문에
		int sum = 0;
		int i = 0; // 반복문 임시변수

		for (i = 0; i < this.score.length; i++) {
			sum += this.score[i];
		}

		return sum;

	}

	// 학생들의 점수 평균 구하기
	public float avgScore() {
		float avg = 0.0f;
		int sum = this.sumScore();

		// avg = (float)this.sumScore()/this.score.length; //내가 한 거
		avg = (float) sum / (float) this.score.length; // 둘 다 정수면 둘 중하나는 실수로 만들어야함
		return avg;

	}

	// 최고값 구하기
	public int scoreMax() {
		int i;

		// 20, 99,70, 98, 100
		int max = this.score[0]; // 0번째 위치의 값을 먼저 지정해두기 20
		for (i = 0; i < this.score.length; i++) {
			if (max < this.score[i]) {
				max = this.score[i]; // 더 큰 숫자가 나오면 max로 옮기는거임
			}
		}
		return max;

	}
	
	//최소값 구하기
	public int scoreMin() {
		
		int i;

		// 20, 99,70, 98, 100
		int min = this.score[0]; // 0번째 위치의 값을 먼저 지정해두기 20
		for (i = 0; i < this.score.length; i++) {
			if (min > this.score[i]) {
				min = this.score[i]; // 더 작은 숫자가 나오면 max로 옮기는거임
			}
		}
		return min;

	}

	// 90점 이상인 사람 구하기
	public int score90() {

		int cnt = 0;
		int i = 0;

		for (i = 0; i < this.score.length; i++) {

			if (this.score[i] >= 90) {
				cnt++;
			}

		}

		return cnt;
	}

}
