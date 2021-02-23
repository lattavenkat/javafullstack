import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reverseintarray {
	public void revmeth(int arr[]) {
		for(int i=arr.length-1;i>=0;i--) {
	         System.out.print(arr[i] + "  ");
		}
	}
	public static void main(String[] args) {		
		System.out.println("REVERSING INT ARRAY");
		System.out.println("Enter size of the array :: ");
	      Scanner sc = new Scanner(System.in);
	      int size = sc.nextInt();
	      int myArray[] = new int [size];
	      System.out.println("Enter the elements of the array: ");
	      for(int i=0; i<size; i++) {
	         myArray[i] = sc.nextInt();
	      }
		new reverseintarray().revmeth(myArray);
	}

}

    