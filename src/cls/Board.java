package cls;

import java.util.Date;

//글번호(long) brdNo, 글제목(String)brdTitle
//글내용(String)brdContent, 작성자(String)brdWriter
//조회수(long)brdHit, 등록일자(Date)brdDate 


public class Board {
	
	long brdNo = 0;
	String brdTitle = "";
	String brdContent = "";
	String brdWriter = "";
	long brdHit = 0;
	Date brdDate = null;
	
	
	@Override
	public String toString() {
		return "Board [brdNo=" + brdNo + ", brdTitle=" + brdTitle + ", brdContent=" + brdContent + ", brdWriter="
				+ brdWriter + ", brdHit=" + brdHit + ", brdDate=" + brdDate + "]";
	}
	public long getBrdNo() {
		return brdNo;
	}
	public void setBrdNo(long brdNo) {
		this.brdNo = brdNo;
	}
	public String getBrdTitle() {
		return brdTitle;
	}
	public void setBrdTitle(String brdTitle) {
		this.brdTitle = brdTitle;
	}
	public String getBrdContent() {
		return brdContent;
	}
	public void setBrdContent(String brdContent) {
		this.brdContent = brdContent;
	}
	public String getBrdWriter() {
		return brdWriter;
	}
	public void setBrdWriter(String brdWriter) {
		this.brdWriter = brdWriter;
	}
	public long getBrdHit() {
		return brdHit;
	}
	public void setBrdHit(long brdHit) {
		this.brdHit = brdHit;
	}
	public Date getBrdDate() {
		return brdDate;
	}
	public void setBrdDate(Date brdDate) {
		this.brdDate = brdDate;
	}
	
	
}
