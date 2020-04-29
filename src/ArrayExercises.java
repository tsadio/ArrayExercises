import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);

        //Program to write a String in reverse
        //First, prompt the user to enter a word
        //save the user input in the variable "word"
        //determine the length of the word
        //use a for loop to reverse the word
        String word;
        System.out.println("Enter a word: ");
        word = in.nextLine();
        int length = word.length();
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println(" ");



        //Program to check if there are duplicate values in an array
        //First, prompt the user to enter 10 values
        //store the values in an array of integers
        //use a for loop to process the values into the array
        //use an inner if loop to check if numbers are the same
        int arNum [] = new int [5];
        for (int i = 0; i < arNum.length; i++) {
            System.out.print("Enter the " + (i + 1) + " number: ");
            arNum[i] = in.nextInt();
            System.out.println(" ");
        }
        System.out.println("Initial Array; " + Arrays.toString(arNum));


        Arrays.sort(arNum);
        System.out.println("Array sorted: " + Arrays.toString(arNum));
        for (int i = 0; i < arNum.length - 1; i++) {
            if (arNum[i] != arNum[i + 1]) {
                System.out.print(arNum[0] + " " + arNum[i + 1] + " ");
            }
        }
        System.out.println(" ");

        outer: for (int i = 0; i < 5; i++) {
            inner: for (int j = 3; j > 0; j-- ) {
                if (i == j) {
                    continue inner;
                }
                else if (arNum[i] == arNum[j]) {
                    continue outer;
                }
            }
            System.out.print(arNum[i] + " ");

        }
        //System.out.println("New Array: " + Arrays.toString(arNum));


        //Program to print pairs of element with sum 13 in an array
        //Declare and initialise the two arrays
        //using a forloop and a nested forloop, check the sum of elements
        //if the sum is 13, display both elements.
        int [] myArray = {1,7, 6, 5, 9};
        int [] anotherArray = {2, 7, 6, 3, 4};

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if ((myArray[i] + anotherArray[j]) == 13) {
                    System.out.println("(" + myArray[i] + "," + anotherArray[j] + ")");
                }
            }
        }


        //Program to check the total number of odd and even number in an array
        //First, declare an array of length 10
        //Declare an integer value temp
        //Prompt the user to enter 10 values and store them into the array
        //use a for loop to check all the values in the array
        // If the number % 2 == 0, add 1 to temp
        // Display temp as the number of even number and 10 - temp the number of odd

        int newArray [] = new int [10];
        int temp = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter the " + i + " number: ");
            newArray[i] = in.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(newArray));
        for (int i = 0; i < 10; i++) {
            if (newArray[i] % 2 == 0) {
                temp += 1;
            }
        }

        System.out.println("There are " + temp + " even numbers in the Array.");
        System.out.println("There are " + (10 - temp) + " odd numbers in the Array.");



        //Program to divide a sentence into words
        //First prompt the user to enter a String
        //Parse The string line into words using for loop
        //and nested if loop

        String sentence;
        System.out.println("Enter a sentence(no more than 132 characters): ");
        sentence = in.nextLine();
        while (sentence.length() > 132) {
            System.out.println("Your sentence is too long.");
            System.out.println("Enter a sentence(no more than 132 characters): ");
            sentence = in.nextLine();
        }
        System.out.println("You entered " + sentence);

        char[] myChar = sentence.toCharArray();
        for (int i = 0; i < myChar.length; i++) {
            String newString = "";

            while (i < myChar.length && myChar[i] != ' ') {

                newString = newString + myChar[i];
                i++;
            }

            if (newString.length() > 0) {
                System.out.println(newString + " has " + newString.length() + " characters.");
            }
        }

    }
}
