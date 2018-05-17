// 지정한 호스트나 localhost의 특정 포트의 사용유무를 알아내는 프로그램.
import java.io.*;
import java.net.*;

class LookPorts 
{
	public static void main(String[] args) 
	{
		Socket socket;
		String host = "localhost";
		if(args.length == 1){
			host = args[0]; // 명령어 라인에서 입력된 호스트 이름 사용
		}
		for(int i=1;i<1024;i++){
			try{
				socket = new Socket(InetAddress.getByName(host),i);
				System.out.println(host+"의 "+i+"번 포트는 특정한 서버가 사용합니다.");
			}catch(UnknownHostException e){
				System.err.println(e);
				break;
			}catch(IOException e) {
			System.err.println(e);
			}
		}
	}
}
