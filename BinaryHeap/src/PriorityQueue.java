import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class PriorityQueue<E> {
	ArrayList<Integer> heap;
	int heapSize;

	public PriorityQueue() {
		heap = new ArrayList<Integer>();
	}

	public void add(int num) {
		heap.add(num);

	}
	public int get(int index)
	{
		return heap.get(index);
	}

	public void remove(int index) {
		heap.remove(index);
	}

	public void swapFirsAndLast() {
		// method to get the contents of the last index and swap it with the
		// first index
		int tempVar;
		tempVar = heap.get(heapSize - 1);
		heap.set(0, tempVar);

	}

	public void sortUp(int index) {
		
		int parent = heap.get((index - 1) / 2);
		int child = heap.get(index);
		int temp = 0;
		if (parent < child) {
			temp = parent;
			heap.set((index - 1) / 2, child);
			heap.set(index, temp);
			sortUp((index - 1) / 2);
		}

	}

	// method that checks the children of the parent and switches with the
	// parent whichever one is greater.
	public static void sortDown(int index) {
		int parent = index;
		int leftChild = heap.get(index * 2 + 1);
		int rightChild = heap.get(index * 2 + 2);
		int tempVar;
		if (parent < leftChild || parent < rightChild)
			if (leftChild >= rightChild) {
				tempVar = parent;
				heap.set(parent, leftChild);
				heap.set(leftChild, tempVar);
			} else {
				tempVar = parent;
				heap.set(parent, rightChild);
				heap.set(rightChild, tempVar);
			}

	}

	public void print(int index, int level)
	{
		if(index >= heap.size())
			return;
		int leftChild = (index * 2 + 1);
		int rightChild =(index * 2 + 2);
		print(rightChild, level + 1);
		
		for(int i = 1; i <= level; i++)
		{
			System.out.print("    ");
			
		}
		System.out.println(heap.get(index));
		print(leftChild, level + 1);
		
	}

}
