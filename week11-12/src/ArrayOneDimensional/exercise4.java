package ArrayOneDimensional;

import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		// The variable list1 and list2 are reference arrays that each have 5 elements. 
		//Write code that copies the values in list1 to list2. Values in list1 are input by user.
		
		int i,j;
		int[] list1 = new int[5];
		int[] list2 = new int[5];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input : ");
//list1		
		for(i=0;i<list1.length;i++) {
			list1[i]=scan.nextInt();
		}
		
//list2
		for(i=0;i<list2.length;i++) {
			list2[i]=list1[i];
		}

		
		System.out.println("output of list 1 ");
		for(j=0;j<list1.length;j++) {
			System.out.println(list1[j]);
		}
		System.out.println("output of list 2 ");
		for(j=0;j<list1.length;j++) {
			System.out.println(list2[j]);
		}
	}

}
