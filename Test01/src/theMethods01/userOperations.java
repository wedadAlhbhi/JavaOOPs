package theMethods01;

import java.util.ArrayList;

public class userOperations {
	ArrayList<User> users = new ArrayList<User>();
	
	public static void main(String args[]) {
		userOperations obj = new userOperations();
		
		
		User userObj = obj.creatUsers();
		obj.add(userObj);
	}
	User creatUsers() {
		User user1=new User(1,"Ahmed");
		return user1;
	}	
	
	void add(User userObj) {
		users.add(userObj);
	}
	void printUser() {
		
	}
	void deleteUser() {
		
	}
	

}
