package homework;

public class Office {
	public String name;
	public int amount;
	
static int P;
boolean E;
double dec;
static String address;
float r;

public Office(String name,int amount){
	this.name= name;
	System.out.println("the big office");
	this.amount =amount;
	System.out.println(amount);
			
	}


	public int location (int num1,int num2){
		int distance = num1+num2;
		return distance;
	}		
	public void where(){
		dec=2.1;
		address="119 forbell";
		System.out.println("the office is:" + dec + "miles from the house");
		System.out.println( "located:" +address);
	}
	
		
		public void office(){
			dec=5.1;
			System.out.println("the office is"+ dec +"miles from the house");
			
		
	}
public String office(String name){
	return name;
	
	
	}
public void inside(){
	P=1;
	String c= "blue";
	System.out.println("there is" + P + "chair" + "the color is of the wall is :" +c);		
}

}
