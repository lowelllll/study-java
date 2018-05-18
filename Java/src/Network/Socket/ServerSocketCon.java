import java.io.*;
import java.net.*;

class ServerSocketCon 
{
	public static void main(String[] args) 
	{
		ServerSocket theServer = null;
		int port;
		if(args.length>0){
			port = Integer.parseInt(args[0]);
		} else {
			System.out.println("명령어 라인에서 서버의 포트번호를 입력하세요");
			return;
		}

		try{
			theServer = new ServerSocket(port);
			System.out.println(port+"에 바인드된 서버 소켓 객체를 생성하였습니다.");
			//  클라이언트의 접속을 기다리고 통신을 수행함.
			theServer.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
