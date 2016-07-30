package mentoring2;

public class Encapsulation {
private String name;

public Encapsulation(){}
public Encapsulation(String name, String snn, int age) {
	super();
	this.name = name;
	this.snn = snn;
	this.age = age;
}
private String snn;
private int age;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSnn() {
	return snn;
}
public void setSnn(String snn) {
	this.snn = snn;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


}
