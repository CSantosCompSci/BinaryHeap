import java.util.ArrayList;

public class HeapMain 
{
	static int size = 0;
	public static void main(String [] args)
	{
		System.out.println("This is a Binary Heap Program");
		
		//Create arrayList to store 20 random integers that will be sorted in the heap
		
		int [] heap = new int[20];
	
		for(int i = 0; i < 20;i++)
		{
			int random =((int)Math.random()* 1000);
			heap[i] = random;
			sortUp();
			
		}
		
	}
	public static void sortUp()
	{
		while(hasParent(index)&& )
	}
	
	public static boolean hasParent(int index)
	{
		return index > 1;
	}
	
	public static int leftIndex(int index)
	{
		return index *2;
	}
	
	
	
}
