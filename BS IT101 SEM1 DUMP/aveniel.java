import java.util.*;

public class aveniel {

    public static void game(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("1. Yes\n2. No\nDo you want to play a game: ");
        int game_yes = input.nextInt();
        
        while(true){
            
            if(game_yes==1){
                int game_random = (int)(Math.random()*10);
                System.out.print("Input a number from 1-10: ");
                int game_input = input.nextInt();

                if(game_input<=10){
                    
                    if(game_input==game_random){
                        System.out.println("You got it right!\nThe number is "+game_random);
                        System.out.println("");
                        System.out.print("1. Yes\n2. No\nDo you want to play again?: ");
                        int right_continue = input.nextInt();
                        
                        if(right_continue==1){
                            continue;
                        }else{
                            break;
                        }
                    }else{
                        System.out.println("You got it wrong");
                        System.out.print("1. Yes\n2. No\nDo you want to play again?: ");
                        int wrong_continue = input.nextInt();
                        if(wrong_continue==1){
                            continue;
                        }else{
                            break;
                        }
                    }
                }else{
                    System.out.println("Number input exceeded please try again!");
                    continue;
                }
            }else{
                System.out.println("Thanks for playing");
                break;
            }
        } 
    }
 
    public static void main(String[] args) {

        game();
    }
    
}
/* 
This is a guess the number game

When the program starts, it asks the player if they want to play the game. 
If the player selects Yes, the program generates a random number from 0–9 
(using Math.random() * 10). The player is then asked to guess a number from 1–10.
After the player enters a guess: it tells them if they guessed the right number or
not and displays the ranom generated number from 1 to 10
In both cases whether correct or wrong, the program then asks the player if 
they want to play again. Choosing Yes restarts the guessing loop using continue;, 
and choosing No breaks the loop and ends the game.
There is also an input validation check: if the player enters a number greater 
than 10, the program warns them that the input is invalid and asks again
without stopping the game.
If the player chooses Noat the very beginning, the program simply prints 
Thanks for playing and exits.
*/