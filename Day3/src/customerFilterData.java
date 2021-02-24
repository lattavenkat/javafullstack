import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class customerFilterData {
	
	static void filtermyData(ArrayList list,String Fname,int Age,List<CustomerData> obj)
    {
        for(CustomerData cd:obj)
        {
        	if(cd.getFname().equals(Fname)&&(cd.getAge()==Age))
        	{
        		System.out.println("Available Records : "+" \n");
        		System.out.println("FirstName"+" "+"LastName"+" "+"Email"+" "+"Age");
        		System.out.println(cd);
        	}
        }
    }
	public static void main(String[] args) {
		
		String Fname,Lname,Email;
	    int Age;
	    System.out.println("Enter the Number of Customer Data : ");
	    Scanner sc=new Scanner(System.in);
	    int len=sc.nextInt();
	    ArrayList list=new ArrayList();
	    var obj=List.of();
	    CustomerData[] cd=new CustomerData[len];
	    for(int i=0;i<len;i++)
	    {
	    	System.out.println("Enter the FirstName : ");
	    	Fname=sc.next();
	    	System.out.println("Enter the LastName : ");
	    	Lname=sc.next();
	    	System.out.println("Enter the Email : ");
	    	Email=sc.next();
	    	System.out.println("Enter the Age : ");
	    	Age=sc.nextInt();
	    	cd[i]=new CustomerData(Fname, Lname, Email, Age);
	    	list.add(cd[i]);
	    }
	    List<CustomerData> list1=new ArrayList<CustomerData>();
	    list1.addAll(list);
	    System.out.println("Enter the FirstName : ");
	    Fname=sc.next();
	    System.out.println("Enter the Age : ");
	    Age=sc.nextInt();
	    filtermyData(list,Fname,Age,list1);
		}

	}


