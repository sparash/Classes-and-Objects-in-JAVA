import java.util.Scanner;
public class secondl
{

	public static void main(String[] args)
	{

		int arr[] = { 1,9,5,33,67,24,6,89,12,54 };
		int largest = arr[0];
		int secondlarge = arr[0];

		System.out.println("Array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondlarge = largest;
				largest = arr[i];

			} else if (arr[i] > secondlarge) {
				secondlarge = arr[i];

			}
		}

		System.out.println("Second largest number is: "+secondlarge);

	}
}