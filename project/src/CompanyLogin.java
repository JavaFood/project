package 식당;

import java.util.HashMap;

public class CompanyLogin {
String ID;
String PASS;
CompanyLogin(String id, String pass) {
	ID=id;
	PASS=pass;
	
}

	public static void main(String[] args) {
		HashMap<String, CompanyLogin> login=new HashMap<>();
		CompanyLogin ta=new CompanyLogin("Tasty","1234");
		CompanyLogin ju=new CompanyLogin("주식","1234");
		CompanyLogin mool=new CompanyLogin("물산","1234");
		CompanyLogin co=new CompanyLogin("Costca","1234");
		CompanyLogin ri=new CompanyLogin("Riotgames","1234");
		
		login.put("Tasty Co.", ta);
		login.put("(주)주식", ju);
		login.put("(주)물산", mool);
		login.put("Costca", co);
		login.put("Riotgames",ri);
		
		
		if(memberID==null && pass=="logout") {
		System.out.println("로그아웃성공");  
	}
	if (memberID.equals(login.get("Tasty Co.").ID && pass.equals(login.get("Tasty Co.").PASS))) {
		System.out.println("로그인성공");
		return true;
			
	} else {
		System.out.println("로그인실패");
		System.out.println("ID,PW를 확인하세요");
		return false;
		
	}
		Member member = new Member();
		member.Logon(login.get("Tasty Co.").ID, login.get("Tasty Co.").PASS);

	}
}
