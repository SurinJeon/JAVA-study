package java_chobo.ch10;

import java.util.Calendar;

public class Ex10_5 {

	public static void main(String[] args) {

		if(args.length != 2) {
			System.out.println("Usage : java Ex10_5 2021 2");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance(); // start day
		Calendar eDay = Calendar.getInstance(); // end day
		
		sDay.set(year, month - 1, 1);
		eDay.set(year, month, 1);
	
		eDay.add(Calendar.DATE, -1); // end day에서 1을 빼주어야지 현재 달의 마지막날이 됨
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("        " + args[0] + "년" + args[1] + "월");
		
		System.out.println(" SU MO TU WE TH FR SA ");
		
		for(int i = 1; i < START_DAY_OF_WEEK; i++) {
			System.out.println(" ");
		}
		
		
		for(int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++ ) {
			System.out.println((i < 10)? " " + i : " " + i);
			if(n%7 == 0) {
				System.out.println();
			}
		}
		
		
		
		
	}
	

}
