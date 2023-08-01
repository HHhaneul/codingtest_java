class Solution {
    public String solution(String code) {
        String answer = "";

        int mode = 0;

        char[] codes = code.toCharArray();

        for (int i = 0; i < code.length(); i++){

            if (codes[i] == '1' && mode == 0){
                mode++;
                continue;
            }
            if (codes[i] == '1' && mode == 1){
                mode--;
                continue;
            }
            if (mode == 0 && i % 2 == 0) {
                answer += code.charAt(i);
            }
            if (mode == 1 && i % 2 == 1) {
                answer += code.charAt(i);
            }
        }
            if (answer == "") return "EMPTY";
        return answer;
    }
}