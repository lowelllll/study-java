package network;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class ServerInputForm extends JDialog implements ActionListener{
	private JLabel ip1;
	private JLabel port1;
	private JTextField iptf;
	private JTextField porttf;
	private JButton b;
	private JPanel ipjp;
	private JPanel portjp;
	private JPanel bjp;
	
	private ChatClient client;
	
	public ServerInputForm (ChatClient client) {
		setTitle("서버 정보 입력 다이얼로그 ");
		this.client = client;
		
		ip1 = new JLabel("I   P :");
		port1 = new JLabel("Port  :");
		iptf = new JTextField(15);
		porttf = new JTextField(15);
		b = new JButton("입 력");
		b.addActionListener(this);
		
		ipjp = new JPanel();
		portjp = new JPanel();
		bjp = new JPanel();
		
		ipjp.add(ip1);
		ipjp.add(iptf);
		
		portjp.add(port1);
		portjp.add(porttf);
		bjp.add(b);
		
		setBounds(100,100,240,130);
		
		getContentPane().setLayout(new GridLayout(3,1));
		getContentPane().add(ipjp);
		getContentPane().add(portjp);
		getContentPane().add(bjp);
	}
	
	public void actionPerformed(ActionEvent ad) {
		// 입력된 서버의 정보를 다이얼로그를 호출한 클래스멤버 변수에 저장함.
		client.setIp(iptf.getText());
		client.setPort(Integer.parseInt(porttf.getText()));
		setVisible(false);
		show(false);
	}
}
