package database;

import java.sql.Statement;
import java.util.ArrayList;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test1 extends Frame implements MouseListener {
	public static void main(String[] args) {
		Connection conn=dbconnect.getConnection();
		
		ArrayList<Integer> companyno=new ArrayList<>();
		ArrayList<String> companyname=new ArrayList<>();
		ArrayList<Integer> companyprice=new ArrayList<>();
		
		try {

			String sql;
			sql = "select * from company";

			PreparedStatement stmt = conn.prepareStatement(sql);

			ResultSet rt = stmt.executeQuery();
			
			//System.out.println(rt.toString());
			
			while (rt.next()) {
				int companyNo=rt.getInt(1);
				String companyName=rt.getString(2);
				int companyPrice=rt.getInt(3);
				companyno.add(companyNo);
				companyname.add(companyName);
				companyprice.add(companyPrice);

			}

			//stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

//			if (conn != null)
//				try {
//					conn.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
