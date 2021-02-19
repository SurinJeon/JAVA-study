package java_chobo.ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student1 implements Comparable<Student1> {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student1(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (float) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	@Override
	public String toString() {
		return String.format("%s, %d, %d, %d, %d, %d, %d, %f", name, ban, no, kor, eng, math, getTotal(), getAverage());
	}

	@Override
	public int compareTo(Student1 o) {
		char name1 = this.name.charAt(0);
		char name2 = o.name.charAt(0);
		if (name1 < name2) {
			return -1;
		} else if (name2 > name1) {
			return 1;
		}
		return 0;
	}

}

public class Ex11_3 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(new Student1("홍길동", 1, 1, 100, 100, 100));
		list.add(new Student1("남궁성", 1, 2, 90, 70, 80));
		list.add(new Student1("김자바", 1, 3, 80, 80, 90));
		list.add(new Student1("이자바", 1, 4, 70, 90, 70));
		list.add(new Student1("안자바", 1, 5, 60, 100, 80));

		Collections.sort(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}