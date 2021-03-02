package java_chobo.ch14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaEx02 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
		
		// abc 순으로 정렬 하려고 함 << 사전순

		System.out.println("before sort : " + list);
		
		// fm방식 (역순 정렬함)
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1); // 내부적으로 해시코드 값을 빼서 구함
			}
		};
		
		Collections.sort(list, comp);
		
		System.out.println("after sort: " + list);
		
		// Lambda식을 사용한 방법 (사전순 정렬)
		Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
		
		System.out.println("after sort by Lambda expression : " + list);
		
		
	}
	
}
