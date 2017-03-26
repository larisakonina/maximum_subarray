/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/** 
 *
 * @author Лариса Конина
 * 23501/3
 */
public class Sort {

static int max(int a, int b) { return (a > b) ? a : b; }
	static int max(int a, int b, int c) { return max(max(a, b), c); }
	public static int end=0, end1=0;
        public static int max_sum=0;
	public static int maxCrossingSum(int arr[], int l, int m, int h)
	{
		// Include elements on left of mid
		int sum = 0;
		
		int left_sum = -10000;
		for (int i = m; i >= 0; i--)
		{
			sum = sum + arr[i];
			if (sum > left_sum) {
				left_sum = sum;
				end1=i;
			}
		}

		// Include elements on right of mid
		sum = 0;
		int right_sum = -10000;
		for (int i = m + 1; i <= h; i++)
		{
			sum = sum + arr[i];
			if (sum > right_sum) {
				right_sum = sum;
			    end=i;
			}
		}

		// Return sum of elements on left and right of mid
		return left_sum + right_sum;
	}
	
	public static int maxSubArraySum(int arr[], int l, int h)
	{
		// Base Case: Only one element
		if (l == h)
			return arr[l];

		// Find middle point
		int m = (l + h) / 2;

		/*Return maximum of following three possible cases
		  Maximum subarray sum in left half
		  Maximum subarray sum in right half
		  Maximum subarray sum such that the subarray crosses the midpoint */
		return max(maxSubArraySum(arr, l, m), maxSubArraySum(arr, m + 1, h), 
				maxCrossingSum(arr, l, m, h));
	}


    public static void main(String[] args) {
    	int Price[] = { 100,123,11,158,25,5 };
    	int n = Price.length-1;
    	int Delta[]={0,0,0,0,0};
    	for (int i = 0; i< Price.length - 1; i++) {
               
               Delta[i] = Price[i + 1] - Price[i];
           }

      max_sum = maxSubArraySum(Delta, 0, n - 1);
  
       
		System.out.print("maximum sum of the subarray in the delta array (your profit) = " + max_sum+"\nDay to buy:  "
		+ end1+"\nDay to sell:   "+end+"\n");

        
    }
}
