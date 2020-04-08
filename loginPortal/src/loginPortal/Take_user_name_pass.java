package loginPortal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Take_user_name_pass {
	 private String get_user_id;
	 private String get_user_pass;
	 private String get_user_title;
	 public Take_user_name_pass (String get_user_id, String get_user_pass) {
		 this.get_user_id = get_user_id;
		 this.get_user_pass = get_user_pass;
	 }
	 public String get_take_user_name_id () {
		 return	 get_user_id;  
	 } 
	 public void set_take_user_name_id (String get_user_id) {
		 this.get_user_id = get_user_id;  
	 }
	 public String get_take_user_name_pass () {
		 return	get_user_pass;  
	 }
	 public void set_take_user_name_pass (String get_user_pass) {
		 this.get_user_pass = get_user_pass;  
	 }
	 public String get_take_user_Title () {
		 return get_user_title;  
	 }
	 public void set_take_user_Title (String get_user_title) {
		 this.get_user_title = get_user_title;  
	 }
	 public void master_taker () {
		// System.out.println(get_user_id);
	//	 System.out.println(get_user_pass);
			String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
					"databaseName=UHD_PHARMACY;integratedSecurity=true;";

			// Declare the JDBC objects.
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			
	        	try {
	        		// Establish the connection.
	        		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            		con = DriverManager.getConnection(connectionUrl);
	            		String the_master_id = null;
	            		String the_master_title = null;
	            		String SQL = ("SELECT * FROM client WHERE Id = '"+get_user_id+"' AND Password = '"+get_user_pass+"' UNION SELECT * FROM staff WHERE Id =  '"+get_user_id+"' AND Password = '"+get_user_pass+"'");
	            		stmt = con.createStatement();
	            		rs = stmt.executeQuery(SQL);
	            
	            		while (rs.next()) {
	            			the_master_id = rs.getString(1);
		            		the_master_title = rs.getString(19);
	            		}
	            	
	            		loginPortal sent_destiny = new loginPortal(the_master_id,the_master_title);
	            		sent_destiny.chose_your_destination();
	            		
	        	}
	        
			// Handle any errors that may have occurred.
			catch (Exception e) {
				e.printStackTrace();
			}
	 }	 
}
