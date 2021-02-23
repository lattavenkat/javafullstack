import java.util.Comparator;

public class ageSort  implements Comparator<sortCustomer>{
	@Override
	public int compare(sortCustomer cust3, sortCustomer cust4) {
	String a1=String.valueOf(cust3.getAge());
	String a2=String.valueOf(cust4.getAge());
	int res=a1.compareTo(a2);
	return res;
	}
}
