package chapter11.exam01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) throws UnknownHostException {
		
		// 내 컴퓨터의 주소(IP)얻기
		InetAddress addr = InetAddress.getLocalHost(); // LocalHost(내 컴퓨터)		
		System.out.println("내 PC주소 : " + addr.getHostAddress()); 
		// Private(사설)IP주소 : 192.168.70.113 => 내부에서만 사용가능한 IP
   		// Public(공인)IP주소 : 14.36.141.27 => 외부에서도 접속가능한 IP		
		System.out.println();
		
		// 도메인으로 IP얻어내기
		String domain = "www.gdu.co.kr";
		addr = InetAddress.getByName(domain);
		System.out.println(domain + " 의 IP 주소 : " + addr.getHostAddress());
		System.out.println();
		
		// 대형 사이트의 경우 하나의 도메인에 여러 IP를 연결해 놓는다.
		domain = "www.youtube.com";
		InetAddress[] addrs = InetAddress.getAllByName(domain);
		System.out.println(domain + " 의 IP 주소들...");
		
		for (InetAddress ip : addrs) {
			System.out.println(ip.getHostAddress());
		}
	}

}
