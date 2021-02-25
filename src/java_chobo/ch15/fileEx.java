package java_chobo.ch15;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

public class fileEx {

	public static void main(String[] args) throws IOException {
		
//		File f = new File("C:\\workspace_java\\native_jdbc_programming\\src\\native_jdbc_programming\\dto\\Department.java"); // 해당 위치에 있는 파일을 읽어오라는 뜻
		// 위가 귀찮다면 아예 method로 넘기기
		File f = getSearchFile();
		
		// 파일 이름 출력
		System.out.println("start");
		String fileName = f.getName();
		System.out.println(fileName);
		
		int pos = fileName.lastIndexOf("."); // lastIndexOf()는 뒤에서부터 검색
		
		System.out.println("경로를 제외한 파일 이름 > " + f.getName());
		System.out.println("확장자를 제외한 파일 이름 > " + fileName.substring(0, pos));
		System.out.println("확장자 > " + fileName.substring(pos + 1)); // pos 다음부터 끝까지
		
		System.out.println("경로를 포함한 파일이름 > " + f.getPath());
		System.out.println("파일의 절대경로 > " + f.getAbsolutePath());
		System.out.println("파일의 정규경로 > " + f.getCanonicalPath());
		System.out.println("파일이 속해있는 디렉터리 > " + f.getParent());
		
		System.out.println();
		
		System.out.println("Files.seperator > " + File.separator);
		System.out.println("Files.seperatorChar > " + File.separatorChar);
		
		System.out.println();
		
		System.out.println("user.dir = " + System.getProperty("user.dir")); // 현재 프로그램이 실행중인 디렉터리 알 수 있음 << java_chobo2가 나옴
		// 그래서 이미지 카피했을때 원본 파일을 java_chobo2에 넣음 
		System.out.println("sun.boot.class.path = " + System.getProperty("sun.boot.class.path"));
		
		
		
		
		
	}

	public static File getSearchFile() {
		JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); // 추가함으로써 file과 directories 둘 다 선택할 수 있게 함
		int res = jfc.showOpenDialog(null); // 열기 위한 method << 반환타입 int (0 / 1)
		File file = null;
		if (res ==JFileChooser.APPROVE_OPTION) { // 만약 반환타입이 approve_opiton인 0과 같다면 (성공한다면)
			file = jfc.getSelectedFile();
			System.out.println(file);
		}else {
			System.out.println("취소합니다.");
		}
		return file;
		
	}
	
}
