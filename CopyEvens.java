import java.util.Arrays;

public class CopyEvens
{
	public static void main(String[] args){
		int[] evens = copyEvens(new int[]{4,5,3,6,7,9,8,1,2,5,7,3,9});
		System.out.println("Array is: 4,5,3,6,7,9,8,1,2,5,7,3,9");
		System.out.println("Evens array: " + Arrays.toString(evens));
	}
	public static int[] copyEvens(int[] a){
		int evenCount = countEvens(a);
		int i = 0;
		int[] evens = new int[evenCount];
		for(int n : a)
		{
			if(n % 2 == 0){
				evens[i++] = n;
			}
		}
		return evens;
	}
	private static int countEvens(int[] a){
		int count = 0;
		for(int n : a)
		{
			if(n % 2 == 0){
				count++;
			}
		}
		return count;
	}	
}

    


