//problem:Reverse an array
//You are given an array of integers arr[]. Your task is to reverse the given array.

//Examples:

//Input: arr = [1, 4, 3, 2, 6, 5]
//Output: [5, 6, 2, 3, 4, 1]
//Explanation: The elements of the array are 1 4 3 2 6 5. After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. Hence, the answer is 5 6 2 3 4 1.
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int i=0,j=arr.length-1;
        while(i<=j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
}
//problem 2
//Given an arraylist of luck and importance ,find the total such that the luck is maximized.
 public static int luckBalance(int k, List<List<Integer>> contests) {
    // Write your code here
        int total=0;
         List<Integer> importantContests = new ArrayList<>();
        for(List<Integer> contest:contests)
        {
            int luck=contest.get(0);
            int importance=contest.get(1);
            if(importance==1)
                importantContests.add(luck);
            else
                total+=luck;
        }
        importantContests.sort(Collections.reverseOrder());
    for(int i=0;i<importantContests.size();i++)
    {
        if(i<k)
            total+=importantContests.get(i);
        else
            total-=importantContests.get(i);
    }
        return total;
    }

}
