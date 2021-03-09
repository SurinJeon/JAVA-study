package java_chobo.ch14.stream;

public class Student2 {

	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	
	public Student2(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public boolean isMale() {
		return isMale;
	}

	public int getHak() {
		return hak;
	}

	public int getBan() {
		return ban;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return String.format("[%s, %s, %d학년 %d반, %3d점]", name, isMale, hak, ban, score);
	}

	// enum은 따로 파일로 뺌
	
}
