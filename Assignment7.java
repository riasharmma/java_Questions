/*Given an array of n numbers, find two elements such that their sum is
equal to “value”.*/

package coding;
import java.util.*;
public class Assignment7 {
	public static void sum(int arr[],int n,int sum) {
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-1;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
	}
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
		System.out.println("Enter the sum ");
		int sum=in.nextInt();
		sum(arr,n,sum);
	}

}
