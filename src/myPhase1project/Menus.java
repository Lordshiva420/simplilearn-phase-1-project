package myPhase1project;

import java.io.IOException;
import java.util.Scanner;

public class Menus {
   
	Scanner scan = new Scanner(System.in);
	operations op = new operations();
	
	public void introScreen() {
		System.out.println();
		System.out.println("*************************************************");
		System.out.println("*      DEVELOPED BY T.SHIVA REDDY     *");
		System.out.println("*************************************************");
		System.out.println("*               LOCKEDME.COM                    *");
		System.out.println("*************************************************");
		System.out.println("*   Directory: " + Main.path +"    *");
		System.out.println("*************************************************");
		System.out.println("\n\n");
			
	}
	
	public void mainMenuOptions() {
		System.out.println("=====================================");
		System.out.println("|            MAIN MENU              |");
		System.out.println("=====================================");
		System.out.println("| Select any one of the following:  |");
	    System.out.println("|   1 - List All Files              |");
	    System.out.println("|   2 - More Options                |");
	    System.out.println("|   3 - Exit                        |");
	    System.out.println("=====================================");
	    System.out.println("Enter your choice : ");
	}
	
    public void subMenuOptions() {
		
		System.out.println("=====================================");
		System.out.println("|            SUB MENU               |");
		System.out.println("=====================================");
		System.out.println("| Select any one of the following:  |");
	    System.out.println("|   1 - Add a file                  |");
	    System.out.println("|   2 - Delete a file               |");
	    System.out.println("|   3 - Search a file               |");
	    System.out.println("|   4 - Go Back                     |");
	    System.out.println("=====================================");
	    System.out.println("Enter your choice : ");
		
	}
    
    public void exitScreen() {
		
		System.out.println("*************************************************");
		System.out.println("*************************************************");
		System.out.println("*                                               *");
		System.out.println("*    THANK YOU FOR VISITING LOCKEDME.COM        *");
		System.out.println("*                                               *");
		System.out.println("*************************************************");
		System.out.println("*************************************************");
		System.out.println("\n\n");
		
		
	}
    
     public void mainMenu() {
		
		int choice = 0;
		char decision = 0;
		do {
			mainMenuOptions();
		    choice = Integer.parseInt(scan.nextLine());
			switch (choice) {
			
			case 1:
					System.out.println();
					op.listAllFiles(Main.path);
					System.out.println("\n***********************************\n");
					break;
					
			case 2: 
					System.out.println();
					subMenu();
					break;
					
			case 3: 
					System.out.println("\n Are you sure you want to exit ? ");
					System.out.println("  (Y) ==> Yes    (N) ==> No        ");
					decision =  scan.nextLine().toUpperCase().charAt(0);
					if(decision == 'Y') {
						System.out.println("\n");
						exitScreen();
						System.exit(0);
					}else if(decision == 'N') {
						System.out.println("\n");
						mainMenu();
					}else {
						System.out.println("\nInvalid Input \nValid Inputs :(Y/N)\n");
						mainMenu();
					}
					
					
			default:
					System.out.println("\nInvalid Input \nValid Input Integers:(1-3)\n");
					mainMenu();
				
			}
			
			
		}while(true);
		
	}
     
     public void subMenu() {
 		String file = null;
 		String fileName = null;
 		int choice = 0;
 		
 		do {
 			subMenuOptions();
 		    choice = Integer.parseInt(scan.nextLine());
 		
 			
 			switch (choice) {
 			case 1: 
 					System.out.println("\n==> Adding a File...");
 					System.out.println("Please enter a file name : ");
 					file = scan.nextLine();
 					fileName = file.trim();
 					op.createNewFile(Main.path, fileName);
 					
 					System.out.println("\n**********************************\n");
 					break;
 					
 			case 2: 
 					System.out.println("\n==> Deleting a File...");
 					System.out.println("Please enter a file name to Delete : ");
 					file = scan.nextLine();
 					fileName = file.trim();
 					
 					op.deleteFile(Main.path, fileName);
 					System.out.println("\n***********************************\n");
 					break;
 					
 			case 3: 
 					System.out.println("\n==> Searching a File...");
 					System.out.println("Please enter a file name to Search : ");
 					file = scan.nextLine();
 					fileName = file.trim();
 				    op.searchFile(Main.path, fileName);
 					System.out.println("\n***********************************\n");
 					break;
 			case 4: mainMenu();
 					break;
 					
 			default:
 				System.out.println("Invalid Input \nValid Input Integers:(1-4)");
 				subMenu();
 				
 			}
 			
 		file = null;
 		fileName = null;
 			
 		}while(true);
 		
    
}
}

