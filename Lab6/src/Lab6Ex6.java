import java.util.Random;
import java.util.Scanner;

public class Lab6Ex6 {
    public static void main(String[] args) {
        play();
    }

    public static void play() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            int pcChoice = rand.nextInt(3) + 1;
            String pcChoiceString = convertToChoiceString(pcChoice);

            System.out.println("Choose rock (r), paper (p), or scissors (s).");
            String playerChoice = scan.nextLine();

            if (checkWinner(pcChoiceString, playerChoice)) {
                System.out.println("Congratulations!");
            } else {
                System.out.println("Try again!");
            }
        }

    }

    public static String convertToChoiceString(int choice) {
        switch (choice) {
            case 1:
                return "rock";
            case 2:
                return "paper";
            case 3:
                return "scissors";
            default:
                return "unknown";
        }
    }

    public static boolean checkWinner(String pcChoice, String playerChoice) {
        System.out.println("You chose " + playerChoice + ". The computer chose " + pcChoice + ".");

        switch (playerChoice) {
            case "r" -> {
                if (pcChoice.equals("rock")) {
                    System.out.println("Tie!");
                    return false;
                } else if (pcChoice.equals("paper")) {
                    System.out.println("You lose!");
                    return false;
                } else {
                    System.out.println("You win!");
                    return true;
                }
            }
            case "p" -> {
                if (pcChoice.equals("rock")) {
                    System.out.println("You win!");
                    return true;
                } else if (pcChoice.equals("paper")) {
                    System.out.println("Tie");
                    return false;
                } else {
                    System.out.println("You lose!");
                    return false;
                }
            }
            case "s" -> {
                if (pcChoice.equals("rock")) {
                    System.out.println("You lose!");
                    return false;
                } else if (pcChoice.equals("paper")) {
                    System.out.println("You win!");
                    return true;
                } else {
                    System.out.println("Tie!");
                    return false;
                }
            }
        }
        return false;
    }
}
