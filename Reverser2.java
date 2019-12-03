import java.util.Scanner;

public class Reverser2
{
	public static int[] reverse(int[] a)
	{
		int[] newArray = new int[a.length];
		for (int i = 0; i < a.length; i++)
			newArray[(a.length-1) - i] = a[i]; 
		return newArray;
	}
	
	public static void reverse2(int[] a){
        	int rev[] = reverse(a); 
        	for(int i=0; i<rev.length; i++){   
           		a[i] = rev[i];  
		}
	}
	
	private static void display(String header, int[] a)
	{
		if (header.length() != 0)
			System.out.print(header + " ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		System.out.println();
	}
	
    	public static void main(String[] args)
	{		
		int[] example = { 0, 1, 2, 3, 4, 5 };
		display("Before reversing:", example);
		example = reverse(example); 
		display("After reversing: ", example);
		
		int[] example1 = { 1, 2, 3, 4, 5, 6 };
        	display("Before reversing:", example1);
        	reverse2(example1);
		display("After reversing: ", example1);
	}
}

    


