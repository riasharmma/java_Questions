/*Find the missing number in an array.*/

package coding;
import java.util.*;
public class Assignment4 {
	public static List<Integer> missingElement(int arr[],int n) {
		Arrays.sort(arr);
		List<Integer> ob=new ArrayList<>();
		int p=0;
		for(int i=0;i<arr[n-1];i++) {
			if(arr[p]!=(i+1)) {
				ob.add(i+1);
			}
			else {
				p++;
			}
		}
		return ob;
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
		List<Integer> ob=missingElement(arr,n);
		for(int i:ob) {
			System.out.print(i+" ");
		}
	}

}
