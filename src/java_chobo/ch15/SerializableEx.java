package java_chobo.ch15;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializableEx {

	public static void main(String[] args) {

		String fileName = "UserInfo.ser"; // 확장자는 크게 의미는 없는데 같이 맞춰준다는 느낌으로 ser 함

		// 보조스트림은 한꺼번에 여러개 쓸 수 있음!
		try (FileOutputStream fos = new FileOutputStream(fileName);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos);) {
			
			// UserInfo 객체 생성
			UserInfo u1 = new UserInfo("JavaMan", "1234", 30);
			UserInfo u2 = new UserInfo("JavaWoman", "4321", 26);

			// ArrayList에 두개를 담음
			ArrayList<UserInfo> list = new ArrayList<UserInfo>(); // ArrayList declaration 보면 이미 serializable을 구현하고있음
			list.add(u1);
			list.add(u2);
			
			// 출력하는 과저
//			oos.writeObject(u1);
//			oos.writeObject(u2);
			oos.writeObject(list);
			
			System.out.println("Done.");
			
			// 아래 finally로 stream들 닫아줄 필요 없음 << try - catch - resource문 써서!
		} catch (FileNotFoundException e) { // 사실 지금 없으면 생성하는 작업이기 때문에 거의 예외발생하지 않음
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
