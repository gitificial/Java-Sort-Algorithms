package com.boardremedy.sortalgorithmsinjava;

public class Quicksort
{
	private static void sort(int[] array, int left, int right) 
	{
		int up = left; // left border
		int down = right; // right border
		final int selected = array[(left + right) / 2];
		// selected element
		do 
		{
			//while (array[up].compareTo(selected) < 0)
			while (array[up] - selected < 0)
				up ++; // search bigger element from left
			//while (selected.compareTo(array[down]) < 0)
			while (selected - array[down] < 0)
				down --; // search smaller element from right
			if (up <= down) 
			{ // swap down and up:
				final int temp = array[up];
				array[up] = array[down];
				array[down] = temp;
				// shift left and right border
				up ++; 
				down --;
			};
		} while (up <= down); // overlap
				
		if (left < down)
			sort(array, left, down); // sort left half
		if (up < right)
			sort(array, up, right); // sort right half
	}
		
	public static void sort(int[] array) 
	{
		sort(array, 0, array.length-1); // sort complete array
	}
}