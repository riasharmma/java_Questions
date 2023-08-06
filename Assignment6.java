/*Given two list X and Y. Find a pair of elements (𝑥𝑖, 𝑦𝑖) such that
𝑥𝑖 ∈ 𝑋 and 𝑦𝑖 ∈ 𝑌 where 𝑥𝑖 + 𝑦𝑖 = 𝑣𝑎𝑙𝑢𝑒.*/

package coding;
import java.util.*;
public class Assignment6 {
	public static void pair(List<Integer> ob1,List<Integer> ob2,int n,int sum) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(ob1.get(i)+ob2.get(j)==sum) {
					System.out.println("("+ob1.get(i)+","+ob2.get(j)+")");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		List<Integer> ob1=new ArrayList<Integer>();
		List<Integer> ob2=new ArrayList<Integer>();
		System.out.println("Enter the size of the list");
		int n=in.nextInt();
		System.out.println("Enter the element for list X");
		for(int i=0;i<n;i++) {
			ob1.add(in.nextInt());
		}
		System.out.println("Enter the elements for list Y");
		for(int j=0;j<n;j++) {
			ob2.add(in.nextInt());
		}
		System.out.println("Enter the sum");
		int sum=in.nextInt();
		pair(ob1,ob2,n,sum);
	}

}
