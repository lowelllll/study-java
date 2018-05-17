import java.io.*;
import java.net.*;

class SocketInfo 
{
	public static void main(String[] args) 
	{
		Socket theSocket;
		for(int i=0; i<args.length;i++){
			try{
				theSocket = new Socket(args[i],80);
				System.out.println("소켓 정보:"+theSocket);
				System.out.println("로컬 호스트의"+theSocket.getLocalPort()+"포트로부터");
				System.out.println(theSocket.getInetAddress()+"호스트의 "+theSocket.getPort()+"포트에 연결");
			}catch(UnknownHostException e){
				System.err.println(args[0]+" 호스트를 찾을 수 없습니다.");
			}catch(SocketException e){
				System.err.println(args[0]+"호스트에 연결할 수 없습니다.");
			}catch(IOException e){
				System.err.println(e);
			}
		}
	}
}
