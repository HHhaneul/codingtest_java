import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String str = String.valueOf(new StringBuffer(1000000));

        str = a;

        String str2 = String.valueOf(new StringBuffer(1000000));

        str2 = b;

        System.out.printf("a = %s%n", str);
        System.out.printf("b = %s", str2);
    }
}