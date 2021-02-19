import java.util.Random;
import java.util.Scanner;

public class homework3 {
    public static Scanner in = new Scanner(System.in);
    public static Random rand = new Random();
    public static void guessingNumberGame() {
        int gameOver = 0;
        int userGuess = 0;
        int answer = 0;
        boolean victoryFlag = false;
        while (true) {
            System.out.println("Welcome to guessing game");
            answer = rand.nextInt(10);
            for (int i = 0; i < 3; ++i) {
                userGuess = in.nextInt();
                if (userGuess == answer) {
                    victoryFlag = true;
                    break;
                } else if (userGuess > answer) {
                    System.out.println("lower");
                } else if (userGuess < answer) {
                    System.out.println("higher");
                }
            }
            if(victoryFlag) {
                System.out.println("Good Job! want to try your luck again? [y - 1/n - 0]");
            } else {
                System.out.println("bad luck, wanna start over? [y - 1/n - 0]");
            }

            gameOver = in.nextInt();
            if(gameOver == 0) {
                break;
            }
        }
    }

    public static void guessingWordGame() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String userGuess;
        int answerIndex = rand.nextInt(words.length);
        String answer = words[answerIndex];
        while (true) {
            System.out.println();
            System.out.print("enter your guess: ");
            userGuess = in.nextLine();

            if (userGuess.equals(answer)) {
                System.out.println("Well done");
                break;
            } else {
                if (userGuess.length() >= answer.length()) {
                    for (int i = 0; i < answer.length(); ++i) {
                        if (userGuess.charAt(i) == answer.charAt(i)) {
                            System.out.print(userGuess.charAt(i));
                        } else {
                            System.out.print("#");
                        }
                    }
                    int filler = rand.nextInt(6);
                    for(int i = 0; i < answer.length() + filler; ++i) {
                        System.out.print("#");
                    }
                } else {
                    for (int i = 0; i < userGuess.length(); ++i) {
                        if (userGuess.charAt(i) == answer.charAt(i)) {
                            System.out.print(userGuess.charAt(i));
                        } else {
                            System.out.print("#");
                        }
                    }
                    int filler = rand.nextInt(6);
                    for(int i = 0; i < answer.length() + filler; ++i) {
                        System.out.print("#");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        guessingWordGame();
    }
}
