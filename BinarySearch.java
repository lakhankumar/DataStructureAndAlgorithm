import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    //searching the letter from the given word
    private static int searchLetter(String[] words) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word you want to search for");
        String word = scanner.next();
        int lowerIndex = 0, higherIndex = words.length-1, midIndex = 0;
        while (lowerIndex <= higherIndex) {
            midIndex = (lowerIndex + higherIndex) / 2;
            if (words[midIndex].equals(word)) {
                return 1;
            } else if ((words[midIndex].compareTo(word)) < 0) {
                lowerIndex = midIndex + 1;
            } else {
                higherIndex = midIndex-1;
            }
        }
        return -1;
    }

    //sorting letter in word
    private static void sorttedArray(String[] words) {
        Arrays.sort(words);
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println(" ");
    }

    //creating array for a given word
    private static String[] word() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word length");
        String[] words = new String[scanner.nextInt()];
        System.out.println("Enter word");
        for (int i = 0; i < words.length; i++) {
            System.out.print((i + 1) + "word: ");
            words[i] = scanner.next();
        }
        return words;
    }

    public static void main(String[] args) {
        String[] words = word();
        sorttedArray(words);
        int result = searchLetter(words);
        if (result==-1){
            System.out.println("word not found");
        }
        else{
            System.out.println("word found");
        }
    }
}
