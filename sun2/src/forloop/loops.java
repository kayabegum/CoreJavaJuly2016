package forloop;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		outer:
			while(1==1){
		System.out.println("please enter your password ");
           String num=scan.nextLine();
          if(num.equals("kaya123")){
          	break outer;
			}
		else{
			System.out.println("error");
       	
          }
	
	}
}
}
