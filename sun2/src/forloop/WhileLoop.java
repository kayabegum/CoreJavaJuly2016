package forloop;

public class WhileLoop {

	public static void main(String[] args) {

		
			
	       int num=6;
          //state is false
		    boolean state = false;
        //as long as num is less than 5 the statement is true.
		 
		outer:    while(num<=5){
	    	state =  true;
		   System.out.println("conidtion is true");
		//stop
		    num++;
		    break outer;
		}
	    //but is the statement is false then give this
	        if(!state){
	    	System.out.println("loop Condition did not met");}
	    
	        
	        
	    	
	    }

		
	}
	
