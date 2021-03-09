package java_chobo.ch16.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UdpServer {

	public static void main(String[] args) throws IOException {

		try {
			DatagramSocket socket = new DatagramSocket(7777);
			DatagramPacket inPacket;
			DatagramPacket outPacket;
		
			byte[] inMsg = new byte[10];
			byte[] outMsg = null;
			
			while (true) {
				// 데이터 수신 위한 패킷 생성
				inPacket = new DatagramPacket(inMsg, inMsg.length);
				socket.receive(inPacket); // 패킷 통해 데이터 수신받음
				
				InetAddress address = inPacket.getAddress();
				int port = inPacket.getPort();
				
				// 서버 현재시간을 간단히 hh:mm:ss 형태로 바꾸기
				SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
				String time = sdf.format(new Date());
				outMsg = time.getBytes();
				
				// 패킷 생성해서 client에게 전송하기
				outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
				socket.send(outPacket);
			}
		} catch (SocketException e) {
			e.printStackTrace();
		}
		
	}

}
