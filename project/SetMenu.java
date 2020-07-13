package food;


import java.io.*;
import java.util.ArrayList;

// c:\menu.csv파일 필요함 (식단파일)

public class SetMenu {

	public static void main(String[] args) throws Exception {
		ArrayList<String> menu = new ArrayList<>();
		ArrayList<Integer> cal= new ArrayList<>();
		File file = new File("c:/menu.csv");
		FileReader filereader = new FileReader(file);
		BufferedReader bufreader = new BufferedReader(filereader);

		String line = "";

		while ((line = bufreader.readLine()) != null) {
			line=line.trim();
			int temp=line.compareTo("kcal");
			if(temp>=0) {
				menu.add(line);
			}
			else
			{
				int c=Integer.valueOf(line.substring(0, line.length()-4));
				cal.add(c);
			}
			
		}
		bufreader.close();
		

	}

}
