package java_chobo.ch15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author surin
 * Deserializable 예제
 */
public class DeSerializableEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String fileName ="UserInfo.ser";
		
		// try-catch-Resource문 사용
		try(FileInputStream fis = new FileInputStream(fileName);
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis);){
		
			// Serializable 했던 순서 그대로 해야함 (당연히!) << 그래야 읽을 수 있음
			// Object로 받아왔었기 때문에 (ObjectInputStream) UserInfo타입으로 형변환 하는 과정이 필요 
//			UserInfo u1 = (UserInfo) ois.readObject();
//			UserInfo u2 = (UserInfo) ois.readObject();
			ArrayList<UserInfo> list = (ArrayList<UserInfo>) ois.readObject();
		
			System.out.println(list.get(0));
			System.out.println(list.get(1));
			System.out.println(list);
			// >> 제대로 읽어옴!
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
