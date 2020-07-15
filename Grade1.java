package UI;
import java.awt.*;

import javax.swing.*;

import java.util.Scanner;

import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.peer.ScrollPanePeer;
import java.awt.event.ActionEvent;

public class Grade1 extends JFrame {

	//private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField TextInput;
	private JTextField NameT;
//	private JTextField NumberT;
//	private JComboBox CnameT;

	/**
	 * Launch the application.
	 */
   public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grade1 frame = new Grade1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Grade1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		Container contentPane =getContentPane();
		contentPane.setBackground(Color.WHITE);
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Home = new JLabel("회사이름 / 평균 평점");
		Home.setBounds(24, 77, 250, 65);
		Home.setFont(new Font("맑은 고딕", Font.BOLD, 21));
		contentPane.add(Home);

		JLabel lblNewLabel = new JLabel("평점 & 후기");
		lblNewLabel.setBounds(125, 12, 139, 34);
		contentPane.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.WHITE);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(24, 142, 111, 44);
		comboBox.setBackground(Color.WHITE);
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		comboBox.setModel(
				new DefaultComboBoxModel(new String[] { "회사별보기", "Tasty", "주식", "물산", "Costca", "Riotgames" }));
		contentPane.add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(153, 142, 111, 44);
//		comboBox_1.setBounds(24, 142, 111, 44);
		
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "\uBCF4\uAE30 \uC21C\uC11C",
				"\uB192\uC740 \uD3C9\uC810 \uC21C", "\uB0AE\uC740 \uD3C9\uC810 \uC21C" }));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		comboBox_1.setBackground(Color.WHITE);
		contentPane.add(comboBox_1);
		
		//JPanel TablePanel=new JPanel();
		//TablePanel.setBounds(24,198,326,155);
		
		DefaultTableModel dtm=new DefaultTableModel(new String[] {"회사이름","후기","작성자","평점"},0);
		JTable table=new JTable(dtm);
		table.setBounds(0,0,300,200);

		table.setEnabled(false);
		table.getTableHeader().setEnabled(false);
		JScrollPane scp=new JScrollPane(table);
		scp.setBounds(24, 198, 326, 155);
		contentPane.add(scp);
//		
//		table_1 = new JTable(dtm);
//		table_1.setFont(new Font("맑은 고딕", Font.BOLD, 13));
//		JScrollPane scrollPane = new JScrollPane(table_1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
////		JScrollPane scrollPane=new JScrollPane();
//		scrollPane.setBounds(24, 198, 326, 155);
//		scrollPane.setPreferredSize(new Dimension(300,155));
//		scrollPane.setCorner(ScrollPaneConstants.UPPER_RIGHT_CORNER, null);
//		contentPane.add(scrollPane);
//		
//		table_1.setToolTipText("");
//		table_1.setPreferredSize(new Dimension(300,155));
//		table_1.setModel(new DefaultTableModel(
//			new Object[][] {
//				{"   회사이름", "     후기", "    작성자", "     평점"},
//			},
//			new String[] {
//				"Cname", "Text", "Name", "Number"
//			}
//		) {
//			Class[] columnTypes = new Class[] {
//				String.class, String.class, String.class, String.class
//			};
//			public Class getColumnClass(int columnIndex) {
//				return columnTypes[columnIndex];
//			}
//		});
//		scrollPane.setColumnHeaderView(table_1);

//		JComboBox comboBox_2 = new JComboBox();
//		comboBox_2.setBounds(24, 142, 111, 44);
//		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "\uBCF4\uAE30 \uC21C\uC11C",
//				"\uB192\uC740 \uD3C9\uC810 \uC21C", "\uB0AE\uC740 \uD3C9\uC810 \uC21C" }));
//		comboBox_2.setForeground(Color.BLACK);
//		comboBox_2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
//		comboBox_2.setBackground(Color.WHITE);
//		contentPane.add(comboBox_2);

		
		JComboBox CnameT = new JComboBox();
		CnameT.setBackground(Color.WHITE);
		CnameT.setForeground(Color.BLACK);
		CnameT.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		CnameT.setModel(
				new DefaultComboBoxModel(new String[] { "", "Tasty", "주식", "물산", "Costca", "Riotgames" }));
		CnameT.setBounds(24, 365, 101, 46);
		contentPane.add(CnameT);

		JComboBox NumberT = new JComboBox();
		NumberT.setBackground(Color.WHITE);
		NumberT.setForeground(Color.BLACK);
		NumberT.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		NumberT.setModel(
				new DefaultComboBoxModel(new String[] { "0.0","0.5","1.0","1.5","2.0","2.5","3.0","3.5","4.0","4.5","5.0"}));
		NumberT.setBounds(134, 365, 101, 46);
		contentPane.add(NumberT);
		
		NameT = new JTextField();
		NameT.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		NameT.setHorizontalAlignment(SwingConstants.CENTER);
		NameT.setText("\uC791\uC131\uC790");
		NameT.setBounds(249, 365, 101, 46);
		contentPane.add(NameT);
		NameT.setColumns(10);

		

		TextInput = new JTextField();
		TextInput.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		TextInput.setHorizontalAlignment(SwingConstants.CENTER);
		TextInput.setText("\uD6C4\uAE30\uB97C \uC785\uB825\uD558\uC138\uC694");
		TextInput.setBounds(24, 421, 326, 101);
		contentPane.add(TextInput);
		TextInput.setColumns(10);

		JButton btnNewButton = new JButton("작성");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(NameT.getText().equals("작성자")&&TextInput.getText().equals("후기를 입력하세요")) {
					JOptionPane.showMessageDialog(null, "입력값을 확인하세요.");
					return ;
					}
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(
						new Object[] { CnameT.getSelectedItem().toString(), TextInput.getText(), NameT.getText(), NumberT.getSelectedItem().toString() });
				NameT.setText("작성자");
				TextInput.setText("후기를 입력하세요");
			}
		});
		btnNewButton.setBounds(276, 157, 74, 29);
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		contentPane.add(btnNewButton);

		
//★★★★★★
		JButton HomeBack = new JButton("New button");
		HomeBack.setIcon(new ImageIcon("집1.PNG"));
		HomeBack.setBounds(325, 13, 43, 44);
		HomeBack.setPressedIcon(new ImageIcon("집2.PNG"));
		contentPane.add(HomeBack);
		HomeBack.addActionListener(new ActionListener() {
//
			@Override
			
			public void actionPerformed(ActionEvent e) {
				new Home();
				setVisible(false);

			}
		});

		JButton Back = new JButton("New button");
		Back.setIcon(new ImageIcon("화살표1.png"));
		Back.setBounds(24, 22, 43, 27);
		Back.setPressedIcon(new ImageIcon("화살표2.PNG"));
		contentPane.add(Back);
//		
		Back.addActionListener(new ActionListener() {
		//
		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame custmain=new CustMain();
			custmain.setVisible(true);
			setVisible(false);

		}
	});
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 382, 65);
		panel.setBackground(new Color(26, 188, 156));
		contentPane.add(panel);

	}
}
