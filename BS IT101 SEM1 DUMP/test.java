
import java.util.*;

public class test{
    
    static void lottery(){
        Scanner input = new Scanner(System.in);
        System.out.print("1. Yes\n2. No\nDo you want to play the lottery?: ");
        int game_play = input.nextInt();
     
        while(true){
            if(game_play==1){
                
                int game_maxinput = 51;
                
                System.out.println("Please input your 5 numbers from 1-50: ");
                int[] game_input = new int[5];
                
                
                {for(int i = 0;i < game_input.length; i++){
                    System.out.print("Number "+(i+1)+": ");
                    game_input[i] = input.nextInt();
                    
                    if(game_input[i] <= game_maxinput && game_input[i] >= 1){
                    }
                    else{
                        System.out.println("Input Invalid. Please try again!");
                        i--;
                    }
                }
            }
                
                
                System.out.println("Your numbers are as follows: ");
                for(int j = 0;j < game_input.length; j++){
                System.out.print(game_input[j]+", ");
                }
                System.out.println("");
                System.out.println("1. No\n2. Yes\nAre you sure with your numbers?");
                int game_reinput = input.nextInt();
                
                if(game_reinput==1){
                    continue;
                }
                else if(game_reinput==2){
                    
                    int[] game_random = new int[5];
                    
                    for(int r = 0; r<game_random.length;r++){
                        game_random[r] = (int)(Math.random()*50) ;
                        
                    }
                    
                    
                    
                }
                
                   
                    
                
                
                
                    
               
                
            }
            else if(game_play==2){
                System.out.println("Thanks for coming!");
            }
            else{
                System.out.println("invalid input. Please try again");
                break;
            }
        }  
        input.close();
    }
    
    
    public static void main(String[] args){
        
      lottery();
      
    }
}