package UserMenu;

import java.util.Scanner;
public class userMenuClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int selection = 1;
		//selection = input.nextInt();
		
		while(selection!=4) { 
		System.out.println("Choose from these options: ");
		System.out.println("1. Add a user specified file");
		System.out.println("1. Delete a user specified file");
		System.out.println("3. Search a user specified file");
		System.out.println("4. Quit");
		
		selection = input.nextInt();
					
			switch(selection) {
			case 1:
				System.out.println("Option 1 selected");
				break;
			case 2:
				System.out.println("Option 2 selected");
				break;
			case 3:
				System.out.println("Option 3 selected");
				break;
			case 4:
				System.exit(0);
				break;
				
				default:
					System.out.println("Wrong option");
			}
			
		}
	}
}
