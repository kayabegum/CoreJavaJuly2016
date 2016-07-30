package homework;

public class Backyard {
	public int how;
	public boolean lier;


	int s;
	boolean k;
	String A;
	double x;
	float d;
	
	public Backyard (int how,boolean lier){
		this.lier =lier;
		System.out.print(lier);
		this.how= how;
		System.out.println(how);
	}
	
	
	public static int area(int w,int l){
		
	int area = w*l;
	
	return area;
	}
	public void color(){
		A="green";
		x=5.1;
		d= 2;
		System.out.println("the color is:" + A +"hight:" + x + "wight:"+ d );
	
}

	public void water(){
	A="blue water";
	 s=2000;
	System.out.println(A + "is"+ s + "liters");
		
	}
	
	public void garden(){
		int area =Backyard.area(20, 20);
		A="feet of grass";
		System.out.println(area+ ":"+A);
	
		
	}
public void pool(){
	A="big";
	s=1;		
	System.out.println("there is" + s + A + "pool in the backyard");
}
}
