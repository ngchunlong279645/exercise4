package ArrayOneDimensional;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		// write a program that create an array of 10 element size. your program should from the user to 
		// input number in array and then display the sum of a array element
		
		int i,j,sum=0;
		int[] number = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10 input : ");
		
		for(i=0;i<number.length;i++) {
		number[i]=scan.nextInt();
		}
		
		for(i=0;i<number.length;i++) {
			System.out.println(number[i]);
			}
		
		for(j=0;j<number.length;j++) {
		sum+=number[j];
		}
		
		System.out.println("The sum equal to : "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
