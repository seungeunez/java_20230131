package cls;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

//글번호(long) brdNo, 글제목(String)brdTitle
//글내용(String)brdContent, 작성자(String)brdWriter
//조회수(long)brdHit, 등록일자(Date)brdDate 

//자바 프로젝트 폴더 우클릭
//Configure - convert to setter getter?
//Update Project ..  - Force Update까지 체크하고 OK누르기

//lombok-1.18.12.jar 설치하기

public class Board {

	// private 외부에서 사용하지 말라고 쓰는 것
	// long쓸땐 L 넣는거 잊지말자
	private long brdNo = 0L; // 글번호
	private String brdTitle = ""; // 제목
	private String brdContent = ""; // 내용
	private String brdWriter = ""; // 작성자
	private long brdHit = 0L; // 조회수
	private Date brdDate = null; // 날짜

//	@Override
//	public String toString() {
//		return "Board [brdNo=" + brdNo + ", brdTitle=" + brdTitle + ", brdContent=" + brdContent + ", brdWriter="
//				+ brdWriter + ", brdHit=" + brdHit + ", brdDate=" + brdDate + "]";
//	}
//	
//	public long getBrdNo() {
//		return brdNo;
//	}
//	public void setBrdNo(long brdNo) {
//		this.brdNo = brdNo;
//	}
//	public String getBrdTitle() {
//		return brdTitle;
//	}
//	public void setBrdTitle(String brdTitle) {
//		this.brdTitle = brdTitle;
//	}
//	public String getBrdContent() {
//		return brdContent;
//	}
//	public void setBrdContent(String brdContent) {
//		this.brdContent = brdContent;
//	}
//	public String getBrdWriter() {
//		return brdWriter;
//	}
//	public void setBrdWriter(String brdWriter) {
//		this.brdWriter = brdWriter;
//	}
//	public long getBrdHit() {
//		return brdHit;
//	}
//	public void setBrdHit(long brdHit) {
//		this.brdHit = brdHit;
//	}
//	public Date getBrdDate() {
//		return brdDate;
//	}
//	public void setBrdDate(Date brdDate) {
//		this.brdDate = brdDate;
//	}
//	

}
