package bank;

import java.util.Scanner;
public class UserInterface  {
	 String username;
	 String pass;
	 String answer;
	 int deposit1;
	 static final int accountbalance=10000;
	//starting my main method
	 
	public static void main(String args[]){
	
	   Scanner user= new Scanner(System.in);
	   
while(1==1){
	   System.out.println("welcome");
	   ConcreteClass s1= new ConcreteClass();
	   s1.accountnumber();
	   String f,j;
	   f=user.nextLine();
	   if(f.equals("1234")){System.out.println("you are kaya");}
	   else{System.out.println("unknown user");}
	
	   //
	outer:
		while(1==1){
	   String username, pass;
       System.out.println("enter user ID");
       username=user.nextLine();
       System.out.println("enter your password");
       pass=user.nextLine();
       
       //Authentication 
        if(username.equals("kaya")&&(pass.equals("mysha123"))){
        System.out.println("welcome to chase online");
        break outer;}
        else{
        	System.out.println("access denied,incorrect user id and password.");
        }
        }
		
        //view your account information
	
        System.out.println("please press 'enter' to view your account information");
              user.nextLine();
        ConcreteClass userinformation =new ConcreteClass();
        System.out.println("your account information");
        userinformation.setName("kaya begum");
        userinformation.setSsn("123-15-4698");
        userinformation.setAccountnumber(123456789);
        System.out.println("Account Holder:  "+ userinformation.getName());
        System.out.println("SSN: "+ userinformation.getSsn() );
        System.out.println("Account Number: "+ userinformation.getAccountnumber());
        System.out.println("your account balance is: " +accountbalance);	     
        
        
        
        //transaction
        ConcreteClass deposit= new ConcreteClass();
        System.out.println("would you like to make a deposit today?");
        String reply= user.nextLine();
        if(reply.equals("yes")){
        System.out.println("enter the amount you would like to deposit");
        }
        else{ 
        	System.out.println("what would you like to do today?");
        	
        }
        //depositing 
          user.nextLine();
          ConcreteClass amountdeposited= new ConcreteClass();
          user.nextInt();
          int deposit1=user.nextInt(); 
          System.out.println("you deposited: "+ deposit1);
        
          int nm=(accountbalance +deposit1);
          System.out.println("your current balance: " + nm);
          
          //withdrawal
        
          user.nextLine();
          System.out.println("would you like to make a withdrawal?");
          String wa=user.nextLine();
          if(wa.equals("yes")){
        	while(1==1){
        	  
        	  System.out.println("enter the amount you want to withdraw");
        	  int wd=user.nextInt();
        	  int cw=(nm-wd);
        	  System.out.println("you withdrew: "+wd);
        	  System.out.println("your new balance is: " + cw);
        	  while(cw<10){
        		  System.out.println("ATTENTION!!! account balance too low");
        		  cw++;
        		  
}
        	}       	  
}
         else if (wa.equals("no")){
        	  s1.Payment();
        	  String la=user.nextLine();
        	  	if(la.equals("yes")){
        	  	System.out.println("enter the amount you would like to pay");
        		int payment=user.nextInt();
        		int nb=(deposit1+accountbalance-payment);
        		System.out.println("your remaining balance is: "+nb);
 }
        else if(la.isEmpty()){System.out.println("error!! please type 'yes' or 'no' ");}
          
        		  
}
	       
}
}
	

}

