package loginPortal;

class loginPortal {
	 private String user_id;
	 private String User_Title;
	 
	 public loginPortal (String user_id, String User_Title ) {
		 this.user_id = user_id;
		 this.User_Title = User_Title;
		   }
	 public String get_the_user_id () {
		 return user_id;  
	 }
	 public void set_the_user_id (String user_id) {
		 this.user_id = user_id;  
	 } 
	 public String get_the_User_Title () {
		 return user_id;  
	 }
	 public void set_the_User_Title (String User_Title) {
		 this.User_Title = User_Title;  
	 }

	 public void chose_your_destination () throws InterruptedException {
		  if (User_Title.equals("Patient"))  {
			  The_patient_portal.main(user_id);
		  };
		  if (User_Title.equals ("Doctor"))  {
    		receptionist_windows.main(null);
   		};
	 }
}
