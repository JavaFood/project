package BackGround;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class menuAndCal {
	ArrayList<String> menu = new ArrayList<>();
	int cal;

	menuAndCal(ArrayList<String> menuname, int menuCal) {
		menu.addAll(menuname);
		cal = menuCal;
	}
	
}

public class getMenu {
	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<String> menu=new ArrayList<>();
		int cal=0;
		ArrayList<menuAndCal> menuandprice=new ArrayList<menuAndCal>();
		String[] filepath=new String[]{"c:/tastyco.csv","c:/jusik.csv","c:/mulsan.csv","c:/Costca.csv","c:/RiotGames.csv" };
		// 파일 경로 알맞게 수정해서 사용할 것
		File file = new File(filepath[0]); // 회사에 따라 각각 다른 파일을 불러올 것 
		FileReader filereader = new FileReader(file);
		BufferedReader bufreader = new BufferedReader(filereader);

		String line;
		while ((line = bufreader.readLine()) != null) {
			line=line.trim();

			int temp=line.compareTo("kcal");
			if(temp>=0) {
				menu.add(line);

			}
			else
			{
				int c=Integer.valueOf(line.substring(0, line.length()-4));
				cal=c;

				menuAndCal m=new menuAndCal(menu,cal);
				menuandprice.add(m);
			}
			
			
			
		}
		bufreader.close();
		filereader.close();

		

				
	}
}
