package homework;

public class FirstFloor {
	public String java;
	public int points;
static int foot;
	String b ;
	boolean H;
	double G;
	char letter;

	public void size(){
	foot= 40;
	b="foot";
	int wight= 20;
	System.out.println("the size of the room is" + foot + "foot long" + wight);
	}

	public void color(){
		b= "cherry";
		String w= "wood";
		System.out.println(b+ w + "floor");
		}
		
	
	//constructors
		public FirstFloor (String java,int points){
			this.java=java;
			System.out.print(java);
			this.points= points;
			System.out.println(points);
		
	}
	public void bed(){
	String l="king size bed";
	System.out.println(l);
	}

public static int 	roomnumber(int num){
	int roomnumber= num;
	return roomnumber;
}
public String F(){
	String N="name";
	return N;
	
	
}
 static public String color(String color){
return (color);
}
 
 public FirstFloor(String java){
	 this.java =java;
	 
 }
}	

