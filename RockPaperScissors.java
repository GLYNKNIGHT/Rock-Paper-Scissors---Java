import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors{


public static void main(String[] args) {

    int[] scores = {0, 0};

  while(true){
    String playerTurn = playerMove(); 
    System.out.println("You chose " + playerTurn);
    String cpuTurn = cpuMove();
    System.out.println("The computer chose " + cpuTurn);
    scores = result(playerTurn, cpuTurn, scores);
    System.out.println("Your Score is  " + scores[0]);
    System.out.println("The Computer Score is " + scores[1]);
  }
}

public static String playerMove(){
Scanner scan = new Scanner(System.in);
 System.out.println("Enter your move (rock, paper or scissors)");
 String playerTurn = scan.nextLine();
 return playerTurn;
} 

public static String cpuMove(){
    String[] moves = {"rock", "paper", "scissors"};
    Random rand = new Random();
    int cpuPos = rand.nextInt(3);
    String cpuTurn = moves[cpuPos];
    return cpuTurn;
}

public static int[] result( String playerTurn, String cpuTurn, int [] scores){
   
 

    if (playerTurn.equals("rock") && cpuTurn.equals("paper")){
        System.out.println("Well done you win!");
         scores[0] ++; 
    } else if (playerTurn.equals("rock") &&  cpuTurn.equals("scissors")){
        System.out.println("Unlucky, conputer won that round");
        scores[1] ++;
    } else if (playerTurn.equals("paper") &&  cpuTurn.equals("rock")){
        System.out.println("Well done you win!");
        scores[0] ++; 
    }else if (playerTurn.equals("paper") &&  cpuTurn.equals("scissors")){
        System.out.println("Unlucky, conputer won that round");
        scores[1] ++; 
    }else if (playerTurn.equals("scissors") && cpuTurn.equals("rock")){
        System.out.println("Unlucky, conputer won that round");
        scores[1] ++;
    }else if (playerTurn.equals("scissors") && cpuTurn.equals("paper")){
        System.out.println("Well done you win!");
        scores[0] ++; 
    }else{
        System.out.println("Round is a draw");
    }
   return scores;
}

}


//player move
//cpu move
// possible results if else  
//keep score