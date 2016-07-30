package mentoring;

import java.util.Scanner;

public class Scan {

	public static void main(String arg[]){
		Scanner scan= new Scanner(System.in);
		
outer:	
		while(1==1){
		System.out.println("pic a number: 1, 2, 3");
		String num=scan.nextLine();
	
		switch(num){
		case "1":
			System.out.println("you are number 1");
			break;
		case "2":
			System.out.println("you are second");
			break;
		case"3":
			System.out.println("you come in last");
			break;
			break outer;
		
			default:System.out.println("wrong");
		}
		}
		
		
	}
	}

