package java_chobo.ch08;

import java.io.File;

import javax.swing.JOptionPane;

/**
 * @author surin 
 * 코드 간결화를 위해 method에서 throws로 전가하기
 * 최종적으로 main에서 try-catch 잡을 것
 */
public class ExceptionEx15 {

	public static void main(String[] args) {

		String res = JOptionPane.showInputDialog("파일명을 입력하세요.");
		File f;
		String msg = null;

		try {
			f = createFile(res);
			msg = String.format(f.getName() + "파일이 생성되었습니다.");
		} catch (Exception e) {
			msg = String.format(e.getMessage() + " 다시 입력해주세요.");
		} finally {
			JOptionPane.showMessageDialog(null, msg);
		}
		String msgExit = "프로그램을 종료합니다.";
		JOptionPane.showMessageDialog(null, msgExit);

	}

	private static File createFile(String fileName) throws Exception {
		if (fileName == null || fileName.equals("")) {
			throw new Exception("유효하지 않는 파일명입니다.");
		} // >> 예외 발생하면 바로 catch문에 걸림 (따로 return처리 하지 않아도 method에서 벗어남)

		File f = new File(fileName);
		f.createNewFile();

		return f;

	}

}
