package com.boardremedy.sortalgorithmsinjava;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args) 
    {
    	int[] array = new int[] {10, 3, 5, 3, 6, 3, 2, 8, 7, 2, 2};
    	Quicksort.sort(array);
    	System.out.println(Arrays.toString(array));
    	
    	array = new int[] {10, 3, 5, 3, 6, 3, 2, 8, 7, 2, 2};
    	Insertionsort.sort(array);
    	System.out.println(Arrays.toString(array));

    }  
}

