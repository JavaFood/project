package qq;
//게시글

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class Admin_Review_Edit3 {
	Admin_Review_Edit3() {
		JFrame f = new JFrame();
		f.setSize(400, 600);
		
		Container c = f.getContentPane();
		c.setBackground(Color.WHITE);
		
		JPanel p1 = new JPanel();
		p1.setSize(400, 90);
		p1.setBackground(new Color(26, 188, 156));
		
		JTextField f1 = new JTextField("(주)대영기획");
		JButton btn1 = new JButton("확인");
		ImageIcon backIcon = new ImageIcon("C:/Users/soldesk/Desktop/back.png");
		ImageIcon homeIcon = new ImageIcon("C:/Users/soldesk/Desktop/home.png");
		JButton btn2 = new JButton(backIcon);
		JButton btn3 = new JButton(homeIcon);
		
		JLabel l3 = new JLabel("Company");
		JLabel l4 = new JLabel("평점 & 후기관리");
		
		btn2.setBounds(12, 20, 70, 48);
		btn3.setBounds(300, 20, 70, 48);
		f1.setBounds(25, 120, 200, 40);
		btn1.setBounds(160, 460, 90, 40);
		l3.setBounds(175, 510, 90, 40);
		l4.setBounds(100, 25, 200, 40);
		l4.setFont(new Font("HY견고딕", Font.BOLD,25));
		l4.setForeground(Color.WHITE);
		

	      JTable table1 = new JTable();
	      table1.setBorder(new LineBorder(new Color(0, 0, 0)));
	      table1.setBackground(Color.WHITE);
	      table1.setModel(new DefaultTableModel(
	         new Object[][] {
	            {"게시글 제목", "물이 제일 맛있네요"},
	            {"작성자", "김실업"},
	            {"평점", "★★★★★(1.0)"},
	         },
	         new String[] {
	            "\uBAA9", "\uAE08"
	         }
	      ));
	      table1.setBounds(25, 170, 329, 120);
	      table1.setRowHeight(40);
	      f.getContentPane().add(table1);

		
	
		JPanel p2 = new JPanel();
		p2.setBounds(25, 300, 330, 150);
		f.add(p2);
		
		JTextArea ja1 = new JTextArea("안녕하세요 반갑습니다. 저는 이대영입니다. 밥이 정말 맛있네요 다음에 또 방문하겠습니다.", 7, 29);
		JScrollPane scrollpane = new JScrollPane(ja1);
		p2.add(scrollpane);
		ja1.setLineWrap(true);

		
		f.add(f1);
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(l3);
		f.add(l4);
		f.add(p1);
		f.setLayout(null);
		f.setVisible(true);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_Review();
				f.setVisible(false);
			}
			 
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_Review();
				f.setVisible(false);
			}
			 
		});
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_Main();
				f.setVisible(false);
			}
			 
		});
	}
	
	public static void main(String[] args) {
		new Admin_Review_Edit3();

	}

}
