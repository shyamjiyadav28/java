class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            int num =nums1[i];
            set.add(num);
        }
        HashSet<Integer> result= new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            int num = nums2[i];
            if(set.contains(num)){
                result.add(num);
            }
        }
        int [] arr = new int [result.size()];
        int i =0;
        for(int num : result){
        arr[i]= num;
        i++;
    }
        return arr;
        
    }
}