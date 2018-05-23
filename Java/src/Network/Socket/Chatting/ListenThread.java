package network;
import java.io.*;
import java.net.*;

// 클라이언트는 별도의 스레드를이용해 서버로부터 수신할 문자열이 있는지 대기하고 만약 있다면 읽어 클라이언트의 프레임에 내용이 출력하도록 함.
public class ListenThread implements Runnable {
	private Socket socket;
	private ChatClientForm f;
	private BufferedReader br;
	
	public ListenThread (Socket socket,ChatClientForm f) {
		this.socket = socket;
		this.f = f;
		
		try {
			br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 스레드가 시작되면 run 메서드의 내용이 실행됨.
	public void run () {
		// 새로운 문자열이 수신되면 문자열을 읽어와 프레임의 JTextField 객체에 새로운 문자열을 추가함.
		while (true) {
			try {
				// 서버로부터 받은  내  용을 읽어 클라이언트의 텍스트 에어리어에 적음.
				String result = br.readLine();
				f.writeTextArea(result);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
