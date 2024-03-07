import java.util.Random;
import java.util.Scanner;
public class NumbersGame {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100)+ 1;
        while(true){
        System.out.println("Enter your  guessing number(1-100):");
        Scanner scanner = new Scanner(System.in);
        int playerNo = scanner.nextInt();
        
        if (playerNo == randomNumber){
            System.out.println("You guessed right!");
            break;
        }
        else if(randomNumber > playerNo){
        System.out.println("The number is higher. Try again");
        }
        else{
            System.out.println("The number is lower. Try again");
        }
    }
}
}
