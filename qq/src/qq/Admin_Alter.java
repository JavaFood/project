package qq;
//정보수정

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Admin_Alter {
	Admin_Alter() {
		JFrame f = new JFrame();
		f.setSize(400, 600);
		
		Container c = f.getContentPane();
		c.setBackground(Color.WHITE);
		
		JPanel p1 = new JPanel();
		p1.setSize(400, 90);
		p1.setBackground(new Color(26, 188, 156));
		
		JLabel l3 = new JLabel("Company");
		JLabel l4 = new JLabel("정보 수정");
		JButton btn1 = new JButton("회사 등록");
		JButton btn2 = new JButton("회사 정보변경");
		ImageIcon backIcon = new ImageIcon("C:/Users/soldesk/Desktop/back.png");
		ImageIcon homeIcon = new ImageIcon("C:/Users/soldesk/Desktop/home.png");
		JButton btn3 = new JButton(backIcon);
		JButton btn4 = new JButton(homeIcon);
		
		
		btn3.setBounds(12, 20, 70, 48);
		btn4.setBounds(300, 20, 70, 48);
		l3.setBounds(175, 510, 90, 40);
		l4.setBounds(140, 25, 150, 40);
		l4.setFont(new Font("HY견고딕", Font.BOLD,25));
		l4.setForeground(Color.WHITE);
		
		btn1.setBounds(100, 160, 200, 40);
		btn2.setBounds(100, 250, 200, 40);
		
		f.add(l3);
		f.add(l4);
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(p1);
		f.setLayout(null);
		f.setVisible(true);
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_Main();
				f.setVisible(false);
			}
			 
		});
		
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_Main();
				f.setVisible(false);
			}
			 
		});
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_AddCom();
				f.setVisible(false);
			}
			 
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_AlterComInfo();
				f.setVisible(false);
			}
			 
		});
	}

	public static void main(String[] args) {
		new Admin_Alter();

	}

}
