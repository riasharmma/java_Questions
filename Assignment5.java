/* Given an array, find the maximum and minimum value in the array
and also find the values in range minimum and maximum that are 
absent in the array*/

package coding;
import java.util.*;
public class Assignment5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=in.nextInt();
		System.out.println("Enter the array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		List<Integer> ob=new ArrayList<>();
		Arrays.sort(arr);
		int p=0;
		System.out.println("Min no. "+arr[0]+" Max no. "+arr[n-1]);
		for(int i=arr[0];i<arr[n-1];i++) {
			if(arr[p]!=i) {
				ob.add(i);
			}
			else {
				p++;
			}
		}
		for(int i:ob) {
			System.out.print(i+" ");
		}
	}

}
