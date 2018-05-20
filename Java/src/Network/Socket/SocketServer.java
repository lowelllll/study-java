import java.io.*;
import java.net.*;
import java.util.*;


public class SocketServer 
{
	// 소켓을 만들기 위한 인스턴스들
	private ServerSocket serverSocket = null;
	private Socket socket = null;

	private InputStream is = null;
	private InputStreamReader reader = null;

	public SocketServer(int port) throws IOException {
		try{
			// 서버 소켓 생성
			// 클라이언트에서 스트림을 받아들일 소켓을 하나더 생성
			serverSocket = new ServerSocket(port);
			System.out.println("소켓을 생성하여 클라이언트의 연결을 기다립니다. 포트번호 = "+port);
			socket = serverSocket.accept();
			System.out.println("클라이언트와 연결이 되었습니다.");
		}catch(IOException e){
			throw e;
		}
	}

	public void startSocket(){
		String str="";
		try{
			// 소켓에  스트림을 연결하고 스트림을 읽어들일 reader를 만듬.
			is = socket.getInputStream();
			reader = new InputStreamReader(is);
		}catch(IOException e){
			System.out.println("소켓 연결에 실패했습니다.");
		}
		
		for(int i=0; i<10; i++){
			try{
				str = str + (char) reader.read();
			}catch(IOException e){
				System.out.println("데이터를 받는데 실패했습니다.");
			}
		}

		System.out.println("받은 데이터:"+str);

		try{
			serverSocket.close();
			socket.close();
			reader.close();
			is.close();
		}catch(IOException e){
			System.out.println("소켓을 닫는데에 실패했습니다.");
		}
	}

	public static void main(String[] args) 
	{
		SocketServer s;
		int port = 1000;

		if(args.length>0){
			port = Integer.parseInt(args[0]);
		}

		try{
			s = new SocketServer(port);
			s.startSocket();
		}catch(IOException e){
			System.out.println("소켓 생성에 실패했습니다.");
		}
	}
}
