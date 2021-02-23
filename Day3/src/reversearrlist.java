import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reversearrlist {
public void revmeth(ArrayList<Integer> a) {
	ArrayList<Integer> list2=new ArrayList<Integer>();
	System.out.println("AFTER REVERSING: ");
	 Collections.reverse(list2);
        System.out.print( "  " +list2);
}

	public static void main(String[] args) {
		System.out.println("REVERSING ARRAY LIST");
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list= new ArrayList<Integer>();
		System.out.println("Enter size of the list: ");
		int lisize=sc.nextInt();
		System.out.println("Enter " +lisize+ " numbers: ");
		for(int j=0;j<lisize;j++) {					
			list.add(sc.nextInt());		
		}
		System.out.println(list);
		
		new reversearrlist().revmeth(list);
		

}
}