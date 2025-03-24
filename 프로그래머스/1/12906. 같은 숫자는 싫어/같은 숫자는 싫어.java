import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (deque.peekLast() != arr[i]) {
                deque.add(arr[i]);
            }
        }

        int size = deque.size();
        answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = deque.poll();
        }

        return answer;
    }
}