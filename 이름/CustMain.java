import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import java.awt.Component;

public class CustMain extends JFrame {

	private JPanel contentPane;

	public CustMain() {
		
	    
		
		setTitle("고객 메인페이지");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 400, 600);
		setSize(400,600);
		contentPane = new JPanel();
		contentPane.setAlignmentY(0.0f);
		contentPane.setAlignmentX(0.0f);
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		
		setResizable(false);
		setLocationRelativeTo(null);

		
		//------	헤더
		JPanel HEAD = new JPanel();
		HEAD.setPreferredSize(new Dimension(382, 65));
		HEAD.setBackground(new Color(26, 188, 156));
	contentPane.add(HEAD);
		//panel.setBounds(100,100,40,600);
		HEAD.setLayout(null);
		
		JLabel Header = new JLabel("Tasty Co.");
		Header.setAlignmentX(Component.CENTER_ALIGNMENT);
		Header.setHorizontalAlignment(SwingConstants.CENTER);
		Header.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		//Header.setBackground(Color.WHITE);
		Header.setForeground(Color.WHITE);
		Header.setBounds(125,12,139,34);
		HEAD.add(Header);
	    
	    
		
//----패널1
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(Color.WHITE);
	    panel_1.setPreferredSize(new Dimension(380, 521));
	    contentPane.add(panel_1);
	    panel_1.setBounds(100, 160, 200, 40);
	    panel_1.setSize(new Dimension(400, 400));
	    
	    		panel_1.setLayout(null);

  		
	    		
	    		
//내용
	    		JButton comp = new JButton("내 회사");
	    		comp.setBounds(104, 118, 169, 60);
	    		comp.setAlignmentX(Component.CENTER_ALIGNMENT);
	    	
	    		panel_1.add(comp);
	    		// evl.setBounds(100, 250, 200, 40);
	    
	    		JButton evl = new JButton("평가 & 후기");
	    		evl.setBounds(104, 264, 169, 60);
	    		evl.setAlignmentX(Component.CENTER_ALIGNMENT);
	    		panel_1.add(evl);
	    		
	    		JLabel lblNewLabel = new JLabel("Tasty Co.");
	    		lblNewLabel.setBounds(164, 496, 57, 15);
	    		panel_1.add(lblNewLabel);
	    		
	    		
//버튼 이벤트
	    	
	    		comp.addMouseListener(new MouseListener() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Frame mycom=new MyCom();
						mycom.setVisible(true);
						setVisible(false);
						
					}
					
					@Override
					public void mouseReleased(MouseEvent e) {}
					
					@Override
					public void mousePressed(MouseEvent e) {}
					
					@Override
					public void mouseExited(MouseEvent e) {}
					
					@Override
					public void mouseEntered(MouseEvent e) {}
	    			});
	    		
	    		evl.addMouseListener(new MouseListener() {
					@Override
					public void mouseClicked(MouseEvent e) {
						try {
							JFrame grade1=new Grade1();
							grade1.setVisible(true);
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						//grade1.setVisible(true);
						setVisible(false);
						
					}
					
					@Override
					public void mouseReleased(MouseEvent e) {}
					
					@Override
					public void mousePressed(MouseEvent e) {}
					
					@Override
					public void mouseExited(MouseEvent e) {}
					
					@Override
					public void mouseEntered(MouseEvent e) {}
	    			});
	    		
	    		//뒤로가기	    		
	    		JLabel back_lb = new JLabel("");
	    		back_lb.setIcon(new ImageIcon("뒤로가기5.PNG"));
	    		back_lb.setBounds(12, 13, 47, 40);
	    		back_lb.addMouseListener(new MouseListener() {
	    			public void mouseClicked(MouseEvent e) {
	    			// TODO Auto-generated method stub
	    				new Home();
	    				
	    				setVisible(false);
	    			}
	    			@Override
	    			public void mouseReleased(MouseEvent e) {}
	    			
	    			@Override
	    			public void mousePressed(MouseEvent e) {}
	    			
	    			@Override
	    			public void mouseExited(MouseEvent e) {
	    				back_lb.setIcon(new ImageIcon("뒤로가기5.PNG"));
	    			}
	    			
	    			@Override
	    			public void mouseEntered(MouseEvent e) {
	    				back_lb.setIcon(new ImageIcon("뒤로가기5_짝.PNG"));
	    			}
	    			
	    	});
	    		    		
	    		HEAD.add(back_lb);
	    		
	    		//홈으로 가기
	    		JLabel home_lb = new JLabel("");
	    		home_lb.setIcon(new ImageIcon("홈버튼.PNG"));
	    		home_lb.setBounds(330, 13, 42, 40);
	    		home_lb.addMouseListener(new MouseListener() {
	    			public void mouseClicked(MouseEvent e) {
	    			// TODO Auto-generated method stub
	    				new Home();
	    				//setVisible(true);
	    				setVisible(false);
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
	    		HEAD.add(home_lb);
	    		
	    		
	    	

					
	    
	    		
	    		
	    setVisible(true);
	
	
}
	

	
	
public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustMain frame = new CustMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	    		}

