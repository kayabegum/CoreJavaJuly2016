package project5;

public class Creation {

	public static void main(String[] args) {
		daughter girl= new daughter();
		girl.clothing();
		girl.eye();
		girl.hair();
		girl.shoes();
		
		Encapsulation ID= new Encapsulation();
		ID.setName("mysha ");
		ID.setDOB("05/07/2006 ");
		ID.setAge(10);
		ID.setSsn(1234566789);
     System.out.println(ID.getName()+ ID.getDOB()+ ID.getAge()+ID.getSsn());
     
     
     
     Encapsulation ID2= new Encapsulation("fatiha","07/14/2016",10,1236542155);
     System.out.println(ID2.getName()+ ID2.getDOB()+ ID2.getAge()+ID2.getSsn());
     
     
     daughter con= new daughter(2,5,"hello");
     con.eye();
     
	}

	
}
