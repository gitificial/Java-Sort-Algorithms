package com.boardremedy.sortalgorithmsinjava;

public class Insertionsort 
{
	public static void sort(int[] array) 
	{
		for (int index = 1; index < array.length; index++) 
		{ 	// start at 2nd element
			final int elementToInsert = array[index];
			int insertionPoint = index;
			while (insertionPoint > 0 && elementToInsert - array[insertionPoint-1] < 0) 
			{
				array[insertionPoint] = array[insertionPoint-1];
				// push up
				insertionPoint --;
			}; 
			// Insertion point found: either insertion point = 0 or elementToInsert - array < 0 
			array[insertionPoint] = elementToInsert;
		}
	}
}
