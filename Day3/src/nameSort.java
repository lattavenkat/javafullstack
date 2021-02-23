import java.util.Comparator;

public class nameSort implements Comparator<sortCustomer>{
	@Override
	public int compare(sortCustomer cust1, sortCustomer cust2) {
	int res=cust1.getFirstName().compareTo(cust2.FirstName);
	return res;
	}

}
