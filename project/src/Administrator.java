package 식당;

import java.util.ArrayList;

import java.util.List;

public interface Administrator {
	/*
	 * final String ID="admin"; final String pass="admin"; // 관리자 아이디, 비밀번호
	 */
	/*
	 * // String[] menu=new String[100]; // 반찬 각각 이름 // List<MenuSelect>
	 * menulist=new ArrayList<>(); // 주문 내역이 들어갈 자리
	 */	
	
	public boolean Logon(String ID, String pass); // 관리자 로그온
	public void Logout(); // 관리자 로그아웃
	
	public void menuInput(); // 반찬 입력
	public void menuDelete(); // 반찬 삭제
	
	public double grade=0.0; // 평점,인터페이스는 초기값 주어야합니다. 꼭!

	
}
