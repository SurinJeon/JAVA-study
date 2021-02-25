package java_chobo.ch16;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressEx {

	public static void main(String[] args) {

		InetAddress ip = null;
		InetAddress[] ipArr = null;

		// host명으로 주소 찾기
		System.out.println("Search by String host");
		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println("toString : " + ip.toString());

			byte[] ipAddr = ip.getAddress();
			System.out.println("getAddress() : " + Arrays.toString(ipArr));

			String result = "";
			for (int i = 0; i < ipAddr.length; i++) {
				result = result + (ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr[i]) + ".";
			}
			System.out.println("getAddress()+256 : " + result);
			System.out.println();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		// host명으로 찾는 주소들을 배열로 받기
		System.out.println("Put in Array Searched by String host");
		try {
			ipArr = InetAddress.getAllByName("www.naver.com");

			for (int i = 0; i < ipArr.length; i++) {
				System.out.println("ipArr[" + i + "] :" + ipArr[i]);
			}
			System.out.println();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		// localhost
		System.out.println("Get LocalHost");
		try {
			ip = InetAddress.getLocalHost();
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
