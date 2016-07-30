package homework2;

public class Homework2 {
	
	
	public static void main(String args[]){
		
		String home="it takes hands to build a house,but it takes hearts to build a home.";
		String family="family is like branches of trees, we all grow in different directions,yet our roots remain as one";
		String happy="i think ill just be happy today";
		String uppercasehappy="I THINK ILL JUST BE HAPPY TODAY";
		String nature="if you truly love nature you will find beauty everywhere";
		String nature2="          if you truly love nature you will find beauty everywhere     ";
		String life="dont look back keep going";
		String life2="dont let anything stop you  ,keep going";
		System.out.println(home);
		//#1.shows how many characters the sentence has.
		System.out.println(home.length());
		//#2.shows the 24th char in that sentence.
		System.out.println(home.charAt(24));
		//#3.compares two objects, returns true if both objects have the same sequence of characters and either one is not null,other wise its false.
		System.out.println(home.equals(family)); 
		//#4.turns all the char into lower case.
		System.out.println(family.toLowerCase());
		//#5.turns all the char into upper chase.
		System.out.println(home.toUpperCase());
		//#6.replaces one character/word with another.
		System.out.println(family.replace("grow","replace"));
		//#7.it will go 10 letters and then pick letters from 4 spaces.
		System.out.println(family.substring(20,50));
		//#8.it returns the numbers of letters before the first occurrence of that letter. 
		System.out.println(family.indexOf("k"));
		//#9.concat lets you add two strings together.
		System.out.println(home.concat(home));
		//#10.if two strings are the same but has different cases, then it ignores the cases and returns true, and it is not the same it returns false.
		//example1:
		System.out.println(happy.equalsIgnoreCase(family));
		//ex:2
		System.out.println(happy.equalsIgnoreCase(uppercasehappy));
		//#11.if the string contains that letter it will return true,false if it does not.
		System.out.println(happy.contains("h"));
		//#12.trim allows you to trim the whitespaces.
		int len=nature2.length();
		System.out.println(nature2.trim()+ len);
		//#13.codepointbefore returns the unicode value of the letter before 1.
		int code=nature.codePointBefore(1);
		System.out.println(nature + "=" + code);
		//#14.returns the unicode value of the letter that is at 8.
		int uni=nature.codePointAt(8);
		System.out.println(nature + "=" + uni);
		//#15.
		int nat=nature.codePointCount(2, 4);
		System.out.println(nature + "=" + nat);
		System.out.println(home.matches(nature));
		//#16 it matches two strings.
		System.out.println(nature.matches(nature2));
	    //#17.if it has the same ending word it will return true, false if other wise.
		System.out.println(life2.endsWith(life));
		//#18.lets you replace the entire substring.
		System.out.println(life.replaceAll(life, nature2));
		//#19.since s1 is a new object it is in the heap and it is not the same as s2 thats why it returned false,by setting the value 
		//of s3 as s1 and then doing intern i was able to find the content of the s1 in the constant pool even though objects are in the heap then it returned true.
		//if we create a string using the new operator it will always create a new content and it wont check the constant pool but using  intern we can do that.
		String s1 = new String("hello");
	    String s2= "hello";
	    String s3=s1.intern();
	 System.out.println(s1==s2);
	    System.out.println(s2==s3);
	    //#20.return true if the string is empty,it will return false if any character exists inside the string.
	    String em="";
	    System.out.println(em.isEmpty());
	    //#21. it lets you covert to strings.
          int num=10;
          System.out.println(String.valueOf(num));
         //#22.it converts strings into char array,as in list the letters one by one instead of a whole word.
           String h="hey";
       char [] x= h.toCharArray();
         System.out.println(x[0]);
         System.out.println(x[1]);
         System.out.println(x[2]);
         //23.Returns the string representation of the long argument. 
         //The representation is exactly the one returned by the Long.toString method of one argument.
         long name=50000;
         System.out.println(String.valueOf(name));
        //#24.the hascode generates a unique id for the object. This is what allows objects to be stored/retrieved quickly in a Hashtable
         
         Homework2 y= new Homework2();
         Homework2 t= new Homework2();	 
         System.out.println(y.hashCode());
         System.out.println(t.hashCode());
         //25.if both strings starts with the same suffix then it will return true otherwise it will return false.
         
         System.out.println(home.startsWith(nature2));
	}
}