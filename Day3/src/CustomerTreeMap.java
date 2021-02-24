import java.util.Scanner;
import java.util.TreeMap;

public class CustomerTreeMap {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		TreeMap<Integer, String> customer = new TreeMap<>();
		System.out.println("Enter no of elements: ");
		int element=sc.nextInt();
		
        for (int i = 0; i < element; i++) {
        	System.out.println("Enter CUSTOMER ID: ");	
    		Integer a = sc.nextInt();
    		System.out.println("Enter CUSTOMER NAME: ");
            String b = sc.next();
            customer.put(a,b);
        }
		   System.out.println("Sorted Customer Map : " +  customer);
	       System.out.println("Total number of customer : " +  customer.size());
	       System.out.println("Enter id to search for : ");
	      int searchid=sc.nextInt();
	      if( customer.containsKey(searchid)) 
	      {	           
	           String name =  customer.get(searchid);
	           System.out.println("Customer with id " + searchid + " : " + name);
	       } 
	      else 
	      {
	           System.out.println("Customer does not exist with id : " + searchid);
	      }
	      
	       System.out.println("First entry in  customer map : " +  customer.firstEntry());
	       System.out.println("Last entry in  customer map : " +  customer.lastEntry());    
	}
}




   