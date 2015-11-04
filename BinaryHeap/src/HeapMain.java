import java.util.ArrayList;
import java.util.Random;

public class HeapMain 
{

	public static void main(String [] args)
	{
		System.out.println("This is a Binary Heap Program");
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		for(int index = 0; index < 20;index++)
		{
			int random =((int)Math.random()* 1000);
			heap.add(random);
			heap.sortUp(index);
			
		}
		for( int index; )
		
	}
	