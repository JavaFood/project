import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
		// 화면중앙에서 뜨게, 화면 창 크기 변환 못하게
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		
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
		jt1.setLocation(118,314);
		jt2.setLocation(118,374);
	
		JLabel lblNewLabel = new JLabel("ID  :");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel.setBounds(70, 314, 42, 33);
		fr.add(lblNewLabel);
		
		JLabel lblPw = new JLabel("PW :");
		lblPw.setForeground(Color.GRAY);
		lblPw.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblPw.setBounds(70, 373, 36, 41);
		fr.add(lblPw);
		
//		Button b1 = new Button("로그인");
//		Label l2 = new Label("뒤로 가기");
//		fr.add(b1);
//		fr.add(l2);
//		
//		b1.setSize(100,40);
//		l2.setSize(55,20);
//		b1.setLocation(145,450);
//		l2.setLocation(30,40);
		
		
		
		//각 회사 ID, 비밀번호에 맞게 로그인하면 로그인 성공 문구를 띄운 후  로그인 실패 문구를 띄움
		
//		b1.addMouseListener(new MouseListener() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
////					new Admin_main();
//						if(jt1.getText().equals("admin")&&Arrays.equals(jt2.getPassword(),("1234").toCharArray())){
//							JOptionPane.showMessageDialog(null, "로그인을 성공하였습니다");
//							fr.setVisible(false);}
//							
//						else {JOptionPane.showMessageDialog(null, "아이디나 비밀번호가 맞지않습니다");
//						
//						}
//			}
//			public void mousePressed(MouseEvent e) {}
//			public void mouseReleased(MouseEvent e) {}
//			public void mouseEntered(MouseEvent e) {}
//			public void mouseExited(MouseEvent e) {}
//		});
//		//'뒤로 가기'레이블 클릭하면 Home창 열고 현재창 닫음
//		l2.addMouseListener(new MouseListener() {
//			public void mouseClicked(MouseEvent e) {
//				new Home();
//				fr.setVisible(false);
//			}
//			public void mousePressed(MouseEvent e) {}
//			public void mouseReleased(MouseEvent e) {}
//			public void mouseEntered(MouseEvent e) {}
//			public void mouseExited(MouseEvent e) {}
//		});
		
		//로그인 버튼 생성
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778\r\n");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setBounds(147, 443, 97, 33);
		
	
		
		
		
		//로그인 id: admin, pw: 1234가 맞을 시 로그인성공, 실패시 로그인 실패 문구와 함께 실패
		btnNewButton.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
//					new Admin_main();
						if(jt1.getText().equals("admin")&&Arrays.equals(jt2.getPassword(),("1234").toCharArray())){
							JOptionPane.showMessageDialog(null, "로그인을 성공하였습니다");
							fr.setVisible(false);}
							
						else {JOptionPane.showMessageDialog(null, "아이디나 비밀번호가 맞지않습니다");
						
						}
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		
		
		
		
		fr.add(btnNewButton);
		
		JLabel back_lb = new JLabel("");
		back_lb.setIcon(new ImageIcon("뒤로가기5.PNG"));
		back_lb.setBounds(20, 30, 47, 40);
		back_lb.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
				new Home();
				//setVisible(true);
				fr.setVisible(false);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub}
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				back_lb.setIcon(new ImageIcon("뒤로가기5.PNG"));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				back_lb.setIcon(new ImageIcon("뒤로가기5_짝.PNG"));
			}
			
	});
		
		
		fr.add(back_lb);

		
		
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
