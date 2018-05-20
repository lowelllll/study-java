import java.io.*;
import java.net.*;

class TCPEchoServer2 
{
	public static void main(String[] args) 
	{
		if(args.length!=1){
			System.out.println("포트번호 입력하세요!");
			System.exit(0);
		}

		int port = Integer.parseInt(args[0]);

		ServerSocket server = null;

		try{
			server = new ServerSocket(port);
		}catch(IOException e){
			e.printStackTrace();
		}

		while(true){
			try{
				Socket con = server.accept();
				
				// 클라이언트와 연결되면 스레드 실행.
				TCPEchoServerThread process = new TCPEchoServerThread(con);

				Thread thread = new Thread(process);
				thread.start();
				// 스레드 실행
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
