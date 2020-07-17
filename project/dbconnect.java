package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnect {
	private static Connection dbconn;
	public static Connection getConnection() {
		if(dbconn==null) {
			try {
				String url="jdbc:oracle:thin:@localhost:1521:orcl";
				String user="foodadmin";
				String pass="admin";
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				dbconn=DriverManager.getConnection(url,user,pass);
			} catch(Exception e) {
				System.out.println(e.toString());
			}
		}
		return dbconn;
	}
	public static void close() {
		if(dbconn!=null) {
			try {
				if(!dbconn.isClosed()) dbconn.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.toString());
			}
		}
		dbconn=null;
	}
}
