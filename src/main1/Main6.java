package main1;

import java.util.Date;

import cls.Item;

public class Main6 {

	public static void main(String[] args) {
		Item item = new Item();

		item.setNo(168L);
		item.setName("사과");
		item.setContent("상큼함");
		item.setPrice(8500);
		item.setQuantity(100000L);
		item.setDate(new Date());

		System.out.println(item.toString()); // 현재 저장된 내용 확인

	}

}
