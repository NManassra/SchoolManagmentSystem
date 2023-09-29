package ass2_1212359_s6;
/*
Student's full name : Noura Awni Jaber Manassra
Student's ID : 1212359
Lecture Section No: 4
Lab Section No:6 */
public class Teacher {
private String name;
private int ID;
private double basicSalary;
private double extraPaymentRate;
private Course[]coursesTaught;
public String getName() { //getter using the generator
	return name;
}
public Teacher() {}
public void setName(String name) {//setter using the generator
	this.name = name;
}
public int getID() {//getter using the generator
	return ID;
}
public void setID(int iD) {//setter using the generator
	ID = iD;
}
public double getBasicSalary() {//getter using the generator
	return basicSalary;
}
public void setBasicSalary(double basicSalary) {//setter using the generator
	this.basicSalary = basicSalary;
}
public double getExtraPaymentRate() {//getter using the generator
	return extraPaymentRate;
}
public void setExtraPaymentRate(double extraPaymentRate) {//setter using the generator
	this.extraPaymentRate = extraPaymentRate;
}

public Course[] getCoursesTaught() {//getter using the generator
	return coursesTaught;
}
public void setCoursesTaught(Course[] coursesTaught) {//setter using the generator
	this.coursesTaught = coursesTaught;
}
public Teacher(String name, int iD, double basicSalary, double extraPaymentRate, Course[] coursesTaught) {
	super();
	this.name = name;
	ID = iD;
	this.basicSalary = basicSalary;
	this.extraPaymentRate = extraPaymentRate;
	this.coursesTaught = coursesTaught;
}
public void printInfo()//prints the full information
{
System.out.println("The name is : " + this.name + " the id is : " + this.ID + " the extra payment rate : " + this.extraPaymentRate + " the basic salary is : "+this.basicSalary );	
}
public int countCourseLevel(int level)
{
	int counter=0;//this counter will be used when we this method called by the print courses method to return the number of methods
	int cou1=0,cou2=0,cou3=0,cou4=0;//counters for levels mentioned at the file
for (int i=0;i<coursesTaught.length;i++)
{   counter++;
	int x = coursesTaught[i].getID(),fin=0;//the id for the course -- the important is the first digit only
	while (x>0)//to get the first digit
	{
		fin=x%10;
		x=x/10;
	}
if(fin==1)//the number of each level
	cou1++;
if(fin==2)//the number of each level
	cou2++;
if(fin==3)//the number of each level
	cou3++;
if(fin==4)//the number of each level
	cou4++;
}
if (level==1)//return the number of subjects with this level
	return cou1;
if (level==2)//return the number of subjects with this level
	return cou2;
if (level==3)//return the number of subjects with this level
	return cou3;
if (level==4)//return the number of subjects with this level
	return cou4;
else return counter;//since the numbers will enter this metod only 1-4, it won't return the counter unless i put number not 1-4, so i used this trick in the print courses method below, i put here in this method number 5, so it will count the courses for this teacher and return them and that is the needed thing
}


public void printCourses()//this method i created to print the courses
{
int z = countCourseLevel(5);//this to count the courses this teacher give
for (int j=0;j<z;j++)
{
	int x = coursesTaught[j].getID();//course ID
	String b = coursesTaught[j].getName();//course name
	System.out.println("the course name is " + b + " the id is " + x);
	}

}
 
public double calculateExtraPayment()
{
	double z = extraPaymentRate*1*countCourseLevel(1)+extraPaymentRate*2*countCourseLevel(2)+extraPaymentRate*3*countCourseLevel(3)+extraPaymentRate*4*countCourseLevel(4);
    return z;//the formula given
}
}