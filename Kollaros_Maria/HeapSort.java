/*****************************************************
The original HeapSort using ALHeap
Maria Kollaros
APCS2 PD#9
HW#41
2014-05-19
*class Heapsort
*Allows for an ALHeap of Integers to be sorted using the sort method
*****************************************************/

public class HeapSort{
    private ALHeap sort;
    
    public Heapsort(){
	sort = new ALHeap();
    }

    public Integer[] sort(Integer[] data){
	int y = data.length;
	Integer[] happy = new Integer[y];
	for(int i = 0; i < y; i++)
	    sort.add(data[i]);
	for(int x = 0; x < y; x++)
	    happy[x] = sort.removeMin();
	return happy;
    }

    public static void main(String[] args){
	Heapsort glad = new Heapsort();
	Integer[] sad = new Integer[]{9,15,3,14,27,31,24,19,35,13};
	Integer[] mad = glad.sort(sad);
	for(int i = 0; i < mad.length; i++)
	    System.out.print(mad[i] + ", ");
	//3, 9, 13, 14, 15, 19, 24, 27, 31, 35, is printed
	System.out.println();
    }
}
