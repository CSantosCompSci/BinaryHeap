import java.util.ArrayList;

public class HeapMain {
	public static void main(String [] args)
	{
		System.out.println("This is a Binary Heap Program");
		
		//Create arrayList to store 20 random integers that will be sorted in the heap
		
		ArrayList<Integer> randoms = new ArrayList<Integer>();
		for(int i = 0; i < 20;i++)
		{
			randoms.add((int)Math.random()* 1000);
		}
		
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		heap.add(randoms);
	}
}
