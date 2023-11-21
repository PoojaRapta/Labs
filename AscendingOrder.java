/*
 * int [] marks ={87, 45, 91, 67, 89}
 * rearrange the array in ascending order of the marks.
 */

package ArraysPrograms;

public class AscendingOrder {

   public static void main(String[] args) {
		// Initialize array
		int []arr= {87, 45, 91, 67, 89};
		int temp=0;
		
		//Displaying elements of original array
		
		System.out.println("Element of original array:");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//Sort the array in ascending order
	    for(int i=0; i<arr.length; i++) {
	    	for (int j=i+1; j< arr.length; j++) {
	    		if (arr[i]>arr[j]) {
					temp=arr[j];
					arr[i]=arr[j];
					arr[j]=temp;
				}
	    	}
	    }
	    System.out.println();
	    
	    //Displaying elements of array after sorting
	    
	    System.out.println("Elements of array sorted in ascending order:");
	    for (int i=0; i<arr.length; i++) {
	    	System.out.print(arr[i]+" ");
	    }
	    

	}

}
