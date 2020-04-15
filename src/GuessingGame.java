import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Im thinking of a number between" +
                " 1 and 10... can you guess what it is?");
        int correct_guess = 10;
        int guess_input = 0;
        while (guess_input != correct_guess){
            guess_input = scn.nextInt();
            if (guess_input != correct_guess){
                System.out.println("Sorry! Try again!");
            }
            else{
                System.out.println("You got it! Way to go.");
            }
        }
    }
}
