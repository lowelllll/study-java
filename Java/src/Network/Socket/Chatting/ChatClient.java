package network;
import java.io.*;
import java.net.*;

public class ChatClient {
	private Socket socket = null;
	private String ip = null;
	private int port = 0;
	private String name = null;
	
	public static void main (String args[]) {
		ChatClient client = new ChatClient();
		client.init();
	}
	
	public ChatClient () {
		
	}
	// 채팅 클라이언트 초기화
	public void init () {
		// 서버의 주소와 포트 번호를 입력받는 다이얼로그
		ServerInputForm sif = new ServerInputForm(this);
		sif.setModal(true);
		sif.setVisible(true);
		sif.show(true);
		
		// 채팅에서 사용할 이름을 입력받는 다이얼로그
		NameInputForm nif = new NameInputForm(this);
		nif.setModal(true);
		nif.setVisible(true);
		nif.show(true);
		
		// 입력된 서버의 주소와 포트번호로 소켓을 생성
		try {
			socket = new Socket(this.ip,this.port);
		} catch (Exception e) {
			
		}
		
		//생성된 소켓과 채   팅  에서 사용할 이름을 인자로 새로운 채팅장 프레임 생성
		ChatClientForm ccf = new ChatClientForm(this.socket,this.name);
		ccf.setVisible(true);
		ccf.show(true);
		
	}
	
	
 	public void setIp (String ip) {
 		this.ip = ip;
 	}
	public void setPort (int port) {
		this.port = port;
	}
	public void setName (String name) {
		this.name = name;
	}
}
