/*Given an array of n numbers, print the duplicate elements in the array*/

package coding;
import java.util.*;
public class Assignment2 {
	public static ArrayList<Integer> Duplicate(int arr[],int n) {
		ArrayList<Integer> ob=new ArrayList<>();
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
				ob.add(arr[j]);
				}
			}
		}
		return ob;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=in.nextInt();
		System.out.println("enter the array");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		ArrayList<Integer> ob=new ArrayList<>();
		ob=Duplicate(arr,n);
		for(int i:ob) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
