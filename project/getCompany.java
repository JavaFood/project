package BackGround;
import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class companyPrice {
	String Company;
	int Price;
	companyPrice(String com, int pri) {
		Company=com;
		Price=pri;
	}
}

public class getCompany {
	public static void main(String[] args) throws IOException {
		
		ArrayList<companyPrice> company=new ArrayList<>();
		
		File f=new File("c:/CompanyList.txt"); // 파일 경로 알맞게 수정해서 쓰세요~
		FileReader fr=new FileReader(f);
		BufferedReader bfr=new BufferedReader(fr);
		String line="";
		bfr.readLine();
		while ((line = bfr.readLine()) != null) {
			String[] temp=line.split("\t");
			company.add(new companyPrice(temp[0],Integer.valueOf(temp[1])));
			
			
		}
		bfr.close();
		fr.close();
		// company에 companyPrice 클래스 형태로 저장됨
	}
}
