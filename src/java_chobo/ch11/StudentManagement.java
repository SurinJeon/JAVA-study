package java_chobo.ch11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author surin ch06에 했던 Array를 ArrayList로 바꿔서 실습
 */
public class StudentManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Student> students = new ArrayList<Student>();
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

	private static void deleteStudent(ArrayList<Student> students, Scanner sc) {

		prnStudent(students);

		System.out.println("삭제할 학생의 학번을 입력하세요. > ");
		int delStdNo = sc.nextInt();

		Student delStd = new Student(delStdNo);
		
		if (!students.contains(delStd)) {
			System.out.println("해당하는 학생이 존재하지 않음");
			return;
		}
		
		students.remove(delStd);
		
	} // end of deleteStudent()

	private static void modifyStudent(ArrayList<Student> students, Scanner sc) {

		System.out.println("수정할 학생의 학번을 입력하세요. > ");

		prnStudent(students);

		int findStdNo = sc.nextInt();
		Student upStd = new Student(findStdNo);
		if (!students.contains(upStd)) {
			System.out.println("해당하는 학생이 존재하지 않음");
			return;
		}
		
		int upIdx = students.indexOf(upStd); // 바꾸고자 하는 객체의 위치를 찾기
		upStd = createStudent(sc); // 객체를 새로운걸로 덮어쓰는 과정
		students.set(upIdx, upStd); // 위에서 구한 객체 위치에 새로 덮어쓴 객체로 세팅하기

	} // end of modifyStudent()

	private static void addStudent(ArrayList<Student> students, Scanner sc) {

		Student inStd = createStudent(sc);

		if (students.contains(inStd)) {
			System.out.println("동일한 학생을 입력할 수 없습니다.");
			return;
		}
		students.add(inStd);
	} // end of addStudent()

	private static Student createStudent(Scanner sc) {
		System.out.printf("학생 정보를 입력하세요. ex) 번호 이름 국어 영어 수학 > ");
		int stdNo = sc.nextInt();
		;
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();

		return new Student(stdNo, name, kor, eng, math);
	} // end of createStudent()

	private static void prnStudent(ArrayList<Student> students) {
		System.out.println("학생목록");
		for (Student std : students) {
			if (std == null)
				break;
			System.out.println(std);
		}
		System.out.println();
	} // end of prnStudent()

	private static void initial(ArrayList<Student> students) {
		students.add(new Student(1, "한여진", 90, 90, 90));
		students.add(new Student(2, "황시목", 91, 91, 91));
		students.add(new Student(3, "서동재", 92, 92, 92));
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