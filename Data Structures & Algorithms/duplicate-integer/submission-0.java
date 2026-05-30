class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(map.contains(nums[i]) == false) {
                map.add(nums[i]);
            }
            else {
                return true;
            }
        }
        return false;
    }
}