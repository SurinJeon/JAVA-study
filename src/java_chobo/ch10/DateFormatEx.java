package java_chobo.ch10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx {

	public static void main(String[] args) throws ParseException {
		
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a K시");
		// month가 mm이 아니라 MM인 이유는 minute과 혼선 방지 때문
		
		System.out.println(sdf.format(today));
		
//		String str = "2021년 02월 16일 화요일 오후 9시";
//		System.out.println(sdf.parse(str)); // 에러 발생(throws 해도!)왜냐하면 한글이 들어갔기 때문...
		
		String str = "2021년 02월 16일";
		sdf.applyPattern("yyyy년 MM월 dd일");
		System.out.println(sdf.parse(str)); // 대신 여기서는 시분초 00으로 뜸 (미리 주어지지 않았기 때문)

	}

}
