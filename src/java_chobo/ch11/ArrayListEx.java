package java_chobo.ch11;

import java.util.ArrayList;
import java.util.Comparator;

class Department {
	int deptNo;
	String deptName;
	int floor;

	public Department(int deptNo) {
		this.deptNo = deptNo;
	}

	public Department(int deptNo, String deptName, int floor) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.floor = floor;
	}

	@Override
	public String toString() {
		return String.format("Department >> %s번, %s부서, %s층", deptNo, deptName, floor);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (deptNo != other.deptNo)
			return false;
		return true;
	}

}

public class ArrayListEx {

	public static void main(String[] args) {

		// 1. ArrayList 기초
		 arrayListBasic();

		// 2. ArrayList 활용
		// 위에 정의한 Department class로 만들어보기
		arrayListDept();
		
	}

	private static void arrayListDept() {
		ArrayList<Department> deptList = new ArrayList<Department>();

		deptList.add(new Department(1, "기획", 20));
		deptList.add(new Department(2, "개발", 10));
		deptList.add(new Department(3, "재무", 30));
		
		prnList(deptList); // 출력용의 method 만들기

		boolean isContain = deptList.contains(new Department(2));
		/*
		 *  generate hashcode and equals를 통해 eqauls를 overriding 했기 때문에 
		 *  포함되었는지 객체 생성으로 찾아낼 수 있음
		 *  equals를 하지 않으면 어떤 데이터와 비교할 지 정해주지 않은 것과 똑같음
		 *  우리가 deptNo로 객체를 생성했지만, deptNo와 비교할 것인지, floor와 비교할 것인지
		 *  알려주지 않은 것와 마찬가지. equals 반드시 해야함
		 */
		System.out.println(isContain);
		
		int idx = deptList.indexOf(new Department(3)); // 3번 부서가 위치한 idx 값은 2가 될 것
		System.out.println("idx >> " + idx); 
		
		deptList.remove(2); // 이렇게 하면 boolean 타입으로 반환함
		prnList(deptList); // >> idx가 2였던 3번부서가 사라짐
		
		deptList.set(1, new Department(2, "IT", 49)); // >> idx가 1이였던 개발부서가 IT부서로 바뀜
		prnList(deptList);
	}

	private static void prnList(ArrayList<Department> deptList) {
		
		for(Department d : deptList) {
			System.out.println(d);
		}
		
	} // end of prnList()

	private static void arrayListBasic() {

		ArrayList<Integer> arList = new ArrayList<>(); // Integer 타입의 ArrayList
		System.out.println(arList);

		// 1. 추가 및 삭제하기
		arList.add(10); // 10은 int지만 Integer에 autoboxing해서 들어감
		arList.add(20);
		System.out.println(arList); // [10, 20]
		System.out.println(arList.size()); // 2

		arList.add(1, 40); // << 해당 idx자리에 넣는 방법
		System.out.println(arList); // [10, 40, 20]
		System.out.println(arList.size()); // 3

		System.out.println("40 is index of " + arList.indexOf(40)); // indexOf는 해당 객체의 자리 idx 찾아줌

		arList.remove(1); // idx 1의 내용물 삭제하고 자동으로 뒤의 객체들이 앞 자리로 당겨옴(ArrayList가 편리한 이유!)
		System.out.println(arList); // [10, 20]
		System.out.println(arList.size()); // 2

		arList.add(50);
		arList.add(60); // [10, 20, 50, 60]

		arList.remove(new Integer(50)); // 50을 바로 넣으면 int타입이기 때문에 인식하지 못함 >> Wrapper인 Integer로 새 객체 만들어서 던져주기
		System.out.println(arList); // [10, 20, 60]

		// 2. 배열 순회
		for (int a : arList) { // unboxing해서 가져오는 방법 (Integer 안의 int 데려오기)
			System.out.println(a);
		}

		for (Integer a : arList) { // 이렇게 해도 Integer 객체로서 확장 for문 돌릴 수 있음
			System.out.println(a);
		}

		// 3. 내용 변경
		arList.set(1, 40); // >> idx 1인 자리를 40으로 바꾸어라
		System.out.println(arList); // [10, 40, 60]

		// 4. 객체 존재 여부 찾아내기
		/*
		 * equals 함수 overriding해야 가능함 ArrayList가 상속받은 AbstractList라는 추상클래스에 equals 정의해둠
		 * 그래서 지금 가져다 쓸 수 있음
		 */
		boolean isContain = arList.contains(30); // 반환타입이 boolean
		System.out.println(isContain); // false

		// 5. sort (정렬)
		ArrayList<String> strList = new ArrayList<String>();

		strList.add("a");
		strList.add("c");
		strList.add("b");

		System.out.println(strList); // [a, c, b] << 들어간 순서대로 ArrayList에 위치함
		// 이걸 정렬할 수는 없을까?

		strList.sort(new Comparator<String>() {

			// sort는 Comparator라는 interface를 구현해야 사용 가능
			@Override
			public int compare(String o1, String o2) {

				return o1.hashCode() - o2.hashCode(); // 양수값이 나오면 내림차순, 음수값이 나오면 오름차순
				// String을 hashCode로 Comparator하면 사전순으로 정리됨
			}
		}); // 정렬 완료됨

		System.out.println(strList); // [a, b, c]
	}

}
