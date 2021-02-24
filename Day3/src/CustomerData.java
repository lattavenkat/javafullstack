import java.util.Comparator;

public class CustomerData {
	
	String Fname,Lname,Email;
    int Age;
    CustomerData(String Fname,String Lname,String Email,int Age){
    	this.Fname=Fname;
    	this.Lname=Lname;
    	this.Email=Email;
    	this.Age=Age;
    }
    public String toString()
	{
	return Fname+" "+Lname+" "+Email+" "+Age;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
}
