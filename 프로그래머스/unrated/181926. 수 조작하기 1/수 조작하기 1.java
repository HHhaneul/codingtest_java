class Solution {
    public int solution(int n, String control) {
        int answer = n;

        char[] a = control.toCharArray();
        for (char as : a){
            if (as == 'w'){
                answer += 1;
            }
            if (as == 's'){
                answer -= 1;
            }
            if (as == 'd'){
                answer += 10;
            }
            if (as == 'a'){
                answer -= 10;
            }
        }
        return answer;
    }
}