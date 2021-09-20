package permutation;

import java.util.Scanner;

public class UsingRecursion {
    private static void swapping(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    private static void permutations(char[] chars, int currentIndex) {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }

        for (int i = currentIndex; i < chars.length; i++) {
            swapping(chars, currentIndex, i);
            permutations(chars, currentIndex + 1);
            swapping(chars, currentIndex, i);
        }
    }

    public static void findingPermutation(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        permutations(str.toCharArray(), 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = scanner.nextLine();
        findingPermutation(str);
    }
}
