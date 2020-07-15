import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
 
public class TableTest extends JFrame {
	
	private JPanel contentPane;
	private JTable table;

    public TableTest(){
        		
		setTitle("Tasty Co. 식단표");
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
		
//------	헤더
		JPanel HEAD = new JPanel();
		HEAD.setPreferredSize(new Dimension(380,40));
		HEAD.setBackground(new Color(26, 188, 156));
	contentPane.add(HEAD);
			//panel.setBounds(100,100,40,600);
	    	//헤더 패널 Layout(null)주고 아래 JLabel에서 Bounds값 지정함
		HEAD.setLayout(null);

	
			//뒤로가기
			JLabel back = new JLabel("\u25C0");
			HEAD.add(back);
			back.setBounds(10,0,40,40);
			back.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
					Frame mycom=new MyCom(); // Frame 호출. TableTest가 JFrame임
					mycom.setVisible(true); //MyCom 보이게 Visible true값으로 줌
			        setVisible(false); // TableTest보이지 않게 false	
				}
			//비사용 
				@Override
				public void mouseReleased(MouseEvent e) {}
				public void mousePressed(MouseEvent e) {}
				public void mouseExited(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {}			
				
			});
		
			JLabel Header = new JLabel("식단표");
			Header.setAlignmentX(0.5f);
			Header.setHorizontalAlignment(SwingConstants.CENTER);
			Header.setFont(new Font("SANS_SERIF", Font.BOLD, 18)); //폰트
			//Header.setBackground(Color.WHITE);
			Header.setForeground(Color.WHITE); //글자색
			Header.setBounds(155,0,70,40);
			HEAD.add(Header);
		
//------ComNameBox
		JPanel ComNameBox = new JPanel();
		ComNameBox.setPreferredSize(new Dimension(380,40));
	contentPane.add(ComNameBox);
		//ComNameBox.setBounds(100,100,40,600);
		ComNameBox.setBackground(Color.WHITE);
		
	
			JLabel ComName=new JLabel("회사"/*선택한 회사이름*/);///★★★★★기능
	    			//▲ Final static String CompantName="Tasty Co."; 지정할것
	    			//TableTest Class 밖에 둬야함 
			Font NameFont=new Font(Font.SANS_SERIF,Font.BOLD,15);
			ComNameBox.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
			ComName.setBackground(Color.WHITE);
			ComName.setForeground(Color.BLACK);
				//ComName.setBounds(100,100,50,600);
			ComName.setFont(NameFont);
			ComNameBox.add(ComName);

//------Date		
		JPanel Date = new JPanel();
		Date.setMinimumSize(new Dimension(20, 20));
	contentPane.add(Date);
		Date.setPreferredSize(new Dimension(380,100));
		Date.setBounds(0,0,40,600);
		Date.setBackground(Color.WHITE);
		Date.setLayout(new BorderLayout(0, 0));
		//
		/* 삭제
		JLabel DateWest = new JLabel("　　6월 4주　　");
		Date.add(DateWest, BorderLayout.WEST);
		DateWest.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		*/
		JLabel DateCenter = new JLabel("7월 1주");
		DateCenter.setHorizontalAlignment(SwingConstants.CENTER);
		Font CenterDFont=new Font(Font.SANS_SERIF,Font.BOLD,15);
		Date.add(DateCenter, BorderLayout.CENTER);
		DateCenter.setFont(CenterDFont);
		/* 삭제
		JLabel DateEast = new JLabel("　　7월 2주　　");
		Date.add(DateEast, BorderLayout.EAST);
		DateEast.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		*/
//------MealList
		//String a 고정값 = 요일
	    	//String b 바뀌는 값=식단
		 String []a = {"월","화","수","목","금"};
	        String [][]b = {{"a1","a2","a3","a4","a5"},
	                        {"b1","b2","b3","b4","b5"},
	                        {"c1","c2","c3"}};
	        
	        //1. 모델과 데이터를 연결
	        DefaultTableModel model = new DefaultTableModel(b,a);
	        
	        JPanel p=new JPanel();     
	        //2. Model을 매개변수로 설정, new JTable(b,a)도 가능하지만 
	        //삽입 삭제를 하기 위해 해당 방법을 사용합니다
	        JTable table = new JTable(model); //
	        table.setPreferredSize(new Dimension(380,270));
	        //3. 결과적으로는 JScrollPane를 추가합니다.
	        JScrollPane sc = new JScrollPane(table);
	        sc.setPreferredSize(new Dimension(380,300));
	        
	        //4. 컴포넌트에  Table 추가
	        p.add(sc);
	        
	        //테이블에 데이터 추가하기
	        //원본데이터를 건들지 않고 table의 매개변수인 model에 있는 데이터를 변경합니다
	        DefaultTableModel m =
	                (DefaultTableModel)table.getModel();
	        //모델에 데이터 추가 , 1번째 출에 새로운 데이터를 추가합니다
	        m.insertRow(1, new Object[]{"d1","d2","d3"});
	        //추가를 마치고 데이터 갱신을 알립니다.
	        table.updateUI();
	        table.setGridColor(Color.WHITE);
	        table.setGridColor(Color.WHITE);
	        table.setEnabled(false); //JTable JVM에서 수정변경 못하도록 잠금. 
	        //table.getTableHeader().setReorderingAllowed(false);
	        table.getTableHeader().setEnabled(false); //JTable JVM에서 수정변경 못하도록 잠금(헤더)
	        	
	        
	 contentPane.add(p); //ContetnPane에 JPanel p 추가(JPanel에 테이블 붙어있음)
	        //setBounds(0, 0, 300, 150);
	    
	        setVisible(true); //페이지 보이도록 seetVisible
		
	}
    
    //메인
    public static void main(String[] args) {
		new TableTest();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableTest frame = new TableTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
