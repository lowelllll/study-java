package network;
import java.io.*;
import java.net.*;

public class ClientInfo {
	private Socket socket;
	private String ip;
	private BufferedWriter bw;
	
	ClientInfo (Socket socket) {
		this.socket = socket;
		
		// 클라이언트
		ip = socket.getInetAddress().getHostAddress();
		
		try {
			bw = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
		} catch (IOException e) {
			
		}
	}
	
	public boolean write (String str) {
		try {
			bw.write(str+"\n");
			bw.flush();
			// 서버에서 클라이언트에게 수신
		} catch (IOException e) {
			return false;
		}
		
		return true;
	}
	
	public String getIp() {
		return ip;
	}
}
