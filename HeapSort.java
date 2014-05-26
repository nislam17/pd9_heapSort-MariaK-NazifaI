public class HeapSort {

	public int[] sort( int[] data ) {
		ALHeap heap = heapify(data); 		
		size = heap.getSize();
		int i = 0; 
		while (i < size) {
			//swap so min is at root 
		}	
		return data; //placeholder
	}//end sort()
		
	public static ALHeap heapify(int[] data) {
		ALHeap heap = new ALHeap();
		for (int i = 0; i < data.length; i++ ) {
			heap.add(data[i]);
		}
		return heap; 
	}//end heapify()

	public static void main( String[] args ) {
		int[] pile = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9}; 
//		ALHeap heap = heapify(pile);	
//		System.out.println(heap);

//		sort( pile ); 
	}//end main 
}//end class 
