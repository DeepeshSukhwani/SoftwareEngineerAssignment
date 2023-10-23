import java.util.Random;

public class ArrayShuffler{
    public static void main(String[] args) {
        // A. Shuffle an array
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);

        // B. Convert Roman Number to Integer
        String romanNumeral = "IX";
        int integerEquivalent = romanToInteger(romanNumeral);
        System.out.println("Roman to Integer: " + integerEquivalent);

        // C. Check if a sentence is a pangram
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(sentence);
        System.out.println("Is Pangram: " + isPangram);
    }

    // A. Shuffle an array
    public static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.print("Shuffled Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // B. Convert Roman Number to Integer
    public static int romanToInteger(String s) {
        // Add your code here to convert Roman numeral to an integer
        return 0; // Placeholder
    }

    // C. Check if a sentence is a pangram
    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
