package java_chobo.ch16.tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpIpClient {

	public static void main(String[] args) {
	
		try {
			String serverIp = "127.0.0.1";
			
			System.out.println("서버에 연결중입니다. 서버IP : " + serverIp);
			
			// 소켓 생성하여 연결 요청
			Socket socket = new Socket(serverIp, 7777);
			
			// 소켓의 입력스트림 얻기
			DataInputStream dis = new DataInputStream(socket.getInputStream());	
			
			// 소켓으로부터 받은 데이터를 출력
			System.out.println("서버로부터 받은 메시지 : " + dis.readUTF());
			System.out.println("연결을 종료합니다.");
			
			// Stream과 socket 연결 종료
			dis.close();
			socket.close();
			System.out.println("연결이 종료되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
