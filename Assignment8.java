/*In given List of integers, both +ve and -ve. You need to find the two
elements such that their sum is closest to zero.*/

package coding;
import java.util.*;
public class Assignment8 {
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		List<Integer> ob=new ArrayList<>();
		
		System.out.println("Enter the Integer in the List");
		int p=in.nextInt();
		ob.add(p);
		System.out.println("Want to add more Integers? Y/N");
		char ch=in.next().charAt(0);
		while(ch!='N'&&ch!='n') {
			System.out.println("Enter the Integer in the List");
			int q=in.nextInt();
			ob.add(q);
			System.out.println("Want to add more Integers? Y/N");
			ch=in.next().charAt(0);
		}
		
		int pointer=0;
		int index1=0,index2=0;
		int s=Integer.MAX_VALUE;
		List<Integer> ob2=new ArrayList<>();
		int sum=0,max=Integer.MAX_VALUE;
		for(int i=0;i<ob.size()-1;i++) {
			sum+=ob.get(i);
			 for(int j=i+1;j<ob.size();j++) {
				sum+=ob.get(j);
				if(Math.abs(sum)<Math.abs(max) ) {
					max=sum;
					pointer=j;
				}
				sum=0;
				sum+=ob.get(i);
			 }
			
			 if(Math.abs(ob.get(i)+ob.get(pointer))<s) {
				 s=ob.get(i)+ob.get(pointer);
				 index1=i;
				 index2=pointer;
				// System.out.println("("+ob.get(index1)+","+ob.get(pointer)+")");
			 }
			 sum=0;
		}
		 System.out.println("("+ob.get(index1)+","+ob.get(pointer)+")");
		
		
	}

}
