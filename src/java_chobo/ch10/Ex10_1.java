package java_chobo.ch10;

import java.util.Calendar;

public class Ex10_1 {

	public static void main(String[] args) {

		Calendar today = Calendar.getInstance(); // 인스턴스는 기본적으로 현재 날짜와 시간으로 생성
		System.out.println("Year : " + today.get(today.YEAR));
		System.out.println("Month (0 >>JAN) : " + today.get(today.MONTH));
		System.out.println("week of year : " + today.get(today.WEEK_OF_YEAR));
		System.out.println("week of month : " + today.get(today.WEEK_OF_MONTH));

		System.out.println("----------------------------------------");

		System.out.println("date " + today.get(today.DATE)); // date == day of month
		System.out.println("day of month : " + today.get(today.DAY_OF_MONTH)); // date == day of month
		System.out.println("day of year : " + today.get(today.DAY_OF_YEAR)); // 365일 중 몇 일
		System.out.println("date (1-7, 1 >> SUN) : " + today.get(today.DAY_OF_WEEK));
		System.out.println("이 달의 몇 째 요일 : " + today.get(today.DAY_OF_WEEK_IN_MONTH));

		System.out.println("----------------------------------------");

		System.out.println("오전_오후(0: 오전, 1: 오후) : " + today.get(today.AM_PM));
		System.out.println("시간(0 ~ 11) : " + today.get(today.HOUR));
		System.out.println("시간(0 ~ 23) : " + today.get(today.HOUR_OF_DAY)); // of day가 들어가면 전체!
		System.out.println("분(0 ~ 59) : " + today.get(today.MINUTE));
		System.out.println("초(0 ~ 59) : " + today.get(today.SECOND));
		System.out.println("1000분의 1초(0~999) : " + today.get(today.MILLISECOND));

		System.out.println("----------------------------------------");

																					// 1시간 = 60 * 60
		System.out.println("TimeZone(-12~+12) : " + (today.get(today.ZONE_OFFSET) / (60 * 60 * 1000))); // 천분의 1초를 시간으로 나타내기 위해 나누기 해줌
		System.out.println("last day of this month : " + today.getActualMaximum(today.DAY_OF_MONTH));

	}

}
