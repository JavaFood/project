package UI;
import java.awt.*;
import java.awt.JobAttributes.DefaultSelectionType;

import javax.print.attribute.standard.JobName;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import java.util.Scanner;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.peer.ScrollPanePeer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Grade1 extends JFrame implements MouseListener {
	
	//private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField TextInput;
	private JTextField NameT;
	private static int gradeNumber=0;
//	private JTextField NumberT;
//	private JComboBox CnameT;
	public class sendGrade {
		String companyname;
		String grade;
		String creator;
		String score;
		
		sendGrade(String c, String g, String r, String s) {
			companyname=c;
			grade=g;
			creator=r;
			score=s;
		}
	}
	public class MsgAppender  {
		
		private String string;
		
		public String getString() {
			return string;
		}
		public String setString(String string) {
			this.string=string;
			return this.string;
		}
	}
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
	 * @throws FileNotFoundException 
	 */
	public Grade1() throws FileNotFoundException {
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
		
		File file=new File("grade.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		table.setBounds(0,0,300,200);
		
		table.setEnabled(false);
		table.getTableHeader().setEnabled(false);
		JScrollPane scp=new JScrollPane(table);
		scp.setBounds(24, 198, 326, 155);
		contentPane.add(scp);
		
		// 표 위에서 마우스를 클릭할 시 새로운 프레임 창을 생성
		table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int row=table.rowAtPoint(e.getPoint());
				
				
				TableModel tm=table.getModel();
				
				
				String companyName=(String)tm.getValueAt(row, 0);
				String grade=(String)tm.getValueAt(row,1);
				String creator=(String)tm.getValueAt(row, 2);
				String score=(String)tm.getValueAt(row, 3);
				
				Frame popup=new Frame();
				popup.setLayout(new BorderLayout());
//				popup.setEnabled(false);
//				Container pc=getContentPane();
//				popup.add(pc);
				popup.setVisible(true);
				popup.setBounds(0, 0, 400, 400);
				JLabel showcompany=new JLabel(companyName);
				showcompany.setHorizontalAlignment(SwingConstants.CENTER);
				showcompany.setFont(new Font("맑은 고딕", Font.BOLD, 21));
				JLabel showgrade=new JLabel(grade);
				showgrade.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
				JLabel showcreator=new JLabel(creator);
				showcreator.setFont(new Font("맑은 고딕", Font.BOLD, 21));
				JLabel showscore=new JLabel(score);
				showscore.setFont(new Font("맑은 고딕", Font.BOLD, 21));
//				showcompany.setEnabled(false);
//				showgrade.setEnabled(false);
//				showcreator.setEnabled(false);
//				showscore.setEnabled(false);
//				showcompany.setBounds(20, 0, 30, 30);
				showcompany.setSize(100, 100);
				popup.add(showcompany,BorderLayout.NORTH);
//				showgrade.setBounds(20, 120, 30, 100);
				
//				showcreator.setBounds(20, 240, 30, 100);
				popup.add(showcreator,BorderLayout.EAST);
//				showscore.setBounds(20, 360, 30, 100);
				popup.add(showscore,BorderLayout.WEST);
				popup.add(showgrade,BorderLayout.CENTER);
				JButton bt=new JButton("닫기");
				bt.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						popup.dispose();
						
					}
				});
				popup.add(bt,BorderLayout.SOUTH);
				popup.addWindowListener(new WindowAdapter() {

					@Override
					public void windowClosing(WindowEvent e) {
						// TODO Auto-generated method stub
						popup.dispose();
					}
					
				});
				

//				try {
//					JFrame jf=new gettext();
//					jf.setVisible(true);
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
				
				
				
			}
			
		});
		
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
// 작성 버튼을 누르면 입력한 코멘트 등을 파일에 추가하여 기록
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
				
				File f=new File("grade.txt");
				try {
					FileWriter fw=new FileWriter(f,true);
					BufferedWriter bw=new BufferedWriter(fw);
					bw.write(gradeNumber+"\t"+CnameT.getSelectedItem().toString()+"\t"+TextInput.getText()+"\t"+NameT.getText()+"\t"+NumberT.getSelectedItem().toString()+"\n");
					bw.close();
					fw.close();
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(276, 157, 74, 29);
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		contentPane.add(btnNewButton);

		JButton HomeBack = new JButton("New button");
		HomeBack.setIcon(new ImageIcon("집1.PNG"));
		HomeBack.setBounds(325, 13, 43, 44);
		HomeBack.setPressedIcon(new ImageIcon("집2.PNG"));
		contentPane.add(HomeBack);
		HomeBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Home();
				contentPane.setVisible(false);

			}
		});

		JButton Back = new JButton("New button");
		Back.setIcon(new ImageIcon("화살표1.png"));
		Back.setBounds(24, 22, 43, 27);
		Back.setPressedIcon(new ImageIcon("화살표2.PNG"));
		contentPane.add(Back);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 382, 65);
		panel.setBackground(new Color(26, 188, 156));
		contentPane.add(panel);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
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

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
