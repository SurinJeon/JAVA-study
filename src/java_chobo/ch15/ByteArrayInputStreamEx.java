package java_chobo.ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayInputStreamEx {

	public static void main(String[] args) {
		
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // byte는 -127~127
		byte[] outSrc = null;
		
		// 선언만 하고 아직 데이터는 읽어오지 않음
		ByteArrayInputStream bais = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int data = 0;
		
		// data는 inSrc를 읽어오는 bais의 read() method의 반환타입을 담는다
		// -1이라면 없는 값, 9 뒤로 넘어가면 -1이 반환될 것
		while ((data = bais.read()) != -1) {
			baos.write(data);
		}

		outSrc = baos.toByteArray();
		System.out.println("inSrc > " + Arrays.toString(inSrc));
		System.out.println("outSrc > " + Arrays.toString(outSrc));
		

	}

}
