package java_chobo.ch10;

import java.util.Calendar;
import java.util.Date;

public class DateToCalendarEx {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance(); // 객체 생성하면 현재 시간 받아옴
		
		cal.clear(); // clear하고 새로운 날짜 세팅하기 위함
		cal.set(2020, 0, 1); // month는 실제와 하나씩 차이남(0월 == JAN)
		
		System.out.println(cal); // 이렇게 실행하면 캘린더 정보들 다 저장되어있는게 뜸
		
		// 우리가 알고 있는 날짜 형식으로 찍어내보기
		System.out.println(cal.get(Calendar.YEAR) + "-" + cal.get(Calendar.MONTH + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH));
		
		Date d = new Date(); // 객체 생성하면 시스템 날짜 가져옴
		
		// 날짜 직접 세팅해보기 (근데 이제 1900년대 날짜 기준을 곁들인...)
		d.setYear(19);
		d.setMonth(0);
		d.setDate(1);
		// 이렇게 하면 1919-1-01
		
		System.out.println(d);
		
		System.out.printf("%tF %n", d); // 형식 지정자로 더 예쁘게 출력하기
		
		 conCalToDate(cal);
		 conDateToCal(d);
		
		
	}

	private static void conCalToDate(Calendar cal) {
		System.out.println("convert Calendar to Date");
		Date d = new Date(cal.getTimeInMillis());
		System.out.printf("%tF %n", d);
		
	}

	private static void conDateToCal(Date d) {
		System.out.println("convert Date to Calendar");
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		System.out.println(cal.get(Calendar.YEAR) + "-" + cal.get(Calendar.MONTH + 1) + "-" + cal.get(Calendar.DAY_OF_MONTH));		
	}

}
