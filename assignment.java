import java.util.Scanner;

public class assignment {

    Scanner sc = new Scanner(System.in);

    // function to checkPalindrome

    public void checkPalindrome() {
        System.out.println("Enter number to check whether it is palindrome or not");
        int number = sc.nextInt();
        int tempNumber = number;
        int reverseNumber = 0;
        do {
            int remainder = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            tempNumber = tempNumber / 10;
        } while (tempNumber > 0);
        if (reverseNumber == number) {
            System.out.println("Number is palindrome ");
        } else {
            System.out.println("Number is not palindrome ");

        }
    }

    // function to printPattern

    public void printPattern() {
        System.out.println("Enter number to print star pattern");
        int number = sc.nextInt();
        for (int i = number; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // function to check no is prime or not
    public void checkPrimeNumber() {
        System.out.println("Enter number to check number is prime or not");
        int number = sc.nextInt();
        boolean isPrime = true;
        int m = number / 2;
        if (number == 0 || number == 1) {
            System.out.println(number + " is not prime");
        } else {
            for (int i = 2; i <= m; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not prime number");
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is prime number");
        }

    }

    // function to print Fibonacci Series

    public void printFibonacciSeries() {

        // initialize the first and second value as 0,1 respectively.

        int first = 0, second = 1;
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        System.out.print(first+","+second);
        for(int i =0;i<number;i++){
            int sum = first+ second;
            first = second;
            second = sum;
            System.out.print(","+sum);

        }
        System.out.println("");;


    }

    // main method which contains switch and do while loop

    public static void main(String[] args) {

        assignment obj = new assignment();

        int choice;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();

            choice = sc.nextInt();

            switch (choice) {

                case 0:

                    choice = 0;

                    break;

                case 1: {

                    obj.checkPalindrome();

                }

                    break;

                case 2: {

                    obj.printPattern();

                }

                    break;

                case 3: {

                    obj.checkPrimeNumber();

                }

                    break;

                case 4: {

                    obj.printFibonacciSeries();

                }

                    break;

                default:

                    System.out.println("Invalid choice. Enter a valid no.\n");

            }

        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();

    }

}