package ass2_1212359_s6;
/*
Student's full name : Noura Awni Jaber Manassra
Student's ID : 1212359
Lecture Section No: 4
Lab Section No:6 */
import java.util.Scanner;
public class Driver {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
	System.out.println("Enter number of teachers");
	int x = input.nextInt(); //x is number of teachers
   while(x<=0)
    {//I added this to check if the teaachers number is possible or not
    	System.out.println("please enter possible number of teachers bro!");
    	x = input.nextInt();//if the number of teachers NOT possible reenter it 
    }
	int num = 0; // number of courses
	Teacher []user = new Teacher[x];//array of objects
	Course [] userr = new Course[num];//array of objects

	for (int i=0;i<x;i++) {
		//the array of teachers
		System.out.println("Enter teachers name, id, basic salary, and extra payment rate");
		String name=input.next();//values gonna be send to the new object syntax
		int iid=input.nextInt();
		double Bsalary=input.nextDouble(),Epay=input.nextDouble();//Epay = extra payment rate
		while(iid<=0)//iid is the id of the teacher
		{//to check if the id is possible or not,if not reenter it again
			System.out.println("please enter possible ID");
			iid=input.nextInt();
		}
		while(Bsalary<=0)
		{//to check if the basic salary possible or not,if not reenter it again
			System.out.println("you entered implossiple salary, please enter new one");
			Bsalary=input.nextDouble();
		}
		while (Epay<=0)
		{//to check if the extra payment possible, if not reenter it again
			System.out.println("you entered impossible extra payment rate, please enter new one");
			Epay=input.nextDouble();
		}
		System.out.println("Enter number of courses that teacher NO."+(i+1) +" taught : ");	
		num=input.nextInt(); //the array of objects with length of num
		while (num<=0)
		{//to check the number if it's possible or not
			System.out.println("please enter valid number");
			num=input.nextInt();
		}
		userr = new Course[num];
		user[i]=new Teacher(name,iid,Bsalary,Epay,userr);//values of each object (teacher class)
		for (int j=0;j<i+1;j++)//i put this for loop to check if the id of the teacher enterd repeated or not
		{ 
			for (int k=j+1;k<i+1;k++)
			{
				while(user[j].getID()==user[k].getID())
					{System.out.println("you enterd taken ID,please reenter new one");
				iid=input.nextInt();//if the id entered of the teacher repeated reenter it
				user[i].setID(iid);	
				continue;
					}
			}
		}
		System.out.println("Enter Course names and ids");
		for (int ii=0;ii<num;ii++)
			{System.out.println("No." + (ii+1));
			String Cname=input.next();//Cname stands for course id
			int CID=input.nextInt();
			userr[ii]=new Course(Cname,CID);
			int xx=CID,fin=0;
			while (xx>0)//to get the first digit
			{
				fin=xx%10;//fin is the fist digit, it is what we need to check levels
				xx=xx/10;
			}
			if (Cname.length()!=4)
			{//to check if the course name 4 letters or NOT
				System.out.println("you have entered unvalid name course :) please try again by putting the name and id of the course correctly!!");
			    ii--;//this decreament to enter new information correctly for the same index,if the course name not true
			    continue;
			}
			if (fin>4 || fin<1)
				{//check if the first digit from the valid levels 1-4
				System.out.println("You have to enter valid ID COURSE!! PLEASE TRY AGAIN, ADD THE NAME AND THE ID");
			    ii--;
				continue;
				}
			}
		//i put these for loops to check if the ID'S repeated or not
		for (int j=0;j<i+1;j++)
	{ // i put it again cuz the first on will check the numbers before, but this will check for all of them
		for (int k=j+1;k<i+1;k++)
		{
			while(user[j].getID()==user[k].getID())
				{System.out.println("Hey user, I TOLD YOU TO ENTER NEW ID'S, BUT YOU ENTERD REPEATED ID AGAIN, SO PLEASE REENTER THE VALUES FOR ALL TEACHERS TRULY AGAIN!!!!!!!");
		        break;
				}
		}// if there is any repeatd teacher id, user should reenter everything again
	}
		continue;
		}
	
	int n;
	while (true)//i put it true so it will keep working
	{
	System.out.println("Welcome :) please choose what ya wanna do ");
	System.out.println("1- Print Teacher Information");
	System.out.println("2- Display all teachers names and total Salaries");
	System.out.println("3- Change basicSalary for a teacher");
	System.out.println("4- Display sum of Total Salaries ");
	System.out.println("5- Exit");
	n = input.nextInt();//the option int
	switch (n)
	{
	case 1 : 
		while (true) {
		System.out.println("what is the ID of the teacher?");
	         int r = input.nextInt();
	         int flagg=0;//this flag used in the for loop to check if the id valid or not
	         for (int i=0;i<x;i++)
	         {
	        	 if(r==user[i].getID())//checks if the id the user enters exists
	        	 {   user[i].printInfo();//get the teacher info
	                 user[i].printCourses();//get the courses the teacher teach&& i have to mention that this method is new i created in the teacher class
	                 flagg=1;//if it's done, let flag 1 
	        	}
	         }
	         if (flagg==1)//if the id valid, flag will be 1, and it will get out this 
	        	 break;
	        		 //if it exists just stop it,, if i deleted this it will give me that its not valid --always--
	         else   if (flagg==0)//if the id is invalid, flag will keep 0 so it will demand to reenter the id
	        	 { System.out.println("THE ID YOU HAVE ENTERD NOT FOUND!!!");  
	        	 continue;
	        	 }   }
		break;
	case 2 :
		for (int i=0;i<x;i++)//all values NOT specefic
	         {
		      System.out.println("teacer NO. " + (i+1) + " Name's is : " +  user[i].getName() + " and his/her total salary is : " + (user[i].getBasicSalary()+user[i].calculateExtraPayment())); 
	         }
		break;
	case 3 : int flag=1;//this flag used to check if the id valid or not
	         while (flag==1) {
	        	 System.out.println("what is the ID of the teacher?");
	         int rn = input.nextInt(); //rn stands for the teacher id
	         for (int i=0;i<x;i++)
	         {
	        	 if(rn==user[i].getID())//checks if the id the user enters exists
	        	 {
	        		 System.out.println("please enter the new salary");
	        		 int bb=input.nextInt();//the salary user wanna set it as new one
	        		 while(bb<=0)//to check if the salary valid or not
	        		 {
	        			 System.out.println("please enter possible salary!");
	        			 bb=input.nextInt();
	        		 }
	        		 user[i].setBasicSalary(bb);//set the new value
	        		 flag=2;
	        		 break;//if it exists just stop it,, if i deleted this it will give me that its not valid --always--
	        	 }}
	         if (flag==2)//if the id valid get out
	        	 break;
	        	 else if (flag==1)//if the id invalid reenter it go to the beggining again
	        	 { System.out.println("THE ID YOU HAVE ENTERD NOT FOUND!!!");
	        	   continue;
	        	 }
	         }
		break;
	case 4 : double sum=0;
	         for (int i=0;i<x;i++)
	         {
	        	 sum = sum + user[i].getBasicSalary()+user[i].calculateExtraPayment();// doctor said he nees the summation of total salaries so the salary and the extra
	         }
	         System.out.println(sum);//given function
		break;
	case 5 :  System.exit(0);
		break;
	default : System.out.println("please enter valid option");
	continue;
	}
	}
    }
	}