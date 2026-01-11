import java.util.*;
public class test01 {
    static void game(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Yes\n2. No\nDo you want to play a game?: ");
        int play = sc.nextInt();
        if(play == 1){
            while(true){
                int rando = (int)(Math.random()*10);
                System.out.print("Guess a number from 1 to 10: ");
                int num = sc.nextInt();
                boolean correct = num==rando;
                String output = correct? "You got it right!!":"EEK the number was " + rando;
                System.out.println(output);
                
                System.out.println("");
                System.out.print("1. Yes\n2. No\nDo you want to continue?: ");
                int cont = sc.nextInt();
                
                if (cont == 1){ 
                    continue;
                }if (cont == 2){
                    break;
                }
            }
        }
        if(play == 2){ System.out.println("Come again!");
        }else{ System.out.println("INVALID INPUT ");
        }

    }
    
    
    
    
    
    

    public static void main(String[] args){
        game();  
    }
}
