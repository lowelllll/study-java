package network;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

// 클라이언트의 채팅창 화면


public class ChatClientForm extends JFrame implements ActionListener{
	private Socket socket;
	private String name;
	
	private BufferedWriter bw;
	private JTextArea ta;
	private JTextField tf;
	private JButton b;
	private JPanel p;
	
	public ChatClientForm (Socket socket, String name) {
		this.socket = socket;
		this.name = name;
		this.setTitle(name+"님의 채팅 클라이언트 ");
		
		ta = new JTextArea();
		ta.setEditable(false);
		tf = new JTextField(25);
		b = new JButton("전송 ");
		b.addActionListener(this);
		p = new JPanel();
		p.add(tf);
		p.add(b);
		
		getContentPane ().setLayout(new BorderLayout());
		getContentPane ().add(ta, "Center");
		getContentPane ().add(p, "South");
		
		setBounds(100,100,400,300);
		
		try {
			//서버로부터 문자열을 수신하기 위한 쓰레드 생성
			ListenThread lt = new ListenThread(this.socket,this);
			Thread t = new Thread(lt);
			t.start();
			
			//서버에 문자열을 송신하기 위한 출력스트림 생성
			bw = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	
	public void writeTextArea (String str) {
		ta.append(str+"\n");
	}
	
	public void actionPerformed (ActionEvent ae) {
		try {

			//버튼이 클릭되면 텍스트필드의 내용을 서버에 송신.
			bw.write(name+" : "+tf.getText()+"\n");
			bw.flush();
			
			tf.setText("");
		} catch (Exception e) {
			//서버에 문자열을 송싱할 수 없으면 스트림과 소켓을 닫은 후 프로그램 종료.
			e.printStackTrace();
			try {
				bw.close();
				socket.close();
			} catch (Exception e2) {
				System.exit(0);
			}
			
		}
	}
}
