class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        
        answer = new String[n];
        for (int i = 0; i < n; i++) {
            String str = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]));
            answer[i] = str.replace('1', '#').replace('0', ' ');
        }

        return answer;
    }
}