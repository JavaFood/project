import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



public class MyCom {
	public static void main(String[] args) {

		Font basicFont=new Font(Font.SANS_SERIF,Font.PLAIN,12); //글자 폰트
		Frame frame=new Frame("Tasty Co.");
		
		frame.setSize(400,600);
		frame.setLayout(new FlowLayout());
		frame.setBackground(Color.WHITE);
	
		
		Color gren=new Color(26, 188, 156); //메인 컬러

//===================헤더==================

		Panel MyComHeader=new Panel(); //헤더 패널 생성
		MyComHeader.setPreferredSize(new Dimension(600,40));//헤더 사이즈 지정
		MyComHeader.setBackground(gren);//헤더에 메인컬러 붙이기
		
		Label mycom=new Label("내 회사");//헤더 내 회사 폰트
		Font font=new Font(Font.SANS_SERIF,Font.BOLD,18);//헤더폰트
		mycom.setForeground(Color.WHITE);//폰트 색상지정
		mycom.setFont(font);//글자에 폰트 붙이기
		
		MyComHeader.add("center",mycom); //패널에 라벨 붙이기
		frame.add(MyComHeader);//프레임에 패널 붙이기

//====================헤더================

		Button select1=new Button("선택");
		Button select2=new Button("선택");
		Button select3=new Button("선택");
		Button select4=new Button("선택");
		Button select5=new Button("선택");//선택버튼
//		------------------------------------
		Panel null1=new Panel();
		null1.setBounds(2, 3, 600, 100);
		//null1.setPreferredSize(new Dimension(600,100));
		null1.setBackground(Color.WHITE);
		
//---------------회사리스트-----------
		Panel List=new Panel();
		List.setLayout(new GridLayout(0,4));
		
		
		Label Number=new Label("No.");
			Label company=new Label("회사 이름");
			Label ticketCost=new Label("식권 가격");
			Label select=new Label("선택");
		Font listT=new Font(Font.SANS_SERIF,Font.BOLD,15);
		Number.setFont(listT);
		company.setFont(listT);
		ticketCost.setFont(listT);
		select.setFont(listT);
		
//		--------객체생성-----------		
		List.add(Number,"Center");
		List.add(company,"Center");		
		List.add(ticketCost,"Center");
		List.add(select,"Right");
		
		Label Company1=new Label("Tasty Co,");
		Label Company2=new Label("(주)주식");
		Label Company3=new Label("(주)물산");
		Label Company4=new Label("Costca");
		Label Company5=new Label("Riotgamas");
		
			Label Cost1=new Label("4,500");
			Label Cost2=new Label("4,000");
			Label Cost3=new Label("5,000");
			Label Cost4=new Label("4,500");
			Label Cost5=new Label("6,000");
			
		Label Num1=new Label("1");Label Num2=new Label("2"); Label Num3=new Label("3");
		Label Num4=new Label("4");Label Num5=new Label("5");

//		-----------List에 객체넣기-----------
		List.add(Num1,"Center");List.add(Company1,"Center");
		List.add(Cost1,"Center"); List.add(select1,"Center");
		
		List.add(Num2,"Center");List.add(Company2,"Center");
		List.add(Cost2,"Center"); List.add(select2,"Center");
		
		List.add(Num3,"Center");List.add(Company3,"Center");
		List.add(Cost3,"Center"); List.add(select3,"Center");
		
		List.add(Num4,"Center");List.add(Company4,"Center");
		List.add(Cost4,"Center"); List.add(select4,"Center");
		
		List.add(Num5,"Center");List.add(Company5,"Center");
		List.add(Cost5,"Center"); List.add(select5,"Center");
//		-------프레임에 List넣기------	

		frame.add(List);
		
//-----------------------닫기------------
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		
	}

}
