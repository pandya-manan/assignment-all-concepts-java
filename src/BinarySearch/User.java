package BinarySearch;

import java.util.ArrayList;

public class User {

	private String FirstName;
	private String LastName;
	private int Age;
	private String Gender;
	private String PhoneNo;
	private boolean IsActive;
	public int selectNo;
	
	// Functions
	public void AddNewuser(User u) {
		this.FirstName = u.FirstName;
		this.LastName = u.LastName;
		this.Age = u.Age;
		this.Gender = u.Gender;
		this.PhoneNo = u.PhoneNo;
		this.IsActive = u.IsActive;
	}
	
	// Getter - Setter 
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public boolean isIsActive() {
		return IsActive;
	}

	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}
	
	
	
	
	
	
	public void DispalyUser(ArrayList<User> arr) {
		for (User user : arr) {
			System.out.println("<---------- User Info start ---------->");
			System.out.println(" ");
			System.out.println("FullName: " + user.FirstName + " " + user.LastName);
//			System.out.println("FirstName: " + user.FirstName);
//			System.out.println("LastName: "  + user.LastName);
			System.out.println("Age: "  + user.Age);
			System.out.println("Gender: "  + user.Gender);
			System.out.println("PhoneNo: "  + user.PhoneNo);
			System.out.println("Status: "  + user.IsActive);
			System.out.println(" ");
			System.out.println("<---------- User Info end ---------->");
		}
	}

}

//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//
//}