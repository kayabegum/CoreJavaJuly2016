package homework;

public class HouseConstruction {
	public String letsee;

	static int h;
	boolean A;
	double W;
	static String M;
	short l;
	
	public HouseConstruction(String letsee){
		this.letsee= letsee;
		System.out.println(letsee);
	}
	
	public static void main(String args[]){
		FirstFloor Bedroom = new FirstFloor("this room is awesome,i give it a " ,100);
		System.out.print("the master room in the first floor");
		Bedroom.size();
		Bedroom.color();
		Bedroom.bed();
		
		FirstFloor kitchen = new FirstFloor("the kitchen is cool i give it a",100);
		kitchen.foot=20;
		kitchen.roomnumber(2);
		System.out.println("the kitchen has:");
		kitchen.color();
		System.out.println("the size of the kitchen is:" + kitchen.foot);
		System.out.println("the kitchen has:" + kitchen.roomnumber(2)+"tables");
		
		SecondFloor TVRoom =new SecondFloor(7,"blue room");
		System.out.print( "you can watch,");
		TVRoom.watchmovies();
		TVRoom.num=2.1;
		SecondFloor.jelly= "2";
		System.out.println(M="the room has"+ SecondFloor.jelly + "TVs");
		 TVRoom.insidetheroom();
		System.out.println(TVRoom.num + "bathroom");
		
		
		Backyard Garden= new Backyard( 80, false);
		Garden.garden();
		int s=Backyard.area(15, 15);
		System.out.println(s + "feet");
	
		Backyard Pool= new Backyard(90,true);
		Pool.pool();
		int J=Backyard.area(6,6);
		System.out.println("the pool is:" + J + "feet");
		Garden.water();
		
		
		
		Office myOffice= new Office("name", 1);
		myOffice.where();
		myOffice.office("kaya's office");
		myOffice.location(1, 5);
		myOffice.inside();
		myOffice.office();
		System.out.println("nice office");
		
		Office theoffice= new Office("my",3);
		
	
	   
	   
	   
	   
	
	
		
	}
}
