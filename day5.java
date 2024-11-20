//Majority Element II
//You are given an array of integer arr[] where each number represents a vote to a candidate. 
//Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 

//Note: The answer should be returned in an increasing format

class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        int n=nums.length;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>n/3)
            {
                list.add(entry.getKey());
            }
        }
        return list;
    }
}

