package java_chobo.ch11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class ListEx {

	public static void main(String[] args) {

		System.out.println("Iterator with ArrayList");
		ArrayList<Department> deptList = new ArrayList<>();

		deptList.add(new Department(1, "기획", 20));
		deptList.add(new Department(2, "개발", 21));
		deptList.add(new Department(3, "인사", 22));
		deptList.add(new Department(4, "총무", 23));

		// 애초에 iterator() 를 돌리기 위해서 변수 만드는거임...
		Iterator<Department> i1 = deptList.iterator();

		while (i1.hasNext()) {
			System.out.println(i1.next()); // deptList 가져오는거 아님 무한루프돈다..^^..
		}

		System.out.println("Iterator with HashMap");
		HashMap<Integer, Department> deptHash = new HashMap<>();

		deptHash.put(1, new Department(1, "기획", 20));
		deptHash.put(2, new Department(2, "개발", 21));
		deptHash.put(3, new Department(3, "인사", 22));
		deptHash.put(4, new Department(4, "총무", 23));

		// Iterator로 순회해서 접근하기
		Iterator<Entry<Integer, Department>> i2 = deptHash.entrySet().iterator();

		// Iterator가 다음값을 가질때까지 돌린다
		while (i2.hasNext()) {
			Entry<Integer, Department> e = i2.next();
			System.out.print("key" + e.getKey() + "  ");
			System.out.println(e.getValue());
		}

	}

}
