import java.io.*;
import java.net.*;

public class  TCPEchoServerThread implements Runnable
{
	// Runnable 인터페이스를 구현한 클래스
	// 서어베 연결 요청이 발생하면 클라이언트와 통신에 사용할 socket 객체를 받아 실제로 처리함.
	// 여러 클라이언트의 연결 요청을 처리할 수 있음.
	private Socket con = null;
	private BufferedInputStream bis = null;
	private BufferedOutputStream bos = null;

	public TCPEchoServerThread(Socket socket){
		con = socket;
	}

	public void run() {
		try
		{
			bis = new BufferedInputStream(con.getInputStream());
			bos = new BufferedOutputStream(con.getOutputStream());

			String str = "";
			byte buf[] = new byte[256];
			int len = 0;

			while((len=bis.read(buf,0,buf.length))!=-1){
				str = str+ new String(buf,0,len);
				bos.write(buf,0,len);
				bos.flush();

				if(str.indexOf("\n")!=-1)
					break;
			}

			System.out.println("수신한 메시지:"+str);

			bos.close();
			bis.close();
			con.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
