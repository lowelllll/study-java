// 서버에 메시지를 전달하고 되돌아온 메시지를 화면에 출력해주는 프로그램.
import java.io.*;
import java.net.*;

class TCPEchoClient
{
	private Socket socket = null;
	
	private BufferedInputStream bis = null;
	private BufferedOutputStream bos = null;

	public TCPEchoClient (String sAddress,int port){
		try{
			// 입력받은 서버 주소와 포트 번호를 인자로 소켓을 생성
			socket = new Socket(sAddress,port);
			
			// 소켓에서 데이터를 읽고 쓰기 위한 스트림 객체 생성
			bis = new BufferedInputStream(socket.getInputStream());
			bos = new BufferedOutputStream(socket.getOutputStream());
		}catch (IOException e){
			e.printStackTrace();
		}
	}

	public void send(byte[] buf){
		try{
			System.out.print("송신한 메세지:"+new String(buf));
			
			// 출력 스트림 객체에 buf에 저장된 메시지를 씀.
			bos.write(buf);
			// 출력 스트림 객체의 버퍼에 저장된 메시지를 네트워크를 통해 전송한다. 
			// 버퍼의 내용을 서버로 전송
			bos.flush();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void receive() {
		try{
			String str = "";
			// 서버로부터 수신한 메시지를 저장하기 위한 바이트 배열
			byte echo[] = new byte[256];
			// 수신된 데이터의 길이를 저장하기 위한 변수
			int len = 0;

			// 서버로부터 수신한 데이터의 길이가 -1이 아닌동안 반복해서 수신
			while((len=bis.read(echo,0,echo.length)) != -1){
				str = str + new String(echo,0,len);
			}
			System.out.print("수신한 메세지:"+str);

		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void close() {
		try{
			// 스트림 객체 , 소켓을 종료함
			bos.close();
			bis.close();
			socket.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}


	public static void main(String[] args) 
	{
		// 에코 서버의 주소,포트번호,메시지가 입력되었는지 확인함.
		if(args.length<2){
			System.out.println(" 서버 ip, 포트 번호, 메시지를 입력해주세요");
			System.exit(0);
		}

		String sAddress = args[0];
		int port = Integer.parseInt(args[1]);

		// 메시지에 메시지의 끝을 알리는 \n을 붙여 byte 배열로 저장.
		byte buf[] = (args[2]+"\n").getBytes();

		TCPEchoClient client = new TCPEchoClient(sAddress,port);
		client.send(buf);
		client.receive();
		client.close();

	}
}
