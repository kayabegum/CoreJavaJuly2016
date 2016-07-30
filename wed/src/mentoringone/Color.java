package mentoringone;

import java.util.Scanner;

public class Color {

	
	public static void main(String args[]){
		Scanner scan= new Scanner(System.in);
		 boolean a = true;

	
	while (a == true) {        
	    
	        System.out.println("pick a fortune teller type");
	    
	        String str = scan.nextLine();
	    
	        if (str.equals("job")){ System.out.println("you picked job");break;} 
	        else if (str.equals("love")){ System.out.println("you picked love");break;} 
	        else if (str.equals("family")){ System.out.println("you picked family");break;}
	        else if (str.equals("java")) { System.out.println("you picked java");break;}        
	        else { System.out.println("that is an inccorect choice, try again");}    
	}
	    

	    System.out.println("pick a color");    
	    String color = scan.nextLine();
	    System.out.println("You have chosen:" + color);

	    
	    
	}

		
	}

