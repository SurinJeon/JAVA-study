package java_chobo.ch14.stream;

public class Student implements Comparable<Student> {
	// Comparable<Student> 구현하면 compareTo를 overriding 할 수 밖에 없음
	// >> 기본 정렬이 그 compareTo가 됨!
	
	private String name;
	private int ban;
	private int totalScore;

	public Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}

	public String getName() {
		return name;
	}

	public int getBan() {
		return ban;
	}

	public int getTotalScore() {
		return totalScore;
	}

	@Override
	public String toString() {
		return String.format("Student [name=%s, ban=%s, totalScore=%s]", name, ban, totalScore);
	}

	@Override
	public int compareTo(Student o) {
		return this.totalScore - o.totalScore * -1; // -1 곱해도 역순됨!
	}

}
