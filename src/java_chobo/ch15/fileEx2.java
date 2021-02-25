package java_chobo.ch15;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFileChooser;

/**
 * @author 탐색기를 만들 것 서치한 것이 디렉토리라면 해당 디렉토리의 리스트들을 출력
 * (디렉토리는 [dir], 파일은 file 형식으로 출력)
 *  만약 파일을 서치했다면 유효하지 않은 디렉토리임을 출력
 */
public class fileEx2 {

	public static void main(String[] args) {

		File f = fileEx.getSearchFile(); // fileEx1에서 만든 method 가지고옴 (선택한 파일을 File f에 담음)

		try {
			System.out.println(f.getName());
			if (!f.exists() || !f.isDirectory()) {
				System.err.println("유효하지 않은 디렉토리입니다.");
				System.exit(0);
			}

			printFileList(f);

		} catch (NullPointerException e) {
		}

		String currDir = System.getProperty("user.dir");
		File dir = new File(currDir);

		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			File ff = files[i];
			String name = ff.getName();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd:mma");
			String attribute = "";
			String size = "";

			if (files[i].isDirectory()) {
				attribute = "DIR";
			} else {
				size = f.length() + "";
				attribute = ff.canRead() ? "R" : " ";
				attribute += ff.canWrite() ? "W" : " ";
				attribute += ff.isHidden() ? "H" : " ";

			}
			System.out.printf("%s %3s %6s %s%n", df.format(new Date(ff.lastModified())), attribute, size, name);

		}

	}

	private static void printFileList(File dir) {

		File[] files = dir.listFiles();
		ArrayList subDir = new ArrayList();

		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();

			if (files[i].isDirectory()) {
				fileName = "[" + fileName + "]";
				subDir.add(i + " ");

			}
			System.out.println(fileName);
		}

		int dirNum = subDir.size(); // dir 있을때마다 fileName 지정하면서 subDir의 요소도 추가시켜줌
		int fileNum = files.length - dirNum;

		for (int i = 0; i < subDir.size(); i++) {

			try {
				int idx = Integer.parseInt((String) subDir.get(i));
				printFileList(files[idx]);
			} catch (NumberFormatException e) {
				// 에러 계속 나길래 그냥 예외처리함^^...
			}
		}

	}

	public static File getSearchFile() {
		JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int res = jfc.showOpenDialog(null); // 열기 위한 method << 반환타입 int (0 / 1)
		File file = null;
		if (res == JFileChooser.APPROVE_OPTION) { // 만약 반환타입이 approve_opiton인 0과 같다면 (성공한다면)
			file = jfc.getSelectedFile();
			System.out.println(file);
		} else {
			System.err.println("취소합니다.");
		}
		return file;
	}

}
