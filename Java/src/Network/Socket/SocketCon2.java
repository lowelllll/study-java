import java.io.*;
import java.net.*;

class SocketCon2 
{
	public static void main(String[] args) 
	{
		Socket socket1,socket2;
		String host1 = "www.naver.com";
		String host2 = "125.209.222.141";
		int port1 = 80,port2 = 80;

		try{
			System.out.println(host1+"호스트의 포트 "+ port1+"와 접속시도 ..");
			socket1 = new Socket(InetAddress.getByName(host1),port1);
			//호스트 이름 대신 InetAddress 객체를 이용함.
			System.out.println("접속완료");
			// 통신부분
			socket1.close();
		}catch(IOException e){
			System.err.println("소켓이 열리지 않음");
		}

		try{
			System.out.println(host2+" 호스트의 포트"+port2+"와 접속시도..");
			socket2 = new Socket(host2,port2);
			// error
			// IP를 사용하기 위해선 InetAddress를 사용해야함.
			System.out.println("접속 완료");
		}catch(IOException e){
			System.out.println("소켓이 열리지 않음");
		}
	}
}
