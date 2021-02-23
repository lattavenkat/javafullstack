import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class convertLinkedlist {
public void linktoarray() {
	Scanner sc = new Scanner(System.in);
	LinkedList<Integer> linkedlist = new LinkedList<Integer>();
	System.out.println("Enter size of the list: ");
	int lisize=sc.nextInt();
	System.out.println("Enter " +lisize+ " numbers: ");
	
	for(int j=0;j<lisize;j++) {					
		linkedlist.add(sc.nextInt());		
	}
	System.out.println("LINKED LIST:" +linkedlist);

    List<Integer> list = new ArrayList<Integer>(linkedlist);
    System.out.println("ARRAY LIST : " +linkedlist);
}
	public static void main(String[] args) {
		System.out.println("CONVERTING LINKED LIST TO ARRAY LIST");
		new convertLinkedlist().linktoarray();

	}

}
