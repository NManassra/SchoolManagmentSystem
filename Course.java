package ass2_1212359_s6;
/*
Student's full name : Noura Awni Jaber Manassra
Student's ID : 1212359
Lecture Section No: 4
Lab Section No:6 */
public class Course {
private String name;
private int ID;
public Course() {}

public Course(String name, int iD) {
	super();
	this.name = name;
	ID = iD;
}
public void printInfo() {
	System.out.println("Course name is : " + this.name + " Course ID is : " + this.ID);
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public  int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
}
