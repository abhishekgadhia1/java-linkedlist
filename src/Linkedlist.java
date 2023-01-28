import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		
		System.out.println(list);
		
		list.addFirst(1);
		System.out.println(list);
		
		list.addLast(20);
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(2));
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext())
		{
			int element = iterator.next();
			System.out.println("element" + element);
		}
	}
}
