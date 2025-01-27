class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        k -= n / 10;
        int skewers = 12000;
        int beverage = 2000;
        answer = skewers * n + beverage * k;
        return answer;
    }
}