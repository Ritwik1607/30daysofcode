//Problem:Rotate array
//Given an unsorted array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

//Note: Consider the array as circular.
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
     public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotateArr(int arr[], int d) {
        
        int n = arr.length;

      
        if (n == 0 || d == 0 || d % n == 0) {
            return; 
        }

        d = d % n;
       
        reverse(arr, 0, d - 1);

       
        reverse(arr, d, n - 1);

       
        reverse(arr, 0, n - 1);
    
    }
}
