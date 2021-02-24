import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sortCustomer{
	String FirstName,LastName,Email;
	int Age;
	sortCustomer(String FirstName,String LastName,String Email,int Age)
	{
	this.FirstName=FirstName;
	this.LastName=LastName;
	this.Email=Email;
	this.Age=Age;
	}
	public String toString()
	{
	return FirstName+" "+LastName+" "+Email+" "+Age;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	//
	static void sortmyData(ArrayList al)
	{
	Collections.sort(al,new nameSort().thenComparing(new ageSort()).reversed());
	System.out.println(al);  
	}			
	public static void main(String[] args) {
		
		String FirstName,LastName,Email;
		int Age;
		Scanner sc = new Scanner(System.in);
		ArrayList list=new ArrayList();
		System.out.println("Enter size of the list: ");
		int lisize=sc.nextInt();
		
		for(int j=0;j<lisize;j++) {	
			System.out.println("Enter FIRST NAME: ");
			FirstName=(sc.next());	
			System.out.println("Enter LAST NAME: ");
			LastName=(sc.next());
			System.out.println("Enter EMAIL ID: ");
			Email=(sc.next());
			System.out.println("Enter AGE: ");
			Age=(sc.nextInt());
			list.add(new sortCustomer(FirstName, LastName, Email, Age));
		}
		sortmyData(list);
	}

}
