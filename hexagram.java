
import java.util.*;

public class hexagram {

        public static int[] numbers;
        private static final int SIZE = 12;
        private static final int[][] LINES = { { 0, 2, 5, 7 }, // Line #1
                        { 7, 8, 9, 10 }, // Line #2
                        { 0, 3, 6, 10 }, // Line #3
                        { 1, 2, 3, 4 }, // Line #4
                        { 4, 6, 9, 11 }, // Line #5
                        { 1, 5, 8, 11 } }; // Line #6

        /*
         * 6 Lines for a complete hexagram, value represents position in hexagram
         * I thought about it as a triangle and upside-down triangle
         * 0
         * / \
         * 1---2---3---4
         * \ / \ /
         * 5 6
         * / \ / \
         * 7---8---9---10
         * \ /
         * 11
         */

        public static void main(String[] args) {

                Scanner stdin = new Scanner(System.in);

                // While loop until 0's are entered
                while (true) {
                        numbers = readInput(stdin);

                        // readInput function returns null when 0's are inputed
                        if (numbers == null)
                                break;

                        // Sums up the numbers in the array to figure out magicSum
                        int magicSum = 0;
                        for (int n : numbers) {
                                magicSum += n;
                        }

                        // If the sum is not divisible by 3, return 0
                        if (magicSum % 3 != 0) {
                                System.out.println(0);
                                continue;
                        }

                        // Otherwise, find the # of stars
                        else {
                                // Initialize variables and arrays to generate permutations
                                magicSum /= 3;
                                int[] permutation = new int[SIZE];
                                boolean[] used = new boolean[SIZE];

                                // Since a hexagram has 12 possible rotations, must divide by 12 to remove
                                // duplicate arrangements
                                int result = getPermutations(0, permutation, used, magicSum) / 12;

                                // Prints results
                                System.out.println(result);
                        }
                }
        }

        // Read number inputs from the user and returns the array
        private static int[] readInput(Scanner stdin) {

                numbers = new int[SIZE];
                for (int i = 0; i < SIZE; i++) {
                        numbers[i] = stdin.nextInt();

                        // If user entered 0, return null
                        if (numbers[i] == 0) {
                                return null;
                        }
                }
                return numbers;
        }

        // A recursive backtracking function that generates permutations and keeps track
        // of the number of valid arrangements
        private static int getPermutations(int index, int[] permutation, boolean[] used, int magicSum) {

                // Base case: Returns 1 when a complete star is formed
                if (index == permutation.length) {
                        return 1;
                }

                int stars = 0;
                // Iterates through each number to consider placing it in the specific index
                for (int i = 0; i < permutation.length; i++) {

                        // If a number is not already used
                        if (!used[i]) {
                                boolean validIndex = true;

                                // Iterate through each LINE of the hexagram
                                for (int[] line : LINES) {
                                        // If the index = the last index in a line, calculate the sum for when this
                                        // number is placed
                                        if (index == line[3]) {
                                                int checkSum = numbers[i];

                                                // Iterate through the current line
                                                for (int j = 0; j < line.length - 1; j++) {
                                                        // permIndex is the index of the number in the permutation array
                                                        int permIndex = permutation[line[j]];
                                                        checkSum += numbers[permIndex];

                                                        // Stop iterating through the loop if sum exceeds magicSum
                                                        if (checkSum > magicSum) {
                                                                validIndex = false;
                                                                break;
                                                        }
                                                }
                                                // This calculated sum must = magicSum, otherwise the number can not be
                                                // placed
                                                if (checkSum != magicSum) {
                                                        validIndex = false;
                                                }
                                        }
                                }
                                // If index is valid, add the current number to the permutation
                                // Recursive call to the next index
                                if (validIndex) {
                                        permutation[index] = i;
                                        used[i] = true;
                                        stars += getPermutations(index + 1, permutation, used, magicSum);
                                        used[i] = false;
                                }
                        }
                }
                return stars;
        }
}
