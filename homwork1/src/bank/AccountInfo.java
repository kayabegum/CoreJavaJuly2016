package bank;

public abstract class AccountInfo {

   
public int deposit(int amount){
int accountbalance= amount;
return accountbalance;
}
	
public abstract void MakeAPayment();
public abstract void sendmoney();

public void Payment(){
	System.out.println("Would you like to make a payment today?");
}


	
}
