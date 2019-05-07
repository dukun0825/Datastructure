//leetcode 第一题
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {

    }
}
class Solution {
    public int reverse(int x) {
        long result = 0 ;
        while (x!=0){
            result = x%10 + result *10 ;
            x = x/10 ;
        }
        if (result>Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            return 0 ;

        return (int) result ;
    }
}