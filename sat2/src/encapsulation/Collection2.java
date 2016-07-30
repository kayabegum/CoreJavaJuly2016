package encapsulation;

public class Collection2 {
	private String DOB;
	private int    id;
	private String ssn;
	private String name;
	
	public Collection2(){}
	
	
	
	public Collection2(String name, String dOB, int id, String ssn) {

		this.name = name;
		this.DOB = dOB;
		this.id = id;
		this.ssn = ssn;
	}
	
	
	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}



	
	

