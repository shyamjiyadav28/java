class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] result = nums.clone();
        for(int i=0;i<nums.length;i++){
            result[i] = nums[i]*nums[i];
        }
         Arrays.sort(result);

        
        return result;
        
    }
}