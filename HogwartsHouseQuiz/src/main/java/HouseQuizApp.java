import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class HouseQuizApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hatPoem = "Oh, you may not think I'm pretty,\n" +
                "But don't judge on what you see,\n" +
                "I'll eat myself if you can find\n" +
                "A smarter hat than me.\n" +
                "You can keep your bowlers black,\n" +
                "Your top hats sleek and tall,\n" +
                "For I'm the Hogwarts Sorting Hat\n" +
                "And I can cap them all.\n" +
                "There's nothing hidden in your head\n" +
                "The Sorting Hat can't see,\n" +
                "So try me on and I will tell you\n" +
                "Where you ought to be.\n" +
                "You might belong in Gryffindor,\n" +
                "Where dwell the brave at heart,\n" +
                "Their daring, nerve, and chivalry\n" +
                "Set Gryffindors apart;\n" +
                "You might belong in Hufflepuff,\n" +
                "Where they are just and loyal,\n" +
                "Those patient Hufflepuffs are true\n" +
                "And unafraid of toil;\n" +
                "Or yet in wise old Ravenclaw,\n" +
                "if you've a ready mind,\n" +
                "Where those of wit and learning,\n" +
                "Will always find their kind;\n" +
                "Or perhaps in Slytherin\n" +
                "You'll make your real friends,\n" +
                "Those cunning folk use any means\n" +
                "To achieve their ends.\n" +
                "So put me on! Don't be afraid!\n" +
                "And don't get in a flap!\n" +
                "You're in safe hands (though I have none)\n" +
                "For I'm a Thinking Cap!";

        String[] lines = hatPoem.split("\\n");

        for (String line : lines) {
            System.out.println(line);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n\nWelcome to Hogwarts! Since some of our students are going to be joining us remotely, we have decided to do an online sorting program!\n" +
                "We'll ask you a few questions to get a fit of your personality, and then you'll be on your way!\n\n" +
                "Question 1: ");
    }
}
