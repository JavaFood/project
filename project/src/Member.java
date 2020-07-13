package 식당;

public class Member implements  Administrator {
	String memberID;
	String pass;
	public Member() {}
	
	Member(String memberID,String pass){
		this.memberID=memberID; this.pass=pass;
		
	}

	@Override
	public String toString() {

		return "";
	}
	public boolean Logon(String memberID, String pass) {
		if(memberID==null && pass=="logout") {
			System.out.println("로그아웃성공");  
		}
		if (memberID.equals(Comp)) {
			System.out.println("로그인성공");
			return true;
				
		} else {
			System.out.println("로그인실패");
			System.out.println("ID,PW를 확인하세요");
			return false;
			
		}
	}

	@Override
	public void Logout() { 
		if(memberID==null && pass=="logout") {
			Logon(memberID,pass);  //메인에서 버튼과연동해주기 
			System.out.println("로그아웃성공");
			
		}
		
	}

	@Override
	public void menuInput() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuDelete() {
		// TODO Auto-generated method stub
		
	}





}
