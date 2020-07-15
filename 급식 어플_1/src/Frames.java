import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.border.LineBorder;

public class Frames {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frames window = new Frames();
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
	public Frames() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 400, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uD68C\uC0AC\uC120\uD0DD", "Tasty Co.", "(\uC8FC)\uC8FC\uC2DD", "(\uC8FC)\uBB3C\uC0B0", "Costca", "RiotGames"}));
		comboBox.setBounds(36, 92, 318, 39);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("\uD68C\uC0AC\uBA85");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		lblNewLabel_1.setBounds(36, 75, 67, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uB0A0\uC9DC \uC120\uD0DD\r\n");
		lblNewLabel_1_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(37, 154, 67, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\uB0A0\uC9DC\uC120\uD0DD", "2020\uB144 7\uC6D4 1\uC8FC\uCC28", "2020\uB144 7\uC6D4 2\uC8FC\uCC28", "2020\uB144 7\uC6D4 3\uC8FC\uCC28", "2020\uB144 7\uC6D4 4\uC8FC\uCC28", "2020\uB144 7\uC6D4 5\uC8FC\uCC28", "2020\uB144 8\uC6D4 1\uC8FC\uCC28", "2020\uB144 8\uC6D4 2\uC8FC\uCC28", "2020\uB144 8\uC6D4 3\uC8FC\uCC28", "2020\uB144 8\uC6D4 4\uC8FC\uCC28"}));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(37, 170, 182, 39);
		frame.getContentPane().add(comboBox_1);
		
		JButton addbtn = new JButton("");
		addbtn.setIcon(new ImageIcon("Ãß°¡2.PNG"));
		addbtn.setBounds(231, 183, 58, 26);
		addbtn.setPressedIcon(new ImageIcon("Ãß°¡2_Â¦.PNG"));
		frame.getContentPane().add(addbtn);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("Á¦°Å2.PNG"));
		btnNewButton_1.setBounds(301, 183, 58, 26);
		btnNewButton_1.setPressedIcon(new ImageIcon("Á¦°Å2_Â¦.PNG"));
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\uC2DD\uB2E8\uD45C \uB4F1\uB85D/\uC218\uC815");
		lblNewLabel.setBounds(93, 10, 195, 39);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton_2 = new JButton("\uCD94\uAC00");
		btnNewButton_2.setIcon(new ImageIcon("±×¸²4.PNG"));
		btnNewButton_2.setBounds(0, 10, 50, 46);
		btnNewButton_2.setPressedIcon(new ImageIcon("±×¸²4Â¦.PNG"));
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("\uCD94\uAC00");
		btnNewButton_2_1.setIcon(new ImageIcon("Áý2.PNG"));
		btnNewButton_2_1.setBounds(334, 10, 50, 46);
		btnNewButton_2_1.setPressedIcon(new ImageIcon("Áý2Â¦.PNG"));
		frame.getContentPane().add(btnNewButton_2_1);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Home();	
				frame.setVisible(false);
			}
		});
		panel.setBackground(new Color(26, 188, 156));
		panel.setBounds(0, 0, 384, 65);
		frame.getContentPane().add(panel);
//-------------TABLE	
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(Color.WHITE);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\uC6D4\uC694\uC77C", null, null, null, null, null},
				{"\uAE40\uCE58\uCC0C\uAC1C", null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"\uAD6C\uBD84/\uC694\uC77C", "\uC6D4", "\uD654", "\uC218", "\uBAA9", "\uAE08"
			}
		));
		table.getColumnModel().getColumn(0).setMinWidth(30);
		table.getColumnModel().getColumn(2).setMinWidth(20);
		table.setBounds(12, 236, 354, 210);
		table.setRowHeight(70);
		frame.getContentPane().add(table);
//---------------------------		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("µî·Ï1.PNG"));
		btnNewButton_3.setBounds(86, 528, 88, 39);
		btnNewButton_3.setPressedIcon(new ImageIcon("µî·Ï1_Â¦.PNG"));
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("");
		btnNewButton_3_1.setIcon(new ImageIcon("¼öÁ¤1.PNG"));
		btnNewButton_3_1.setBounds(231, 528, 88, 39);
		btnNewButton_3_1.setPressedIcon(new ImageIcon("¼öÁ¤1_Â¦.PNG"));
		frame.getContentPane().add(btnNewButton_3_1);
		
		
			}
	}