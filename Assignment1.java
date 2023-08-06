/* Given an unsorted list of n elements, find the first element, which is
repeated.*/

package coding;
import java.util.*;
public class Assignment1 {
	public static int deleteDuplicate(int arr[],int size) {
		for(int i=1;i<size;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=in.nextInt();
		System.out.println("Enter the array");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=in.nextInt();
		}
		int k=deleteDuplicate(arr,size);
		System.out.println("First Duplicate Element is:"+k);
		
	}

}
