package encapsulation;

public class employees {
	
	
	
public static void main(String[] args) {
	Collection employee1= new Collection("nahreen",55,"551326","tester" );
  System.out.println(employee1.getId()+" "+ employee1.getName()+" "+employee1.getP()+" "+employee1.getSsn());
	
  Collection employees2= new Collection();
  Collection em= employees2;
  employees2.setId( 50);
  employees2.setName("  kaya");
  employees2.setSsn("  123-32-5856");
  employees2.setP("  QA tester");
 System.out.println("employees info "+ em.getId()+em.getName()+em.getP()+em.getSsn() );
	}
	
	
	
	
	
	
	
}

