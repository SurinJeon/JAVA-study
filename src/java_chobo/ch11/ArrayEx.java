package java_chobo.ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntUnaryOperator;

public class ArrayEx {

	public static void main(String[] args) {

		// 1. List >> Array
		arrayToString();

		// 2. 다차원 배열
		arrayDeepToString();

		// 3. equals
		arrayToEquals();

		// 4. fill
		arraysToFill();

		// 5. Array >> List
		arrayToList();

		// 6. sort
		arraySort();

		// 7. Comparable and Comparator
		myComparator();

	}

	private static void myComparator() {
		Student[] stdArr = { new Student(1, "황시목", 100, 86, 63), new Student(2, "한여진", 97, 95, 87),
				new Student(3, "영은수", 50, 87, 98), new Student(4, "서동재", 40, 100, 93), };

//		Arrays.sort(stdArr); << 오류 생김(내가 만든 class기 때문에 Comparator 설정 필요)

		Comparator<Student> compKor = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getKor() - o2.getKor();
				// 음수면 오름차순
				// 양수면 내림차순
			}

		};

		// 국어성적으로 오름차순 정렬
		Arrays.sort(stdArr, compKor);
		prnStudent(stdArr);
	}

	private static void prnStudent(Student[] stdArr) {
		for (Student s : stdArr) {
			System.out.println(s);
		}
	}

	private static void arraySort() {
		int[] arr = { 10, 9, 5, 7, 3, 2, 4, 8, 1 };

		System.out.println(Arrays.binarySearch(arr, 1));
		// 1이라는 요소가 있는데도 -1을 출력하며 찾지 못함
		// >> 왜냐하면 binarySearch는 정렬이 반드시 되어있어야하기 때문임

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 1)); // 정렬 후 찾아냄
	}

	private static void arrayToList() {
		Integer[] intArr = new Integer[] { 1, 2, 3, 4 };

		// >> List로 바꾸기
		List<Integer> list = Arrays.asList(intArr); // << Array as list (Array >> List)

		// 출력
		for (int a : list) {
			System.out.println(a);
		}

		// list 요소 설정
		list.set(1, 6); // [1, 6, 3, 4]
		System.out.println(list);
	}

	private static void arraysToFill() {
		// 1. copy
		int[] intArr1 = { 1, 2, 3, 4, 5 };
		int[] copyIntArr1 = Arrays.copyOf(intArr1, intArr1.length);
		System.out.println(Arrays.toString(intArr1));
		System.out.println(Arrays.toString(copyIntArr1));

		System.out.println(Arrays.equals(intArr1, copyIntArr1));

		int[] copyArr2 = Arrays.copyOf(copyIntArr1, 3);
		System.out.println(Arrays.toString(copyArr2));

		// 2. fill
		int[] newArr = new int[10];

		Arrays.fill(newArr, 10); // << 10으로 모두 다 채움
		System.out.println(Arrays.toString(newArr));

		// 3. setall
		Arrays.setAll(newArr, new IntUnaryOperator() {

			@Override
			public int applyAsInt(int operand) {
				return (int) (Math.random() * 100) + 1;
			} // operand가 돌면서 Math.random()을 넣겠다 (1~100)

		});
		System.out.println(Arrays.toString(newArr)); // << 들어감

		// 혹은 람다식을 사용해서 간단하게 가능함
		Arrays.setAll(newArr, (i) -> (int) (Math.random() * 100) + 1);
		// 여기서 i는 operand와 같은 역할
		System.out.println(Arrays.toString(newArr)); // << 들어감
	}

	private static void arrayToEquals() {
		int[] intArr1 = { 1, 2, 3 };
		int[] intArr2 = { 1, 2, 3 };

		System.out.println(Arrays.equals(intArr1, intArr2)); // >> true

		int[][] intTwoDimen1 = { { 1, 2 }, { 3, 4 } };

		int[][] intTwoDimen2 = { { 1, 2 }, { 3, 5 } };

		System.out.println(Arrays.deepEquals(intTwoDimen1, intTwoDimen2)); // << false
	}

	private static void arrayDeepToString() {
		int[][] twoArr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(Arrays.toString(twoArr)); // << 겉의 배열만 보이기 때문에 hashCode로 뜸
		System.out.println(Arrays.deepToString(twoArr)); // << deep 한겹 더 들어가야함
	}

	private static void arrayToString() {
		ArrayList<String> arList = new ArrayList<>();

		arList.add("abc");
		arList.add("def");
		arList.add("ghi");

		// 1. Object 타입의 배열로 ArrayList 받아오기
		Object[] objArr = arList.toArray();
		String str = Arrays.toString(objArr);
		System.out.println("arList to Object[] objArr >> " + str);

		// 2. 요소의 타입을 고려한 배열 미리 생성 후 받아오기
		String[] strArr = new String[arList.size()];
		arList.toArray(strArr); // parameter로 넣어주면 됨

		System.out.println("arList to String[] strArr >> " + Arrays.toString(strArr));
	}

}
