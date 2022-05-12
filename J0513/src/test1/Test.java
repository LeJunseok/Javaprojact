//0513 #1
//arrayList alike python list  동적으로 배열 확장
// x = [] x = new int[3]
// x.append(0) = new int[3]
// 동적
package test1;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("hello");
		al.add("world");
		al.add("java");
		System.out.println(al); // al[0] al[1] al[2]
		
		al.set(1, "top");
		System.out.println(al);
		
		al.remove("hello");
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al);
		
		al.clear();
		System.out.println(al);
		
		al.add("python");
		System.out.println("ArrayList size = " +al.size());
		
		al.add("hello");
		al.add("top");
		al.add("world");
		System.out.println(al);
		
		for(int i=0; i < al.size(); i++)
			System.out.print(al.get(i)+ " ");
		System.out.println();
		
		for(String str:al)
			System.out.print(str+" ");
		System.out.println();
		
		Iterator it = al.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		System.out.println();
		
		
		//-------------------------------------------
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		System.out.println(arr);
		
		for(int i : arr)
			System.out.print(" " + i);
		System.out.println();	
	}
}