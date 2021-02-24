package java_chobo.ch15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {

		// catcat파일을 읽어와서 cat파일로 출력할 것
		// InputStream, OutputStream >> byte 기반!
		// fileInputStreamEx();
		
		// byte 기반일 때, 용량이 커서 느리게 걸릴 수 있음
		// >> byte의 배열인 buffer를 이용해 한 번에 받아오기
		// fileBufferedInputStreamEx();
		
	}

	public static void fileBufferedInputStreamEx() {
		try (FileInputStream fis = new FileInputStream("catcat.jpg");
			BufferedInputStream bis = new BufferedInputStream(fis, 8192);
			FileOutputStream fos = new FileOutputStream("catcatcat.jpg");
				BufferedOutputStream bos= new BufferedOutputStream(fos, 8192);){
			
			int data = 0;
			while ( (data = bis.read()) != -1) {
				bos.write(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fileInputStreamEx() {
		try (FileInputStream fis = new FileInputStream("catcat.jpg");
			FileOutputStream fos = new FileOutputStream("cat.jpg");){
			int data = 0;
			while ((data = fis.read()) != -1 ) {
				fos.write(data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
