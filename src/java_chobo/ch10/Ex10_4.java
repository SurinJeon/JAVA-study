package java_chobo.ch10;

import java.util.Calendar;

public class Ex10_4 {

	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance();
		date.set(2019, 7, 31); // 2019/08/31 설정
		
		System.out.println(toString(date));
		System.out.println("--- 1일 후 ---");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("--- 6달 전 ---");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("--- 31일 후 (roll) ---");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date)); // 4월 1일이 아니라 date 부분만 바뀌어서 3월 1일이 나옴(다른 필드에 영향X)
		
		System.out.println("--- 31일 후 (add) ---");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date)); // 알아서 4월 1일 됨(다른 필드까지 바꿈)
		
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "/" + (date.get(Calendar.MONTH) + 1) + "/" + date.get(Calendar.DATE);
	}
}
