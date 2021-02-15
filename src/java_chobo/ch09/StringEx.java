package java_chobo.ch09;

public class StringEx {

	public static void main(String[] args) {

		String str = "ab,cd,ef";

		String[] strArr = str.split(","); // str을 구분자를 기준으로 잘라서 배열로 받아오겠다!

		for (String s : strArr) {
			System.out.println(s);
		}

	}

}
