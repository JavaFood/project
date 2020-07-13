import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.awt.event.*;

class Meal extends Frame implements MouseListener{
	Meal() {
		
		super("Tasty Co. 식단표");
		
		this.setSize(400,600);
		this.setLayout(new FlowLayout());
		this.setBackground(Color.WHITE);
		MyWinExit end=new MyWinExit();
		this.addWindowListener(new MyWinExit());
		
		Color gren=new Color(26, 188, 156); //메인 컬러
//===================헤더==================

		Panel MyComHeader=new Panel(); //헤더 패널 생성
		MyComHeader.setPreferredSize(new Dimension(600,40));//헤더 사이즈 지정
		MyComHeader.setBackground(gren);//헤더에 메인컬러 붙이기
		
		Label mycom=new Label("식단표");//헤더 내 회사 폰트
		Font font=new Font(Font.SANS_SERIF,Font.BOLD,18);//헤더폰트
		mycom.setForeground(Color.WHITE);//폰트 색상지정
		mycom.setFont(font);//글자에 폰트 붙이기
		
		MyComHeader.add("center",mycom); //패널에 라벨 붙이기
		this.add(MyComHeader);//프레임에 패널 붙이기

//====================================
		
		Panel ComNameBox=new Panel();
		ComNameBox.setPreferredSize(new Dimension(600,40));
		//회사이름 메소드 필요
		Label ComName=new Label(/*선택한회사이름*/); 
		Font NameFont=new Font(Font.SANS_SERIF,Font.BOLD,15); 
		//ComName 라벨에 폰트 붙이기
		ComName.setFont(NameFont);
		
	
		//패널에 라벨 붙이기
		ComNameBox.add(ComName,"Center"); 
		//프레임에 패널 붙이기
		this.add(ComNameBox);
	
	this.setVisible(true);
	} //Meal() 클래스 종료
	
//==================닫기================
		
	
// 윈도우 종료 클래스 MyWinExit
	public class MyWinExit extends WindowAdapter {
	       public void windowClosing(WindowEvent we) {
	        dispose(); //내가 보고 있는 창만 닫음

	        }
	    }
	
	
	//페이지전환 구현중
	public void mouseClicked(MouseEvent e) {}

	//메인
public static void main(String[] args) {

}

//----------------구현안함------------------

	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}



}//class Meal extends Frame implements MouseListener 종료


