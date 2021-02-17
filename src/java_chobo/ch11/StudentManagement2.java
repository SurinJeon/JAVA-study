package java_chobo.ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author surin ch06에 했던 Array를 HashMap으로 바꿔서 실습
 */
public class StudentManagement2 {
	static int i;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<Integer, Student> students = new HashMap<>();

		initial(students);
		prnStudent(students);

		System.out.println("학생관리 프로그램");
		int choice;
		do {
			showMenu();
			System.out.print("메뉴 > ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("학생 추가");
				addStudent(students, sc);
				break;
			case 2:
				System.out.println("학생 수정");
				modifyStudent(students, sc);
				break;
			case 3:
				System.out.println("학생 삭제");
				deleteStudent(students, sc);

				break;
			case 4:
				System.out.println("학생 목록");
				prnStudent(students);
				break;
			}
		} while (choice < 5);
		sc.close();

	} // end of main

	private static void deleteStudent(HashMap<Integer, Student> students, Scanner sc) {

		prnStudent(students);

		System.out.println("삭제할 학생의 key를 입력하세요. > ");
		int keyNum = sc.nextInt();

		if (!students.containsKey(keyNum)) {
			System.out.println("해당하는 학생이 존재하지 않음");
			return;
		}

		students.remove(keyNum);

	} // end of deleteStudent()

	private static void modifyStudent(HashMap<Integer, Student> students, Scanner sc) {

		System.out.println("수정할 학생의 key를 입력하세요. > ");

		prnStudent(students);

		int keyNum = sc.nextInt();

		if (!students.containsKey(keyNum)) {
			System.out.println("해당하는 학생이 존재하지 않음");
			return;
		}

		Student upStd = createStudent(sc);
		students.replace(keyNum, upStd);

	} // end of modifyStudent()

	private static void addStudent(HashMap<Integer, Student> students, Scanner sc) {

		Student inStd = createStudent(sc);

		if (students.containsKey(inStd.getStdNo())) {
			System.out.println("동일한 학생을 입력할 수 없습니다.");
			return;
		}

		students.put(++i, inStd);
	} // end of addStudent()

	private static Student createStudent(Scanner sc) {
		System.out.printf("학생 정보를 입력하세요. ex) 번호 이름 국어 영어 수학 > ");
		int stdNo = sc.nextInt();
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();

		return new Student(stdNo, name, kor, eng, math);
	} // end of createStudent()

	private static void prnStudent(HashMap<Integer, Student> students) {
		System.out.println("학생목록");

		Iterator<Entry<Integer, Student>> i = students.entrySet().iterator();
		while (i.hasNext()) {
			Entry<Integer, Student> e = i.next();
			System.out.print("key" + e.getKey() + " >> ");
			System.out.println(e.getValue());
		}

	} // end of prnStudent()

	private static void initial(HashMap<Integer, Student> students) {
		students.put(++i, new Student(1, "한여진", 90, 90, 90));
		students.put(++i, new Student(2, "황시목", 91, 91, 91));
		students.put(++i, new Student(3, "서동재", 92, 92, 92));
	} // end of initial()

	private static void showMenu() {
		String[] m = new String[6];
		m[0] = "메뉴를 선택하새요.\n";
		m[1] = "1. 학생 추가\n";
		m[2] = "2. 학생 수정\n";
		m[3] = "3. 학생 삭제\n";
		m[4] = "4. 학생 목록\n";
		m[5] = "5. 종료\n";

		for (String str : m) {
			System.out.print(str);
		}
	} // end of showMenu()
} // end of class