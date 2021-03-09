package java_chobo.ch16.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TcpIpServer {

	public static void main(String[] args) {
		ServerSocket ss = null;
		// 여기서 close를 벌써 하면 안됨!
		try {
			ss = new ServerSocket(7777);
			System.out.printf("%tF 서버가 준비되었습니다.%n", new Date());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 항상 대기해야하기 때문에 무한루프 돌아야됨
		while (true) {
			System.out.printf("%tF 요청을 기다립니다.%n", new Date());
			
			try {
				Socket socket = ss.accept();
				
				System.out.printf("%tF    %s 로부터 연결 요청이 들어왔습니다.%n", new Date(), socket.getInetAddress());
				
				// socket의 IOStream 생성!
				// socket의 outputStream부터 가져와서 생성해야함
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				
				// >> 그리고 그걸 client한테 전달해줘야함
				dos.writeUTF("[Notice] Test Message1 from Server.");
				System.out.printf("%tF 데이터를 전송했습니다.%n", new Date());
				
				// 이제 닫아도 됨
				dos.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}






















