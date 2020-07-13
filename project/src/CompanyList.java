package 식당;

import java.util.HashMap;
//회사 목록과 각 식권가격 리스트
public class CompanyList {
	static HashMap<String, Integer> companymap = new HashMap<String, Integer>();
	public void addcompany(String name, int price) {
		companymap.put(name, price);
	}
	public static void main(String[] args) {
		
		companymap.put("Tasty Co.", 4500);
		companymap.put("(주)주식", 4000);
		companymap.put("(주)물산", 5000);
		companymap.put("Costca", 4500);
		companymap.put("Riotgames", 6000);
	
		
		// 회사검색 - 정규표현식.
		// gui에서 등록 하시겠습니까 예/아니요 구현 
	}
}
