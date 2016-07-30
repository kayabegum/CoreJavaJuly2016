package project5;

public class Encapsulation {
	
private String name;
private String DOB;
private int age;
private int ssn;

public Encapsulation(){}

public Encapsulation(String name, String dOB, int age, int ssn) {
	super();
	this.name = name;
	DOB = dOB;
	this.age = age;
	this.ssn = ssn;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String dOB) {
	DOB = dOB;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSsn() {
	return ssn;
}
public void setSsn(int ssn) {
	this.ssn = ssn;
}



	
}
