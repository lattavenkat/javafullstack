import java.util.ArrayList;
import java.util.Scanner;

public class oddinteger {
	public void odd() {

	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> list= new ArrayList<Integer>();
	
//	System.out.println("Is the topCompanies list empty? : " + list.isEmpty());
	System.out.println("Enter size of the list: ");
	int lisize=sc.nextInt();
	System.out.println("Enter " +lisize+ " numbers: ");
	
	for(int j=0;j<lisize;j++) {					
		list.add(sc.nextInt());		
	}
	System.out.println(list);
	int count=0,num;
	for(int i=0;i<list.size();i++) {
		num=list.get(i);
		if(num%2!=0) {
			count+=1;
		}
	}
	if(count==0) {
		System.out.println("The List do not contains odd number" +list);
	}
	else {
		System.out.println("The List contains odd number" +list);
	}}
	
	public static void main(String[] args) {	
		System.out.println("CHECKING IF THE LIST CONTAINS ONLY ODD NUMBERS");
		new oddinteger().odd();
	}
}