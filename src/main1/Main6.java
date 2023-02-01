package main1;

import java.util.Date;

import cls.Item;

public class Main6 {

	public static void main(String[] args) {

		// 1. 물품등록
		Item item = new Item();

		item.setNo(168L);
		item.setName("사과");
		item.setContent("상큼함");
		item.setPrice(10000);
		item.setQuantity(95L);
		item.setDate(new Date());

		// 2. 20%할인한 금액으로 자동 계산
		item.discountPrice(0.2f);	
		// 0.8f로 해주면 Item 클래스에서는 this.price * per로 해줘야함

		// 3. 재고 수량이 100개 미만이면 1000개로 변경인데
		// 100개 추가해주는것같음
		item.checkQuantity(100);
		
		
		// 4. 물품내용을 확인
		System.out.println(item.toString()); // 현재 저장된 내용 확인

	}

}
