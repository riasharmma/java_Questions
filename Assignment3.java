/*Remove duplicates in a given integer list.*/

package coding;
import java.util.*;
public class Assignment3 {
	public static List<Integer> duplicate(List<Integer> ob){
		for(int i=0;i<ob.size();i++) {
			for(int j=1;j<ob.size();j++) {
				if(ob.get(i)==ob.get(j)) {
					ob.remove(j);
				}
			}
		}
		return ob;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		List<Integer> ob=new ArrayList<>();
		System.out.println("Enter the size");
		int n=in.nextInt();
		System.out.println("Enter the elements");
		int element;
		for(int i=0;i<n;i++) {
			element=in.nextInt();
			ob.add(element);
		}
		List<Integer> ob2=duplicate(ob);
		for(int i:ob2) {
			System.out.print(i+" ");
		}
	}

}
