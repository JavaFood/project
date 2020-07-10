package 식당;

import java.util.ArrayList;

import java.util.List;

public interface Administrator {
	final String ID="admin";
	final String pass="admin"; // 관리자 아이디, 비밀번호
	
	String[] menu=new String[100]; // 반찬 각각 이름
	List<MenuSelect> menulist=new ArrayList<>(); // 주문 내역이 들어갈 자리
	
	public void Logon(); // 관리자 로그온
	public void Logout(); // 관리자 로그아웃
	
	public void menuInput(); // 반찬 입력
	public void menuDelete(); // 반찬 삭제
	
	public String Suggestions=""; // 건의사항
	
}