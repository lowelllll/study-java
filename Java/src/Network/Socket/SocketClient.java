import java.io.*;
import java.net.*;

public class SocketClient 
{
	// 소켓을 만들기 위한
	private Socket socket = null;
	
	// 소켓에서 스트림을 얻어오기 위한 인스턴스
	private OutputStream os = null;
	private OutputStreamWriter writer = null;

	// 생성자. 주어진 IP와 포트번호로 소켓 생성
	public SocketClient (String ip,int port) throws IOException {
		try{
			// 클라이언트 소켓 생성
			socket = new Socket(ip,port);
			// 생성한 서버의 ip와 port
			System.out.println("소켓을 생성하여 서버와 연결하였습니다.");
		}catch (IOException e){
			throw e;
		}
	}

	public void startSocket(){
		String str = "나랏말싸미뒹긱에달아";

		try{
			// 소켓에 스트림을 연결하고 스트림을 보낼 writer를 만듬.
			os = socket.getOutputStream();
			writer = new OutputStreamWriter(os);
		}catch(IOException e){
			System.out.println("소켓 연결에 실패했습니다.");
		}

		try{
			writer.write(str,0,10);
			writer.flush();
		}catch(IOException e){
			System.out.println("데이터 전송에 실패했습니다.");
		}

		System.out.println("보낸 데이터:"+str);

		try{
			socket.close();
			writer.close();
			os.close();
		}catch(IOException e){
			System.out.println("소켓 닫기에 실패하였습니다.");
		}
	}
	public static void main(String[] args) 
	{
		SocketClient c;
		String ip = "127.0.0.1";
		int port = 1000;

		if (args.length>0)
		{
			port = Integer.parseInt(args[0]);
		}
		try{

			c = new SocketClient(ip,port);
			c.startSocket();

		}catch(IOException e){
			System.out.println("소켓 생성에 실패했습니다.");
		}
	}
}
