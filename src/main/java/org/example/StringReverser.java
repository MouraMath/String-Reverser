package org.example;

public class StringReverser {
    public void reverseString(char[] s) {
        if(s == null || s.length <= 1) {
            return;
        }

        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    // Helper method to print character arrays
    private static void printCharArray(char[] arr) {
        System.out.print("\"");
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println("\"");
    }

    public static void main(String[] args) {
        StringReverser reverser = new StringReverser();

        // Test case 1: Normal string
        System.out.println("Test case 1: Normal string");
        char[] test1 = "Hello World".toCharArray();
        System.out.print("Original: ");
        printCharArray(test1);
        reverser.reverseString(test1);
        System.out.print("Reversed: ");
        printCharArray(test1);
        System.out.println();

        // Test case 2: Palindrome
        System.out.println("Test case 2: Palindrome");
        char[] test2 = "radar".toCharArray();
        System.out.print("Original: ");
        printCharArray(test2);
        reverser.reverseString(test2);
        System.out.print("Reversed: ");
        printCharArray(test2);
        System.out.println();

        // Test case 3: Single character string
        System.out.println("Test case 3: Single character string");
        char[] test3 = "a".toCharArray();
        System.out.print("Original: ");
        printCharArray(test3);
        reverser.reverseString(test3);
        System.out.print("Reversed: ");
        printCharArray(test3);
        System.out.println();

        // Test case 4: Empty string
        System.out.println("Test case 4: Empty string");
        char[] test4 = "".toCharArray();
        System.out.print("Original: ");
        printCharArray(test4);
        reverser.reverseString(test4);
        System.out.print("Reversed: ");
        printCharArray(test4);
        System.out.println();

        // Test case 5: String with special characters
        System.out.println("Test case 5: String with special characters");
        char[] test5 = "a!b@c#d$".toCharArray();
        System.out.print("Original: ");
        printCharArray(test5);
        reverser.reverseString(test5);
        System.out.print("Reversed: ");
        printCharArray(test5);
    }
}
