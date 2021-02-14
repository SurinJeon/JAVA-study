package java_chobo.ch08;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * @author surin Resource 관련 실행 시 예외처리 file 생성으로 실습하기
 */
public class ExceptionEx14 {

	public static void main(String[] args) {

		// Scanner 대신 JOptionPane 써보기
		String res = JOptionPane.showInputDialog("파일명을 입력하세요.");
		System.out.println("res : " + res); // >> 제대로 출력됐는지 콘솔창에 찍어보기

		File f = createFile(res); // method 생성하기(method에 넘어가는 parameter 뭔지 항상 잘 체크하기)

		String msg = f.getName() + "파일이 생성되었습니다.";
		JOptionPane.showMessageDialog(null, msg);

	} // end of main

	private static File createFile(String fileName) {

		System.out.println("fileName : " + fileName); // >> 제대로 넘어갔는지 출력으로 찍어보기

		File f;

		try {
			// 아무것도 넘어오지 않았을 때는 공백이라고 판단함
			if (fileName == null || fileName.equals("")) {
				throw new Exception("파일명이 유효하지 않습니다.");
			}
			fileName = fileName + ".txt";
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("제목없음으로 파일을 생성합니다.");
			fileName = "제목없음.txt";
		} finally {
			f = new File(fileName); // >> 아직 file 객체만 생성되었음
			createNewFile(f); // >> 새로운 method로 file 만들어줄 것 (IOException이 필요함)
		}
		return f;
	} // end of createFile

	private static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (IOException e) {
//			e.printStackTrace(); >> 보통 IOException은 거의 예외가 발생하지 않기 때문에 무시하기도 함
		}
	} // end of createNewFile

} // end of class
