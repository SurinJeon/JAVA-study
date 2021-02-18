package java_chobo.ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class HashSetEx {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();

		// 랜덤한 정수를 입력받아서 넣을 것

		Random rnd = new Random(1234); // seed 넣어서 처음엔 랜덤하고 그 이후부턴 고정된 값이 나오도록

		// ArrayList와 HashSet의 결정적인 차이점 >> 중복을 허용하느냐 아니냐
		ArrayList<Integer> list = new ArrayList<Integer>();

		// 크기 10개로 list와 set에 입력해보기
		for (int i = 0; i < 10; i++) {
			int r = rnd.nextInt(5); // 크기가 10인데 숫자는 0~5이기 때문에 반드시 중복이 일어날 수 밖에 없음
			list.add(r);
			set.add(r);
		}
		System.out.println("list >> " + list); // 중복가능
		System.out.println("set >> " + set); // 중복 모두 제거해버림 (중복 아닌 요소만 들어감)

	}

}
