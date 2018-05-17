import java.io.*;
import java.net.*;

class  SocketCon1
{
	public static void main(String[] args) 
	{
		Socket socket1, socket2;
		String host1 = "www.google.com";
		String host2 = "www.naver.com";
		int port1 = 80, port2 = 80;

		try{
			System.out.println(host1+"호스트의 포트 "+port1+"와 접속 시도..");
			socket1 = new Socket(host1,port1); // 소켓을 생성하고 접속을 시도함.
			// String 타입의 호스트명
			System.out.println("접속완료");
			// 통신부분..
			socket1.close();
		}catch(UnknownHostException e){
			System.err.println("지정된 호스트 없음");
		}catch(IOException e){
			System.err.println("소켓이 열리지 않음");
		}

		try{
			System.out.println(host2+"호스트의 포트 "+port2+"와 접속 시도..");
			socket2 = new Socket(host2,port2);
			System.out.println("접속완료");
		}catch(UnknownHostException e){
			System.err.println("지정된 호스트 없음");
		}catch(IOException e){
			System.err.println("소켓이 열리지 않음.");
		}
	}
}
