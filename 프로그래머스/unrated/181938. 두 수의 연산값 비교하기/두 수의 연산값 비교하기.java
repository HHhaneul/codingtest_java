class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
        int e = a * b * 2;
        answer = Math.max(c, e);

        return answer;
    }
}