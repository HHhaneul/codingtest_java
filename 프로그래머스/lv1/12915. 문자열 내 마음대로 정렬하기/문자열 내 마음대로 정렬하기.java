import java.util.*;


class Solution {
    public String[] solution(String[] strings, int n) {
        List<String> string = new ArrayList<>(List.of(strings));
        return string.stream().map(x -> x.charAt(n) + x).sorted().map(x -> x.substring(1, x.length())).toArray(String[]::new);
    }
}