package Codes;

public class Student {
private int id;
private String name;
private Date dob; // contenment -- declaring one class object in another class as a data member 

public Student()
{
	id = 100;
	name="Ram";
}

public Student(int id , String name, int day , int month , int year)
{
	
	this.id=id;
	this.name=name;
	this.dob = new Date(day,month,year);
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", dob=" + dob.toString() + "]";
}



}
