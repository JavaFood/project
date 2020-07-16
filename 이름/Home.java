import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Home extends JFrame implements MouseListener  {
	Home() {
		Frame fr = new Frame();
		fr.setSize(400,600);
		fr.setTitle("Tasty Co.");
		fr.setBackground(Color.WHITE);
		fr.setLayout(null);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		// Tasty Co. 이미지 설정
		ImageIcon img = new ImageIcon("Tasty Co.png");
		JLabel j1 = new JLabel(img);
		fr.add(j1);
		j1.setBounds(70,75,250,250);
		
		Button b1 = new Button("고객");
		Button b2 = new Button("관리자");
		
		//버튼 사이즈,위치
		b1.setSize(100,40);
		b2.setSize(100,40);
		b1.setLocation(145, 340);
		b2.setLocation(145, 400);
//		b1.setBounds(135,320,100,40);
//		b2.setBounds(135,380,100,40);
		fr.add(b1);
		fr.add(b2);
		//'고객'버튼 누르면 손님 메인 켜지고 현재창 닫음
		b1.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				JFrame custMain = new CustMain();
				custMain.setVisible(true);
				fr.setVisible(false);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {} 
		});
		//'관리자'버튼 누르면 관리자 로그인 켜지고 현현재창 닫음
		b2.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				
				new Admin_Login();
				//setVisible(true);
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
				//dispose(0); // 데이터 살아있음 
				System.exit(0);
			}
			
		});
	}
//	public class MyWinExit extends WindowAdapter {
//		public void windowClosing(WindowEvent we) {
//			
//			System.exit(0); //JVM전체 종료시킴
//		}
//	}
	
	public static void main(String[] args) {
		new Home();

		
}
	//선언 안해줌
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
