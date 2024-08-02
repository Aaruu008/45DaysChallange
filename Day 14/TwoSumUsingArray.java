import java.util.*;
public class TwoSumUsingArray {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int more=target - a;
            
            if (mp.containsKey(more)){
                ans[0]=mp.get(more);
                ans[1]=i;
                return ans;

            }
            mp.put(nums[i],i);
           


        }
        return ans;


        
    }
}
