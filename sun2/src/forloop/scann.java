package forloop;
import java.util.Scanner;
public class scann {

	
	public static void main(String args[]){
		Scanner user= new Scanner(System.in);
		String username, pass;
       System.out.println("enter user ID");
       username=user.nextLine();
       System.out.println("enter user password");
       pass=user.nextLine();
       
        if(username.equals("kaya")&&(pass.equals("mysha123"))){
        System.out.println("wellcome to chase online");}
        
        else{
        	System.out.println("access denied, please enter correct username and password");
        	
	}
        
}
}
