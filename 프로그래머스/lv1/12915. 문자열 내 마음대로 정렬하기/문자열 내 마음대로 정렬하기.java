import java.util.*;


class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> string = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            string.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(string);
        for (int i = 0; i < string.size(); i++) {
            answer[i] = string.get(i).substring(1, string.get(i).length());
        }
        return answer;
    }
}