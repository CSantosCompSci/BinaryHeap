import java.util.ArrayList;
import java.util.Random;

public class HeapMain 
{

	public static void main(String [] args)
	{
		System.out.println("This is a Binary Heap Program");
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		Random random = new Random();
		for(int index = 0; index < 20;index++)
		{
			heap.add(random.nextInt(1001));
			heap.sortUp(index);
			//heap.print(0, 0);
			
		}
		heap.print(0,0);
		for( int index = 19; index >= 0; index-- )
		{
			heap.swapFirstAndLast(index);
			heap.sortDown(0);
			heap.remove(index);
			heap.print(0,0);
			System.out.println();
			
		}
		
	}
}
	