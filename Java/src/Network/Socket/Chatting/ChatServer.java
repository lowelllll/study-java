package network;
import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
	public static void main (String args[]) {
		System.out.println("자바 커뮤니티 채팅 서버 v1.0");
		
		ServerSocket server = null;
		Vector v = null;
		
		try {
			server = new ServerSocket(9000);
			v = new Vector(10);
			
			while (true) {
				// 클라이언트로부터 접속요청이 발생했을 경우 서버와 클라이언트 사이의 새로운 소켓을 생성
				Socket socket = server.accept();
				
				// 클라이언트의 정보를 저장하는 ClinetInfo 클래스를 저장해 벡터 객체에 ㄱ저장.
				ClientInfo ci = new ClientInfo(socket);
				v.add(ci);
				
				// 각 소켓에 대한 작업을 수행할 쓰레드 생성
				ChatThread ct = new ChatThread(socket,v);
				Thread thread = new Thread(ct);
				
				thread.start();
				
				System.out.println(ci.getIp()+"님이 접속했습니다.");
			}
		} catch(Exception e) {
			try {
				server.close();
				System.exit(0);
			} catch (Exception ioe) {}
		}
	}
}
