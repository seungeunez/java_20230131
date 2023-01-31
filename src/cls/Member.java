package cls;


//원시타입은 import안해도 되는데 직접만든 것들은 해야함
import java.util.Date;

//내가 원하는 타입을 만듦. 실행하는 클래스 아님, 그니깐 그 void main 클릭하면 안됨
//아이디, 암호, 이메일, 나이, 주소, 연락처, 가입일자 등 (설계상에서 정해지는 항목)
public class Member {
	
	// 클래스를 만들 땐 기능을 많이 넣어줘야 main에서 일하는게 수월하다.
	// 비어있는 상태 유지. 건들면 안됨 형태 유지 할 것
	String userId = "";
	String userPW = "";
	String userEmail = "";
	int userAge = 0;	// 숫자형에서 001 => 1이 됨 맨 앞에 0이 존재할 수 없다.
	String userPhone = "000-0000-0000";
	Date userDate = null; // 클래스형의 타입을 만들어 놓음
	
	

	// 데이터를 집어넣고 꺼내쓰는 역할이 필요함 
	// 누군가에 의해서 값을 저장시키는 역할 setter
	// 누군가에 의해서 값을 가지고 갈 수 있는 역할 getter
			
	// 메소드(함수)라고 함
	// 우클릭 - Source - Generate Setter and Getter 
	// 1. Main4에서 사용할 수 있다. public
	// 2. 반환타입(String) 문자로 반환해야함. 반환타입이 String이라서
	// 3. 메소드명(Main4에서 전달할 값) => 현재는 없음
	
	
	// 우클릭 - Source - Generate toString()
	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPW=" + userPW + ", userEmail=" + userEmail + ", userAge=" + userAge
				+ ", userPhone=" + userPhone + ", userDate=" + userDate + "]";
	}

	//메소드는 통로 역할 값이 지정되어 있으면 바꿀 수가 없어
	public String getUserId() {
		return userId;
	}
	
	//main4에서 아이디를 받으면 여기에다가 넣는 것
	//여기에다가 넣는다는 것은 위의 값에 보내버리는것
	public void setUserId(String userId) {
		this.userId = userId;
	}
	

	
	public String getUserPW() {
		return userPW;
	}
	
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public Date getUserDate() {
		return userDate;
	}
	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}
	

	

}
