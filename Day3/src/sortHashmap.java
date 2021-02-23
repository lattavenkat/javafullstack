import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class sortHashmap {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("SORTING HASH MAP BY KEYS AND VALUES");
		Map mp= new HashMap();
		System.out.println("Enter no of elements: ");
		int element=sc.nextInt();
		
        for (int i = 0; i < element; i++) {
        	System.out.println("Enter " +element+ " keys: ");	
    		Integer a = sc.nextInt();
    		System.out.println("Enter " +element+ " values: ");
            String b = sc.next();
            mp.put(a,b);
        }
       // System.out.println(mp);
        List sortedkey=new ArrayList();
        sortedkey.add(mp);
        Collections.sort(sortedkey);
        System.out.println("SORTED KEY " +sortedkey);
       
	}
}
/* Map sortedTmap=new TreeMap(mp);
System.out.println("SORTED MAP" +sortedTmap);
 List sortedkey=new ArrayList(mp.keySet());*/