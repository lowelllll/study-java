// 클라이언트로부터 메시지를 전달 받아 화면에 출력하고 클라이언트에게 재전송하는 프로그램.
import java.io.*;
import java.net.*;

public class  TCPEchoServer
{
	private ServerSocket server = null;

	public TCPEchoServer(int port){
		try{
			server = new ServerSocket(port);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void process() {
		// 루프를 반복하며 클라이언트의 요청을 처리함.
		while(true){
			try{
				// 클라이언트의 접속 요청이 있을 때 까지 대기, 연결이 발생하면 클라이언트와의 통신을 위한 소켓 반환
				Socket con = server.accept();

				// 스트림 생성
				BufferedInputStream bis = null;
				BufferedOutputStream bos = null;
				bis = new BufferedInputStream(con.getInputStream());
				bos = new BufferedOutputStream(con.getOutputStream());

				String str = "";

				// 클라이언트로부터 수신한 데이터를 저장하기 위한 byte배열
				byte buf[] = new byte[256];
				// 수신한 데이터의 길이를 저장하기 위한 int형 변수
				int len = 0;
				
				// 입력 스트림에서 읽어들인 데이터의 길이가 -1이 아닌 동안 반복함.
				while((len=bis.read(buf,0,buf.length))!=-1){
					str = str+new String(buf,0,len);
					bos.write(buf,0,len);
					bos.flush();
					
					// 읽어들인 데이터에 메시지의 끝을 알리는 문자 (\n)이 있으면 데이터를 읽지 않음.
					if(str.indexOf("\n")!=-1)
						break;
				}

					System.out.println("수신한 메시지:"+str);
					
					bos.close();
					bis.close();
					con.close();
					// 해당 클라이언트와의 통신에 사용한 소켓과 입출력 스트림 객체를 닫고 다음 클라이언트의 접속 요청을 기다림.
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	
	public static void main(String[] args) 
	{
		if (args.length!=1)
		{
			System.out.println("포트번호를 입력해주세용^^");
			System.exit(0);
		}	

		int port = Integer.parseInt(args[0]);

		TCPEchoServer server = new TCPEchoServer(port);
		server.process();
	}
}
