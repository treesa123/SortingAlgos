package com.treesa.bubblesort;

import java.util.Scanner;
import java.util.Random;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BubbleSort
	{
	public static void sort(int arrayy[],int n)
	{int c,d;
	for (c = 0; c < ( n - 1 ); c++)
	{
		for (d = 0; d < n - c - 1; d++) 
		{
        	if (arrayy[d] > arrayy[d+1]) /* For descending order use < */
        	{
         		int swap       = arrayy[d];
          		arrayy[d]   = arrayy[d+1];
          		arrayy[d+1] = swap;
        	}
		}
	}
 
       System.out.println("Sorted list of numbers");
 
       for (c = 0; c < n; c++) 
       System.out.println(arrayy[c]);
	}
	
	
	
	public static void main(String []args)
	{
	int n,c,k; int maximum,minimum;
    	Scanner in = new Scanner(System.in);
	Random r= new Random();
        //System.out.println("Input number of integers to sort");
 	//n = in.nextInt();
 	//System.out.println("Input number of minimum and maximum numbers(for finding the range for which the random numbers are entered)");
 	//minimum = in.nextInt();
 	//maximum = in.nextInt();

	File file = new File("src/test/resources/test.txt");
	FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;

		try 
		{
			fis = new FileInputStream(file);

			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);

			while (dis.available() != 0)
			{
				System.out.println(dis.readLine());
			}


			byte[] datainBytes = new byte[dis.available()];
		 	dis.readFully(datainBytes);
			String content = new String(datainBytes, 0, datainBytes.length);
		     
		 	System.out.println(content);			






		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{	
				try
				{
				fis.close();
				bis.close();
				dis.close();
				}

				catch(Exception e)
				{
				System.out.print(e);
				}
		}


	int array[] = new int[n];
 
 
	for (c = 0; c < n; c++) 
	array[c] = (r.nextInt(maximum-minimum) + minimum); 
 	
	sort(array,n);	

	}
}