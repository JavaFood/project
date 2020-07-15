import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Admin_Login extends Frame implements MouseListener {
	Admin_Login() {
		//각 회사 로그인 아이디, 비밀번호 Hash맵 설정
		final String id = "admin";
		final String pass = "1234";
		
		
		Frame fr= new Frame();
		fr.setSize(400,600);
		fr.setTitle("관리자 로그인.");
		fr.setBackground(Color.WHITE);
		fr.setLayout(null);
		
		ImageIcon img = new ImageIcon("Tasty Co.png");
		JLabel j1 = new JLabel(img);
		fr.add(j1);
		j1.setBounds(70,75,250,250);
		
		JTextField jt1 = new JTextField();
		JPasswordField jt2 = new JPasswordField();
		fr.add(jt1);
		fr.add(jt2);
		
		jt1.setSize(180,40);
		jt2.setSize(180,40);
		jt1.setLocation(105,330);
		jt2.setLocation(105,390);
	
		Button b1 = new Button("로그인");
		Label l2 = new Label("뒤로 가기");
		fr.add(b1);
		fr.add(l2);
		
		b1.setSize(100,40);
		l2.setSize(55,20);
		b1.setLocation(145,450);
		l2.setLocation(30,40);
		//각 회사 ID, 비밀번호에 맞게 로그인하면 로그인 성공 문구를 띄운 후  로그인 실패 문구를 띄움
		
		b1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
//					new Admin_main();
						if(jt1.getText().equals("admin")&&Arrays.equals(jt2.getPassword(),("1234").toCharArray())){
							JOptionPane.showMessageDialog(null, "Tasty 회사에 로그인을 성공하였습니다");
							fr.setVisible(false);}
							
						else {JOptionPane.showMessageDialog(null, "아이디나 비밀번호가 맞지않습니다");
						
						}
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		//'뒤로 가기'레이블 클릭하면 Home창 열고 현재창 닫음
		l2.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				new Home();
				fr.setVisible(false);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		
		fr.setVisible(true);
		//X누르면 모든 UI 종료
		fr.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
//	 public class MyWinExit extends WindowAdapter {
//	        public void windowClosing(WindowEvent we) {
//	        	dispose();//내가 보고 있는 창만 닫음
//	        	
//			// System.exit(0); // JVM전체 종료시킴
//	        }
//	 }

	public static void main(String[] args) {
		
		new Admin_Login();
		

	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}


}
