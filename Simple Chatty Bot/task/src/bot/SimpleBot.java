package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Beep", "2023"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");

        // print out the Bots question
        System.out.println("When would we use a for loop?");

        // Show the possible answers
        System.out.println("1. to check if a condition is true and output a result.");
        System.out.println("2. To iterate over a value n amount of times and execute while true");
        System.out.println("3. You should only use a while loop as it is bad practice using a for loop");
        System.out.println("4. To iterate over a value indefinitely regardless if it is true or false");

        // Check the user input and see if it is the correct answer
        int chosenAnswer = scanner.nextInt();

        while (chosenAnswer != 2) {
            // Ask the User to try again
            System.out.println("Please, try again.");

            // Store the Users new input
            int newAnswer = scanner.nextInt();

            // Check if the new input is incorrect otherwise exit the loop
            if (newAnswer == 1 || newAnswer == 3 || newAnswer == 4) {
                chosenAnswer = 0;
            } else {
                chosenAnswer = newAnswer;
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
