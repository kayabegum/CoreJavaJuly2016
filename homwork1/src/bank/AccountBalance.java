package bank;

public  class AccountBalance extends AccountInfo implements  Users {

	
	public void deposit() {
		System.out.println("total deposit: ");
		
	}

	
	public void ssn() {
	
		System.out.println("ssn");
	}

	
	public void accountbalance() {
		System.out.println("new account balance");
		
	}

	
	public void accountnumber() {
		System.out.println("enter account number");
		
		
	}

	
	public void MakeAPayment() {
	     
		System.out.println("amount");
	}

	
	public void sendmoney() {
		
		System.out.println("to account");
	}
	//Polymorphism changed modified the method in the sub class.
	public void Payment(){
		System.out.println("Would you like to make a payment");
}
}

	
	