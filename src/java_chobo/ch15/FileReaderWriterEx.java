package java_chobo.ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterEx {

	// Reader와 Writer는 텍스트만 가능함
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		// 일반 FileReader, FileWriter
		fileReadWriterEx();

		// Buffered
		
		try (FileReader fr = new FileReader("output2.properties"); // 입력 용도
				BufferedReader br = new BufferedReader(fr, 8192);
				
				FileWriter fw = new FileWriter("test.properties"); // 출력 용도
				BufferedWriter bw = new BufferedWriter(fw, 8192)
						){
			String line;
			while( (line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine(); // << 줄바꿈 역할 (새 라인 넣는 것)
			}
			
		}
		
	}

	public static void fileReadWriterEx() {
		try (FileReader fr = new FileReader("output2.xml");
				FileWriter fw = new FileWriter("test.xml");
				){
			char[] cbuf = new char[512]; // 512개씩 단위로 함 << 그 전의 fis.read(data)보다 훨 빠름(이건 하나씩 읽었음)
			while( (fr.read(cbuf)) != -1) {
				fw.write(cbuf);
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("해당 파일이 존재하지 않음");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
