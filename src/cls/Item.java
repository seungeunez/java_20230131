package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
// @ctrl+space 누르면 나옴


//클래스
public class Item {

	private long no=0L; //물품번호
	private String name = null; //물품명 문자열은 null로 초기화를 많이 함
	private String content = null; //물품내용
	private int price = 0; // 가격
	private long quantity = 0L; //수량
	private Date date = null;
	
}
