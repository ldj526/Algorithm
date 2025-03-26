class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
        int round = 0;
        int i = 0;
        while (i < dartResult.length()) {
            int score = 0;
            if (i + 1 < dartResult.length() && dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0') {
                score = 10;
                i += 2;
            } else {
                score = dartResult.charAt(i) - '0';
                i++;
            }

            char bonus = dartResult.charAt(i);
            i++;
            if (bonus == 'S') {
                score = (int) Math.pow(score, 1);
            } else if (bonus == 'D') {
                score = (int) Math.pow(score, 2);
            } else if (bonus == 'T') {
                score = (int) Math.pow(score, 3);
            }

            if (i < dartResult.length() && (dartResult.charAt(i) == '*' || dartResult.charAt(i) == '#')) {
                char option = dartResult.charAt(i);
                i++;
                if (option == '*') {
                    score *= 2;
                    if (round > 0) {
                        scores[round - 1] *= 2;
                    }
                } else if (option == '#') {
                    score *= -1;
                }
            }

            scores[round] = score;
            round++;
        }

        for (int s: scores) {
            answer += s;
        }
        return answer;
    }
}