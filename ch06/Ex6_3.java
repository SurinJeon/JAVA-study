package java_chobo.ch06;

import java.util.Arrays;

public class Ex6_3 {

	public static void main(String[] args) {

		// 객체배열 : 객체 투머치... 배열로 받는 방법을 찾아서,,,
		
		Tv[] tvArr = new Tv[3]; // 캐비넷 세 칸 생성, 그 안은 텅 비었다,,,(초기값)
		System.out.println(Arrays.toString(tvArr));
		
		
		// 지금 객체가 세 개 들어가는거임!!!
		tvArr[0] = new Tv(); // 내용물을 넣는데 그 내용물이 초기화 값이 든 객체임
//		System.out.println(tvArr[0]); // 초기화된 객체가 튀어나옴
		
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();

		prnArrTv(tvArr);
		
		// 첫번째 캐비넷에 들어가는 객체의 instance var 값 바꿔주기
		tvArr[0].color = "red";
		tvArr[0].isPower = true;
		tvArr[0].channel = 10;
		
		prnArrTv(tvArr);
		
		// 배열 안 객체를 모두 순회하며, 거기에 있는 채널을 하나씩 올리겠단 뜻
		for(Tv t : tvArr) {
			t.channelUp();
		}
		
		prnArrTv(tvArr);
		
	} // end of main
	

	private static void prnArrTv(Tv[] tvArr) {
		for(Tv t : tvArr) {
			System.out.println(t);
		}
		System.out.println();
	} // end of prnArrTv
	

} // end of class
