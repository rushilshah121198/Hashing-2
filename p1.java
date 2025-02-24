class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        int curSum = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            curSum += nums[i];
            if(curSum == k)
                res++;
            if(map.containsKey(curSum - k))
                res += map.get(curSum - k);
            Integer count = map.get(curSum);
            if(count == null)
                map.put(curSum,1);
            else
                map.put(curSum,count + 1);
        }
        return res;

    }
}