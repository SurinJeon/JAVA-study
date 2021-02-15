package java_chobo.ch09;

public class StringCount {

	private int count;
	private String source = "";
	
	public StringCount(String source) {
		this.source = source;
	}
	
	public int stringCount(String s) {
		return stringCount(s, 0);
	}
	
	public int stringCount(String s, int pos) {
		
		int index = 0;
		if(s == null || s.length() == 0) {
			return 0; // 아무것도 없는 값이거나 길이가 없다면 검색할 단어 자체가 없다고 보는 것임
		}
		if((index = source.indexOf(s, pos)) != -1){
			count++;
			stringCount(s, index + s.length()); // 이것 뒤에도 같은 문자열이 오는지 또 검색하기 위함
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		String str = "aabbccAABBCCaa";
		System.out.println(str);
		
		StringCount sc = new StringCount(str);
		
		int result = sc.stringCount("aa");
		System.out.printf("aa를 %d개 찾았습니다.", result);
	}
	
}
