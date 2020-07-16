import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class admin_back {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new admin_back();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_back window = new admin_back();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public admin_back() {
		initialize();
	}
 
	 

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		// Tasty Co. 이미지 설정
		ImageIcon img = new ImageIcon("Tasty Co.png");
		JLabel j1 = new JLabel(img);
		frame.getContentPane().add(j1);
		j1.setBounds(70,62,250,250);
		
		JTextField jt1 = new JTextField();
		JPasswordField jt2 = new JPasswordField();
		frame.getContentPane().add(jt1);
		frame.getContentPane().add(jt2);
		
		jt1.setSize(180,40);
		jt2.setSize(180,40);
		jt1.setLocation(118,314);
		jt2.setLocation(118,374);
		
		JLabel lblNewLabel = new JLabel("ID  :");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblNewLabel.setBounds(70, 314, 42, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("PW :");
		lblPw.setForeground(Color.GRAY);
		lblPw.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		lblPw.setBounds(70, 373, 36, 41);
		frame.getContentPane().add(lblPw);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778\r\n");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setBounds(147, 443, 97, 33);
		btnNewButton.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
//					new Admin_main();
						if(jt1.getText().equals("admin")&&Arrays.equals(jt2.getPassword(),("1234").toCharArray())){
							JOptionPane.showMessageDialog(null, "로그인을 성공하였습니다");
							frame.setVisible(false);}
							
						else {JOptionPane.showMessageDialog(null, "아이디나 비밀번호가 맞지않습니다");
						
						}
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		frame.getContentPane().add(btnNewButton);
		
		JLabel back_lb = new JLabel("");
		back_lb.setIcon(new ImageIcon("뒤로가기5.PNG"));
		back_lb.setBounds(12, 20, 47, 40);
		back_lb.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
				new Home();
				//setVisible(true);
				frame.setVisible(false);
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
		
		
		frame.getContentPane().add(back_lb);
		
		JLabel home_lb = new JLabel("");
		home_lb.setIcon(new ImageIcon("홈버튼.PNG"));
		home_lb.setBounds(55, 20, 42, 40);
		home_lb.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
				new Home();
				//setVisible(true);
				frame.setVisible(false);
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
				home_lb.setIcon(new ImageIcon("홈버튼.PNG"));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				home_lb.setIcon(new ImageIcon("홈버튼_짝.PNG"));
			}
			
	});
		frame.getContentPane().add(home_lb);
		
		
	}
}

