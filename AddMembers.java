/*
 * Make an array of size 5. Take input from user to add members in the array.
 * Find the highest and the lowest member of this array at the end.
 */
package ArraysPrograms;

import java.util.Scanner;

public class AddMembers{

public static void main(String args[]){
	try (Scanner sc = new Scanner(System.in)) {
		int[]arr=new int[5];
		
		   System.out.println("Enter five element in Array ");
		   for(int i=0; i<=4; i++) {
			   arr[i]=sc.nextInt();
		   }
		   for(int i=0; i<arr.length; i++) {
			   for(int j=0; j<arr.length -i -1; j++) {
				   if (arr[j]>arr[j+1]) {
					   
					   int t= arr[j];
					   arr[j]=arr[j+1];
					   arr[j+1]=t;
				   }
			   }
		   }
		   System.out.println("Highest number is "+arr[4]);
		   System.out.println("Lowest number is "+arr[0]);
	}
}
}