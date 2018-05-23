package network;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class NameInputForm extends JDialog implements ActionListener{
	private ChatClient client;
	private JTextField jf;
	private JButton jb;
	private JPanel jp;
	
	public NameInputForm (ChatClient client) {
		this.client = client;
		setTitle("대화명을 입력하세요 ");
		setBounds(100,100,250,70);
		
		jf = new JTextField(15);
		jb = new JButton("입 력 ");
		jb.addActionListener(this);
		jp = new JPanel();
		
		jp.add(jf);
		jp.add(jb);
		
		getContentPane().add(jp);
	}
	
	public void actionPerformed (ActionEvent ae) {
		// 입력된 이름을 다이얼로그를 호출한 클래스의 멤버 변수에 저장함.
		client.setName(jf.getText());
		setVisible(false);
		show(false);
	}
}
