package java_chobo.ch16.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpClient {

	public static void main(String[] args) throws IOException {

		try {
			DatagramSocket datagramSocket = new DatagramSocket();
			InetAddress serverAddress = InetAddress.getByName("127.0.0.1");

			// 데이터가 저장될 공간으로 byte배열을 생성
			byte[] msg = new byte[100];

			DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 7777);

			DatagramPacket inPacket = new DatagramPacket(msg, msg.length);

			datagramSocket.send(outPacket); // packet을 전송
			datagramSocket.receive(inPacket); // packet을 수신

			System.out.println("서버로부터 온 메시지 (current server time) : " + new String(inPacket.getData()));

			// close로 닫아주기
			datagramSocket.close();

		} catch (SocketException e) {
			e.printStackTrace();
		}

	}

}
