import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int number, int limit, int power) {
        List<Integer> ww = new ArrayList<>();
        for (int i = 1; i <= number; i++){
            int a = 0;
            for (int j = 1; j * j <= i; j++){
                if (j * j == i)
                    a++;
                else if (i % j == 0)
                    a += 2;
            }
            ww.add(a > limit ? power : a);
        }
        return ww.stream().mapToInt(x -> x).sum();
    }
}