public class ZeroToEnd {
    public static void main(String[] args)
	{
		int[] A = { 5, 6, 0, 4, 6, 0, 9, 0, 8 };
		int n = A.length;
		int[] B = new int[n];
		int j = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (A[i] != 0) {
				B[j] = A[i];
				j++;
			}
			else {
				count++;
			}
		}
		while (count > 0) {
			B[j] = 0;
			count--;
			j++;
		}
		for (int i = 0; i < n; i++) {
			A[i] = B[i];
			System.out.print(A[i] + " ");
		}
	}
}
/*

-------------Move all zeroes to end of array----------------------

 Given an array of random numbers, Push all the zero’s of a given array to the end of the array. 
 For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. 

Example: 

Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output : arr[] = {1, 2, 4, 3, 5, 0, 0, 0};

Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
 
 */