import java.io.*;
import java.net.*;

class GetServerSocketFields 
{
	public static void main(String[] args) 
	{
		ServerSocket theServer = null;
		Socket theSocket = null;
		int port = 4000;

		try{
			System.out.println(port+" 포트에 바인드된 서버 소켓을 생성하는 중입니다.");
			theServer = new ServerSocket(port);
			System.out.println(theServer.getInetAddress().getHostName()+ " 호스트 및 " +theServer.getLocalPort() +"포트에 바인드된 서버 소켓을 생성하였습니다.");
		}catch(IOException e){
			System.out.println(e);
			System.exit(1);
		}

		while(true){
			System.out.println("클라이언트의 접속 요청을 기다립니다..");
			try{
				theSocket = theServer.accept();

				System.out.println(theSocket.getInetAddress().getHostName()+"이름 및 "+theSocket.getPort()+"포트의 클라이언트로부터 접속 요청을 받았습니다.");

				// 접속된 클라이언트와 통신 구현
				theSocket.close();
			}catch(IOException e){
				System.err.println(e);
			}
		}
	}
}
