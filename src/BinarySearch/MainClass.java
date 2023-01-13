package BinarySearch;

import java.util.ArrayList;
import java.util.Scanner;

//import DataClass.UserData;

public class MainClass {
	
	
	public static void Question() {
		System.out.println("Please.. select options");
		System.out.println(" ");
		System.out.println("1- add User Details");
		System.out.println("2- Show user details");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Options;
		Scanner sc = new Scanner(System.in);
		ArrayList<User> userdata = new ArrayList<>();
		
		// do_while loop
		do {
			User u = new User();
			Question();
			Options =  sc.nextInt();
//			System.out.println("User Selected: " + sc.nextInt());
			
			// Apply Switch case here.. 
			switch (Options) {
			case 1:
				System.out.println(" ");
				System.out.println("Enter First Name: ");
				sc = new Scanner(System.in);
				u.setFirstName(sc.next());
				System.out.println("Enter Last Name: ");
				u.setLastName(sc.next());
				System.out.println("Enter Age: ");
				u.setAge(sc.nextInt());
				System.out.println("Enter Gender: ");
				u.setGender(sc.next());
				System.out.println("Enter Phone No: ");
				u.setPhoneNo(sc.next());
				u.AddNewuser(u);
				userdata.add(u);
				break;
				
			case 2:
				u.DispalyUser(userdata);
				break;
				
			default:
				break;
			}
			
		} while (Options != 0);

	}
}
