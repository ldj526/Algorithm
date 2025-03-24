import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        answer = Math.min(nums.length / 2, hashSet.size());
        return answer;
    }
}