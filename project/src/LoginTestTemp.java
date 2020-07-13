package 식당;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginTestTemp extends JFrame{
	public LoginTestTemp() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pswrd = new JLabel("Password : ");
		JTextField tteID = new JTextField(10);
		JPasswordField ttePass = new JPasswordField(10);
		
		JButton logbtn = new JButton("로그인");
		
		panel.add(label);
		panel.add(tteID);
		add(panel);
		panel.add(ttePass);
		panel.add(pswrd);
		panel.add(ttePass);
		panel.add(logbtn);
		setVisible(true);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		logbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String ID;
				String pass;		
				Member member=new Member();
				ID = JOptionPane.showInputDialog("ID");
				pass = JOptionPane.showInputDialog("Pass");
				
				
				
				boolean logon=member.Logon(ID,pass);
				

				

				
				
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new LoginTestTemp();
	}
}