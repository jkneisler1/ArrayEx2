import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        // 1. Write a program to print a string in reverse:
        // char[] charAry = {'W', 'e', 'l', 'c', 'o', 'm', 'e'};
        String aryInput = "Welcome";
        char[] charAry = aryInput.toCharArray();
        for (int j = 0; j < charAry.length; j++) {
            System.out.print(charAry[j]);
        }
        System.out.println();
        for (int i = charAry.length - 1; i >= 0; i--) {
            System.out.print(charAry[i]);
        }

        System.out.println();

        // 2. Write a program that will find the length of an input string without using the library function.
        Scanner key = new Scanner(System.in);
        String inputStr;
        int lengthStr = 0;
        char[] inputChar;
        System.out.print("Input a string: ");
        inputStr = key.nextLine();
        System.out.println("The input line chosen is: " + inputStr);

        inputChar = inputStr.toCharArray();
        for (int i = 0; i < inputChar.length; i++) {
            lengthStr++;
        }
        System.out.println("The length of the string is: " + lengthStr);

        System.out.println();

        // 3. Prompt the user to input 10 values and store them into an array.
        //    If there are any duplicate values in that array, remove them and print out the remaining values.
        //    Assume there are no triples in the array.
        int indexVal = 10;
        int newIndexVal = indexVal;
        int[] values = new int[indexVal];
        int[] flags = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("Please enter 10 values when promped.");
        for (int i = 0; i < indexVal; i++) {
            System.out.print("Input an integer value for index " + i + ": ");
            values[i] = key.nextInt();
        }
        System.out.print("Printing out the original array.  ");
        for (int i = 0; i < indexVal; i++) { System.out.print(values[i] + " "); }
        System.out.println();
        System.out.println();
        // determine the length of the new array
        for (int i = 0; i < indexVal-1; i++) {
            for (int j = i+1; j < indexVal; j++) {
                if (values[i] == values[j]) {
                    System.out.println("The same value was found at indices: " + i + " and " + j);
                    System.out.println("Both will be removed.");
                    newIndexVal = newIndexVal - 2;                  // new array length
                    flags[i] = 1;                                   // Creating sentinels, to skip over later on.
                    flags[j] = 1;
                }
            }
        }
        System.out.println("The length of the array without duplicates is: " + newIndexVal);
        // Should check whether newValues is not equal to zero.
        int[] newValues = new int[newIndexVal];             // Initialize the new array without duplicates
        int newIndex = 0;                                   // Create a new index counter
        for (int i = 0; i < indexVal; i++) {                // Creating the new array without duplicates
            if (flags[i] == 0) {
                newValues[newIndex] = values[i];
                newIndex++;
            }
        }
        System.out.println("Printing out a new array without the duplicates");
        for (int i = 0; i < newIndexVal; i++) {
            System.out.println("\tIndex: " + i + ", value: " + newValues[i]);
        }

        System.out.println();

        // 4. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        //    Write a program that will print out all pairs from arrays 1 and 2 that gives a sum of 13:
        //    Expected output:
        //      (6,7)
        //      (9,4)
        int[] ary1 = {1,7,6,5,9};
        int[] ary2 = {2,7,6,3,4};
        int sum13 = 5;
        System.out.println("The number pairs that sum up to 13 are: ");
        for (int i = 0; i < sum13; i++) {
            for (int j = 0; j < sum13; j++) {
                if (ary1[i] + ary2[j] == 13) {
                    System.out.println("(" + ary1[i] + "," + ary2[j] + ")");
                }
            }
        }

        // 5. Prompt the user to input 10 values and store them into an array.
        //    Output the total number of odd and even values in the array.
        int indexE_O = 10;
        int[] evenOdd = new int[indexE_O];
        int even = 0;
        int odd = 0;
        Scanner key2 = new Scanner(System.in);
        System.out.println("Input 10 numbers.");
        for (int i = 0; i < indexE_O; i++) {
            System.out.print("Input a number: ");
            evenOdd[i] = key2.nextInt();
        }

        for (int i = 0; i < indexE_O; i++) {                // Determine the number of even or odd values
            if ( (evenOdd[i] % 2) == 1 ) {
                odd++;
            }
            else {
                even++;
            }
        }
        System.out.println("The number of even values are: " + even + ", the number of odd values are: " + odd + ".");





    }
}
