
import java.util.*;

public class crazyIwascrazyonce{
    
    static void delete(){
        for(int i = 0; i < 25 ; i++){
            System.out.println("");
        }
    }
    static void spacing(){
        for(int i = 0;i < 5;i++){
            System.out.println("");
        }
    }
    
    static void game(){
        Scanner sc = new Scanner(System.in);
    delete();
        System.out.print("1. Yes\n2. No\nDo you want to play a game?: ");
        int yes = sc.nextInt();
    
        
        if(yes==1){
            
            delete();
            System.out.println("Great!\nLet's play a game of guess the number.");
            System.out.print(" \n1. Yes\n2. No\nAre you ready?: ");
            int ans = sc.nextInt();
            spacing();
            
            if(ans==1){
                while(true){
                    int random= (int)(Math.random()*10);
                    delete();
                    System.out.print("Guess a number from 1 to 10: ");
                    int guess = sc.nextInt();
                    spacing();
                    boolean correct = guess==random;
                    
                    String output = correct? "YEY, You got it right":"EEKK, you got it wrong,\nthe number was "+random;
                    
                    delete();
                    System.out.println(output);
                    System.out.println("");
                    System.out.print("1. Yes\n2. No\nDo you want to continue?: ");
                    int cont = sc.nextInt();
                    spacing();
                    
                    if(cont==1){
                     
                    }
                    else{
                        delete();
                        System.out.println("Thanks for playing!");
                        spacing();
                        break;
                    }
                    
                }
                
            }
            else{
                delete();
                System.out.println("Oh okay, maybe next time~");
                spacing();
            }
            
        }
        else{
            delete();
            System.out.println("Maybe Next time,\nGoodbye~");
            spacing();
        }
        
        
    }
    
    public static void main(String[] args){    
        game();
     }
}