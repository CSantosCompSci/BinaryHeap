import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class PriorityQueue<E> 
{
	static ArrayList<Integer> heap;
	int heapSize;
	public PriorityQueue()
	{
		heap  =  new ArrayList<Integer>();
	}
	
	public void add(int num)
	{
		heap.add(num);
	}
	
	public void sortUp( int index)
	{
		int parent = heap.get((index - 1) / 2);
		int child = heap.get(index);
		int temp = 0;
		if(parent < child)
		{
			temp = parent;
			heap.set(parent,child);
			heap.set(child,temp);
			sortUp(parent);
		}
	
	}
	//method that checks the children of the parent and switches with the parent whichever one is greater.
	public static void sortDown()
	{
		
	}
	public
	public static void print()
	{
		if(right != null)
		{			
			right.print(level+1);
		}
		for(int i = 1; i <= level; i++)
		{
			System.out.print("    ");
			
		}
		System.out.println(data);
		if(left != null)
		{
			left.print(level+1);
		}
	}
	
	public void insert(int number)
	{
		i
		
		heap.a
		
		
	}
	
	public void delete()
	{
		
	}
	
	public void siftDown()
	{
		
	}
}
