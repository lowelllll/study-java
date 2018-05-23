package network;
import java.io.*;
import java.net.*;
import java.util.*;


// 새로운 연결 요청이 발생할 때 마다 스레드를 생성해 처리함으로써 여러 사용자가 동시에 채팅할 수 있음.

public class ChatThread implements Runnable {
	private Socket socket = null;
	private BufferedReader br = null;
	private Vector v = null;
	
	public ChatThread (Socket socket,Vector v) {
		this.socket = socket;
		this.v = v;
		
		try {
			br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
		} catch (IOException e) {
			
		}
	}
	
	public void run () {
		while (true) {
			String str = null;
			try {
				// 클라이언트로부터 문자열을 읽어옴.
				str = br.readLine();
				//System.out.println(str);
			} catch (IOException e) {
				break;
			}
			
			for (int i = 0; i<v.size(); i++) {
				// 읽어온 문자열을 벡터 객체에 저장된 각 클라이언트에 전송함.
				ClientInfo ci = (ClientInfo)v.get(i);
				ci.write(str);
			}
		}
		
		try {
			// 예외가 발생해 whil 루프가 종료되면 스트림/소켓을 닫음.
			br.close();
			socket.close();
		} catch (Exception e) {}
	
	}
}
