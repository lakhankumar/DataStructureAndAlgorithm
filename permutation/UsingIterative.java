package permutation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsingIterative {
    public static void findPermutations(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        List<String> stringList = new ArrayList<>();

        stringList.add(String.valueOf(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            for (int j = stringList.size() - 1; j >= 0; j--) {
                String s = stringList.remove(j);
                for (int k = 0; k <= s.length(); k++) {
                    stringList.add(s.substring(0,k) + str.charAt(i) + s.substring(k));
                }
            }
        }
        System.out.println(stringList);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        findPermutations(str);
    }
}
