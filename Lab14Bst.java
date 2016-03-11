// Lab14Bst.java
// The "Text Files of Names" Program
// This is the student, starting version of Lab 14B.


import java.io.*;


public class Lab14Bst
{
	private static String names[];
	private static int fileSize;

	public static void main (String args[]) throws IOException
	{
		System.out.println("\nLab 14B\n");
		names = new String[100];
		readFile("Names1.txt");
		displayArray();
		sortArray();
//		displayArray();           // Uncomment this line for 100 point version only.
		writeFile("Names2.txt");
	}

	public static void readFile(String fileName) throws IOException
	{

	}

	public static void displayArray()
	{
		System.out.println("Names Array Contents\n");



		System.out.println();
	}

	public static void sortArray()
	{

	}

	public static void writeFile(String fileName) throws IOException
	{

	}

}


