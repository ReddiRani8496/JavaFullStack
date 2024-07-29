package training.iqgateway.entities;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc extends Thread{
	public static void main(String[] args) {
		try {
			Class.forName("oracle:jdbc:driver:Driver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","HR","HR");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
